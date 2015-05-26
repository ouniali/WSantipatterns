
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GramsOfCO2Emitted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalInfoType", propOrder = {
    "gramsOfCO2Emitted"
})
public class EnvironmentalInfoType {

    @XmlElement(name = "GramsOfCO2Emitted", required = true)
    protected String gramsOfCO2Emitted;

    /**
     * Gets the value of the gramsOfCO2Emitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGramsOfCO2Emitted() {
        return gramsOfCO2Emitted;
    }

    /**
     * Sets the value of the gramsOfCO2Emitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGramsOfCO2Emitted(String value) {
        this.gramsOfCO2Emitted = value;
    }

}
