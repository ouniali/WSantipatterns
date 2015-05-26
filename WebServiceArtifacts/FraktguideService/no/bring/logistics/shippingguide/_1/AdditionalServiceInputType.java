
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServiceInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AdditionalServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalServiceParameters" type="{http://www.bring.no/logistics/shippingguide/1.0}AdditionalServiceInputParametersType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServiceInputType", propOrder = {

})
public class AdditionalServiceInputType {

    @XmlElement(name = "AdditionalServiceId", required = true)
    protected String additionalServiceId;
    @XmlElement(name = "AdditionalServiceParameters")
    protected AdditionalServiceInputParametersType additionalServiceParameters;

    /**
     * Gets the value of the additionalServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceId() {
        return additionalServiceId;
    }

    /**
     * Sets the value of the additionalServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceId(String value) {
        this.additionalServiceId = value;
    }

    /**
     * Gets the value of the additionalServiceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceInputParametersType }
     *     
     */
    public AdditionalServiceInputParametersType getAdditionalServiceParameters() {
        return additionalServiceParameters;
    }

    /**
     * Sets the value of the additionalServiceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceInputParametersType }
     *     
     */
    public void setAdditionalServiceParameters(AdditionalServiceInputParametersType value) {
        this.additionalServiceParameters = value;
    }

}
