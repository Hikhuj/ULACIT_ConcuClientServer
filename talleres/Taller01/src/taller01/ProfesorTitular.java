/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author roger
 */
public class ProfesorTitular extends Profesor{
    
    // Atributos
    private String fechaNombrado;
    
    // Constructor
    public ProfesorTitular() {
        super();
    }

    public ProfesorTitular(String nombre, String apellido, int edad, int idProfesor, double salario, int cantidadClases, String FechaNombrado) {
        super(nombre, apellido, edad, idProfesor, salario, cantidadClases);
        this.fechaNombrado = FechaNombrado;
    }
    
    // Metodos
    public String getFechaNombrado() {
        return fechaNombrado;
    }

    public void setFechaNombrado(String fechaNombrado) {
        this.fechaNombrado = fechaNombrado;
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" + super.toString() + "FechaNombrado=" + fechaNombrado + '}';
    }
    
    /*
    *
    *   METODO PENDIENTE DE REVISAR JUNTO CON LOS ATRIBUTOS
    *
    */
    public void desplegarAniosExperiencia(){
        //System.out.println(Integer.parseInt(this.fechaNombrado) - Integer.parseInt(tFECHA ACTUAL));
    }
    
}
