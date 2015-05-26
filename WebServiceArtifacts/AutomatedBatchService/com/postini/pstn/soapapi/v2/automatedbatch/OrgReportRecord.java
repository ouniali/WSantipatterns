
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgReportRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgReportRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="acc_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bad_isp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bad_sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bulk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bytes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clean_failures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cleanings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inf_deliveries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mmf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naughty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_bh_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_bytes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_f_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_q_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_spams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_viruses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pct_bh_bytes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pct_bh_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pct_f_bytes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pct_f_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pct_q_bytes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pct_q_messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="racial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stored_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="users" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgReportRecord", propOrder = {

})
public class OrgReportRecord {

    @XmlElement(name = "acc_messages")
    protected String accMessages;
    protected String account;
    @XmlElement(name = "bad_isp")
    protected String badIsp;
    @XmlElement(name = "bad_sender")
    protected String badSender;
    protected String bulk;
    protected String bytes;
    @XmlElement(name = "clean_failures")
    protected String cleanFailures;
    protected String cleanings;
    protected String commerce;
    protected String customerid;
    protected String customername;
    protected String deliveries;
    @XmlElement(name = "inf_deliveries")
    protected String infDeliveries;
    protected String messages;
    protected String mmf;
    protected String naughty;
    @XmlElement(name = "num_bh_messages")
    protected String numBhMessages;
    @XmlElement(name = "num_bytes")
    protected String numBytes;
    @XmlElement(name = "num_f_messages")
    protected String numFMessages;
    @XmlElement(name = "num_messages")
    protected String numMessages;
    @XmlElement(name = "num_q_messages")
    protected String numQMessages;
    @XmlElement(name = "num_spams")
    protected String numSpams;
    @XmlElement(name = "num_viruses")
    protected String numViruses;
    @XmlElement(name = "pct_bh_bytes")
    protected String pctBhBytes;
    @XmlElement(name = "pct_bh_messages")
    protected String pctBhMessages;
    @XmlElement(name = "pct_f_bytes")
    protected String pctFBytes;
    @XmlElement(name = "pct_f_messages")
    protected String pctFMessages;
    @XmlElement(name = "pct_q_bytes")
    protected String pctQBytes;
    @XmlElement(name = "pct_q_messages")
    protected String pctQMessages;
    protected String productid;
    protected String racial;
    protected String recip;
    protected String sellerid;
    protected String ssb;
    @XmlElement(name = "stored_size")
    protected String storedSize;
    protected String users;

