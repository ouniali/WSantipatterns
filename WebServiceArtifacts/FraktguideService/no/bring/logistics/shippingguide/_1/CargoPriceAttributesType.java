
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CargoPriceAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoPriceAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubAgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoPriceAttributesType", propOrder = {
    "agreementName",
    "agreementNumber",
    "subAgreementNumber"
})
public class CargoPriceAttributesType {

    @XmlElement(name = "AgreementName", required = true)
    protected String agreementName;
    @XmlElement(name = "AgreementNumber", required = true)
    protected String agreementNumber;
    @XmlElement(name = "SubAgreementNumber", required = true)
    protected String subAgreementNumber;

    /**
     * Gets the value of the agreementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementName() {
        return agreementName;
    }

    /**
     * Sets the value of the agreementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementName(String value) {
        this.agreementName = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the subAgreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgreementNumber() {
        return subAgreementNumber;
    }

    /**
     * Sets the value of the subAgreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgreementNumber(String value) {
        this.subAgreementNumber = value;
    }

}
