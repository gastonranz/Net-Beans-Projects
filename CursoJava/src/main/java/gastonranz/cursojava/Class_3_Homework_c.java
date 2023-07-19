/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonranz.cursojava;

/**
 *
 * @author Gaston
 */
public class Class_3_Homework_c {
    public static void main(String[] args) {
        
        int numeros[] = new int[]{5,2,16,12,38};
        int numX = 4;
        int sumaNumX = 0;

        for(int i = 0; i < numeros.length; i++) {
            if (numX < numeros[i]) {
                sumaNumX = sumaNumX + numeros[i];
            }
        }
        numX = sumaNumX;
        System.out.println("La suma total de los números mayor a \"numX\" es: " + numX);
        
    }
  }