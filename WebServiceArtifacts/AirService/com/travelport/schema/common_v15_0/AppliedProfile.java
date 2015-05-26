
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="TravelerID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TravelerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ImmediateParentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ImmediateParentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AppliedProfile")
public class AppliedProfile {

    @XmlAttribute(name = "TravelerID")
    protected String travelerID;
    @XmlAttribute(name = "TravelerName")
    protected String travelerName;
    @XmlAttribute(name = "AccountID")
    protected String accountID;
    @XmlAttribute(name = "AccountName")
    protected String accountName;
    @XmlAttribute(name = "ImmediateParentID")
    protected String immediateParentID;
    @XmlAttribute(name = "ImmediateParentName")
    protected String immediateParentName;

    /**
     * Gets the value of the travelerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerID() {
        return travelerID;
    }

    /**
     * Sets the value of the travelerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerID(String value) {
        this.travelerID = value;
    }

    /**
     * Gets the value of the travelerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerName() {
        return travelerName;
    }

    /**
     * Sets the value of the travelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerName(String value) {
        this.travelerName = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the immediateParentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediateParentID() {
        return immediateParentID;
    }

    /**
     * Sets the value of the immediateParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmediateParentID(String value) {
        this.immediateParentID = value;
    }

    /**
     * Gets the value of the immediateParentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediateParentName() {
        return immediateParentName;
    }

    /**
     * Sets the value of the immediateParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmediateParentName(String value) {
        this.immediateParentName = value;
    }

}
