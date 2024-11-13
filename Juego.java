/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

/**
 *
 * @author Jerry
 */
public abstract class Juego {
    public String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
    }
    public abstract void jugar(String nombreCliente);
    public void mensajeGanador() {
        System.out.println("¡Felicidades, ganaste!");
    }
    public void mensajePerdedor() {
        System.out.println("Sigue participando.");
    }
        
}
