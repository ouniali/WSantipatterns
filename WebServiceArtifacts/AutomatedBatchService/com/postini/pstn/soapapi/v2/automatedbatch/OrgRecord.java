
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="approved_senders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="async_bounce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="at_notify_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authentication_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authentication_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autocreate_smtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autocreate_web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blatant_spam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blocked_senders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bounce_fragments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="default_message_limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="default_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disable_first_spam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disposition_virus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext_encrypt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="footer_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="im_enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="im_external_enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="im_proto_enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_email_config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lang_locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastmod_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="max_message_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ndr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="non_account_bounce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="non_account_virus_scan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="out_at_notify_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outbound_max_message_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outbound_virus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outbound_virus_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qsum_actionable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qsum_enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtine_redir_atq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtine_redir_ndr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtine_redir_out_atq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtine_redir_out_virus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtine_redir_spam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtine_redir_virus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarantine_links" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarsum_links" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remotecmd_secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spam_notify_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="support_contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagonly_spam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tls_notify_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tls_notify_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virus_clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virus_notify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="welcome_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zero_hour_notify_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zero_hour_scan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zero_hour_waiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgRecord", propOrder = {

})
public class OrgRecord {

    @XmlElement(name = "approved_senders")
    protected String approvedSenders;
    protected String archive;
    @XmlElement(name = "async_bounce")
    protected String asyncBounce;
    @XmlElement(name = "at_notify_on")
    protected String atNotifyOn;
    @XmlElement(name = "authentication_data")
    protected String authenticationData;
    @XmlElement(name = "authentication_type")
    protected String authenticationType;
    @XmlElement(name = "autocreate_smtp")
    protected String autocreateSmtp;
    @XmlElement(name = "autocreate_web")
    protected String autocreateWeb;
    @XmlElement(name = "blatant_spam")
    protected String blatantSpam;
    @XmlElement(name = "blocked_senders")
    protected String blockedSenders;
    @XmlElement(name = "bounce_fragments")
    protected String bounceFragments;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "create_method")
    protected String createMethod;
    @XmlElement(name = "created_date")
    protected String createdDate;
    protected String creator;
    @XmlElement(name = "default_message_limit")
    protected String defaultMessageLimit;
    @XmlElement(name = "default_user")
    protected String defaultUser;
    @XmlElement(name = "disable_first_spam")
    protected String disableFirstSpam;
    @XmlElement(name = "disposition_virus")
    protected String dispositionVirus;
    @XmlElement(name = "ext_encrypt")
    protected String extEncrypt;
    @XmlElement(name = "footer_on")
    protected String footerOn;
    protected String iid;
    @XmlElement(name = "im_enable")
    protected String imEnable;
    @XmlElement(name = "im_external_enable")
    protected String imExternalEnable;
    @XmlElement(name = "im_proto_enable")
    protected String imProtoEnable;
    @XmlElement(name = "is_email_config")
    protected String isEmailConfig;
    @XmlElement(name = "lang_locale")
    protected String langLocale;
    @XmlElement(name = "lastmod_date")
    protected String lastmodDate;
    @XmlElement(name = "max_message_size")
    protected String maxMessageSize;
    protected String ndr;
    @XmlElement(name = "non_account_bounce")
    protected String nonAccountBounce;
    @XmlElement(name = "non_account_virus_scan")
    protected String nonAccountVirusScan;
    protected String orgname;
    @XmlElement(name = "out_at_notify_on")
    protected String outAtNotifyOn;
    @XmlElement(name = "outbound_max_message_size")
    protected String outboundMaxMessageSize;
    @XmlElement(name = "outbound_virus")
    protected String outboundVirus;
    @XmlElement(name = "outbound_virus_disposition")
    protected String outboundVirusDisposition;
    @XmlElement(name = "parent_org")
    protected String parentOrg;
    @XmlElement(name = "qsum_actionable")
    protected String qsumActionable;
    @XmlElement(name = "qsum_enable")
    protected String qsumEnable;
    @XmlElement(name = "qtine_redir_atq")
    protected String qtineRedirAtq;
    @XmlElement(name = "qtine_redir_ndr")
    protected String qtineRedirNdr;
    @XmlElement(name = "qtine_redir_out_atq")
    protected String qtineRedirOutAtq;
    @XmlElement(name = "qtine_redir_out_virus")
    protected String qtineRedirOutVirus;
    @XmlElement(name = "qtine_redir_spam")
    protected String qtineRedirSpam;
    @XmlElement(name = "qtine_redir_virus")
    protected String qtineRedirVirus;
    @XmlElement(name = "quarantine_links")
    protected String quarantineLinks;
    @XmlElement(name = "quarsum_links")
    protected String quarsumLinks;
    @XmlElement(name = "remotecmd_secret")
    protected String remotecmdSecret;
    @XmlElement(name = "spam_notify_on")
    protected String spamNotifyOn;
    @XmlElement(name = "support_contact")
    protected String supportContact;
    @XmlElement(name = "tagonly_spam")
    protected String tagonlySpam;
    protected String timezone;
    @XmlElement(name = "tls_notify_admin")
    protected String tlsNotifyAdmin;
    @XmlElement(name = "tls_notify_on")
    protected String tlsNotifyOn;
    @XmlElement(name = "virus_clean")
    protected String virusClean;
    @XmlElement(name = "virus_notify")
    protected String virusNotify;
    @XmlElement(name = "welcome_on")
    protected String welcomeOn;
    @XmlElement(name = "zero_hour_notify_on")
    protected String zeroHourNotifyOn;
    @XmlElement(name = "zero_hour_scan")
    protected String zeroHourScan;
    @XmlElement(name = "zero_hour_waiver")
    protected String zeroHourWaiver;

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
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchive(String value) {
        this.archive = value;
    }

    /**
     * Gets the value of the asyncBounce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncBounce() {
        return asyncBounce;
    }

    /**
     * Sets the value of the asyncBounce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncBounce(String value) {
        this.asyncBounce = value;
    }

    /**
     * Gets the value of the atNotifyOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtNotifyOn() {
        return atNotifyOn;
    }

    /**
     * Sets the value of the atNotifyOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtNotifyOn(String value) {
        this.atNotifyOn = value;
    }

    /**
     * Gets the value of the authenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Sets the value of the authenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationData(String value) {
        this.authenticationData = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the autocreateSmtp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutocreateSmtp() {
        return autocreateSmtp;
    }

    /**
     * Sets the value of the autocreateSmtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutocreateSmtp(String value) {
        this.autocreateSmtp = value;
    }

    /**
     * Gets the value of the autocreateWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutocreateWeb() {
        return autocreateWeb;
    }

    /**
     * Sets the value of the autocreateWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutocreateWeb(String value) {
        this.autocreateWeb = value;
    }

    /**
     * Gets the value of the blatantSpam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlatantSpam() {
        return blatantSpam;
    }

    /**
     * Sets the value of the blatantSpam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlatantSpam(String value) {
        this.blatantSpam = value;
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
     * Gets the value of the bounceFragments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBounceFragments() {
        return bounceFragments;
    }

    /**
     * Sets the value of the bounceFragments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBounceFragments(String value) {
        this.bounceFragments = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the defaultMessageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultMessageLimit() {
        return defaultMessageLimit;
    }

    /**
     * Sets the value of the defaultMessageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultMessageLimit(String value) {
        this.defaultMessageLimit = value;
    }

    /**
     * Gets the value of the defaultUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultUser() {
        return defaultUser;
    }

    /**
     * Sets the value of the defaultUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultUser(String value) {
        this.defaultUser = value;
    }

    /**
     * Gets the value of the disableFirstSpam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableFirstSpam() {
        return disableFirstSpam;
    }

    /**
     * Sets the value of the disableFirstSpam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableFirstSpam(String value) {
        this.disableFirstSpam = value;
    }

    /**
     * Gets the value of the dispositionVirus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionVirus() {
        return dispositionVirus;
    }

    /**
     * Sets the value of the dispositionVirus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionVirus(String value) {
        this.dispositionVirus = value;
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
     * Gets the value of the footerOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooterOn() {
        return footerOn;
    }

    /**
     * Sets the value of the footerOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooterOn(String value) {
        this.footerOn = value;
    }

    /**
     * Gets the value of the iid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIid() {
        return iid;
    }

    /**
     * Sets the value of the iid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIid(String value) {
        this.iid = value;
    }

    /**
     * Gets the value of the imEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImEnable() {
        return imEnable;
    }

    /**
     * Sets the value of the imEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImEnable(String value) {
        this.imEnable = value;
    }

    /**
     * Gets the value of the imExternalEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImExternalEnable() {
        return imExternalEnable;
    }

    /**
     * Sets the value of the imExternalEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImExternalEnable(String value) {
        this.imExternalEnable = value;
    }

    /**
     * Gets the value of the imProtoEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImProtoEnable() {
        return imProtoEnable;
    }

    /**
     * Sets the value of the imProtoEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImProtoEnable(String value) {
        this.imProtoEnable = value;
    }

    /**
     * Gets the value of the isEmailConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEmailConfig() {
        return isEmailConfig;
    }

    /**
     * Sets the value of the isEmailConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEmailConfig(String value) {
        this.isEmailConfig = value;
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
     * Gets the value of the maxMessageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMessageSize() {
        return maxMessageSize;
    }

    /**
     * Sets the value of the maxMessageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMessageSize(String value) {
        this.maxMessageSize = value;
    }

    /**
     * Gets the value of the ndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdr() {
        return ndr;
    }

    /**
     * Sets the value of the ndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdr(String value) {
        this.ndr = value;
    }

    /**
     * Gets the value of the nonAccountBounce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonAccountBounce() {
        return nonAccountBounce;
    }

    /**
     * Sets the value of the nonAccountBounce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonAccountBounce(String value) {
        this.nonAccountBounce = value;
    }

    /**
     * Gets the value of the nonAccountVirusScan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonAccountVirusScan() {
        return nonAccountVirusScan;
    }

    /**
     * Sets the value of the nonAccountVirusScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonAccountVirusScan(String value) {
        this.nonAccountVirusScan = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the outAtNotifyOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAtNotifyOn() {
        return outAtNotifyOn;
    }

    /**
     * Sets the value of the outAtNotifyOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAtNotifyOn(String value) {
        this.outAtNotifyOn = value;
    }

    /**
     * Gets the value of the outboundMaxMessageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundMaxMessageSize() {
        return outboundMaxMessageSize;
    }

    /**
     * Sets the value of the outboundMaxMessageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundMaxMessageSize(String value) {
        this.outboundMaxMessageSize = value;
    }

    /**
     * Gets the value of the outboundVirus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundVirus() {
        return outboundVirus;
    }

    /**
     * Sets the value of the outboundVirus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundVirus(String value) {
        this.outboundVirus = value;
    }

    /**
     * Gets the value of the outboundVirusDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundVirusDisposition() {
        return outboundVirusDisposition;
    }

    /**
     * Sets the value of the outboundVirusDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundVirusDisposition(String value) {
        this.outboundVirusDisposition = value;
    }

    /**
     * Gets the value of the parentOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrg() {
        return parentOrg;
    }

    /**
     * Sets the value of the parentOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrg(String value) {
        this.parentOrg = value;
    }

    /**
     * Gets the value of the qsumActionable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsumActionable() {
        return qsumActionable;
    }

    /**
     * Sets the value of the qsumActionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsumActionable(String value) {
        this.qsumActionable = value;
    }

    /**
     * Gets the value of the qsumEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsumEnable() {
        return qsumEnable;
    }

    /**
     * Sets the value of the qsumEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsumEnable(String value) {
        this.qsumEnable = value;
    }

    /**
     * Gets the value of the qtineRedirAtq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtineRedirAtq() {
        return qtineRedirAtq;
    }

    /**
     * Sets the value of the qtineRedirAtq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtineRedirAtq(String value) {
        this.qtineRedirAtq = value;
    }

    /**
     * Gets the value of the qtineRedirNdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtineRedirNdr() {
        return qtineRedirNdr;
    }

    /**
     * Sets the value of the qtineRedirNdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtineRedirNdr(String value) {
        this.qtineRedirNdr = value;
    }

    /**
     * Gets the value of the qtineRedirOutAtq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtineRedirOutAtq() {
        return qtineRedirOutAtq;
    }

    /**
     * Sets the value of the qtineRedirOutAtq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtineRedirOutAtq(String value) {
        this.qtineRedirOutAtq = value;
    }

    /**
     * Gets the value of the qtineRedirOutVirus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtineRedirOutVirus() {
        return qtineRedirOutVirus;
    }

    /**
     * Sets the value of the qtineRedirOutVirus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtineRedirOutVirus(String value) {
        this.qtineRedirOutVirus = value;
    }

    /**
     * Gets the value of the qtineRedirSpam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtineRedirSpam() {
        return qtineRedirSpam;
    }

    /**
     * Sets the value of the qtineRedirSpam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtineRedirSpam(String value) {
        this.qtineRedirSpam = value;
    }

    /**
     * Gets the value of the qtineRedirVirus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtineRedirVirus() {
        return qtineRedirVirus;
    }

    /**
     * Sets the value of the qtineRedirVirus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtineRedirVirus(String value) {
        this.qtineRedirVirus = value;
    }

    /**
     * Gets the value of the quarantineLinks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineLinks() {
        return quarantineLinks;
    }

    /**
     * Sets the value of the quarantineLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineLinks(String value) {
        this.quarantineLinks = value;
    }

    /**
     * Gets the value of the quarsumLinks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarsumLinks() {
        return quarsumLinks;
    }

    /**
     * Sets the value of the quarsumLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarsumLinks(String value) {
        this.quarsumLinks = value;
    }

    /**
     * Gets the value of the remotecmdSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotecmdSecret() {
        return remotecmdSecret;
    }

    /**
     * Sets the value of the remotecmdSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotecmdSecret(String value) {
        this.remotecmdSecret = value;
    }

    /**
     * Gets the value of the spamNotifyOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpamNotifyOn() {
        return spamNotifyOn;
    }

    /**
     * Sets the value of the spamNotifyOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpamNotifyOn(String value) {
        this.spamNotifyOn = value;
    }

    /**
     * Gets the value of the supportContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportContact() {
        return supportContact;
    }

    /**
     * Sets the value of the supportContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportContact(String value) {
        this.supportContact = value;
    }

    /**
     * Gets the value of the tagonlySpam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagonlySpam() {
        return tagonlySpam;
    }

    /**
     * Sets the value of the tagonlySpam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagonlySpam(String value) {
        this.tagonlySpam = value;
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
     * Gets the value of the tlsNotifyAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlsNotifyAdmin() {
        return tlsNotifyAdmin;
    }

    /**
     * Sets the value of the tlsNotifyAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlsNotifyAdmin(String value) {
        this.tlsNotifyAdmin = value;
    }

    /**
     * Gets the value of the tlsNotifyOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlsNotifyOn() {
        return tlsNotifyOn;
    }

    /**
     * Sets the value of the tlsNotifyOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlsNotifyOn(String value) {
        this.tlsNotifyOn = value;
    }

    /**
     * Gets the value of the virusClean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirusClean() {
        return virusClean;
    }

    /**
     * Sets the value of the virusClean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirusClean(String value) {
        this.virusClean = value;
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
     * Gets the value of the welcomeOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeOn() {
        return welcomeOn;
    }

    /**
     * Sets the value of the welcomeOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeOn(String value) {
        this.welcomeOn = value;
    }

    /**
     * Gets the value of the zeroHourNotifyOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroHourNotifyOn() {
        return zeroHourNotifyOn;
    }

    /**
     * Sets the value of the zeroHourNotifyOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroHourNotifyOn(String value) {
        this.zeroHourNotifyOn = value;
    }

    /**
     * Gets the value of the zeroHourScan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroHourScan() {
        return zeroHourScan;
    }

    /**
     * Sets the value of the zeroHourScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroHourScan(String value) {
        this.zeroHourScan = value;
    }

    /**
     * Gets the value of the zeroHourWaiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroHourWaiver() {
        return zeroHourWaiver;
    }

    /**
     * Sets the value of the zeroHourWaiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroHourWaiver(String value) {
        this.zeroHourWaiver = value;
    }

}
