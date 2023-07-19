/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

/**
 *
 * @author Gaston
 */
public class Ticket {
    private int idTicket;
    private static int nextId = 0;
    private String date;
    private String DNIPerson;
    
    public static int getNextId() {
        return Ticket.nextId;
    }
    
    public Ticket(String date, String DNIPerson){
        this.setDate(date);
        this.setDNIPerson(DNIPerson);
        Ticket.nextId++;
        this.idTicket = Ticket.nextId;
    }
    
    public Ticket() {
        this("Default", "Default");
    }
    
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        if(date != null) {
            this.date = date;
        } else {
            System.out.println("Please don't type a \"null\" value.");
            this.date = "Default";
        }
    }
    
    public String getDNIPerson() {
        return this.DNIPerson;
    }
    
    public void setDNIPerson(String DNIPerson) {
        if(DNIPerson != null) {
            this.DNIPerson = DNIPerson;
        } else {
            System.out.println("Please don't type a \"null\" value.");
            this.date = "Default";
        }
    }
    
    @Override
    public String toString() {
        return "Id Ticket: " + this.idTicket + " | Date: " + this.date + " | Dni Person: " + this.DNIPerson;
    }
    
    public static void main(String[] args) {
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
