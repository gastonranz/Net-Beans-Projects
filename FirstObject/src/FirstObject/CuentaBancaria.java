/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstObject;

import java.awt.BorderLayout;

/**
 *
 * @author Gaston
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;
    
    //CONSTRUCTOR 1
    public CuentaBancaria(String alias, String moneda, String tipo) {
        setCBU();
        this.setAlias(alias);
        this.setMoneda(moneda);
        this.setTipo(tipo);
    }
    
    //CONSTRUCTOR 2
    public CuentaBancaria(String moneda, String tipo) {
        this("alias_por_defecto", moneda, tipo);
        //"alias_por_defecto" es un valor HARDCODEADO.
    }
    
    //CONSTRUCTOR 3
    public CuentaBancaria(String moneda) {
        this(moneda, "Caja de ahorro");
    }
    
    //CONSTRUCTOR 4
    public CuentaBancaria() {
        this("Dollar", "Save Box");
//        this("alias_por_defecto2", "Dollar", "Caja Ahorro en Pesos");
    }
    
    
    public String getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(String moneda) {
        if(moneda != null) {
            this.moneda = moneda;
        } else {
            this.moneda = "Unknown Coin";
        }
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        if(tipo != null) {
            this.tipo = tipo;
        } else {
            this.tipo = "Unknown Type";
        }
    }
    
    public String getCBU() {
        return CBU;
    }
    
    public void setCBU() {
        int min = 1;
        int max = 10;
        double resultado = Math.floor(Math.random() * (max - min + 1) + min);
        
        if(resultado == 1) {
            this.CBU = "2220001839280010002828";
        } else if(resultado == 2) {
            this.CBU = "2220001839280010002800";
        } else if(resultado == 3) {
            this.CBU = "2220001839280010002812";
        } else if(resultado == 4) {
            this.CBU = "2220001839280010002826";
        } else if(resultado == 5) {
            this.CBU = "2220001839280010002830";
        } else if(resultado == 6) {
            this.CBU = "2220001839280010002880";
        } else if(resultado == 7) {
            this.CBU = "2220001839280010002891";
        } else if(resultado == 8) {
            this.CBU = "2220001839280010002840";
        } else if(resultado == 9) {
            this.CBU = "2220001839280010002862";
        } else if(resultado == 10) {
            this.CBU = "2220001839280010002873";
        }
    }
    
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String alias) {
        if(alias != null) {
            this.alias = alias;
        } else {
            this.alias = "Unknown name";
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void showData() {
        System.out.println(this.toString());
        System.out.println(CBU + " " + alias + " " + saldo + " " + moneda + " " + tipo);
    }
    
    void showIdentificador() {
        System.out.println(this);
    }
    
    double deposito(double monto) {
        if(monto >= 0) {
        saldo = saldo + monto;
      //saldo += monto;
        } else {
            System.out.println("Type a positive number!");
        }
        return saldo;
    }
    
    void extraccion(double monto) {
        if(consultaExtraccion(monto)) { //Método de apoyo.
            saldo -= monto;
        } else if(monto < 0) {
            System.out.println("Please, type a positive number.");
        } else {
            System.out.println("You don't have enough money in your ATM to do this operation.\nPlease, check your \"saldo\" in your bank account.");
        }
    }
    
    static {
        System.out.println("This is the 1st method of Class \"CuentaBancaria\"!");
    }
    
    private boolean consultaExtraccion(double monto) {
        boolean resultado = monto <= saldo && monto > 0; //No tengo necesidad de crear un "IF";
        return resultado;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", alias=" + alias + ", saldo=" + saldo + ", moneda=" + moneda + ", tipo=" + tipo + '}';
    }
    
    
    
}
