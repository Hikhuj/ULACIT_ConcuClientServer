/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Profesor extends Persona{
    
    // Atributos
    private int idProfesor;
    private double salario;
    private int cantidadClases;
    
    // Constructor

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, int edad, int idProfesor, double salario, int cantidadClases) {
        super(nombre, apellido, edad);
        this.idProfesor = idProfesor;
        this.salario = salario;
        this.cantidadClases = cantidadClases;
    }

    // Metodos
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "idProfesor=" + idProfesor + ", salario=" + salario + ", cantidadClases=" + cantidadClases + '}';
    }
    
    

    
    
    
    
    
    
    
    
}
