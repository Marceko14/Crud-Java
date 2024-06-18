/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author marcelo
 */
public class Usuarios {
    private int id_user;
    private int id_rol;
    private String nombre;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String celular;
    private String email;
    private String clave;
    private boolean estado;
    // CONSTRUCTOR VACIO 

    public Usuarios() {
    }
    // CONSTRUCTOR CON PARAMETROS

    public Usuarios(int id_user, int id_rol, String nombre, String tipo_documento, String num_documento, String direccion, String celular, String email, String clave, boolean estado) {
        this.id_user = id_user;
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
        this.clave = clave;
        this.estado = estado;
    }
    
    // CREACION DE GETTER AND SETTER 
    

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    // CREACION DEL TO STRING 
    

    @Override
    public String toString() {
        return "Usuarios{" + "id_user=" + id_user + ", id_rol=" + id_rol + ", nombre=" + nombre + ", tipo_documento=" + tipo_documento + ", num_documento=" + num_documento + ", direccion=" + direccion + ", celular=" + celular + ", email=" + email + ", clave=" + clave + ", estado=" + estado + '}';
    }
    
    

    
    
    
}
