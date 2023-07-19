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
public class Class_3_Homework_b {
    public static void main(String[] args) throws IOException {
        /*
        int num1 = 500;
        int num2 = 400;
        int num3 = 900;
        int data = 0;
        
        if (num1 > num2) {
            data = num1;
            num1 = num2;
            num2 = data; //num1 90 / num2 = 180
        }
        if (num2 > num3) {
            data = num2;
            num2 = num3;
            num3 = data; //num2 2 / num3 = 180
        }
        if (num1 > num2) {
            data = num1;
            num1 = num2;
            num2 = data; //num1 2 / num2 = 90
        }
        
        int numeros[] = new int[3];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Array numeros[" + i + "] = " + numeros[i]);
        }
*/
        System.out.println("Type you 1st number:");
        int num1 = cargarNumero();
        
        System.out.println("Type you 2st number:");
        int num2 = cargarNumero();
        
        System.out.println("Type you 3st number:");
        int num3 = cargarNumero();
        
        numAscendente(num1, num2, num3);
        numDescendente(num1, num2, num3);
    }
    
    private static Integer cargarNumero() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        return num;
    }
    
    private static void numAscendente(int num1, int num2, int num3) {
        
        int numMayor = num1;
        if(num2 > numMayor) {
            numMayor = num2;
        }
        if(num3 > numMayor) {
            numMayor = num3;
        }
        
        int numMenor = num1;
        if(num2 < numMenor) {
            numMenor = num2;
        }
        if(num3 < numMenor) {
            numMenor = num3;
        }
        
        int numMedio = num1;
        if(num2 < numMayor && num2 > numMenor) {
            numMedio = num2;
        }
        if(num3 < numMayor && num3 > numMenor) {
            numMedio = num3;
        }
        
        int result[] = new int[]{numMenor, numMedio, numMayor};
        
        System.out.println("Your numbers from the lowest to the highest are: ");
        
        for(int resultado : result) {
            System.out.println(resultado);
        }
    }
    
    private static void numDescendente(int num1, int num2, int num3) {
        
        int numMayor = num1;
        if(num2 > numMayor) {
            numMayor = num2;
        }
        if(num3 > numMayor) {
            numMayor = num3;
        }
        
        int numMenor = num1;
        if(num2 < numMenor) {
            numMenor = num2;
        }
        if(num3 < numMenor) {
            numMenor = num3;
        }
        
        int numMedio = num1;
        if(num2 > numMenor && num2 < numMayor) {
            numMedio = num2;
        }
        if(num3 > numMenor && num3 < numMayor) {
            numMedio = num3;
        }
        
        int result[] = new int[]{numMayor, numMedio, numMenor};
        
        System.out.println("Your numbers from the highest to the lowest are: ");
        
        for(int resultado : result) {
            System.out.println(resultado);
        }
    }
}