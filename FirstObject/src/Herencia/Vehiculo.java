/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Gaston
 */
public class Vehiculo {
    private String brand;
    private String model;
    private String patente;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public void acelerar() {
        System.out.println("Acelerando...");
    }
    
    public void frenar() {
        System.out.println("Frenar");
    }
    
    public void encender() {
        System.out.println("Encendido");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "brand=" + brand + ", model=" + model + ", patente=" + patente + '}';
    }
    
    
}
