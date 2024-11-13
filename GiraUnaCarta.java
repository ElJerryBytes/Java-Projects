/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;
import java.util.Scanner;

/**
 *
 * @author Jerry
 */
public class GiraUnaCarta extends Juego {
    public char[] cartas;
    public int posicionDiamante;


    public GiraUnaCarta() {
        super("Gira una carta");
    }
    
    public void jugar(String nombreCliente) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al juego Gira una carta, " + nombreCliente + "!");
        System.out.println("Se mostrará una línea de 5 símbolos de X. Indica la posición del símbolo de diamante de póquer.");

        cartas = new char[]{'X', 'X', 'X', 'X', 'X'};
        posicionDiamante = (int) (Math.random() * 5);
        cartas[posicionDiamante] = '\u2666'; 

        System.out.println("Cartas:");
        for (int i = 0; i < cartas.length; i++) {
            if (i == posicionDiamante) {
                System.out.print("X ");
            } else {
                System.out.print(cartas[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Ingresa la posición del símbolo de diamante (1-5): ");
        int posicion = entrada.nextInt() - 1; 

        if (posicion >= 0 && posicion < 5) {
            if (posicion == posicionDiamante) {
                mensajeGanador();
            } else {
                mensajePerdedor();
            }
        } else {
            System.out.println("Posición inválida. Inténtalo de nuevo.");
        }
    }
}
