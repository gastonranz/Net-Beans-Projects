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
public class JavaCourse_Exercise2 {
    public static void main(String[] args) throws IOException {
        //Armar un programa que permita cargar 3 números y mostrar cual es el NÚMERO PROMEDIO.
        System.out.println("Welcome!\nThis program will calculate the average among 3 numbers.\nPlease choice your numbers.");
        System.out.println("Type your 1st number: ");
        int num1 = cargarNumero();
        
        System.out.println("Type your 2nd number: ");
        int num2 = cargarNumero();
        
        System.out.println("Type your 3rd number: ");
        int num3 = cargarNumero();
        
        int numeros[] = new int[]{num1,num2,num3};
        String strNumeros[] = new String[]{"1st number","2nd number","3rd number"};
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Your " + strNumeros[i] + " is: " + numeros[i]);
        }
        
        System.out.println("Total value of your numbers is: " + (num1 + num2 + num3));
        System.out.println("The average among your three numbers is: " + promedio(num1, num2, num3));
        
    }
    
    private static Integer cargarNumero() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        return num;
    }
    
    private static Double promedio(int num1, int num2, int num3) {
      //double promedio = (num1 + num2 + num3) / 3;
      //return promedio;
        Integer suma = num1 + num2 + num3;
        Double promedio = Double.valueOf(suma) / 3;
        return promedio;
    }
}
