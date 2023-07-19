/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonranz.cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gaston
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        
//        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
//        BufferedReader buffer = new BufferedReader(keyboardCapture);
//        
//        System.out.println("Type your name:");
//        String name = buffer.readLine();
//        System.out.println("Type your age:");
//        String strAge = buffer.readLine();
//        Integer age = Integer.parseInt(strAge);
//        Integer result = age + 2;
//        System.out.println("Hi " + name + "! You're " + age + 
//                " years old. I hope you're doing great! In two years you'll turn " + result + ".");
//        
////        String name = "Gastón Ranz";
////        float age = 0.5f;
////        String phrase = "Hi,my name is " + name + ".\nI'm " + age + " years old!";
//        boolean kid = age > 1 && age <= 14;
//        boolean teenager = age > 14 && age < 18;
//        boolean younger = age >= 18 && age < 30;
//        
////        System.out.println(phrase);
//        
//        if (age >= 1) {
//            if (kid) {
//                System.out.println("Kid");
//            } else if (teenager) {
//                System.out.println("teenager");
//            } else if (younger) {
//                System.out.println("Younger");
//            } else if (age >= 30) {
//                System.out.println("Youngest");
//            }
//        } else if (age >= 0.1 && age < 0.2) {
//            System.out.println("You just have a few days!");
//        } else if (age <= 0) {
//            System.out.println("You haven't born yet!");
//        } else {
//            System.out.println("You just have a few months!");
//        }

       byte numero = 127;
       short numero2 = 32767;
       
       String palabra = "Hola que tal.";
       int palabra2 = palabra.length();
       boolean palabra3 = palabra.equals(palabra);
       char palabra4 = palabra.charAt(9);
       String palabra5 = palabra.replace("Hola", "Hi");
       boolean palabra6 = palabra5.startsWith("Hi");
       boolean palabra7 = palabra5.endsWith("l.");
       String palabra8 = palabra5.toUpperCase();
       String palabra9 = palabra5.toLowerCase();
       String[] palabra10 = palabra5.split("");//Si solo coloco como parámetro ""
// (sin espacio) dentro de los paréntesis de la propiedad split de palabra5, al convertir el String
// como un array, voy a obtener de resultado una asignación a cada espacio del array una letra.
// Ej: palabra5[0] = H; palabra5[1] = i; palabra5[2] =  ; palabra5[3] = q; etc. (11 espacios).
       boolean palabra11 = palabra5.contains("ue ");
       String palabra12 [] = palabra5.split(" ");
       
       for(int i = 0; i < palabra10.length; i++) {
           System.out.println("palabra12 [" + i + "] = " + palabra10[i]);
       }
       
        System.out.println(palabra10);
//        
//        if (palabra11 && palabra7) {
//            System.out.println("How you doing?");
//        } else {
//            System.out.println("Nice to meet you!");
//        }
//        System.out.println("Hola." + " El resultado es: " + ("Hola" + " " + "3" == "Hola" + " " + "3"));
          int num = 10;
          int num2 = 22;
          String strNum = "40";
          Integer numString = Integer.parseInt(strNum);
          numString = numString + num2;
          System.out.println(numString);
          Integer num3 = Integer.max(numString,num2);
          System.out.println(num3);
    }
}
