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
    private String nombreFabricante;
    private String tipoDeArma;

    public Arma() {
    }

    public Arma(String nombreFabricante, String tipoDeArma) {
        this.nombreFabricante = nombreFabricante;
        this.tipoDeArma = tipoDeArma;
    }

    public String getTipoDeArma() {
        return tipoDeArma;
    }

    public void setTipoDeArma(String tipoDeArma) {
        this.tipoDeArma = tipoDeArma;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombreFabricante=" + nombreFabricante + ", tipoDeArma=" + tipoDeArma + '}';
    }
    
}
