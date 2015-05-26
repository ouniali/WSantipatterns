
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuerTransformations" type="{http://www.xignite.com/services/}ArrayOfIssuerTransformation" minOccurs="0"/>
 *         &lt;element name="InstrumentTransformations" type="{http://www.xignite.com/services/}ArrayOfInstrumentTransformation" minOccurs="0"/>
 *         &lt;element name="IssuerAttributeChanges" type="{http://www.xignite.com/services/}ArrayOfIssuerAttributeChange" minOccurs="0"/>
 *         &lt;element name="InstrumentAttributeChanges" type="{http://www.xignite.com/services/}ArrayOfInstrumentAttributeChange" minOccurs="0"/>
 *         &lt;element name="SecurityAttributeChanges" type="{http://www.xignite.com/services/}ArrayOfSecurityAttributeChange" minOccurs="0"/>
 *         &lt;element name="SplitHistories" type="{http://www.xignite.com/services/}ArrayOfSplitHistory" minOccurs="0"/>
 *         &lt;element name="DividendHistories" type="{http://www.xignite.com/services/}ArrayOfDividendHistory" minOccurs="0"/>
 *         &lt;element name="PaymentHistories" type="{http://www.xignite.com/services/}ArrayOfPaymentHistory" minOccurs="0"/>
 *         &lt;element name="ActionProperties" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action", propOrder = {
    "type",
    "status",
    "issuerTransformations",
    "instrumentTransformations",
    "issuerAttributeChanges",
    "instrumentAttributeChanges",
    "securityAttributeChanges",
    "splitHistories",
    "dividendHistories",
    "paymentHistories",
    "actionProperties"
})
public class Action {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "IssuerTransformations")
    protected ArrayOfIssuerTransformation issuerTransformations;
    @XmlElement(name = "InstrumentTransformations")
    protected ArrayOfInstrumentTransformation instrumentTransformations;
    @XmlElement(name = "IssuerAttributeChanges")
    protected ArrayOfIssuerAttributeChange issuerAttributeChanges;
    @XmlElement(name = "InstrumentAttributeChanges")
    protected ArrayOfInstrumentAttributeChange instrumentAttributeChanges;
    @XmlElement(name = "SecurityAttributeChanges")
    protected ArrayOfSecurityAttributeChange securityAttributeChanges;
    @XmlElement(name = "SplitHistories")
    protected ArrayOfSplitHistory splitHistories;
    @XmlElement(name = "DividendHistories")
    protected ArrayOfDividendHistory dividendHistories;
    @XmlElement(name = "PaymentHistories")
    protected ArrayOfPaymentHistory paymentHistories;
    @XmlElement(name = "ActionProperties")
    protected ArrayOfCustomAttribute actionProperties;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the issuerTransformations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerTransformation }
     *     
     */
    public ArrayOfIssuerTransformation getIssuerTransformations() {
        return issuerTransformations;
    }

    /**
     * Sets the value of the issuerTransformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerTransformation }
     *     
     */
    public void setIssuerTransformations(ArrayOfIssuerTransformation value) {
        this.issuerTransformations = value;
    }

    /**
     * Gets the value of the instrumentTransformations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public ArrayOfInstrumentTransformation getInstrumentTransformations() {
        return instrumentTransformations;
    }

    /**
     * Sets the value of the instrumentTransformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public void setInstrumentTransformations(ArrayOfInstrumentTransformation value) {
        this.instrumentTransformations = value;
    }

    /**
     * Gets the value of the issuerAttributeChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerAttributeChange }
     *     
     */
    public ArrayOfIssuerAttributeChange getIssuerAttributeChanges() {
        return issuerAttributeChanges;
    }

    /**
     * Sets the value of the issuerAttributeChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerAttributeChange }
     *     
     */
    public void setIssuerAttributeChanges(ArrayOfIssuerAttributeChange value) {
        this.issuerAttributeChanges = value;
    }

    /**
     * Gets the value of the instrumentAttributeChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentAttributeChange }
     *     
     */
    public ArrayOfInstrumentAttributeChange getInstrumentAttributeChanges() {
        return instrumentAttributeChanges;
    }

    /**
     * Sets the value of the instrumentAttributeChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentAttributeChange }
     *     
     */
    public void setInstrumentAttributeChanges(ArrayOfInstrumentAttributeChange value) {
        this.instrumentAttributeChanges = value;
    }

    /**
     * Gets the value of the securityAttributeChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public ArrayOfSecurityAttributeChange getSecurityAttributeChanges() {
        return securityAttributeChanges;
    }

    /**
     * Sets the value of the securityAttributeChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityAttributeChange }
     *     
     */
    public void setSecurityAttributeChanges(ArrayOfSecurityAttributeChange value) {
        this.securityAttributeChanges = value;
    }

    /**
     * Gets the value of the splitHistories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public ArrayOfSplitHistory getSplitHistories() {
        return splitHistories;
    }

    /**
     * Sets the value of the splitHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public void setSplitHistories(ArrayOfSplitHistory value) {
        this.splitHistories = value;
    }

    /**
     * Gets the value of the dividendHistories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDividendHistory }
     *     
     */
    public ArrayOfDividendHistory getDividendHistories() {
        return dividendHistories;
    }

    /**
     * Sets the value of the dividendHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDividendHistory }
     *     
     */
    public void setDividendHistories(ArrayOfDividendHistory value) {
        this.dividendHistories = value;
    }

    /**
     * Gets the value of the paymentHistories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentHistory }
     *     
     */
    public ArrayOfPaymentHistory getPaymentHistories() {
        return paymentHistories;
    }

    /**
     * Sets the value of the paymentHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentHistory }
     *     
     */
    public void setPaymentHistories(ArrayOfPaymentHistory value) {
        this.paymentHistories = value;
    }

    /**
     * Gets the value of the actionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public ArrayOfCustomAttribute getActionProperties() {
        return actionProperties;
    }

    /**
     * Sets the value of the actionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public void setActionProperties(ArrayOfCustomAttribute value) {
        this.actionProperties = value;
    }

}
