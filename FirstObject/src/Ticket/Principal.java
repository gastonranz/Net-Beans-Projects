/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ticket;

/**
 *
 * @author Gaston
 */
public class Principal {
    private String nombre;
    private String apellido;
    private String DNI;
    private int numero;
    private static int incremento = 0;
    
    public Principal(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        Principal.incremento = Principal.incremento + 1;
        this.numero = Principal.incremento;
    }
    
    public Principal() {
        this("Kim", "Wilde", "33222000");
    }
    
    private void getData() {
        System.out.println(this.nombre + " | " + this.apellido + " | " + this.DNI + " | " + this.numero);
    }
    
    @Override
    public String toString() {
        return "Name: " + this.nombre + " | Last Name: " + this.apellido + " | DNI: " + this.DNI + " | Number: " + this.numero;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal obj1 = new Principal();
        Principal obj2 = new Principal("Gaston", "Ranz", "38503823");
        Principal obj3 = new Principal("Gaston", "Ranz", "38503823");
        obj1.getData();
        obj2.getData();
        obj3.getData();
        System.out.println(obj1.toString());
        System.out.println();
        
        Ticket ticket = new Ticket(null, "38.503.823");
        Ticket ticket2 = new Ticket("5/20/2023", "22.389.049");
        Ticket ticket3 = new Ticket("5/24/2023", "40.923.238");
        Ticket ticket4 = new Ticket("11/28/2023", "83.923.823");
        
        System.out.println(ticket);
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);
        
        System.out.println();
        System.out.println("Last Id Ticket is: " + Ticket.getNextId());
        
    }
    
}
