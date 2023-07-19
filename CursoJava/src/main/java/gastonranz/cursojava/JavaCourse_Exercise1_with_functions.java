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
public class JavaCourse_Exercise1_with_functions {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Write you 1st number down:");
        int num1 = guardarNumero();
        
        System.out.println("Write you 2nd number down:");
        int num2 = guardarNumero();
        
        System.out.println("Write you 3rd number down:");
        int num3 = guardarNumero();
        
        calculoNumeroMayor(num1, num2, num3);
        calculoNumeroMenor(num1, num2, num3);
    }
    /**
     * Lee los datos que le escriba a la consola como String.
     * @return Me devuelve el número convertido a Integer.
     * @throws IOException 
     */
    private static Integer guardarNumero() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        return num;
    }
    
    private static void calculoNumeroMayor(int num1, int num2, int num3) {
        int numMayor = num1;
        if (num2 > numMayor) {
            numMayor = num2;
        }
        if (num3 > numMayor) {
            numMayor = num3;
        }
        System.out.println("Your highest number is: " + numMayor);
    }
    /**
     * Esta función sirve para calcular el "Número Menor".
     * @param num1 es el 1er número.
     * @param num2 es el 2do número.
     * @param num3 es el 3er número.
     */
    private static void calculoNumeroMenor(int num1, int num2, int num3) {
        int numMenor = num1;
        if (num2 < numMenor) {
            numMenor = num2;
        }
        if (num3 < numMenor) {
            numMenor = num3;
        }
        System.out.println("Your lowest number is: " + numMenor);
    }
    
}