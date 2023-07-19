/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtributosTipoObjeto;

/**
 *
 * @author Gaston
 */
public class Auto {
    private String patente;
    private String marca;
    private String color;
    private boolean es0KM;
    private double precio;
    //Atributo de Tipo Objeto
    private Motor engine;
    
    public Auto(String patente, String marca, String color, double precio, Motor engine) {
        this.setPatente(patente);
        this.setMarca(marca);
        this.setColor(color);
        this.setEs0KM();
        this.setPrecio(precio);
        this.engine = engine;
    }
    
    public Auto(String color, double precio, Motor engine) {
        this("California", "Mustang", color, precio, engine);
    }
    
    public Auto(Motor engine) {
        this("Out-Time", "Delorean", "Gray", 9999999, engine);
    }

    public Motor getEngine() {
        return engine;
    }
    
    public void acelerar(int rpm) {
//        this.engine.setRpmActuales(this.engine.getRpmActuales() + rpm);
        this.engine.acelerar(rpm);
    }
    
    public String getPatente() {
        return this.patente;
    }
    
    public void setPatente(String patente) {
        if(patente != null) {
            this.patente = patente;
        } else {
            System.out.println("Please don't use a \"null\" value.");
            this.patente = "Unknown";
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null) {
            this.marca = marca;
        } else {
            System.out.println("Please don't use a \"null\" value.");
            this.marca = "Unknown";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color != null) {
            this.color = color;
        } else {
            System.out.println("Please don't use a \"null\" value.");
            this.color = "Unknown";
        }
    }

    public boolean getEs0KM() {
        return es0KM;
    }

    public void setEs0KM() {
        int min = 1;
        int max = 2;
        double resultado = Math.floor(Math.random() * (max - min + 1) - min);
        if(resultado == 0) {
            this.es0KM = true;
        } else {
            this.es0KM = false;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Please set a positive number.");
        }
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", es0KM=" + es0KM + ", precio=" + precio + ", engine=" + engine + '}';
    }
}
