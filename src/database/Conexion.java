/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Conexion {
    // DECLARO LAS VARIABLES DE CONEXION 
    
    private final String DRIVER= "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE = "todobarato";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    public Connection cadena;
    public static Conexion instancia;

    public Conexion() {
        this.cadena = null;
    }
    
    public Connection Conected(){
        try {
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL+DATABASE,USER,PASSWORD);
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getCause());
            
        }
        
        return this.cadena;
        
    
    }  
    
    public void Disconected(){
        try {
            this.cadena.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getCause());
        }
            
    }
    
    // SINCRONIZACION CON LA BASE DE DATOS 
    public synchronized static Conexion getInstancia(){
        if (instancia  == null) {
            instancia = new Conexion();
            
            
        }
        return instancia;
    
    }
    
    
}
