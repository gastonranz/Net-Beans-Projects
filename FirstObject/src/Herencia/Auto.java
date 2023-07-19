/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Gaston
 */
public class Auto extends Vehiculo {
    private boolean tieneAire;

    public boolean isTieneAire() {// por defecto a un valor boolean se coloca is en lugar de get.
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }
    
    public void prenderAire() {
        if(tieneAire) {
            System.out.println("Encendiendo Aire");
        }
    }
}
