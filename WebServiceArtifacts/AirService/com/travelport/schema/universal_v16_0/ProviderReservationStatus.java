
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v15_0.TypeResultMessage;


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
 *         &lt;element name="CancelInfo" type="{http://www.travelport.com/schema/common_v15_0}typeResultMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CreateDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeProviderCode" />
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeProviderLocatorCode" />
 *       &lt;attribute name="Cancelled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelInfo"
})
@XmlRootElement(name = "ProviderReservationStatus")
public class ProviderReservationStatus {

    @XmlElement(name = "CancelInfo")
    protected TypeResultMessage cancelInfo;
    @XmlAttribute(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "ModifiedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;
    @XmlAttribute(name = "Cancelled", required = true)
    protected boolean cancelled;

    /**
     * Gets the value of the cancelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeResultMessage }
     *     
     */
    public TypeResultMessage getCancelInfo() {
        return cancelInfo;
    }

    /**
     * Sets the value of the cancelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeResultMessage }
     *     
     */
    public void setCancelInfo(TypeResultMessage value) {
        this.cancelInfo = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(boolean value) {
        this.cancelled = value;
    }

}
