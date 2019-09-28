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
public class ArmaProyeccion extends Arma{
    
    // Atributos
    private String tipoDeProyectil;
    
    // Constructores
    public ArmaProyeccion(){
        super();
    }
    
    public ArmaProyeccion(int anioCreacion, String tipoArma, String tipoDeProyectil) {
        super(anioCreacion, tipoArma);
        this.tipoDeProyectil = tipoDeProyectil;
    }
    
    // Metodos
    public String getTipoDeProyectil() {
        return tipoDeProyectil;
    }

    public void setTipoDeProyectil(String tipoDeProyectil) {
        this.tipoDeProyectil = tipoDeProyectil;
    }

    @Override
    public String toString() {
        return "ArmaProyeccion{" + super.toString() + "tipoDeProyectil=" + tipoDeProyectil + '}';
    }
    
}
