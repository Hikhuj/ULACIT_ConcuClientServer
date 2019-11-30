/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;


/**
 *
 * @author roger
 */
public class Resultado {
    
    private String nombre;
    private double promedioApunte;
    private double promedioDisparo;
    private int puntajeTotal;

    public Resultado(){
        
    }
    
    public Resultado(String nombre, double promedioApunte, double promedioDisparo, int puntajeTotal) {
        this.nombre = nombre;
        this.promedioApunte = promedioApunte;
        this.promedioDisparo = promedioDisparo;
        this.puntajeTotal = puntajeTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedioApunte() {
        return promedioApunte;
    }

    public void setPromedioApunte(double promedioApunte) {
        this.promedioApunte = promedioApunte;
    }

    public double getPromedioDisparo() {
        return promedioDisparo;
    }

    public void setPromedioDisparo(double promedioDisparo) {
        this.promedioDisparo = promedioDisparo;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }
    
    
    
}
