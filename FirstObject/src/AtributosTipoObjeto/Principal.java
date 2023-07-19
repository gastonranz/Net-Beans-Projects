/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AtributosTipoObjeto;

/**
 *
 * @author Gaston
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor engine = new Motor("1-823-982-1", 3.0, "Fuel");
        Motor engine2 = new Motor();
        Motor engine3 = new Motor(null, 0, null);
        
        Auto car = new Auto("ABC123", "Ford", "Black", 100030, engine);
        Auto car2 = new Auto(engine2);
        Auto car3 = new Auto("Yellow", 7720182, engine3);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        
        System.out.println("Motor auto 1: " + car.getEngine());
        System.out.println("Motor auto 2: " + car2.getEngine());
        System.out.println("Motor auto 3: " + car3.getEngine());
        System.out.println();
        
        System.out.println("Engine 1: " + engine);
        System.out.println("Engine 2: " + engine2);
        System.out.println("Engine 3: " + engine3);
        System.out.println();
        System.out.println();
        
        //1 Ejemplo: Así NO hay que realizar el código por más que funcione.
        //Este codigo es más bien estructurado. Estoy generando muchas dependencias de más.
        //Al utilizar "Getters" de otros objetos no uso el paradigma "Tell, don't ask".
        //Estoy utilizando la lógica dentro de este "método main" y debería delegar esa lógica a cada objeto.
        car.getEngine().setRpmActuales(car.getEngine().getRpmActuales() + 1000);
        System.out.println(car);
        System.out.println(car.getEngine());
        car.getEngine().setRpmActuales(car.getEngine().getRpmActuales() + 2001);
        System.out.println(car);
        System.out.println(car.getEngine());
        System.out.println();
        
        //Lógica evolución 2
        car2.acelerar(1000);
        System.out.println(car2);
        System.out.println(car2.getEngine());
        car2.acelerar(2000);
        System.out.println(car2);
        System.out.println(car2.getEngine());
        System.out.println();
        
        //Lógica de la evolución terminada, así debería ser la lógica.
        car3.acelerar(1000);
        System.out.println(car3);
        //Utilizo directamente el método de instancia del propio "Objeto Auto" sin tener que
        //solicitar miembros de los demás objetos (Auto y Motor), de esta forma no ejecuto la
        //lógica de los demás objetos dentro de esta clase generando dependencias, sino que cada
        //objeto se responsabiliza de su propia lógica y de esta forma obtengo un mejor encapsulamiento
        //sin necesidad de conocer a los demás miembros de los otros Objetos sin dejar de hacer funcional
        //el código. No genero de esta manera ningún "USO O DEPENDENCIA DE NINGÚN OBJETO HACIA ESTA CLASE".
        System.out.println(car3);
        System.out.println(car3.getEngine());
        car3.acelerar(2000);
        System.out.println(car3);
    }
    
}
