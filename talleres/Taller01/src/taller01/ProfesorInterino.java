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
public class ProfesorInterino extends Profesor{
    
    // Atributos
    private String fechaComienzoInterinidad;
    private String fechaFinalInterinidad;
    
    // Constructor
    public ProfesorInterino() {
        super();
    }

    public ProfesorInterino(String nombre, String apellido, int edad, int idProfesor, double salario, int cantidadClases, String fechaComienzoInterinidad, String fechaFinalInterinidad) {
        super(nombre, apellido, edad, idProfesor, salario, cantidadClases);
        this.fechaComienzoInterinidad = fechaComienzoInterinidad;
        this.fechaFinalInterinidad = fechaFinalInterinidad;
    }

    // Metodos
    public String getFechaComienzoInterinidad() {
        return fechaComienzoInterinidad;
    }

    public void setFechaComienzoInterinidad(String fechaComienzoInterinidad) {
        this.fechaComienzoInterinidad = fechaComienzoInterinidad;
    }

    public String getFechaFinalInterinidad() {
        return fechaFinalInterinidad;
    }

    public void setFechaFinalInterinidad(String fechaFinalInterinidad) {
        this.fechaFinalInterinidad = fechaFinalInterinidad;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" + super.toString() + "fechaComienzoInterinidad=" + fechaComienzoInterinidad + ", fechaFinalInterinidad=" + fechaFinalInterinidad + '}';
    }
    
    /*
    *
    *   METODO PENDIENTE DE REVISAR JUNTO CON LOS ATRIBUTOS
    *
    */
    public void calcularTiempoTrabajo(){
        System.out.println(Integer.parseInt(this.fechaComienzoInterinidad) - Integer.parseInt(this.fechaFinalInterinidad));
    }
    
}
