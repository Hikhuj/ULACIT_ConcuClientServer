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
public class ArmaArrojadiza extends Arma{
    
    // Atributos
    private String nombreArmaArrojadiza;
    private float pesoArmaArrojadiza;
    private String tipoArmaArrojadiza;
    private boolean armaPoseeMango;
    
    // Constructores
    public ArmaArrojadiza(){
        super();
    }

    public ArmaArrojadiza(String nombreArmaArrojadiza, float pesoArmaArrojadiza, String tipoArmaArrojadiza, boolean armaPoseeMango, int anioCreacion, String tipoArma) {
        super(anioCreacion, tipoArma);
        this.nombreArmaArrojadiza = nombreArmaArrojadiza;
        this.pesoArmaArrojadiza = pesoArmaArrojadiza;
        this.tipoArmaArrojadiza = tipoArmaArrojadiza;
        this.armaPoseeMango = armaPoseeMango;
    }

    // Metodos
    public String getNombreArmaArrojadiza() {
        return nombreArmaArrojadiza;
    }

    public void setNombreArmaArrojadiza(String nombreArmaArrojadiza) {
        this.nombreArmaArrojadiza = nombreArmaArrojadiza;
    }

    public float getPesoArmaArrojadiza() {
        return pesoArmaArrojadiza;
    }

    public void setPesoArmaArrojadiza(float pesoArmaArrojadiza) {
        this.pesoArmaArrojadiza = pesoArmaArrojadiza;
    }

    public String getTipoArmaArrojadiza() {
        return tipoArmaArrojadiza;
    }

    public void setTipoArmaArrojadiza(String tipoArmaArrojadiza) {
        this.tipoArmaArrojadiza = tipoArmaArrojadiza;
    }

    public boolean isArmaPoseeMango() {
        return armaPoseeMango;
    }

    public void setArmaPoseeMango(boolean armaPoseeMango) {
        this.armaPoseeMango = armaPoseeMango;
    }

    @Override
    public String toString() {
        return "ArmaArrojadiza{" + super.toString() + "nombreArmaArrojadiza=" + nombreArmaArrojadiza + ", pesoArmaArrojadiza=" + pesoArmaArrojadiza + ", tipoArmaArrojadiza=" + tipoArmaArrojadiza + ", armaPoseeMango=" + armaPoseeMango + '}';
    }
    
}
