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
public class ArmaMano extends Arma{
    
    // Atributos
    private String tipoArmaMano;
    
    // Constructor

    public ArmaMano() {
        super();
    }

    public ArmaMano(String tipoArmaMano, int anioCreacion, String tipoArma) {
        super(anioCreacion, tipoArma);
        this.tipoArmaMano = tipoArmaMano;
    }

    public String getTipoArmaMano() {
        return tipoArmaMano;
    }

    public void setTipoArmaMano(String tipoArmaMano) {
        this.tipoArmaMano = tipoArmaMano;
    }

    @Override
    public String toString() {
        return "ArmaMano{" + "tipoArmaMano=" + tipoArmaMano + '}';
    }

}
