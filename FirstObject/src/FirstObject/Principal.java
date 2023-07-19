/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FirstObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author Gaston
 */
public class Principal {
    private int a = 0; //No deja de ser una clase como para cualquier otro objeto.
    
    public Principal(int num) {
        this.a = num;
        System.out.println("Constructor");
    }
    
    public void hacerAlgo() {
        System.out.println("Do Something");
    }
    static {//Puede instanciarse un método de instancia sin su tipo de retorno ni el nombre del método si no va a reutilizarse.
        System.out.println("Hi world");
    }
    
private static String nombre = "Gaston";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        Scanner a = new Scanner(System.in);
//        System.out.println("Escribe un número: ");
//        int num = a.nextInt();
//        System.out.println("Escogiste un " + num + " Congratulations!");
          Principal per1 = new Principal(20);
          per1.hacerAlgo();
          System.out.println(per1.a);
          Principal per2 = new Principal(100);
          System.out.println(per2.a);
          Principal.nombre = "Ranz";
          System.out.println(Principal.nombre);
          System.out.println();

          Car auto = new Car();
//        System.out.println(auto.patente + " " + auto.color + " " + " " + auto.esAltagama);

          auto.setPatente("ABC123");
//        String color = auto.color;
          auto.setColor("Yellow");
//        color = "yellow";
//        Integer kms = 2000;
          auto.setKms(2000);
          auto.setAltaGama(true);
          System.out.println("The Yellow car is \"Alta Gama\": " + auto.getAltaGama());
          double autoValor = auto.getValor();
          String[] arrayAuto = auto.getColor().split("e");
          System.out.println("arrayAuto [" + 1 + "] = " + arrayAuto[1]);


          Car auto2 = auto;

          Car auto3 = auto2; // auto3 no es un objeto, es una nueva VARIABLE (sin valor asignado);
          System.out.println(auto3.getColor());
          auto2.setColor("Red");
          System.out.println(auto);
          System.out.println(auto2);
          System.out.println(auto3);
          System.out.println(auto.getColor());
          auto3.setColor("White");
          System.out.println(auto.getColor());

//        System.out.println(auto.color);


//        System.out.println(auto);
//        auto2.color = "Red";
//        System.out.println(auto2.color);
          System.out.println();



        CuentaBancaria bank = new CuentaBancaria("gastonranz", "Peso", "Caja de Ahorro");
            
            bank.showData();
//          bank.setCBU(null);
            bank.setCBU();
            bank.setAlias(null);
            bank.showData();
            bank.showIdentificador();
            
            double saldo = bank.getSaldo();
            System.out.println(saldo);
            bank.deposito(2000);
            saldo = bank.getSaldo();
            System.out.println(saldo);
            bank.deposito(3500);
            
            System.out.println(bank.getSaldo());
            bank.extraccion(800);
            saldo = bank.getSaldo();
            System.out.println(saldo);
            
            auto.setValor(104799);
            autoValor = auto.getValor();
            System.out.println("El valor del auto es: " + autoValor);
            saldo = bank.deposito(100000);
            saldo = bank.deposito(100000);
            bank.setSaldo(auto.compraAuto(saldo, saldo));
            System.out.println(bank.getSaldo());

            bank.showData();
            
            CuentaBancaria bank2 = new CuentaBancaria("KimWilde", "Dollar", "Caja de Ahorro");
            bank2.showData();
            
            CuentaBancaria bank3 = new CuentaBancaria("pesetas");
            bank3.deposito(1000000);
            bank3.showData();
            System.out.println();
            
            
            Robot robot = new Robot(null);
            robot.setName("-------- Robocop ---------");
            System.out.println(robot.getName());
            Robot robot2 = new Robot("------- Terminator -------");
            robot2.personName("Gaston");
            Robot robot3 = new Robot();
            robot.personName();
            robot.personName('g');
            robot.personName();
            System.out.println();
            
            String infoBank = bank.toString();
            String infoBank2 = bank2.toString();
            String infoBank3 = bank3.toString();
            System.out.println(infoBank);
            System.out.println(bank);
            System.out.println(infoBank2);
            System.out.println(infoBank3);
            System.out.println(new CuentaBancaria());
            bank.showData();
            System.out.println(robot);
            System.out.println();
            
            
            Persona p1 = new Persona("Marco", 28);
            System.out.println(p1.getNombre());
            Persona p2 = new Persona("Kim",30);
            p2.showData();
            Persona p3 = new Persona("Gaston", 28);
            p3.showData();
            Persona p4 = new Persona("Michael", 20);
            p4.showData();
            p1.showData();
            p2.showData();
            System.out.println(Persona.nextIdNumber());
            System.out.println(Persona.getIdSiguiente());
            System.out.println();
            
            
            Persona persona = new Persona();
            System.out.println(persona.getNombre() + " " + persona.getNumero());
            persona.showData();
            Persona persona1 = new Persona();
            persona1.showData();
            Persona persona2 = new Persona();
            persona2.showData();
            System.out.println(Persona.getNum());
            System.out.println(persona.getNombre());
            Persona persona3 = new Persona("Kim");
            persona3.showData();
            System.out.println(persona.getApellido() + " " + Persona.getNum());
            System.out.println(persona);
            System.out.println(persona1);
            System.out.println(persona2);
            System.out.println(persona3);
            Persona persona4 = new Persona("Marylin");
            System.out.println(persona4);
            
            suma();
    }
    
    public static void suma() { 
        System.out.println(1 + 2);
    }
    
    private static double deposito(double monto, double saldo) {
        if(monto >= 0) {
        saldo = saldo + monto;
      //saldo += monto;
        } else {
            System.out.println("Type a positive number!");
        }
        return saldo;
    }
    
    private static void mensaje(CuentaBancaria bank) throws IOException {
        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboard);
        System.out.println("Ingrese un número: ");
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);
        
        if(num == 1) {
            System.out.println("El identificador de \"bank\" es: " + bank);
        } else {
            System.out.println("Have a nice day!");
        }
    }
}
