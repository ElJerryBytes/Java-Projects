/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerardomartinez.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Jerry
 */
public class Reto1 {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        double peso;
        double estatura;
        double MetabolismoBasal;
        double IMC;
        double MasaCorporalMagra;
        char sexo;
        int edad;
        
        System.out.println("Menú de opciones:");
        System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");
        System.out.println("S. Salir del programa");
        System.out.println("Elige una opción: ");
        char menu = entrada.next().charAt(0);
        
        switch(menu){
            case 'A':
                System.out.println("Ingrese el peso (en kg)");
                peso=entrada.nextDouble();
                System.out.println("Ingrese la estatura (en cm)");
                estatura=entrada.nextDouble()/100;
                
                IMC = peso / (estatura * estatura);
                System.out.println("El IMC calculado es: " + IMC);
                CondicionIMC(IMC);
                break;
                
            case 'B':
                System.out.println("Ingrese el peso (en kg)");
                peso=entrada.nextDouble();
                System.out.println("Ingrese la estatura (en cm)");
                estatura=entrada.nextDouble();
                System.out.println("Ingresa el sexo (M/F):");
                sexo=entrada.next().charAt(0);
                
                if (sexo == 'M' || sexo == 'm') {
                MasaCorporalMagra = (1.10 * peso) - 128 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
                } else if (sexo == 'F' || sexo == 'f') {
                MasaCorporalMagra = (1.07 * peso) - 148 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
                } else {
                System.out.println("Sexo no válido. Ingresa 'M' o 'F'.");
                return;
                }
                System.out.println("La masa corporal magra calculada es: " + MasaCorporalMagra + " kg");
                break;
                
            case 'C':
                System.out.println("Ingresa el peso en kg:");
                peso=entrada.nextDouble();
                System.out.println("Ingrese la estatura (en cm)");
                estatura=entrada.nextDouble();
                System.out.println("Ingresa la edad:");
                edad=entrada.nextInt();
                System.out.println("Ingresa el sexo (M/F):");
                sexo=entrada.next().charAt(0);
                
                if (sexo == 'M' || sexo == 'm') {
                MetabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
                } else if (sexo == 'F' || sexo == 'f') {
                MetabolismoBasal =  655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
                } else {
                System.out.println("Sexo no válido. Ingresa 'M' o 'F'.");
                return;
                }
                System.out.println("El metabolismo basal calculado es: " + MetabolismoBasal);
                break;
                
            case 'S':
                System.out.println("Saliendo del programa. ¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
        }
    } 
    public static void CondicionIMC(double IMC){
        if (IMC < 18.5) {
            System.out.println("Condición: Peso bajo");
        } else if (IMC < 25) {
            System.out.println("Condición: Peso normal");
        } else if (IMC < 30) {
            System.out.println("Condición: Sobrepeso");
        } else if (IMC < 35) {
            System.out.println("Condición: Obesidad leve");
        } else if (IMC < 40) {
            System.out.println("Condición: Obesidad media");
        } else {
            System.out.println("Condición: Obesidad mórbida");
        }
    }
}
