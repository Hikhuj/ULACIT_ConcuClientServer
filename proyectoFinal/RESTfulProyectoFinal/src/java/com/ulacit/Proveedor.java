package com.ulacit;

/**
 *
 * @author proyectoFinal
 */
public class Proveedor {

    //atributos
    private int id;
    private int telefono1;
    private int telefono2;
    private String proveedor;
    private String correo;
    private String direccion;

    //constructor vacio
    public Proveedor() {
    }

    //constructor normal
    public Proveedor(int id, int telefono1, int telefono2, String proveedor, String correo, String direccion) {
        this.id = id;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.proveedor = proveedor;
        this.correo = correo;
        this.direccion = direccion;
    }

    //setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //toString
    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", proveedor=" + proveedor + ", correo=" + correo + ", direccion=" + direccion + '}';
    }

}
