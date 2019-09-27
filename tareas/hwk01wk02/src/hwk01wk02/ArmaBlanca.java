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
public class ArmaBlanca extends Arma{
    
    private int largoHoja;

    public ArmaBlanca() {
        super();
    }

    public ArmaBlanca(String numeroSerie, String nombreFabricante, String tipoDeArma, int largoHoja) {
        super(numeroSerie, nombreFabricante, tipoDeArma);
        this.largoHoja = largoHoja;
    }

    public int getLargoHoja() {
        return largoHoja;
    }

    public void setLargoHoja(int largoHoja) {
        this.largoHoja = largoHoja;
    }

    @Override
    public String toString() {
        return "ArmaBlanca{" + super.toString() + "largoHoja=" + largoHoja + '}';
    }
    
    
    
    
    
}
