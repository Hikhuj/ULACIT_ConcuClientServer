/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk01wk02;

/**
 *
 * @author roger
 */
public class Arma {
    
    // Atributos
    private int anioCreacion;
    private String tipoArma;

    // Constructores
    public Arma(){
    }

    public Arma(int anioCreacion, String tipoArma) {
        this.anioCreacion = anioCreacion;
        this.tipoArma = tipoArma;
    }
    
    // Metodos
    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    @Override
    public String toString() {
        return "Arma{" + "anioCreacion=" + anioCreacion + ", tipoArma=" + tipoArma + '}';
    }
    
}
