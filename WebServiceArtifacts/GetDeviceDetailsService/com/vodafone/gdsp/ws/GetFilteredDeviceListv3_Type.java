
package com.vodafone.gdsp.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getFilteredDeviceListv3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFilteredDeviceListv3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchImsi" type="{http://ws.gdsp.vodafone.com/}tImsiList" minOccurs="0"/>
 *         &lt;element name="matchMsisdn" type="{http://ws.gdsp.vodafone.com/}tMsisdnList" minOccurs="0"/>
 *         &lt;element name="matchIccid" type="{http://ws.gdsp.vodafone.com/}tIccidList" minOccurs="0"/>
 *         &lt;element name="matchCustomerServiceProfiles" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfileList" minOccurs="0"/>
 *         &lt;element name="matchRagStatus" type="{http://ws.gdsp.vodafone.com/}tRagStateList" minOccurs="0"/>
 *         &lt;element name="matchDeviceState" type="{http://ws.gdsp.vodafone.com/}tDeviceStateList" minOccurs="0"/>
 *         &lt;element name="matchAlert" type="{http://ws.gdsp.vodafone.com/}tAlertTypeList" minOccurs="0"/>
 *         &lt;element name="matchEarliestFirstUsedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="matchCustomerOrderNumber" type="{http://ws.gdsp.vodafone.com/}tCustomerOrderNumberList" minOccurs="0"/>
 *         &lt;element name="matchCustomAttribute1" type="{http://ws.gdsp.vodafone.com/}tCustomAttributeList" minOccurs="0"/>
 *         &lt;element name="matchCustomAttribute2" type="{http://ws.gdsp.vodafone.com/}tCustomAttributeList" minOccurs="0"/>
 *         &lt;element name="matchCustomAttribute3" type="{http://ws.gdsp.vodafone.com/}tCustomAttributeList" minOccurs="0"/>
 *         &lt;element name="matchCustomAttribute4" type="{http://ws.gdsp.vodafone.com/}tCustomAttributeList" minOccurs="0"/>
 *         &lt;element name="matchCustomAttribute5" type="{http://ws.gdsp.vodafone.com/}tCustomAttributeList" minOccurs="0"/>
 *         &lt;element name="sortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortFieldOrderDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFilteredDeviceListv3", propOrder = {
    "pageSize",
    "pageNumber",
    "matchImsi",
    "matchMsisdn",
    "matchIccid",
    "matchCustomerServiceProfiles",
    "matchRagStatus",
    "matchDeviceState",
    "matchAlert",
    "matchEarliestFirstUsedDate",
    "matchCustomerOrderNumber",
    "matchCustomAttribute1",
    "matchCustomAttribute2",
    "matchCustomAttribute3",
    "matchCustomAttribute4",
    "matchCustomAttribute5",
    "sortField",
    "sortFieldOrderDirection"
})
public class GetFilteredDeviceListv3_Type {

    protected Long pageSize;
    protected Long pageNumber;
    @XmlElementRef(name = "matchImsi", type = JAXBElement.class, required = false)
    protected JAXBElement<TImsiList> matchImsi;
    @XmlElementRef(name = "matchMsisdn", type = JAXBElement.class, required = false)
    protected JAXBElement<TMsisdnList> matchMsisdn;
    @XmlElementRef(name = "matchIccid", type = JAXBElement.class, required = false)
    protected JAXBElement<TIccidList> matchIccid;
    @XmlElementRef(name = "matchCustomerServiceProfiles", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomerServiceProfileList> matchCustomerServiceProfiles;
    @XmlElementRef(name = "matchRagStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<TRagStateList> matchRagStatus;
    @XmlElementRef(name = "matchDeviceState", type = JAXBElement.class, required = false)
    protected JAXBElement<TDeviceStateList> matchDeviceState;
    @XmlElementRef(name = "matchAlert", type = JAXBElement.class, required = false)
    protected JAXBElement<TAlertTypeList> matchAlert;
    @XmlElementRef(name = "matchEarliestFirstUsedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> matchEarliestFirstUsedDate;
    @XmlElementRef(name = "matchCustomerOrderNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomerOrderNumberList> matchCustomerOrderNumber;
    @XmlElementRef(name = "matchCustomAttribute1", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomAttributeList> matchCustomAttribute1;
    @XmlElementRef(name = "matchCustomAttribute2", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomAttributeList> matchCustomAttribute2;
    @XmlElementRef(name = "matchCustomAttribute3", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomAttributeList> matchCustomAttribute3;
    @XmlElementRef(name = "matchCustomAttribute4", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomAttributeList> matchCustomAttribute4;
    @XmlElementRef(name = "matchCustomAttribute5", type = JAXBElement.class, required = false)
    protected JAXBElement<TCustomAttributeList> matchCustomAttribute5;
    protected String sortField;
    protected String sortFieldOrderDirection;

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageNumber(Long value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the matchImsi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TImsiList }{@code >}
     *     
     */
    public JAXBElement<TImsiList> getMatchImsi() {
        return matchImsi;
    }

    /**
     * Sets the value of the matchImsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TImsiList }{@code >}
     *     
     */
    public void setMatchImsi(JAXBElement<TImsiList> value) {
        this.matchImsi = value;
    }

    /**
     * Gets the value of the matchMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TMsisdnList }{@code >}
     *     
     */
    public JAXBElement<TMsisdnList> getMatchMsisdn() {
        return matchMsisdn;
    }

    /**
     * Sets the value of the matchMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TMsisdnList }{@code >}
     *     
     */
    public void setMatchMsisdn(JAXBElement<TMsisdnList> value) {
        this.matchMsisdn = value;
    }

    /**
     * Gets the value of the matchIccid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TIccidList }{@code >}
     *     
     */
    public JAXBElement<TIccidList> getMatchIccid() {
        return matchIccid;
    }

    /**
     * Sets the value of the matchIccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TIccidList }{@code >}
     *     
     */
    public void setMatchIccid(JAXBElement<TIccidList> value) {
        this.matchIccid = value;
    }

    /**
     * Gets the value of the matchCustomerServiceProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomerServiceProfileList }{@code >}
     *     
     */
    public JAXBElement<TCustomerServiceProfileList> getMatchCustomerServiceProfiles() {
        return matchCustomerServiceProfiles;
    }

    /**
     * Sets the value of the matchCustomerServiceProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomerServiceProfileList }{@code >}
     *     
     */
    public void setMatchCustomerServiceProfiles(JAXBElement<TCustomerServiceProfileList> value) {
        this.matchCustomerServiceProfiles = value;
    }

    /**
     * Gets the value of the matchRagStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TRagStateList }{@code >}
     *     
     */
    public JAXBElement<TRagStateList> getMatchRagStatus() {
        return matchRagStatus;
    }

    /**
     * Sets the value of the matchRagStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TRagStateList }{@code >}
     *     
     */
    public void setMatchRagStatus(JAXBElement<TRagStateList> value) {
        this.matchRagStatus = value;
    }

    /**
     * Gets the value of the matchDeviceState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TDeviceStateList }{@code >}
     *     
     */
    public JAXBElement<TDeviceStateList> getMatchDeviceState() {
        return matchDeviceState;
    }

    /**
     * Sets the value of the matchDeviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TDeviceStateList }{@code >}
     *     
     */
    public void setMatchDeviceState(JAXBElement<TDeviceStateList> value) {
        this.matchDeviceState = value;
    }

    /**
     * Gets the value of the matchAlert property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TAlertTypeList }{@code >}
     *     
     */
    public JAXBElement<TAlertTypeList> getMatchAlert() {
        return matchAlert;
    }

    /**
     * Sets the value of the matchAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TAlertTypeList }{@code >}
     *     
     */
    public void setMatchAlert(JAXBElement<TAlertTypeList> value) {
        this.matchAlert = value;
    }

    /**
     * Gets the value of the matchEarliestFirstUsedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMatchEarliestFirstUsedDate() {
        return matchEarliestFirstUsedDate;
    }

    /**
     * Sets the value of the matchEarliestFirstUsedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMatchEarliestFirstUsedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.matchEarliestFirstUsedDate = value;
    }

    /**
     * Gets the value of the matchCustomerOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomerOrderNumberList }{@code >}
     *     
     */
    public JAXBElement<TCustomerOrderNumberList> getMatchCustomerOrderNumber() {
        return matchCustomerOrderNumber;
    }

    /**
     * Sets the value of the matchCustomerOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomerOrderNumberList }{@code >}
     *     
     */
    public void setMatchCustomerOrderNumber(JAXBElement<TCustomerOrderNumberList> value) {
        this.matchCustomerOrderNumber = value;
    }

    /**
     * Gets the value of the matchCustomAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public JAXBElement<TCustomAttributeList> getMatchCustomAttribute1() {
        return matchCustomAttribute1;
    }

    /**
     * Sets the value of the matchCustomAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public void setMatchCustomAttribute1(JAXBElement<TCustomAttributeList> value) {
        this.matchCustomAttribute1 = value;
    }

    /**
     * Gets the value of the matchCustomAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public JAXBElement<TCustomAttributeList> getMatchCustomAttribute2() {
        return matchCustomAttribute2;
    }

    /**
     * Sets the value of the matchCustomAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public void setMatchCustomAttribute2(JAXBElement<TCustomAttributeList> value) {
        this.matchCustomAttribute2 = value;
    }

    /**
     * Gets the value of the matchCustomAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public JAXBElement<TCustomAttributeList> getMatchCustomAttribute3() {
        return matchCustomAttribute3;
    }

    /**
     * Sets the value of the matchCustomAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public void setMatchCustomAttribute3(JAXBElement<TCustomAttributeList> value) {
        this.matchCustomAttribute3 = value;
    }

    /**
     * Gets the value of the matchCustomAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public JAXBElement<TCustomAttributeList> getMatchCustomAttribute4() {
        return matchCustomAttribute4;
    }

    /**
     * Sets the value of the matchCustomAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public void setMatchCustomAttribute4(JAXBElement<TCustomAttributeList> value) {
        this.matchCustomAttribute4 = value;
    }

    /**
     * Gets the value of the matchCustomAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public JAXBElement<TCustomAttributeList> getMatchCustomAttribute5() {
        return matchCustomAttribute5;
    }

    /**
     * Sets the value of the matchCustomAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCustomAttributeList }{@code >}
     *     
     */
    public void setMatchCustomAttribute5(JAXBElement<TCustomAttributeList> value) {
        this.matchCustomAttribute5 = value;
    }

    /**
     * Gets the value of the sortField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortField(String value) {
        this.sortField = value;
    }

    /**
     * Gets the value of the sortFieldOrderDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortFieldOrderDirection() {
        return sortFieldOrderDirection;
    }

    /**
     * Sets the value of the sortFieldOrderDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortFieldOrderDirection(String value) {
        this.sortFieldOrderDirection = value;
    }

}
