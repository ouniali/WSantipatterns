
package com.xifin.schema.accessionsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.xifin.schema.types.NameType;


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
 *         &lt;element name="PayorName" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="SubscriberId" type="{http://www.xifin.com/schema/types}DescriptionType" minOccurs="0"/>
 *         &lt;element name="InsuredName" type="{http://www.xifin.com/schema/types}NameType" minOccurs="0"/>
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
    "payorName",
    "subscriberId",
    "insuredName"
})
@XmlRootElement(name = "InsuranceInfo")
public class InsuranceInfo {

    @XmlElement(name = "PayorName")
    protected String payorName;
    @XmlElement(name = "SubscriberId")
    protected String subscriberId;
    @XmlElement(name = "InsuredName")
    protected NameType insuredName;

    /**
     * Gets the value of the payorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorName() {
        return payorName;
    }

    /**
     * Sets the value of the payorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorName(String value) {
        this.payorName = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setInsuredName(NameType value) {
        this.insuredName = value;
    }

}
