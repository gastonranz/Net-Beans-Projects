/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstObject;

/**
 *
 * @author Gaston
 */
public class Car {
    private String patente;
    private String color;
    private int kms;
    private double valor;
    private boolean altaGama;
    
    
    public String getPatente() {
        return this.patente;
    }
    
    public void setPatente(String patente) {
        if(patente != null) {
            this.patente = patente;
        } else {
            System.out.println("Please don't use a \"null\" value.");
        }
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        if(color != null) {
            this.color = color;
        } else {
            System.out.println("Please don't use a \"null\" value.");
        }
    }
    
    public int getKms() {
        return this.kms;
    }
    
    public void setKms(int kms) {
        this.kms = kms;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public boolean getAltaGama() {
        return this.altaGama;
    }
    
    public void setAltaGama(boolean altaGama) {
        this.altaGama = altaGama;
    }
    
    double compraAuto(double monto, double saldo) {
        if(valor > saldo) {
            System.out.println("You don't have enough cash!");
        } else if(valor == saldo) {
            saldo -= valor;
            System.out.println("Congratulations! You have a new car! Now you have no cash.");
        } else {
          saldo -= valor;
          System.out.println("Congratulations! You have a new car!\nYour \"Saldo\" is: " + saldo);
        }
        return saldo;
    }
    
    double compraAuto(double saldo) {
        System.out.println("You haven't chosen a car yet.");
        return saldo;
    }

    @Override
    public String toString() {
        return "Car{" + "patente=" + patente + ", color=" + color + ", kms=" + kms + ", valor=" + valor + ", altaGama=" + altaGama + "}";
    }
}
