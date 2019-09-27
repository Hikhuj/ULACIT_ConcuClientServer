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
public class ArmaQuimica extends Arma{
    
    String composicion;

    public ArmaQuimica() {
        super();
    }

    public ArmaQuimica(String numeroSerie, String nombreFabricante, String tipoDeArma, String composicion) {
        super(numeroSerie, nombreFabricante, tipoDeArma);
        this.composicion = composicion;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    @Override
    public String toString() {
        return "ArmaQuimica{" + super.toString() + "composicion=" + composicion + '}';
    }
    
    
    
    
    
}
