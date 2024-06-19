/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Conexion conexion = new Conexion();
        
        // LLAMAMOS AL METODO CONECTAR
        conexion.Conected();
        
        if (conexion.cadena != null) {
            JOptionPane.showMessageDialog(null, "base de datos conectado");
            
        } else {
            JOptionPane.showMessageDialog(null, "Base de datos desconectado");
            
        }
    }
    
}
