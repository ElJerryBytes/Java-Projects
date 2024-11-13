/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerardomartinez.mavenproject1;

/**
 *
 * @author Jerry
 */

class Cafetera {
    public double cafeDisponible;  
    public double aguaDisponible;  
    public double azucarDisponible;
    public double importeTotalVenta;
    public double totalVentasCafe;
    public int totalTazasVendidas;

    public Cafetera(double cafeInicial, double aguaInicial, double azucarInicial) {
        this.cafeDisponible = cafeInicial;
        this.aguaDisponible = aguaInicial;
        this.azucarDisponible = azucarInicial;
        this.importeTotalVenta = 0;
        this.totalVentasCafe = 0;
        this.totalTazasVendidas = 0;
    }

    public void servirTaza(String tipo, boolean azucar, double precio) {
        double cafeUsado = 0;
        double azucarUsado = 0;
        int capacidad = 0;

        switch (tipo) {
            case "pequeño":
                cafeUsado = 10;  // gramos
                capacidad = 120;  // ml
                break;
            case "mediano":
                cafeUsado = 15;  // gramos
                capacidad = 220;  // ml
                break;
            case "grande":
                cafeUsado = 20;  // gramos
                capacidad = 320;  // ml
                break;
            default:
                System.out.println("Tipo de taza de café no válido.");
                return;
        }

        if (azucar) {
            azucarUsado = 10;  // gramos
        }

        if (this.cafeDisponible >= cafeUsado && this.aguaDisponible >= (capacidad / 1000.0) && this.azucarDisponible >= azucarUsado) {
            this.cafeDisponible -= cafeUsado;
            this.aguaDisponible -= (capacidad / 1000.0); 
            this.azucarDisponible -= azucarUsado;
            this.totalVentasCafe += precio;
            this.totalTazasVendidas++;
            System.out.println("Taza " + this.totalTazasVendidas + " de café " + tipo + (azucar ? " con azúcar" : " sin azúcar") + " servida. Precio: $" + precio);
        } else {
            System.out.println("No hay suficientes insumos para servir la taza de café solicitada.");
        }
    }

    public void agregarCafe(double cantidad) {
        if (this.cafeDisponible + cantidad <= 2000) {
            this.cafeDisponible += cantidad;
            System.out.println(cantidad + " gramos de café agregados a la cafetera.");
        } else {
            System.out.println("No se puede agregar esa cantidad de café, excede la capacidad máxima.");
        }
    }

    public void mostrarInsumosDisponibles() {
        System.out.println("Café disponible: " + this.cafeDisponible + " gramos");
        System.out.println("Agua disponible: " + this.aguaDisponible + " litros");
        System.out.println("Azúcar disponible: " + this.azucarDisponible + " gramos");
    }

    public void vaciarCafetera() {
        this.cafeDisponible = 0;
        this.aguaDisponible = 0;
        this.azucarDisponible = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void mostrarReporte() {
        System.out.println("Total de tazas vendidas: " + this.totalTazasVendidas);
        System.out.println("Total de ventas de café: $" + this.totalVentasCafe);
    }

    public double calcularCambio(double montoPago) {
        double cambio = montoPago - this.importeTotalVenta;  // Calcular el cambio basado en el importe total de venta
        if (cambio >= 0) {
            System.out.println("Cambio a devolver: $" + cambio);
            System.out.println("Desglose de cambio:");
            int[] denominaciones = {10, 5, 2, 1};
            for (int denominacion : denominaciones) {
                int cantidadDenominacion = (int) (cambio / denominacion);
                cambio -= cantidadDenominacion * denominacion;
                System.out.println("$" + denominacion + ": " + cantidadDenominacion + " moneda(s)");
            }
        } else {
            System.out.println("El monto ingresado no es suficiente para cubrir el total de la compra.");
        }
        return cambio;
    }
}


