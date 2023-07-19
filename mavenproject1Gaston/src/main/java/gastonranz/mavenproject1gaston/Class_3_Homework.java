/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gastonranz.mavenproject1gaston;

/**
 *
 * @author Gaston
 */
public class Class_3_Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            String txt = "Hola, como te va, mi nombre es Gaston Ranz, estoy aquí para realizar este ejercicio.";
            char letra = 'o';
            int resultado = 0;
            
            for(int i = 0; i<txt.length(); i++) {
                if(txt.charAt(i) == letra) {
                    resultado++;
                }
            }
            System.out.println("La letra " + "\"" + letra + "\"" + " aparece " + resultado + " veces.");
          
    }
    
}
