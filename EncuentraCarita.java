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
public class EncuentraCarita extends Juego {
    public char[][] tablaCaritas;
    public int filaCarita;
    public int columnaCarita;
    
    public EncuentraCarita() {
        super("Encuentra la carita");
    }
    
    public void jugar(String nombreCliente) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al juego Encuentra la carita, " + nombreCliente + "!");
        System.out.println("Elige una fila (1-3) y una columna (1-3) para encontrar la carita feliz.");

        tablaCaritas = new char[][]{{'X', 'X', 'X'}, {'X', 'X', 'X'}, {'X', 'X', 'X'}};
        filaCarita = (int) (Math.random() * 3);
        columnaCarita = (int) (Math.random() * 3);
        tablaCaritas[filaCarita][columnaCarita] = '\u263A'; 

        System.out.println("Tabla:");
        for (int i = 0; i < tablaCaritas.length; i++) {
            for (int j = 0; j < tablaCaritas[i].length; j++) {
                if (i == filaCarita && j == columnaCarita) {
                    System.out.print("X ");
                } else {
                    System.out.print(tablaCaritas[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Ingresa el número de fila (1-3): ");
        int fila = entrada.nextInt() - 1; 
        System.out.println("Ingresa el número de columna (1-3): ");
        int columna = entrada.nextInt() - 1; 

        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            if (fila == filaCarita && columna == columnaCarita) {
                mensajeGanador();
            } else {
                mensajePerdedor();
            }
        } else {
            System.out.println("Posición inválida. Inténtalo de nuevo.");
        }
    }
}