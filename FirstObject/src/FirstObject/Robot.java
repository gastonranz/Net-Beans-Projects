/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstObject;

/**
 *
 * @author Gaston
 */
public class Robot {
    private String name;
    
    public Robot() {
        this.setName("Robocop");
    }
    
    public Robot(String name) {
        setName(name);
        System.out.println(this.name);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name != null) {
            this.name = name;
        } else {
            System.out.println("Please, use a name not a \"null\" value.");
            this.name = "T-800";
        }
    }
    
    public void personName(String name) {
        System.out.println("Hi " + name + ". My name is " + this.name);
    }
    
    public void personName(int num) {
        System.out.println(num);
    }
    
    public void personName(double num) {
        System.out.println(num);
    }
    
    public void personName(boolean boleano) {
        System.out.println("Your answer is: " + boleano);
    }
    
    public void personName() {
        this.personName("Michael");
        System.out.println("Thanks!");
    }
    
//    public void personName(char letra) {
//        if(letra == 'a') {
//            System.out.println(112);
//        } else {
//            System.out.println(20);
//        }
//    }
    
    @Override
    public String toString() {
        return "Robot\\name: " + this.name;
    }
    
    static {
        System.out.println("This is the first method of class \"Robot\"!");
    }
    
}
