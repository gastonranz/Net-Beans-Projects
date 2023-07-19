/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gastonranz.mavenproject1gaston;

/**
 *
 * @author Gaston
 */
public class hiWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte mordida;
        mordida = (byte)127.12;
        System.out.println("mordida=" + mordida);
        
        short corto;
        corto = -32768;
        System.out.println("corto=" + corto);
        
        int entero;
        entero = 2147483647;
        System.out.println("entero=" + entero);
        
        long largo;
        largo = 998714399;
        System.out.println("largo=" + largo);
        
        float flotante;
        flotante = (float)919.64;
        System.out.println("flotante=" + flotante);
        
        //Método "casting" con float versión corta y sencilla.
        float flotante2;
        flotante2 = 1020.64f; //Coloco solo la letra "f" al final.
        System.out.println("flotante=" + flotante2);
        
        double doble;
        doble = 7189.37f;
        System.out.println("doble=" + doble);
        
        char caracter;
        caracter = '@';
        System.out.println("caracter=" + caracter);
        
        boolean boleano;
        boleano = true;
        System.out.println("boleano=" + boleano);
        
        double doble2;
        doble2 = (double)1249871.20;
        System.out.println("doble2=" + doble2);
    }
    
}
