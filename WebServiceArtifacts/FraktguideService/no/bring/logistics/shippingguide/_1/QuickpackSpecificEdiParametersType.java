
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *               This section holds the data required to make a booking for Bring QuickPack.
 *           
 * 
 * <p>Java class for QuickpackSpecificEdiParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickpackSpecificEdiParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpsSpecificEdiParameters" type="{http://www.bring.no/logistics/shippingguide/1.0}UpsSpecificEdiParametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickpackSpecificEdiParametersType", propOrder = {
    "upsSpecificEdiParameters"
})
public class QuickpackSpecificEdiParametersType {

    @XmlElement(name = "UpsSpecificEdiParameters")
    protected UpsSpecificEdiParametersType upsSpecificEdiParameters;

    /**
     * Gets the value of the upsSpecificEdiParameters property.
     * 
     * @return
     *     possible object is
     *     {@link UpsSpecificEdiParametersType }
     *     
     */
    public UpsSpecificEdiParametersType getUpsSpecificEdiParameters() {
        return upsSpecificEdiParameters;
    }

    /**
     * Sets the value of the upsSpecificEdiParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpsSpecificEdiParametersType }
     *     
     */
    public void setUpsSpecificEdiParameters(UpsSpecificEdiParametersType value) {
        this.upsSpecificEdiParameters = value;
    }

}
