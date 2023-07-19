/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioIntegrador;

import java.awt.BorderLayout;

/**
 *
 * @author Gaston
 */
public class Person {
    private String DNI;
    private String name;
    private String lastName;
    private String cellPhone;
    private String email;
    
    public Person(String DNI, String name, String lastName, String cellPhone, String email) {
        this.setDNI(DNI);
        this.setName(name);
        this.setLastName(lastName);
        this.setCellPhone(cellPhone);
        this.setEmail(email);
    }
    
    public Person() {
        this("0000000000", "Kim", "Wilde", "09823482984", "kimwilde@gmail.com");
    }
    
    private void setDNI(String DNI) {
        if(DNI != null) {
            this.DNI = DNI;
        } else {
            System.out.println("Please don't type a \"null\" value.");
        }
    }
    
    private void setName(String name) {
        if(name != null) {
            this.name = name;
        } else {
            System.out.println("Please don't type a \"null\" value.");
        }
    }
    
    private void setLastName(String lastName) {
        if(lastName != null) {
            this.lastName = lastName;
        } else {
            System.out.println("Please don't type a \"null\" value.");
        }
    }
    
    private void setCellPhone(String cellPhone) {
        if(cellPhone != null) {
            this.cellPhone = cellPhone;
        } else {
            System.out.println("Please don't type a \"null\" value.");
        }
    }
    
    private void setEmail(String email) {
        if(email != null) {
            this.email = email;
        } else {
            System.out.println("Please don't type a \"null\" value.");
        }
    }
    
    public void personData() {
        System.out.println("Name: " + this.name + "\nLast Name: " + this.lastName + "\nDNI: " + this.DNI + "\nPhone Number: " + this.cellPhone + "\nEmail: " + this.email);
    }
    
    public String ticketPersonData() {
        return "Name: " + this.name + "Last Name: " + this.lastName;
    }
    
    public String ticketPersonData(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        return "Name: " + this.name + "Last Name: " + this.lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "DNI=" + DNI + ", name=" + name + ", lastName=" + lastName + ", cellPhone=" + cellPhone + ", email=" + email + '}';
    }
}
