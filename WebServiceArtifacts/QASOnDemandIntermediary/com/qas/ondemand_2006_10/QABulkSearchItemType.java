
package com.qas.ondemand_2006_10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 VerifyLevel   : The VerifyLevel attribute specifies the level to which the verification engine has
 *                 verified the input address.
 *               
 * 
 * <p>Java class for QABulkSearchItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QABulkSearchItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QAAddress" type="{http://www.qas.com/OnDemand-2006-10}QAAddressType"/>
 *         &lt;element name="InputAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VerifyLevel" type="{http://www.qas.com/OnDemand-2006-10}VerifyLevelType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QABulkSearchItemType", propOrder = {
    "qaAddress",
    "inputAddress"
})
public class QABulkSearchItemType {

    @XmlElement(name = "QAAddress", required = true)
    protected QAAddressType qaAddress;
    @XmlElement(name = "InputAddress", required = true)
    protected String inputAddress;
    @XmlAttribute(name = "VerifyLevel")
    protected VerifyLevelType verifyLevel;

    /**
     * Gets the value of the qaAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QAAddressType }
     *     
     */
    public QAAddressType getQAAddress() {
        return qaAddress;
    }

    /**
     * Sets the value of the qaAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QAAddressType }
     *     
     */
    public void setQAAddress(QAAddressType value) {
        this.qaAddress = value;
    }

    /**
     * Gets the value of the inputAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputAddress() {
        return inputAddress;
    }

    /**
     * Sets the value of the inputAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputAddress(String value) {
        this.inputAddress = value;
    }

    /**
     * Gets the value of the verifyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyLevelType }
     *     
     */
    public VerifyLevelType getVerifyLevel() {
        return verifyLevel;
    }

    /**
     * Sets the value of the verifyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyLevelType }
     *     
     */
    public void setVerifyLevel(VerifyLevelType value) {
        this.verifyLevel = value;
    }

}
