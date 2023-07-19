/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gastonranz.mavenproject1gaston;

/**
 *
 * @author Gaston
 */
public class Class_3_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int number[] = new int[4];
        float number[] = new float[4];
        char letter[] = {'a','b','c'};
        
        number[0] = 5;
        number[1] = 2;
        number[2] = 10;
        number[3] = 243;
        //int inicial = 2;
        
        letter[1] = 'z';
        
        //System.out.println(number.length);
        //System.out.println(inicial + number[2]);
        
//        for (int initial = 0; initial<number.length; initial++) {
//            System.out.println(initial + number[initial]);
//        }
//        
//        for (int i = 0; i<=number.length; i++) {
//            System.out.println("number = [" + i + "] = " + number[i]);
//        }
//        
        //for mejorado
        int valor = 0;
        for (float numero : number) {
            System.out.println("numero = [" + valor + "] = " + numero/2);
            valor++;
        }
        
//        float result = number[valor] / 2;
//        System.out.println(result);
            
    }
    
}
