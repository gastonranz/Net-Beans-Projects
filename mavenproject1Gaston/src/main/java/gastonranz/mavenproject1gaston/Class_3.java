/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gastonranz.mavenproject1gaston;

/**
 *
 * @author Gaston
 */
public class Class_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeros[] = new int[10]; //"new" es el método "dinámico" para reservar memoria de ese vector.
        char letras[] = {'a','b','c','e'}; //método llamado "estático" para almacenar memoria en el vector.
        
        numeros[0] = 5;
        numeros[1] = 25;
        numeros[2] = 12;
        numeros[9] = 16;
        letras[0] = 'e';
        float resultado = (float)numeros[0]/2;
//            System.out.println(numeros.length);
            System.out.println(resultado);
        
        //for números.
        for(int indice = 0; indice<numeros.length; indice++) {
            if(numeros[indice] % 2 != 0) {
            System.out.println("numeros=[" + indice + "] = " + numeros[indice]);
            }
        }
        
        //for MEJORADO letras.
        for (char letra : letras) {  // Luego del for creo una nueva variable del mismo tipo del vector y luego ":", seguido el nombre del Array que voy a recorrer.
            if (letra == 'a' || letra == 'b') {
            System.out.println(letra);
            }
        }
        
        //for letras.
        for (int indice = 0; indice<letras.length; indice++) {
            System.out.println("indice [" + indice + "] = " + letras[indice]);
        }
        
        //for mejorado números.
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        String palabra = "Hola";
        palabra.charAt(2);
    }
    
}