    /**
     * Gets the value of the accMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccMessages() {
        return accMessages;
    }

    /**
     * Sets the value of the accMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccMessages(String value) {
        this.accMessages = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the badIsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadIsp() {
        return badIsp;
    }

    /**
     * Sets the value of the badIsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadIsp(String value) {
        this.badIsp = value;
    }

    /**
     * Gets the value of the badSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadSender() {
        return badSender;
    }

    /**
     * Sets the value of the badSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadSender(String value) {
        this.badSender = value;
    }

    /**
     * Gets the value of the bulk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulk() {
        return bulk;
    }

    /**
     * Sets the value of the bulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulk(String value) {
        this.bulk = value;
    }

    /**
     * Gets the value of the bytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBytes() {
        return bytes;
    }

    /**
     * Sets the value of the bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBytes(String value) {
        this.bytes = value;
    }

    /**
     * Gets the value of the cleanFailures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanFailures() {
        return cleanFailures;
    }

    /**
     * Sets the value of the cleanFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanFailures(String value) {
        this.cleanFailures = value;
    }

    /**
     * Gets the value of the cleanings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanings() {
        return cleanings;
    }

    /**
     * Sets the value of the cleanings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanings(String value) {
        this.cleanings = value;
    }

    /**
     * Gets the value of the commerce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerce() {
        return commerce;
    }

    /**
     * Sets the value of the commerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerce(String value) {
        this.commerce = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerid(String value) {
        this.customerid = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomername(String value) {
        this.customername = value;
    }

    /**
     * Gets the value of the deliveries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveries() {
        return deliveries;
    }

    /**
     * Sets the value of the deliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveries(String value) {
        this.deliveries = value;
    }

    /**
     * Gets the value of the infDeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfDeliveries() {
        return infDeliveries;
    }

    /**
     * Sets the value of the infDeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfDeliveries(String value) {
        this.infDeliveries = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessages(String value) {
        this.messages = value;
    }

    /**
     * Gets the value of the mmf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmf() {
        return mmf;
    }

    /**
     * Sets the value of the mmf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmf(String value) {
        this.mmf = value;
    }

    /**
     * Gets the value of the naughty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaughty() {
        return naughty;
    }

    /**
     * Sets the value of the naughty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaughty(String value) {
        this.naughty = value;
    }

    /**
     * Gets the value of the numBhMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBhMessages() {
        return numBhMessages;
    }

    /**
     * Sets the value of the numBhMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBhMessages(String value) {
        this.numBhMessages = value;
    }

    /**
     * Gets the value of the numBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBytes() {
        return numBytes;
    }

    /**
     * Sets the value of the numBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBytes(String value) {
        this.numBytes = value;
    }

    /**
     * Gets the value of the numFMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFMessages() {
        return numFMessages;
    }

    /**
     * Sets the value of the numFMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFMessages(String value) {
        this.numFMessages = value;
    }

    /**
     * Gets the value of the numMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumMessages() {
        return numMessages;
    }

    /**
     * Sets the value of the numMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumMessages(String value) {
        this.numMessages = value;
    }

    /**
     * Gets the value of the numQMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumQMessages() {
        return numQMessages;
    }

    /**
     * Sets the value of the numQMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumQMessages(String value) {
        this.numQMessages = value;
    }

    /**
     * Gets the value of the numSpams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSpams() {
        return numSpams;
    }

    /**
     * Sets the value of the numSpams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSpams(String value) {
        this.numSpams = value;
    }

    /**
     * Gets the value of the numViruses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumViruses() {
        return numViruses;
    }

    /**
     * Sets the value of the numViruses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumViruses(String value) {
        this.numViruses = value;
    }

    /**
     * Gets the value of the pctBhBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctBhBytes() {
        return pctBhBytes;
    }

    /**
     * Sets the value of the pctBhBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctBhBytes(String value) {
        this.pctBhBytes = value;
    }

    /**
     * Gets the value of the pctBhMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctBhMessages() {
        return pctBhMessages;
    }

    /**
     * Sets the value of the pctBhMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctBhMessages(String value) {
        this.pctBhMessages = value;
    }

    /**
     * Gets the value of the pctFBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctFBytes() {
        return pctFBytes;
    }

    /**
     * Sets the value of the pctFBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctFBytes(String value) {
        this.pctFBytes = value;
    }

    /**
     * Gets the value of the pctFMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctFMessages() {
        return pctFMessages;
    }

    /**
     * Sets the value of the pctFMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctFMessages(String value) {
        this.pctFMessages = value;
    }

    /**
     * Gets the value of the pctQBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctQBytes() {
        return pctQBytes;
    }

    /**
     * Sets the value of the pctQBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctQBytes(String value) {
        this.pctQBytes = value;
    }

    /**
     * Gets the value of the pctQMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctQMessages() {
        return pctQMessages;
    }

    /**
     * Sets the value of the pctQMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctQMessages(String value) {
        this.pctQMessages = value;
    }

    /**
     * Gets the value of the productid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductid() {
        return productid;
    }

    /**
     * Sets the value of the productid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductid(String value) {
        this.productid = value;
    }

    /**
     * Gets the value of the racial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacial() {
        return racial;
    }

    /**
     * Sets the value of the racial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacial(String value) {
        this.racial = value;
    }

    /**
     * Gets the value of the recip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecip() {
        return recip;
    }

    /**
     * Sets the value of the recip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecip(String value) {
        this.recip = value;
    }

    /**
     * Gets the value of the sellerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerid() {
        return sellerid;
    }

    /**
     * Sets the value of the sellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerid(String value) {
        this.sellerid = value;
    }

    /**
     * Gets the value of the ssb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsb() {
        return ssb;
    }

    /**
     * Sets the value of the ssb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsb(String value) {
        this.ssb = value;
    }

    /**
     * Gets the value of the storedSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoredSize() {
        return storedSize;
    }

    /**
     * Sets the value of the storedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoredSize(String value) {
        this.storedSize = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsers(String value) {
        this.users = value;
    }

}
