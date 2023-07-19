/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonranz.cursojava;

/**
 *
 * @author Gaston
 */
public class JavaCourse_Exercise4 {
    public static void main(String[] args) {
        /*Armar un programa que muestre los 100 primeros números primos.
        Ejemplo: 2, 3, 5, 7, 11, 13;
        */
        
          int num = 0;
          int i = 1;
          int result = 0;
          int cantidad = 10000;
          int totalPrimos = 0;
          int resultado[] = new int[cantidad];
          
          calculo(num, i, result, totalPrimos, resultado);
            
    }
    
    private static void calculo(int num, int i, int result, int totalPrimos, int[] resultado) {
        boolean numCeroYUnoNoPrimos = num == 0;
        boolean comprobacionNumPrimo = num % i == 0;
        boolean numPrimo = i >= num && result == 2;
        boolean numNoPrimo = result > 2;
        
        while(totalPrimos < 100) {
              if (numCeroYUnoNoPrimos) {
                  num += 2;
                  resultado[num] = num;
                  num++;
                  totalPrimos++;
              }
              if (comprobacionNumPrimo) {
                  result++;
              }
              if (numNoPrimo) {
                  num++;
                  result = 0;
                  i = 0;
              }
              if (numPrimo) {
                  resultado[num] = num;
                  num++;
                  totalPrimos++;
                  result = 0;
                  i = 1;
              }else{
                  i++;   
              }
          }
          System.out.println("Los números primos son ");
          
          for(int recorrido : resultado) {
              if(recorrido > 1) {
              System.out.println(recorrido);
              }
          }
    }
}
    

//          int contador = 0;
//          int num = 0;
//          String datos = "";
//          
//          while(contador < 100) {
//              if(num == 0 || num == 1) {
//                  num = 2;
//              }
//              if(numeroPrimo(num)) {
//                  datos += num + " ";
//                  contador++;
//              }
//              num++;
//          }
//          
//          String[] resultado = datos.split(" ");
//          
//          array(resultado);
//
//    }
//    
//    private static boolean numeroPrimo(int num) {
//        boolean primo = true;
//        
//        for(int i = 2; i < num; i++) {
//            if(num % i == 0) {
//                primo = false;
//            }
//        }
//        return primo;
//    }
//    private static void array(String[] resultado) {
//        for(String recorrido : resultado) {
//            System.out.println(recorrido);
//        }
//    }
//}
