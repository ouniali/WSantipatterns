
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BondLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BondLookup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="CUSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}BondTypes"/>
 *         &lt;element name="PaymentFrequency" type="{http://www.xignite.com/services/}PaymentFrequencyTypes"/>
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuctionCloseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoodysRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondLookup", propOrder = {
    "cusip",
    "name",
    "type",
    "paymentFrequency",
    "coupon",
    "maturityDate",
    "auctionCloseDate",
    "settlementDate",
    "issueDate",
    "datedDate",
    "moodysRating",
    "spRating"
})
public class BondLookup
    extends Common
{

    @XmlElement(name = "CUSIP")
    protected String cusip;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected BondTypes type;
    @XmlElement(name = "PaymentFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentFrequencyTypes paymentFrequency;
    @XmlElement(name = "Coupon")
    protected double coupon;
    @XmlElement(name = "MaturityDate")
    protected String maturityDate;
    @XmlElement(name = "AuctionCloseDate")
    protected String auctionCloseDate;
    @XmlElement(name = "SettlementDate")
    protected String settlementDate;
    @XmlElement(name = "IssueDate")
    protected String issueDate;
    @XmlElement(name = "DatedDate")
    protected String datedDate;
    @XmlElement(name = "MoodysRating")
    protected String moodysRating;
    @XmlElement(name = "SPRating")
    protected String spRating;

    /**
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
        return cusip;
    }

    /**
     * Sets the value of the cusip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSIP(String value) {
        this.cusip = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BondTypes }
     *     
     */
    public BondTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondTypes }
     *     
     */
    public void setType(BondTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the paymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequencyTypes }
     *     
     */
    public PaymentFrequencyTypes getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequencyTypes }
     *     
     */
    public void setPaymentFrequency(PaymentFrequencyTypes value) {
        this.paymentFrequency = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     */
    public double getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     */
    public void setCoupon(double value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityDate(String value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the auctionCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionCloseDate() {
        return auctionCloseDate;
    }

    /**
     * Sets the value of the auctionCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionCloseDate(String value) {
        this.auctionCloseDate = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementDate(String value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the datedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedDate() {
        return datedDate;
    }

    /**
     * Sets the value of the datedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedDate(String value) {
        this.datedDate = value;
    }

    /**
     * Gets the value of the moodysRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoodysRating() {
        return moodysRating;
    }

    /**
     * Sets the value of the moodysRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoodysRating(String value) {
        this.moodysRating = value;
    }

    /**
     * Gets the value of the spRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRating() {
        return spRating;
    }

    /**
     * Sets the value of the spRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRating(String value) {
        this.spRating = value;
    }

}
