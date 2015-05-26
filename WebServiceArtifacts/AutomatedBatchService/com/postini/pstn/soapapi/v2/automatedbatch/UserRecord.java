
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approved_recipients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approved_senders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blocked_senders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext_encrypt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter_adult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter_bulk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter_getrich" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter_offers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter_racial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initial_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="junkmail_filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lang_locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastmod_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message_count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message_limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message_limited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notice_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgtag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virus_notify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virus_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weblocked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="welcome_count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wireless_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRecord", propOrder = {

})
public class UserRecord {

    protected String active;
    protected String address;
    @XmlElement(name = "approved_recipients")
    protected String approvedRecipients;
    @XmlElement(name = "approved_senders")
    protected String approvedSenders;
    @XmlElement(name = "blocked_senders")
    protected String blockedSenders;
    @XmlElement(name = "create_method")
    protected String createMethod;
    @XmlElement(name = "created_date")
    protected String createdDate;
    @XmlElement(name = "ext_encrypt")
    protected String extEncrypt;
    @XmlElement(name = "filter_adult")
    protected String filterAdult;
    @XmlElement(name = "filter_bulk")
    protected String filterBulk;
    @XmlElement(name = "filter_getrich")
    protected String filterGetrich;
    @XmlElement(name = "filter_offers")
    protected String filterOffers;
    @XmlElement(name = "filter_racial")
    protected String filterRacial;
    @XmlElement(name = "initial_password")
    protected String initialPassword;
    @XmlElement(name = "junkmail_filter")
    protected String junkmailFilter;
    @XmlElement(name = "lang_locale")
    protected String langLocale;
    @XmlElement(name = "lastmod_date")
    protected String lastmodDate;
    @XmlElement(name = "message_count")
    protected String messageCount;
    @XmlElement(name = "message_limit")
    protected String messageLimit;
    @XmlElement(name = "message_limited")
    protected String messageLimited;
    @XmlElement(name = "notice_address")
    protected String noticeAddress;
    protected String orgid;
    protected String orgtag;
    protected String password;
    protected String timezone;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "virus_notify")
    protected String virusNotify;
    @XmlElement(name = "virus_state")
    protected String virusState;
    protected String weblocked;
    @XmlElement(name = "welcome_count")
    protected String welcomeCount;
    @XmlElement(name = "wireless_state")
    protected String wirelessState;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the approvedRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedRecipients() {
        return approvedRecipients;
    }

    /**
     * Sets the value of the approvedRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedRecipients(String value) {
        this.approvedRecipients = value;
    }

    /**
     * Gets the value of the approvedSenders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedSenders() {
        return approvedSenders;
    }

    /**
     * Sets the value of the approvedSenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedSenders(String value) {
        this.approvedSenders = value;
    }

    /**
     * Gets the value of the blockedSenders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedSenders() {
        return blockedSenders;
    }

    /**
     * Sets the value of the blockedSenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedSenders(String value) {
        this.blockedSenders = value;
    }

    /**
     * Gets the value of the createMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateMethod() {
        return createMethod;
    }

    /**
     * Sets the value of the createMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateMethod(String value) {
        this.createMethod = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the extEncrypt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtEncrypt() {
        return extEncrypt;
    }

    /**
     * Sets the value of the extEncrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtEncrypt(String value) {
        this.extEncrypt = value;
    }

    /**
     * Gets the value of the filterAdult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAdult() {
        return filterAdult;
    }

    /**
     * Sets the value of the filterAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAdult(String value) {
        this.filterAdult = value;
    }

    /**
     * Gets the value of the filterBulk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterBulk() {
        return filterBulk;
    }

    /**
     * Sets the value of the filterBulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterBulk(String value) {
        this.filterBulk = value;
    }

    /**
     * Gets the value of the filterGetrich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterGetrich() {
        return filterGetrich;
    }

    /**
     * Sets the value of the filterGetrich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterGetrich(String value) {
        this.filterGetrich = value;
    }

    /**
     * Gets the value of the filterOffers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterOffers() {
        return filterOffers;
    }

    /**
     * Sets the value of the filterOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterOffers(String value) {
        this.filterOffers = value;
    }

    /**
     * Gets the value of the filterRacial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterRacial() {
        return filterRacial;
    }

    /**
     * Sets the value of the filterRacial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterRacial(String value) {
        this.filterRacial = value;
    }

    /**
     * Gets the value of the initialPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialPassword() {
        return initialPassword;
    }

    /**
     * Sets the value of the initialPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialPassword(String value) {
        this.initialPassword = value;
    }

    /**
     * Gets the value of the junkmailFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunkmailFilter() {
        return junkmailFilter;
    }

    /**
     * Sets the value of the junkmailFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunkmailFilter(String value) {
        this.junkmailFilter = value;
    }

    /**
     * Gets the value of the langLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangLocale() {
        return langLocale;
    }

    /**
     * Sets the value of the langLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangLocale(String value) {
        this.langLocale = value;
    }

    /**
     * Gets the value of the lastmodDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmodDate() {
        return lastmodDate;
    }

    /**
     * Sets the value of the lastmodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmodDate(String value) {
        this.lastmodDate = value;
    }

    /**
     * Gets the value of the messageCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCount() {
        return messageCount;
    }

    /**
     * Sets the value of the messageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCount(String value) {
        this.messageCount = value;
    }

    /**
     * Gets the value of the messageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLimit() {
        return messageLimit;
    }

    /**
     * Sets the value of the messageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLimit(String value) {
        this.messageLimit = value;
    }

    /**
     * Gets the value of the messageLimited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLimited() {
        return messageLimited;
    }

    /**
     * Sets the value of the messageLimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLimited(String value) {
        this.messageLimited = value;
    }

    /**
     * Gets the value of the noticeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeAddress() {
        return noticeAddress;
    }

    /**
     * Sets the value of the noticeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeAddress(String value) {
        this.noticeAddress = value;
    }

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgid(String value) {
        this.orgid = value;
    }

    /**
     * Gets the value of the orgtag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtag() {
        return orgtag;
    }

    /**
     * Sets the value of the orgtag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtag(String value) {
        this.orgtag = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the virusNotify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirusNotify() {
        return virusNotify;
    }

    /**
     * Sets the value of the virusNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirusNotify(String value) {
        this.virusNotify = value;
    }

    /**
     * Gets the value of the virusState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirusState() {
        return virusState;
    }

    /**
     * Sets the value of the virusState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirusState(String value) {
        this.virusState = value;
    }

    /**
     * Gets the value of the weblocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeblocked() {
        return weblocked;
    }

    /**
     * Sets the value of the weblocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeblocked(String value) {
        this.weblocked = value;
    }

    /**
     * Gets the value of the welcomeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeCount() {
        return welcomeCount;
    }

    /**
     * Sets the value of the welcomeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeCount(String value) {
        this.welcomeCount = value;
    }

    /**
     * Gets the value of the wirelessState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessState() {
        return wirelessState;
    }

    /**
     * Sets the value of the wirelessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessState(String value) {
        this.wirelessState = value;
    }

}
