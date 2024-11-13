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
public class Partida {
    public String nombreCliente;
    public String correoCliente;
    public String telefonoCliente;
    public String fechaNacimiento;
    public String tipoJuego;
    public String estatus;

    public Partida(String nombreCliente, String correoCliente, String telefonoCliente, String fechaNacimiento, String tipoJuego) {
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoJuego = tipoJuego;
        this.estatus = "En juego";
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoJuego() {
        return tipoJuego;
    }

    public String getEstatus() {
        return estatus;
    }
}


