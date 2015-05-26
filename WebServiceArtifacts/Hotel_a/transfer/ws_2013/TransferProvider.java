
package transfer.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderLocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferProvider", propOrder = {
    "providerLocationCode",
    "providerDescription",
    "providerLocationType"
})
public class TransferProvider {

    @XmlElement(name = "ProviderLocationCode")
    protected String providerLocationCode;
    @XmlElement(name = "ProviderDescription")
    protected String providerDescription;
    @XmlElement(name = "ProviderLocationType")
    protected String providerLocationType;

    /**
     * Gets the value of the providerLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocationCode() {
        return providerLocationCode;
    }

    /**
     * Sets the value of the providerLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocationCode(String value) {
        this.providerLocationCode = value;
    }

    /**
     * Gets the value of the providerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDescription() {
        return providerDescription;
    }

    /**
     * Sets the value of the providerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDescription(String value) {
        this.providerDescription = value;
    }

    /**
     * Gets the value of the providerLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocationType() {
        return providerLocationType;
    }

    /**
     * Sets the value of the providerLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocationType(String value) {
        this.providerLocationType = value;
    }

}
