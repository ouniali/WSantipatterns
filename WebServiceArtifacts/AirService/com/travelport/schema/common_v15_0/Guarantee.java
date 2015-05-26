
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CreditCard" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}OtherGuaranteeInfo" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Guarantee"/>
 *             &lt;enumeration value="Deposit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ReuseFOP" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ExternalReference" type="{http://www.travelport.com/schema/common_v15_0}typeExternalReference" />
 *       &lt;attribute name="Reusable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "otherGuaranteeInfo"
})
@XmlRootElement(name = "Guarantee")
public class Guarantee {

    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "OtherGuaranteeInfo")
    protected OtherGuaranteeInfo otherGuaranteeInfo;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ReuseFOP")
    protected String reuseFOP;
    @XmlAttribute(name = "ExternalReference")
    protected String externalReference;
    @XmlAttribute(name = "Reusable")
    protected Boolean reusable;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the otherGuaranteeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherGuaranteeInfo }
     *     
     */
    public OtherGuaranteeInfo getOtherGuaranteeInfo() {
        return otherGuaranteeInfo;
    }

    /**
     * Sets the value of the otherGuaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherGuaranteeInfo }
     *     
     */
    public void setOtherGuaranteeInfo(OtherGuaranteeInfo value) {
        this.otherGuaranteeInfo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the reuseFOP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseFOP() {
        return reuseFOP;
    }

    /**
     * Sets the value of the reuseFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuseFOP(String value) {
        this.reuseFOP = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the reusable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReusable() {
        if (reusable == null) {
            return false;
        } else {
            return reusable;
        }
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusable(Boolean value) {
        this.reusable = value;
    }

}
