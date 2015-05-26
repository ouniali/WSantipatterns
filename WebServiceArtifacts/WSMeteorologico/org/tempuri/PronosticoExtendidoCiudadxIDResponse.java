
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pronosticoExtendidoCiudadxIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pronosticoExtendidoCiudadxIDResult"
})
@XmlRootElement(name = "pronosticoExtendidoCiudadxIDResponse")
public class PronosticoExtendidoCiudadxIDResponse {

    protected String pronosticoExtendidoCiudadxIDResult;

    /**
     * Gets the value of the pronosticoExtendidoCiudadxIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPronosticoExtendidoCiudadxIDResult() {
        return pronosticoExtendidoCiudadxIDResult;
    }

    /**
     * Sets the value of the pronosticoExtendidoCiudadxIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPronosticoExtendidoCiudadxIDResult(String value) {
        this.pronosticoExtendidoCiudadxIDResult = value;
    }

}
