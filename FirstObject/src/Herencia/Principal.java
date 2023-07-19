/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author Gaston
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto car = new Auto();
        Moto bike = new Moto();
        car.acelerar();
        bike.setBrand("Harley Davison");
        car.setBrand("Toyota");
        System.out.println(bike.getBrand());
        System.out.println(car.getBrand());
        Principal.probar(car);
    }
    
    private static void probar(Vehiculo car) {//Auto extends from Vehiculo
        car.encender();
    }
    
}
