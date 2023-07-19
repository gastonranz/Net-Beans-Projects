/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtributosTipoObjeto;

/**
 *
 * @author Gaston
 */
public class Motor {
    private String number;
    private double cilindrada;
    private String tipo;
    private int rpmActuales = 0;
    
    public Motor(String number, double cilindrada, String tipo) {
        this.setNumber(number);
        this.setCilindrada(cilindrada);
        this.setTipo(tipo);
    }
    
    public void acelerar(int acelerar) {
        if(acelerar > 0 && this.rpmActuales + acelerar <= 3000) {
            this.rpmActuales += acelerar;
        } else if(acelerar <= 0) {
            System.out.println("No puedes acelerar con un valor igual o menor a \"cero\".");
        } else {
            System.out.println("No te excedas de revoluciones, vas a dañar el motor!");
        }
    }
    
    public int getRpmActuales() {
        return this.rpmActuales;
    }
    
    public void setRpmActuales(int rpmActuales) {
        if(rpmActuales >= 0 && rpmActuales <= 3000) {
            this.rpmActuales = rpmActuales;
        } else {
            System.out.println("Estas pasandote de las revoluciones y vas a dañar el motor.");
        }
    }
    
    public Motor() {
        this("1-000-828-10", 10.8, "Electric");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number != null) {
            this.number = number;
        } else {
            this.number = "0-000-000-0";
        }
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        if(cilindrada >= 0) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("Please set a positive number.");
            this.cilindrada = 0;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo != null) {
            this.tipo = tipo;
        } else {
            this.tipo = "Unknown";
        }
    }
    
    public void secreto(int num) {
        System.out.println(num + " This is the secret password: 982747274");
    }
    
    public void secreto(String word) {
        System.out.println(word + " This is the secret password: lsjad98324kl");
    }

    @Override
    public String toString() {
        return "Motor{" + "number=" + number + ", cilindrada=" + cilindrada + ", tipo=" + tipo + ", rpmActuales=" + rpmActuales + '}';
    }
}
