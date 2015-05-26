
package com.travelport.schema.universal_v16_0;

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
 *       &lt;attribute name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BranchID" type="{http://www.travelport.com/schema/common_v15_0}typeBranchId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchAccount")
public class SearchAccount {

    @XmlAttribute(name = "ClientID")
    protected String clientID;
    @XmlAttribute(name = "BranchID")
    protected String branchID;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the branchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchID() {
        return branchID;
    }

    /**
     * Sets the value of the branchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchID(String value) {
        this.branchID = value;
    }

}
