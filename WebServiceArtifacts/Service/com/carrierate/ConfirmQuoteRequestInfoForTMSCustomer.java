
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConfirmQuoteRequestInfoForTMSCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmQuoteRequestInfoForTMSCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipperAddress" type="{http://carrierate.com/}ShipmentAddressForTMS" minOccurs="0"/>
 *         &lt;element name="ConsigneeAddress" type="{http://carrierate.com/}ShipmentAddressForTMS" minOccurs="0"/>
 *         &lt;element name="QuoteItemsForTMS" type="{http://carrierate.com/}ArrayOfQuoteItemsInfoForTMSCustomer" minOccurs="0"/>
 *         &lt;element name="ShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ShipmentReadyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentCloseTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickUpRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefrenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerBOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SelectedCarrierCodeForShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmQuoteRequestInfoForTMSCustomer", propOrder = {
    "shipperAddress",
    "consigneeAddress",
    "quoteItemsForTMS",
    "shipmentDate",
    "shipmentReadyTime",
    "shipmentCloseTime",
    "pickUpRemarks",
    "deliveryRemarks",
    "poNo",
    "refrenceNumber",
    "customerBOL",
    "agreementAcceptance",
    "selectedCarrierCodeForShipment",
    "serviceTransactionId",
    "addressCode",
    "proNo"
})
public class ConfirmQuoteRequestInfoForTMSCustomer {

    @XmlElement(name = "ShipperAddress")
    protected ShipmentAddressForTMS shipperAddress;
    @XmlElement(name = "ConsigneeAddress")
    protected ShipmentAddressForTMS consigneeAddress;
    @XmlElement(name = "QuoteItemsForTMS")
    protected ArrayOfQuoteItemsInfoForTMSCustomer quoteItemsForTMS;
    @XmlElement(name = "ShipmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "ShipmentReadyTime")
    protected String shipmentReadyTime;
    @XmlElement(name = "ShipmentCloseTime")
    protected String shipmentCloseTime;
    @XmlElement(name = "PickUpRemarks")
    protected String pickUpRemarks;
    @XmlElement(name = "DeliveryRemarks")
    protected String deliveryRemarks;
    @XmlElement(name = "PONo")
    protected String poNo;
    @XmlElement(name = "RefrenceNumber")
    protected String refrenceNumber;
    @XmlElement(name = "CustomerBOL")
    protected String customerBOL;
    @XmlElement(name = "AgreementAcceptance")
    protected boolean agreementAcceptance;
    @XmlElement(name = "SelectedCarrierCodeForShipment")
    protected String selectedCarrierCodeForShipment;
    @XmlElement(name = "ServiceTransactionId")
    protected String serviceTransactionId;
    @XmlElement(name = "AddressCode")
    protected String addressCode;
    @XmlElement(name = "ProNo")
    protected String proNo;

    /**
     * Gets the value of the shipperAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentAddressForTMS }
     *     
     */
    public ShipmentAddressForTMS getShipperAddress() {
        return shipperAddress;
    }

    /**
     * Sets the value of the shipperAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentAddressForTMS }
     *     
     */
    public void setShipperAddress(ShipmentAddressForTMS value) {
        this.shipperAddress = value;
    }

    /**
     * Gets the value of the consigneeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentAddressForTMS }
     *     
     */
    public ShipmentAddressForTMS getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * Sets the value of the consigneeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentAddressForTMS }
     *     
     */
    public void setConsigneeAddress(ShipmentAddressForTMS value) {
        this.consigneeAddress = value;
    }

    /**
     * Gets the value of the quoteItemsForTMS property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteItemsInfoForTMSCustomer }
     *     
     */
    public ArrayOfQuoteItemsInfoForTMSCustomer getQuoteItemsForTMS() {
        return quoteItemsForTMS;
    }

    /**
     * Sets the value of the quoteItemsForTMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteItemsInfoForTMSCustomer }
     *     
     */
    public void setQuoteItemsForTMS(ArrayOfQuoteItemsInfoForTMSCustomer value) {
        this.quoteItemsForTMS = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDate(XMLGregorianCalendar value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the shipmentReadyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentReadyTime() {
        return shipmentReadyTime;
    }

    /**
     * Sets the value of the shipmentReadyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentReadyTime(String value) {
        this.shipmentReadyTime = value;
    }

    /**
     * Gets the value of the shipmentCloseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentCloseTime() {
        return shipmentCloseTime;
    }

    /**
     * Sets the value of the shipmentCloseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentCloseTime(String value) {
        this.shipmentCloseTime = value;
    }

    /**
     * Gets the value of the pickUpRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpRemarks() {
        return pickUpRemarks;
    }

    /**
     * Sets the value of the pickUpRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpRemarks(String value) {
        this.pickUpRemarks = value;
    }

    /**
     * Gets the value of the deliveryRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryRemarks() {
        return deliveryRemarks;
    }

    /**
     * Sets the value of the deliveryRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryRemarks(String value) {
        this.deliveryRemarks = value;
    }

    /**
     * Gets the value of the poNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONo() {
        return poNo;
    }

    /**
     * Sets the value of the poNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONo(String value) {
        this.poNo = value;
    }

    /**
     * Gets the value of the refrenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrenceNumber() {
        return refrenceNumber;
    }

    /**
     * Sets the value of the refrenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrenceNumber(String value) {
        this.refrenceNumber = value;
    }

    /**
     * Gets the value of the customerBOL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBOL() {
        return customerBOL;
    }

    /**
     * Sets the value of the customerBOL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBOL(String value) {
        this.customerBOL = value;
    }

    /**
     * Gets the value of the agreementAcceptance property.
     * 
     */
    public boolean isAgreementAcceptance() {
        return agreementAcceptance;
    }

    /**
     * Sets the value of the agreementAcceptance property.
     * 
     */
    public void setAgreementAcceptance(boolean value) {
        this.agreementAcceptance = value;
    }

    /**
     * Gets the value of the selectedCarrierCodeForShipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedCarrierCodeForShipment() {
        return selectedCarrierCodeForShipment;
    }

    /**
     * Sets the value of the selectedCarrierCodeForShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedCarrierCodeForShipment(String value) {
        this.selectedCarrierCodeForShipment = value;
    }

    /**
     * Gets the value of the serviceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    /**
     * Sets the value of the serviceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTransactionId(String value) {
        this.serviceTransactionId = value;
    }

    /**
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the proNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProNo() {
        return proNo;
    }

    /**
     * Sets the value of the proNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProNo(String value) {
        this.proNo = value;
    }

}
