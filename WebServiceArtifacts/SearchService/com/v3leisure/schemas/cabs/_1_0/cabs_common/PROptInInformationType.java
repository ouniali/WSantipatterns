
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PR_OptInInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_OptInInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="opted_in" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="is_blocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="product_count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="opted_in_effective" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="last_opted_in" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="effective_last_opted_out" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="effective_last_opted_in" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="last_opted_out" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_OptInInformationType")
public class PROptInInformationType {

    @XmlAttribute(name = "opted_in", required = true)
    protected boolean optedIn;
    @XmlAttribute(name = "is_blocked", required = true)
    protected boolean isBlocked;
    @XmlAttribute(name = "product_count", required = true)
    protected int productCount;
    @XmlAttribute(name = "opted_in_effective", required = true)
    protected boolean optedInEffective;
    @XmlAttribute(name = "last_opted_in")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOptedIn;
    @XmlAttribute(name = "effective_last_opted_out")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveLastOptedOut;
    @XmlAttribute(name = "effective_last_opted_in")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveLastOptedIn;
    @XmlAttribute(name = "last_opted_out")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOptedOut;

    /**
     * Gets the value of the optedIn property.
     * 
     */
    public boolean isOptedIn() {
        return optedIn;
    }

    /**
     * Sets the value of the optedIn property.
     * 
     */
    public void setOptedIn(boolean value) {
        this.optedIn = value;
    }

    /**
     * Gets the value of the isBlocked property.
     * 
     */
    public boolean isIsBlocked() {
        return isBlocked;
    }

    /**
     * Sets the value of the isBlocked property.
     * 
     */
    public void setIsBlocked(boolean value) {
        this.isBlocked = value;
    }

    /**
     * Gets the value of the productCount property.
     * 
     */
    public int getProductCount() {
        return productCount;
    }

    /**
     * Sets the value of the productCount property.
     * 
     */
    public void setProductCount(int value) {
        this.productCount = value;
    }

    /**
     * Gets the value of the optedInEffective property.
     * 
     */
    public boolean isOptedInEffective() {
        return optedInEffective;
    }

    /**
     * Sets the value of the optedInEffective property.
     * 
     */
    public void setOptedInEffective(boolean value) {
        this.optedInEffective = value;
    }

    /**
     * Gets the value of the lastOptedIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOptedIn() {
        return lastOptedIn;
    }

    /**
     * Sets the value of the lastOptedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOptedIn(XMLGregorianCalendar value) {
        this.lastOptedIn = value;
    }

    /**
     * Gets the value of the effectiveLastOptedOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveLastOptedOut() {
        return effectiveLastOptedOut;
    }

    /**
     * Sets the value of the effectiveLastOptedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveLastOptedOut(XMLGregorianCalendar value) {
        this.effectiveLastOptedOut = value;
    }

    /**
     * Gets the value of the effectiveLastOptedIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveLastOptedIn() {
        return effectiveLastOptedIn;
    }

    /**
     * Sets the value of the effectiveLastOptedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveLastOptedIn(XMLGregorianCalendar value) {
        this.effectiveLastOptedIn = value;
    }

    /**
     * Gets the value of the lastOptedOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOptedOut() {
        return lastOptedOut;
    }

    /**
     * Sets the value of the lastOptedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOptedOut(XMLGregorianCalendar value) {
        this.lastOptedOut = value;
    }

}
