
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PrePayId"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PrePayCustomer" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PrePayAccount" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Affiliations" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AccountRelatedRules" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreatorID" type="{http://www.travelport.com/schema/common_v15_0}typeCardNumber" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePayId",
    "prePayCustomer",
    "prePayAccount",
    "affiliations",
    "accountRelatedRules"
})
@XmlRootElement(name = "PrePayProfileInfo")
public class PrePayProfileInfo {

    @XmlElement(name = "PrePayId", required = true)
    protected PrePayId prePayId;
    @XmlElement(name = "PrePayCustomer")
    protected PrePayCustomer prePayCustomer;
    @XmlElement(name = "PrePayAccount")
    protected PrePayAccount prePayAccount;
    @XmlElement(name = "Affiliations")
    protected List<Affiliations> affiliations;
    @XmlElement(name = "AccountRelatedRules")
    protected AccountRelatedRules accountRelatedRules;
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;

    /**
     * Pre pay unique identifier detail.This information block is returned both in list and  detail retrieve transactions.Example flight pass number
     * 
     * @return
     *     possible object is
     *     {@link PrePayId }
     *     
     */
    public PrePayId getPrePayId() {
        return prePayId;
    }

    /**
     * Sets the value of the prePayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayId }
     *     
     */
    public void setPrePayId(PrePayId value) {
        this.prePayId = value;
    }

    /**
     * Pre pay customer detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayCustomer }
     *     
     */
    public PrePayCustomer getPrePayCustomer() {
        return prePayCustomer;
    }

    /**
     * Sets the value of the prePayCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayCustomer }
     *     
     */
    public void setPrePayCustomer(PrePayCustomer value) {
        this.prePayCustomer = value;
    }

    /**
     * Pre pay account detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayAccount }
     *     
     */
    public PrePayAccount getPrePayAccount() {
        return prePayAccount;
    }

    /**
     * Sets the value of the prePayAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayAccount }
     *     
     */
    public void setPrePayAccount(PrePayAccount value) {
        this.prePayAccount = value;
    }

    /**
     * Pre pay affiliations detail.This information block is returned only in detail retrieve transactions.Gets the value of the affiliations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Affiliations }
     * 
     * 
     */
    public List<Affiliations> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<Affiliations>();
        }
        return this.affiliations;
    }

    /**
     * Pre pay account related rules.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link AccountRelatedRules }
     *     
     */
    public AccountRelatedRules getAccountRelatedRules() {
        return accountRelatedRules;
    }

    /**
     * Sets the value of the accountRelatedRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRelatedRules }
     *     
     */
    public void setAccountRelatedRules(AccountRelatedRules value) {
        this.accountRelatedRules = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

}
