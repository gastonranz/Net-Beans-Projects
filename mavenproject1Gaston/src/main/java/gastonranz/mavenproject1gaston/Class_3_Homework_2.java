/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonranz.mavenproject1gaston;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gaston
 */
public class Class_3_Homework_2 {
    public static void main(String[] args) throws IOException {
        
      //Genere una clase que tenga los métodos para realizar la codificación y decodificación
      //de un string, dado un número de desplazamiento.
        
        System.out.println("Welcome!\n Type \"1\" if you want to \"coding\".\nType \"2\" if you want to \"decoding\"");
        int choice = cargarDatos();
        
        System.out.println("Please type the numbers of spaces you want to separe each letter:");
        int choice2 = cargarDatos();
        
        desicion(choice, choice2);
        
    }
        
    private static Integer cargarDatos() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        return num;
    }
    
    private static void desicion(int choice, int choice2) {
        if (choice == 1) {
            coding(choice2);
        }else {
            decoding(choice2);
        }
    }
    
    private static void coding(int choice2) {
        String word = "Hi, my name is Gaston Ranz.";
        String abecedario = "abcdefghijklmnñopqrstuvwxyz @,\".&abcdefghijklmnñopqrstuvwxyz @,\".&abcdefghijklmnñopqrstuvwxyz @,\".&abcdefghijklmnñopqrstuvwxyz @,\".&abcdefghijklmnñopqrstuvwxyz @,\".&abcdefghijklmnñopqrstuvwxyz @,\".&";
        String abecedario2 = abecedario.toUpperCase();
        String result = "";
        int i2 = 0;
        for(int i = 0; i < word.length(); i++) {
                  while(word.charAt(i) != abecedario.charAt(i2) && word.charAt(i) != abecedario2.charAt(i2)) {
                  i2++;
              }
                  if(word.charAt(i) == abecedario.charAt(i2)) {
                      System.out.println(abecedario.charAt(i2 + choice2));
                      result = result + abecedario.charAt(i2 + choice2);
                  }else {
                      System.out.println(abecedario2.charAt(i2 + choice2));
                      result = result + abecedario2.charAt(i2 + choice2);
                  }

                  i2 = 0;
              }
              System.out.println("El resultado es: " + result);
              System.out.println("Valor del abecedario es: " + abecedario.length());
        }
    
        private static void decoding(int choice2) {
        String word = "Hi, my name is Gaston Ranz.";
        String abecedario = "&.\",@ zyxwvutsrqpoñnmlkjihgfedcba&.\",@ zyxwvutsrqpoñnmlkjihgfedcba&.\",@ zyxwvutsrqpoñnmlkjihgfedcba&.\",@ zyxwvutsrqpoñnmlkjihgfedcba&.\",@ zyxwvutsrqpoñnmlkjihgfedcba&.\",@ zyxwvutsrqpoñnmlkjihgfedcba";
        String abecedario2 = abecedario.toUpperCase();
        String result = "";
        
        int i2 = 0;
        for(int i = 0; i < word.length(); i++) {
                  while(word.charAt(i) != abecedario.charAt(i2) && word.charAt(i) != abecedario2.charAt(i2)) {
                  i2++;
              }
                  if(word.charAt(i) == abecedario.charAt(i2)) {
                      System.out.println(abecedario.charAt(i2 + choice2));
                      result = result + abecedario.charAt(i2 + choice2);
                  }else {
                      System.out.println(abecedario2.charAt(i2 + choice2));
                      result = result + abecedario2.charAt(i2 + choice2);
                  }

                  i2 = 0;
              }
        
              System.out.println("El resultado es: " + result);
              System.out.println("Valor del abecedario es: " + abecedario.length());
        }
//        
        // String.valueOf(arr) //convierte cualquier variable en "String".
        // Integer.valueOf("3")//Convierte cualquier variable en "Integer".
//        System.out.println(Float.valueOf("3.50") + 10);
//        int num = 3;
//        System.out.println(String.valueOf(num) + 22);
//        System.out.println("3" + 10);
    
    
}
