
package com.peninsulatruck.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quoteDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quoteDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grossCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessorialAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fscAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsNoonAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsAmAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movePoints" type="{http://peninsulatruck.com/WebServices/}ArrayOfMovePoint" minOccurs="0"/>
 *         &lt;element name="rateDetail" type="{http://peninsulatruck.com/WebServices/}ArrayOfRateItem" minOccurs="0"/>
 *         &lt;element name="accessorialDetail" type="{http://peninsulatruck.com/WebServices/}ArrayOfAccessorialItem" minOccurs="0"/>
 *         &lt;element name="totalWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fscPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transitTime" type="{http://peninsulatruck.com/WebServices/}ArrayOfTransitItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quoteDetail", propOrder = {
    "quoteNumber",
    "quoteDate",
    "quoteExpirationDate",
    "accountNumber",
    "grossCharge",
    "discountAmount",
    "accessorialAmount",
    "fscAmount",
    "totalCharge",
    "gsNoonAmount",
    "gsAmAmount",
    "movePoints",
    "rateDetail",
    "accessorialDetail",
    "totalWeight",
    "discountPercent",
    "fscPercent",
    "asWeight",
    "codAmount",
    "serviceType",
    "transitTime"
})
public class QuoteDetail {

    protected String quoteNumber;
    protected String quoteDate;
    protected String quoteExpirationDate;
    protected String accountNumber;
    protected String grossCharge;
    protected String discountAmount;
    protected String accessorialAmount;
    protected String fscAmount;
    protected String totalCharge;
    protected String gsNoonAmount;
    protected String gsAmAmount;
    protected ArrayOfMovePoint movePoints;
    protected ArrayOfRateItem rateDetail;
    protected ArrayOfAccessorialItem accessorialDetail;
    protected String totalWeight;
    protected String discountPercent;
    protected String fscPercent;
    protected String asWeight;
    protected String codAmount;
    protected String serviceType;
    protected ArrayOfTransitItem transitTime;

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the quoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteDate() {
        return quoteDate;
    }

    /**
     * Sets the value of the quoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteDate(String value) {
        this.quoteDate = value;
    }

    /**
     * Gets the value of the quoteExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteExpirationDate() {
        return quoteExpirationDate;
    }

    /**
     * Sets the value of the quoteExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteExpirationDate(String value) {
        this.quoteExpirationDate = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the grossCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossCharge() {
        return grossCharge;
    }

    /**
     * Sets the value of the grossCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossCharge(String value) {
        this.grossCharge = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the accessorialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessorialAmount() {
        return accessorialAmount;
    }

    /**
     * Sets the value of the accessorialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessorialAmount(String value) {
        this.accessorialAmount = value;
    }

    /**
     * Gets the value of the fscAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFscAmount() {
        return fscAmount;
    }

    /**
     * Sets the value of the fscAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFscAmount(String value) {
        this.fscAmount = value;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCharge(String value) {
        this.totalCharge = value;
    }

    /**
     * Gets the value of the gsNoonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsNoonAmount() {
        return gsNoonAmount;
    }

    /**
     * Sets the value of the gsNoonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsNoonAmount(String value) {
        this.gsNoonAmount = value;
    }

    /**
     * Gets the value of the gsAmAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsAmAmount() {
        return gsAmAmount;
    }

    /**
     * Sets the value of the gsAmAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsAmAmount(String value) {
        this.gsAmAmount = value;
    }

    /**
     * Gets the value of the movePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMovePoint }
     *     
     */
    public ArrayOfMovePoint getMovePoints() {
        return movePoints;
    }

    /**
     * Sets the value of the movePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMovePoint }
     *     
     */
    public void setMovePoints(ArrayOfMovePoint value) {
        this.movePoints = value;
    }

    /**
     * Gets the value of the rateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateItem }
     *     
     */
    public ArrayOfRateItem getRateDetail() {
        return rateDetail;
    }

    /**
     * Sets the value of the rateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateItem }
     *     
     */
    public void setRateDetail(ArrayOfRateItem value) {
        this.rateDetail = value;
    }

    /**
     * Gets the value of the accessorialDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccessorialItem }
     *     
     */
    public ArrayOfAccessorialItem getAccessorialDetail() {
        return accessorialDetail;
    }

    /**
     * Sets the value of the accessorialDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccessorialItem }
     *     
     */
    public void setAccessorialDetail(ArrayOfAccessorialItem value) {
        this.accessorialDetail = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalWeight(String value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercent(String value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the fscPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFscPercent() {
        return fscPercent;
    }

    /**
     * Sets the value of the fscPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFscPercent(String value) {
        this.fscPercent = value;
    }

    /**
     * Gets the value of the asWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsWeight() {
        return asWeight;
    }

    /**
     * Sets the value of the asWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsWeight(String value) {
        this.asWeight = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAmount(String value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the transitTime property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransitItem }
     *     
     */
    public ArrayOfTransitItem getTransitTime() {
        return transitTime;
    }

    /**
     * Sets the value of the transitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransitItem }
     *     
     */
    public void setTransitTime(ArrayOfTransitItem value) {
        this.transitTime = value;
    }

}
