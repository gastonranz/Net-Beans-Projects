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
public class JavaCourse_Exercise1 {
    public static void main(String[] args) throws IOException {
     
        //Armar un programa que permita cargar 3 números y mostrar cual es el número mayor
        //y cual es el número menor.
        
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        
        System.out.println("Write your 1st number down:");
        String strNum1 = buffer.readLine();
        Integer num1 = Integer.parseInt(strNum1);
        System.out.println("Write your 2nd number down:");
        String strNum2 = buffer.readLine();
        Integer num2 = Integer.parseInt(strNum2);
        System.out.println("Write your 3rd number down:");
        String strNum3 = buffer.readLine();
        Integer num3 = Integer.parseInt(strNum3);
        
          int numMayor = num1;
          int numMedio = 0;
          int numBajo = 0;
          
          if (num2 > numMayor) {
              numMayor = num2;
          }
          if (num3 > numMayor) {
              numMayor = num3;
          }
          
          if (num1 < numMayor && num1 > numMedio) {
              numMedio = num1;
          }
          if (num2 < numMayor && num2 > numMedio) {
              numMedio = num2;
          }
          if (num3 < numMayor && num3 > numMedio) {
              numMedio = num3;
          }
          
          if (num1 < numMedio) {
              numBajo = num1;
          }
          if (num2 < numMedio) {
              numBajo = num2;
          }
          if (num3 < numMedio) {
              numBajo = num3;
          }
          
          int numeros[] = new int[3];
          numeros[0] = numBajo;
          numeros[1] = numMedio;
          numeros[2] = numMayor;
          
          System.out.println("Tus números de menor a mayor son: " + numBajo + " - " + numMedio + " - " + numMayor);
          
          System.out.println("El número mayor es: " + numMayor);
          
          System.out.println("El número medio es: " + numMedio);
          
          System.out.println("El número menor es: " + numBajo);
          
          for (int i = 0; i < numeros.length; i++) {
              System.out.println("numeros ["+ i + "] es: " + numeros[i]);
          }
          
          //for mejorado con ubicación del array:
          int i = 0;
          for(int numeros2 : numeros) {
              System.out.println("numeros [" + i + "] = " + numeros2);
              i++;
          }
        
          
          
          String product = "jeans";
          int price = 80;
          int discount = 20;
          int finalPrice = price - (discount * price / 100);
          System.out.println("Your " + product + " are " + finalPrice + ".\n Thank you for buying in this online store!");
          
          //mostrarProductoFinal(String product,int price,int discount) {
          // String productoFinal = producto - (discount * price / 100);
          // System.out.println( "Your + product + "are " + finalPrice + ".\n Thank you for buying in this online store!");
          //}
          //mostrarProductoFinal(jean,80,20);
          //mostrarProductoFinal(shirt,100,30);
          //mostrarProductoFinal(Coat,200,40);
    }
}
