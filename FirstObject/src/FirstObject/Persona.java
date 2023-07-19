/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstObject;

/**
 *
 * @author Gaston
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String puesto;
    private int id;
    private static int idSiguiente = 1;
    private int numero;
    private static int num = 1;
    
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.apellido = "Mike";
        this.edad = edad;
        this.puesto = "Gerente";
        this.id = Persona.idSiguiente;
        Persona.idSiguiente++;
    }
    
    public Persona(String name) {
        this.setNombre(name);
        this.id = Persona.idSiguiente;
        Persona.idSiguiente++;
    }
    
    public Persona() {
        this.setNombre(null);
        this.id = Persona.idSiguiente;
        Persona.idSiguiente++;
    }
    
    
    public static void main(String[] args) {
        Principal a = new Principal(20);
        a.hacerAlgo();
    }
    
    
    static {
        System.out.println("This is the first method of this clas \"Persona\"!");
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
            this.numero = Persona.num;
            Persona.num++;
        } else {
            this.numero = Persona.num;
            this.nombre = "Person";
            Persona.num++;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public int getId() {
        return id;
    }
    
    public static int getIdSiguiente() {
        return idSiguiente;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public static int getNum() {
        return Persona.num;
    }
    
    public void showData() {
        System.out.println("name: " + this.nombre + " " + this.numero + " Last Name: " + this.apellido + " Age: " + this.edad + " Puesto: " + this.puesto + " Id: " + id + " NextId: " + Persona.idSiguiente);
    }
    
    public static String nextIdNumber() {
        return "Next \"Id number\" is: " + Persona.idSiguiente;
    }
     
    public int IdNumber() {
        return Persona.idSiguiente;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", puesto=" + puesto + ", id=" + id + ", numero=" + numero + '}';
    }
    
}
