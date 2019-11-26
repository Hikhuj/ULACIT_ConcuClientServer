
package com.wsliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dolToCol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dolToCol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dolares" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dolToCol", propOrder = {
    "dolares"
})
public class DolToCol {

    @XmlElement(name = "Dolares")
    protected double dolares;

    /**
     * Obtiene el valor de la propiedad dolares.
     * 
     */
    public double getDolares() {
        return dolares;
    }

    /**
     * Define el valor de la propiedad dolares.
     * 
     */
    public void setDolares(double value) {
        this.dolares = value;
    }

}
