/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioIntegrador;

/**
 *
 * @author Gaston
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y = 0, z = 8;
        System.out.println(y + z);
        Person person = new Person();
        CreditCard card = new CreditCard(person);
        
        card.extraer();
        card.depositar();
        System.out.println();
        System.out.println(card.getSaldo());
        System.out.println();
        card.extraer();
        System.out.println(card.getSaldo());
    }
    
}
