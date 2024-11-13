/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jerry
 */
public class Reto8 {
    public static void main(String[] args) {
        ArrayList<Partida> historialPartidas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la agencia de publicidad. Por favor, seleccione un juego:");
        System.out.println("1. Adivina el número");
        System.out.println("2. Encuentra la carita");
        System.out.println("3. Gira una carta");
        System.out.println("Ingrese el número del juego que desea jugar: ");
        int opcion = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Ingrese su nombre: ");
        String nombreCliente = entrada.nextLine();
        System.out.println("Ingrese su correo: ");
        String correoCliente = entrada.nextLine();
        System.out.println("Ingrese su teléfono: ");
        String telefonoCliente = entrada.nextLine();
        System.out.println("Ingrese su fecha de nacimiento (DD/MM/YYYY): ");
        String fechaNacimiento = entrada.nextLine();

        Juego juego = null;
        String tipoJuego = "";
        switch (opcion) {
            case 1:
                juego = new AdivinaNumero();
                tipoJuego = "Adivina el número";
                break;
            case 2:
                juego = new EncuentraCarita();
                tipoJuego = "Encuentra la carita";
                break;
            case 3:
                juego = new GiraUnaCarta();
                tipoJuego = "Gira una carta";
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                return;
        }

        Partida partida = new Partida(nombreCliente, correoCliente, telefonoCliente, fechaNacimiento, tipoJuego);
        juego.jugar(nombreCliente);
        historialPartidas.add(partida);

        System.out.println("Reporte del día:");
        for (Partida p : historialPartidas) {
            System.out.println("Cliente: " + p.getNombreCliente() + " - Juego: " + p.getTipoJuego() + " - Estatus: " + p.getEstatus());
        }
    }
}

