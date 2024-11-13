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
public class AdivinaNumero extends Juego {
    public int numeroAdivinar;

    public AdivinaNumero() {
        super("Adivina el numero");
    }
    
    public void jugar(String nombreCliente) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al juego Adivina el número, " + nombreCliente + "!");
        System.out.println("Tienes 3 oportunidades para adivinar un número del 1 al 10.");

        numeroAdivinar = (int) (Math.random() * 10) + 1;

        for (int i = 0; i < 3; i++) {
            System.out.println("Intento " + (i + 1) + ": Ingresa tu número: ");
            int numeroUsuario = entrada.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                mensajeGanador();
                return;
            } else {
                System.out.println("Número incorrecto. Inténtalo de nuevo.");
            }
        }
        mensajePerdedor();
    }
}
