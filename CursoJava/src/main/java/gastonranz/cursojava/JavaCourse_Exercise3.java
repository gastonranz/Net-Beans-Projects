/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonranz.cursojava;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Gaston
 */
public class JavaCourse_Exercise3 {
    public static void main(String[] args) throws IOException {
        //Crear un programa que permita ingresar un número y luego mostrar si
        //ese número es "par" o "impar".
        /*
        System.out.println("Welcome!\nThis program will get you a number and will show you if it's an even number or an odd number.\nLet's get started!");
        System.out.println("Please type a number: ");
        Double numero = Double.valueOf(cargarNumero());
        
        //boolean numero = (numero % 2) == 0;
        boolean numeroPar = numero / 2 == Math.round(numero) / 2;
        parImpar(numeroPar);
    }
    
    private static Integer cargarNumero() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
     /**Double num = Double.parseDouble(strNum);
      * También puedo generar un tipo "Double" de variable a retorno y realizar
      * un "Double.parseDouble(strNum);"
        return num;
    }
        
    private static void parImpar(boolean par) {
        if (par) {
            System.out.println("Your number is Even.");
        } else {
            System.out.println("Your number is Odd.");
        }*/
/*
        String word = "Hi, my name is Gastón Ranz, I'm 28 years old.";
        char letter = 'e';
        int result = 0;
        
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                result++;
            }
        }
        System.out.println("Letter " + "\"" + letter + "\"" + " appears " + result + " times.");
*/
        Integer numbers[] = new Integer[7]; //{8, 10, 24, 95, 2, 13, 108}
        
        System.out.println("Type your 1st out of 7th number from the \"number Array\":");
        numbers[0] = cargarNumero();
        System.out.println("Type your 2nd out of 7th number from the \"number Array\":");
        numbers[1] = cargarNumero();
        System.out.println("Type your 3rd out of 7th number from the \"number Array\":");
        numbers[2] = cargarNumero();
        System.out.println("Type your 4th out of 7th number from the \"number Array\":");
        numbers[3] = cargarNumero();
        System.out.println("Type your 5th out of 7th number from the \"number Array\":");
        numbers[4] = cargarNumero();
        System.out.println("Type your 6th out of 7th number from the \"number Array\":");
        numbers[5] = cargarNumero();
        System.out.println("Type your 7th out of 7th number from the \"number Array\":");
        numbers[6] = cargarNumero();
        
        System.out.println("Type your \"X\" number:");
        Integer numX = cargarNumero();
        
        System.out.println("La suma de todos los números del \"Array numbers\" mayores al número \"X\" es:");
        
        cantidadNumX(numbers, numX);
    }
    
    private static Integer cargarNumero() throws IOException{
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        return num;
    }
    
    private static void cantidadNumX(Integer[] numbers, int numX) {
        
        Integer result = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if(numX < numbers[i]) {
                result = result + numbers[i];
            }
        }
        numX = result;
        System.out.println(numX);
    }
    
}
