/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec02;

/**
 *
 * @author roger
 */
public class Masajista extends SeleccionFutbol implements Acciones{
    
    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(){
        super();
    }

    // es bueno que los metodos viejos siempre vayan de primero y luego
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    public void darMasaje(){
        System.out.println("El masajista es el unio que da el masaje");
    }

    @Override
    public String toString() {
        return "Masajista{" + super.toString() + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }

    @Override
    public void respirar() {
        System.out.println("El masajista respira");
    }

    @Override
    public void observar() {
        System.out.println("El masajista observa");
    }
    
}
