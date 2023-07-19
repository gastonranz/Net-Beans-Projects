/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonranz.managementsystem.dao;

import com.mysql.cj.util.StringUtils;
import gastonranz.managementsystem.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gaston
 */
public class ClienteDao {
    
    public Connection conectar() {
        String baseDeDatos = "java";
        String usuario = "root";
        String password = "";
        String host = "localhost";
        String puerto = "3306";
        String driver = "com.mysql.cj.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";
        
        Connection conexion = null;
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            
            
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public void agregar(Cliente cliente) {
        
        try {
            Connection conexion = conectar(); //Debo asignarle el valor de la función a la
            // variable "conexion", debido que más abajo la utilizo. Recordar siempre colocar
            // el tipo de variable, como es en este caso "Connection".
            
            String sql = "INSERT INTO `cliente` (`id`, `name`, `last_name`, `email`, `phone_number`) VALUES (NULL, '" + cliente.getName() + "', '" + cliente.getLastName() + "', '" + cliente.getEmail() + "', '" + cliente.getPhoneNumber() + "');";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void update(Cliente cliente) {
        
        try {
            Connection conexion = conectar();
            
            String sql = "UPDATE `cliente` SET `name` = '" + cliente.getName() + "', `last_name` = '" + cliente.getLastName() + "', `email` = '" + cliente.getEmail() + "', `phone_number` = '" + cliente.getPhoneNumber() + "' WHERE `cliente`.`id` =  " + cliente.getId() + ";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Lograr que al abrir la App de gestión de datos, los datos estén ya almacenados en la lista.
    public List<Cliente> listar() { //Me tiene que devolver un listado de clientes (Array).
        
        List<Cliente> arrayLista = new ArrayList<Cliente>();
        
        try {
            Connection conexion = conectar();
            
            String sql = "SELECT * FROM `cliente`";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);//Todos los datos de las consultas estarán aquí.
            while(resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultado.getString("id"));
                cliente.setName(resultado.getString("name"));
                cliente.setLastName(resultado.getString("last_name"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setPhoneNumber(resultado.getString("phone_number"));
                arrayLista.add(cliente);//Por cada recorrido de mi tabla (PHPMyAdmin), cada
              //fila la convierte en un "cliente" y la guarda en mi "arrayLista".
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayLista;
    }
    
    public void eliminar(String numId) {
        
        try {
            Connection conexion = conectar();
            
            String sql = "DELETE FROM `cliente` WHERE `cliente`.`id` = " + numId;
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void save(Cliente cliente) {
        if(StringUtils.isEmptyOrWhitespaceOnly(cliente.getId())) {
            agregar(cliente);
        } else {
            update(cliente);
        }
    }
    
    public void setearId(String id, String valor) {
        
        try {
            Connection conexion = conectar(); //Debo asignarle el valor de la función a la
            // variable "conexion", debido que más abajo la utilizo. Recordar siempre colocar
            // el tipo de variable, como es en este caso "Connection".
            
            String sql = "UPDATE `cliente` SET `id` = '" + valor + "' WHERE `cliente`.`id` =  " + id + ";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setearAllId(int selection) {
        
        try {
            Connection conexion = conectar(); //Debo asignarle el valor de la función a la
            // variable "conexion", debido que más abajo la utilizo. Recordar siempre colocar
            // el tipo de variable, como es en este caso "Connection".
            
            String sql = "ALTER TABLE `cliente` AUTO_INCREMENT= " + (selection + 1) + ";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
