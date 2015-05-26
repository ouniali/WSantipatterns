
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Agency Payment.
 * 
 * <p>Java class for typeAgencyPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAgencyPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AgencyBillingIdentifier" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="128"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AgencyBillingNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="128"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AgencyBillingPassword">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="128"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyPayment")
public class TypeAgencyPayment {

    @XmlAttribute(name = "AgencyBillingIdentifier", required = true)
    protected String agencyBillingIdentifier;
    @XmlAttribute(name = "AgencyBillingNumber")
    protected String agencyBillingNumber;
    @XmlAttribute(name = "AgencyBillingPassword")
    protected String agencyBillingPassword;

    /**
     * Gets the value of the agencyBillingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingIdentifier() {
        return agencyBillingIdentifier;
    }

    /**
     * Sets the value of the agencyBillingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBillingIdentifier(String value) {
        this.agencyBillingIdentifier = value;
    }

    /**
     * Gets the value of the agencyBillingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingNumber() {
        return agencyBillingNumber;
    }

    /**
     * Sets the value of the agencyBillingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBillingNumber(String value) {
        this.agencyBillingNumber = value;
    }

    /**
     * Gets the value of the agencyBillingPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBillingPassword() {
        return agencyBillingPassword;
    }

    /**
     * Sets the value of the agencyBillingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBillingPassword(String value) {
        this.agencyBillingPassword = value;
    }

}
