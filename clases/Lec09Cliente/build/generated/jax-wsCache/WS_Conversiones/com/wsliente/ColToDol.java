
package com.wsliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para colToDol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="colToDol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Colones" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "colToDol", propOrder = {
    "colones"
})
public class ColToDol {

    @XmlElement(name = "Colones")
    protected double colones;

    /**
     * Obtiene el valor de la propiedad colones.
     * 
     */
    public double getColones() {
        return colones;
    }

    /**
     * Define el valor de la propiedad colones.
     * 
     */
    public void setColones(double value) {
        this.colones = value;
    }

}
