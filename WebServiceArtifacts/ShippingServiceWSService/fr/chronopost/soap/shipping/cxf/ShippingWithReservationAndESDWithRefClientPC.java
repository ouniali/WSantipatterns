
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shippingWithReservationAndESDWithRefClientPC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shippingWithReservationAndESDWithRefClientPC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refEsdClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retrievalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closingDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specificInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCarriesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperBuildingFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperServiceDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreDePassageMaximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ltAImprimerParChronopost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header_idEmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header_identWebPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCivility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperAdress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperAdress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCivility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAdress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAdress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPreAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCivility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAdress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAdress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPreAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipperRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerSkybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weightUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customsCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skybillRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bulkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modeRetour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeSlotStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeSlotEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeSlotTariffLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellByDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingWithReservationAndESDWithRefClientPC", propOrder = {
    "refEsdClient",
    "retrievalDateTime",
    "closingDateTime",
    "specificInstructions",
    "height",
    "width",
    "length",
    "shipperCarriesCode",
    "shipperBuildingFloor",
    "shipperServiceDirection",
    "nombreDePassageMaximum",
    "ltAImprimerParChronopost",
    "headerIdEmit",
    "accountNumber",
    "subAccount",
    "headerIdentWebPro",
    "shipperCivility",
    "shipperName",
    "shipperName2",
    "shipperAdress1",
    "shipperAdress2",
    "shipperZipCode",
    "shipperCity",
    "shipperCountry",
    "shipperCountryName",
    "shipperContactName",
    "shipperEmail",
    "shipperPhone",
    "shipperMobilePhone",
    "customerCivility",
    "customerName",
    "customerName2",
    "customerAdress1",
    "customerAdress2",
    "customerZipCode",
    "customerCity",
    "customerCountry",
    "customerCountryName",
    "customerContactName",
    "customerEmail",
    "customerPhone",
    "customerMobilePhone",
    "customerPreAlert",
    "recipientCivility",
    "recipientName",
    "recipientName2",
    "recipientAdress1",
    "recipientAdress2",
    "recipientZipCode",
    "recipientCity",
    "recipientCountry",
    "recipientCountryName",
    "recipientContactName",
    "recipientEmail",
    "recipientPhone",
    "recipientMobilePhone",
    "recipientPreAlert",
    "shipperRef",
    "recipientRef",
    "customerSkybillNumber",
    "evtCode",
    "productCode",
    "shipDate",
    "shipHour",
    "weight",
    "weightUnit",
    "insuredValue",
    "insuredCurrency",
    "codValue",
    "codCurrency",
    "customsValue",
    "customsCurrency",
    "service",
    "objectType",
    "content1",
    "content2",
    "content3",
    "content4",
    "content5",
    "portValue",
    "portCurrency",
    "skybillRank",
    "bulkNumber",
    "mode",
    "password",
    "modeRetour",
    "timeSlotStartDate",
    "timeSlotEndDate",
    "timeSlotTariffLevel",
    "expirationDate",
    "sellByDate"
})
public class ShippingWithReservationAndESDWithRefClientPC {

    protected String refEsdClient;
    protected String retrievalDateTime;
    protected String closingDateTime;
    protected String specificInstructions;
    protected String height;
    protected String width;
    protected String length;
    protected String shipperCarriesCode;
    protected String shipperBuildingFloor;
    protected String shipperServiceDirection;
    protected String nombreDePassageMaximum;
    protected String ltAImprimerParChronopost;
    @XmlElement(name = "header_idEmit")
    protected String headerIdEmit;
    protected String accountNumber;
    protected String subAccount;
    @XmlElement(name = "header_identWebPro")
    protected String headerIdentWebPro;
    protected String shipperCivility;
    protected String shipperName;
    protected String shipperName2;
    protected String shipperAdress1;
    protected String shipperAdress2;
    protected String shipperZipCode;
    protected String shipperCity;
    protected String shipperCountry;
    protected String shipperCountryName;
    protected String shipperContactName;
    protected String shipperEmail;
    protected String shipperPhone;
    protected String shipperMobilePhone;
    protected String customerCivility;
    protected String customerName;
    protected String customerName2;
    protected String customerAdress1;
    protected String customerAdress2;
    protected String customerZipCode;
    protected String customerCity;
    protected String customerCountry;
    protected String customerCountryName;
    protected String customerContactName;
    protected String customerEmail;
    protected String customerPhone;
    protected String customerMobilePhone;
    protected String customerPreAlert;
    protected String recipientCivility;
    protected String recipientName;
    protected String recipientName2;
    protected String recipientAdress1;
    protected String recipientAdress2;
    protected String recipientZipCode;
    protected String recipientCity;
    protected String recipientCountry;
    protected String recipientCountryName;
    protected String recipientContactName;
    protected String recipientEmail;
    protected String recipientPhone;
    protected String recipientMobilePhone;
    protected String recipientPreAlert;
    protected String shipperRef;
    protected String recipientRef;
    protected String customerSkybillNumber;
    protected String evtCode;
    protected String productCode;
    protected String shipDate;
    protected String shipHour;
    protected String weight;
    protected String weightUnit;
    protected String insuredValue;
    protected String insuredCurrency;
    protected String codValue;
    protected String codCurrency;
    protected String customsValue;
    protected String customsCurrency;
    protected String service;
    protected String objectType;
    protected String content1;
    protected String content2;
    protected String content3;
    protected String content4;
    protected String content5;
    protected String portValue;
    protected String portCurrency;
    protected String skybillRank;
    protected String bulkNumber;
    protected String mode;
    protected String password;
    protected String modeRetour;
    protected String timeSlotStartDate;
    protected String timeSlotEndDate;
    protected String timeSlotTariffLevel;
    protected String expirationDate;
    protected String sellByDate;

    /**
     * Gets the value of the refEsdClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefEsdClient() {
        return refEsdClient;
    }

    /**
     * Sets the value of the refEsdClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefEsdClient(String value) {
        this.refEsdClient = value;
    }

    /**
     * Gets the value of the retrievalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalDateTime() {
        return retrievalDateTime;
    }

    /**
     * Sets the value of the retrievalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalDateTime(String value) {
        this.retrievalDateTime = value;
    }

    /**
     * Gets the value of the closingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingDateTime() {
        return closingDateTime;
    }

    /**
     * Sets the value of the closingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingDateTime(String value) {
        this.closingDateTime = value;
    }

    /**
     * Gets the value of the specificInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificInstructions() {
        return specificInstructions;
    }

    /**
     * Sets the value of the specificInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificInstructions(String value) {
        this.specificInstructions = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the shipperCarriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCarriesCode() {
        return shipperCarriesCode;
    }

    /**
     * Sets the value of the shipperCarriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCarriesCode(String value) {
        this.shipperCarriesCode = value;
    }

    /**
     * Gets the value of the shipperBuildingFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperBuildingFloor() {
        return shipperBuildingFloor;
    }

    /**
     * Sets the value of the shipperBuildingFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperBuildingFloor(String value) {
        this.shipperBuildingFloor = value;
    }

    /**
     * Gets the value of the shipperServiceDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperServiceDirection() {
        return shipperServiceDirection;
    }

    /**
     * Sets the value of the shipperServiceDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperServiceDirection(String value) {
        this.shipperServiceDirection = value;
    }

    /**
     * Gets the value of the nombreDePassageMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDePassageMaximum() {
        return nombreDePassageMaximum;
    }

    /**
     * Sets the value of the nombreDePassageMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDePassageMaximum(String value) {
        this.nombreDePassageMaximum = value;
    }

    /**
     * Gets the value of the ltAImprimerParChronopost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtAImprimerParChronopost() {
        return ltAImprimerParChronopost;
    }

    /**
     * Sets the value of the ltAImprimerParChronopost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtAImprimerParChronopost(String value) {
        this.ltAImprimerParChronopost = value;
    }

    /**
     * Gets the value of the headerIdEmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderIdEmit() {
        return headerIdEmit;
    }

    /**
     * Sets the value of the headerIdEmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderIdEmit(String value) {
        this.headerIdEmit = value;
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
     * Gets the value of the subAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAccount() {
        return subAccount;
    }

    /**
     * Sets the value of the subAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAccount(String value) {
        this.subAccount = value;
    }

    /**
     * Gets the value of the headerIdentWebPro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderIdentWebPro() {
        return headerIdentWebPro;
    }

    /**
     * Sets the value of the headerIdentWebPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderIdentWebPro(String value) {
        this.headerIdentWebPro = value;
    }

    /**
     * Gets the value of the shipperCivility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCivility() {
        return shipperCivility;
    }

    /**
     * Sets the value of the shipperCivility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCivility(String value) {
        this.shipperCivility = value;
    }

    /**
     * Gets the value of the shipperName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * Sets the value of the shipperName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName(String value) {
        this.shipperName = value;
    }

    /**
     * Gets the value of the shipperName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperName2() {
        return shipperName2;
    }

    /**
     * Sets the value of the shipperName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperName2(String value) {
        this.shipperName2 = value;
    }

    /**
     * Gets the value of the shipperAdress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperAdress1() {
        return shipperAdress1;
    }

    /**
     * Sets the value of the shipperAdress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperAdress1(String value) {
        this.shipperAdress1 = value;
    }

    /**
     * Gets the value of the shipperAdress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperAdress2() {
        return shipperAdress2;
    }

    /**
     * Sets the value of the shipperAdress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperAdress2(String value) {
        this.shipperAdress2 = value;
    }

    /**
     * Gets the value of the shipperZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperZipCode() {
        return shipperZipCode;
    }

    /**
     * Sets the value of the shipperZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperZipCode(String value) {
        this.shipperZipCode = value;
    }

    /**
     * Gets the value of the shipperCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCity() {
        return shipperCity;
    }

    /**
     * Sets the value of the shipperCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCity(String value) {
        this.shipperCity = value;
    }

    /**
     * Gets the value of the shipperCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCountry() {
        return shipperCountry;
    }

    /**
     * Sets the value of the shipperCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCountry(String value) {
        this.shipperCountry = value;
    }

    /**
     * Gets the value of the shipperCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperCountryName() {
        return shipperCountryName;
    }

    /**
     * Sets the value of the shipperCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperCountryName(String value) {
        this.shipperCountryName = value;
    }

    /**
     * Gets the value of the shipperContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperContactName() {
        return shipperContactName;
    }

    /**
     * Sets the value of the shipperContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperContactName(String value) {
        this.shipperContactName = value;
    }

    /**
     * Gets the value of the shipperEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperEmail() {
        return shipperEmail;
    }

    /**
     * Sets the value of the shipperEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperEmail(String value) {
        this.shipperEmail = value;
    }

    /**
     * Gets the value of the shipperPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperPhone() {
        return shipperPhone;
    }

    /**
     * Sets the value of the shipperPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperPhone(String value) {
        this.shipperPhone = value;
    }

    /**
     * Gets the value of the shipperMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperMobilePhone() {
        return shipperMobilePhone;
    }

    /**
     * Sets the value of the shipperMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperMobilePhone(String value) {
        this.shipperMobilePhone = value;
    }

    /**
     * Gets the value of the customerCivility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCivility() {
        return customerCivility;
    }

    /**
     * Sets the value of the customerCivility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCivility(String value) {
        this.customerCivility = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName2() {
        return customerName2;
    }

    /**
     * Sets the value of the customerName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName2(String value) {
        this.customerName2 = value;
    }

    /**
     * Gets the value of the customerAdress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAdress1() {
        return customerAdress1;
    }

    /**
     * Sets the value of the customerAdress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAdress1(String value) {
        this.customerAdress1 = value;
    }

    /**
     * Gets the value of the customerAdress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAdress2() {
        return customerAdress2;
    }

    /**
     * Sets the value of the customerAdress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAdress2(String value) {
        this.customerAdress2 = value;
    }

    /**
     * Gets the value of the customerZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerZipCode() {
        return customerZipCode;
    }

    /**
     * Sets the value of the customerZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerZipCode(String value) {
        this.customerZipCode = value;
    }

    /**
     * Gets the value of the customerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Sets the value of the customerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    /**
     * Gets the value of the customerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /**
     * Sets the value of the customerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountry(String value) {
        this.customerCountry = value;
    }

    /**
     * Gets the value of the customerCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountryName() {
        return customerCountryName;
    }

    /**
     * Sets the value of the customerCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountryName(String value) {
        this.customerCountryName = value;
    }

    /**
     * Gets the value of the customerContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContactName() {
        return customerContactName;
    }

    /**
     * Sets the value of the customerContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerContactName(String value) {
        this.customerContactName = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the customerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the value of the customerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhone(String value) {
        this.customerPhone = value;
    }

    /**
     * Gets the value of the customerMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMobilePhone() {
        return customerMobilePhone;
    }

    /**
     * Sets the value of the customerMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMobilePhone(String value) {
        this.customerMobilePhone = value;
    }

    /**
     * Gets the value of the customerPreAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPreAlert() {
        return customerPreAlert;
    }

    /**
     * Sets the value of the customerPreAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPreAlert(String value) {
        this.customerPreAlert = value;
    }

    /**
     * Gets the value of the recipientCivility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCivility() {
        return recipientCivility;
    }

    /**
     * Sets the value of the recipientCivility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCivility(String value) {
        this.recipientCivility = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName2() {
        return recipientName2;
    }

    /**
     * Sets the value of the recipientName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName2(String value) {
        this.recipientName2 = value;
    }

    /**
     * Gets the value of the recipientAdress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAdress1() {
        return recipientAdress1;
    }

    /**
     * Sets the value of the recipientAdress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAdress1(String value) {
        this.recipientAdress1 = value;
    }

    /**
     * Gets the value of the recipientAdress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAdress2() {
        return recipientAdress2;
    }

    /**
     * Sets the value of the recipientAdress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAdress2(String value) {
        this.recipientAdress2 = value;
    }

    /**
     * Gets the value of the recipientZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientZipCode() {
        return recipientZipCode;
    }

    /**
     * Sets the value of the recipientZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientZipCode(String value) {
        this.recipientZipCode = value;
    }

    /**
     * Gets the value of the recipientCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCity() {
        return recipientCity;
    }

    /**
     * Sets the value of the recipientCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCity(String value) {
        this.recipientCity = value;
    }

    /**
     * Gets the value of the recipientCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCountry() {
        return recipientCountry;
    }

    /**
     * Sets the value of the recipientCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCountry(String value) {
        this.recipientCountry = value;
    }

    /**
     * Gets the value of the recipientCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCountryName() {
        return recipientCountryName;
    }

    /**
     * Sets the value of the recipientCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCountryName(String value) {
        this.recipientCountryName = value;
    }

    /**
     * Gets the value of the recipientContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientContactName() {
        return recipientContactName;
    }

    /**
     * Sets the value of the recipientContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientContactName(String value) {
        this.recipientContactName = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

    /**
     * Gets the value of the recipientPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * Sets the value of the recipientPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPhone(String value) {
        this.recipientPhone = value;
    }

    /**
     * Gets the value of the recipientMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientMobilePhone() {
        return recipientMobilePhone;
    }

    /**
     * Sets the value of the recipientMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientMobilePhone(String value) {
        this.recipientMobilePhone = value;
    }

    /**
     * Gets the value of the recipientPreAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPreAlert() {
        return recipientPreAlert;
    }

    /**
     * Sets the value of the recipientPreAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPreAlert(String value) {
        this.recipientPreAlert = value;
    }

    /**
     * Gets the value of the shipperRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperRef() {
        return shipperRef;
    }

    /**
     * Sets the value of the shipperRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperRef(String value) {
        this.shipperRef = value;
    }

    /**
     * Gets the value of the recipientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientRef() {
        return recipientRef;
    }

    /**
     * Sets the value of the recipientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientRef(String value) {
        this.recipientRef = value;
    }

    /**
     * Gets the value of the customerSkybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSkybillNumber() {
        return customerSkybillNumber;
    }

    /**
     * Sets the value of the customerSkybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSkybillNumber(String value) {
        this.customerSkybillNumber = value;
    }

    /**
     * Gets the value of the evtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCode() {
        return evtCode;
    }

    /**
     * Sets the value of the evtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtCode(String value) {
        this.evtCode = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDate(String value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipHour() {
        return shipHour;
    }

    /**
     * Sets the value of the shipHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipHour(String value) {
        this.shipHour = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets the value of the weightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnit(String value) {
        this.weightUnit = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredValue(String value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the insuredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredCurrency() {
        return insuredCurrency;
    }

    /**
     * Sets the value of the insuredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredCurrency(String value) {
        this.insuredCurrency = value;
    }

    /**
     * Gets the value of the codValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValue() {
        return codValue;
    }

    /**
     * Sets the value of the codValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValue(String value) {
        this.codValue = value;
    }

    /**
     * Gets the value of the codCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCurrency() {
        return codCurrency;
    }

    /**
     * Sets the value of the codCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCurrency(String value) {
        this.codCurrency = value;
    }

    /**
     * Gets the value of the customsValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsValue() {
        return customsValue;
    }

    /**
     * Sets the value of the customsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsValue(String value) {
        this.customsValue = value;
    }

    /**
     * Gets the value of the customsCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCurrency() {
        return customsCurrency;
    }

    /**
     * Sets the value of the customsCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCurrency(String value) {
        this.customsCurrency = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the content1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent1() {
        return content1;
    }

    /**
     * Sets the value of the content1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent1(String value) {
        this.content1 = value;
    }

    /**
     * Gets the value of the content2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent2() {
        return content2;
    }

    /**
     * Sets the value of the content2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent2(String value) {
        this.content2 = value;
    }

    /**
     * Gets the value of the content3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent3() {
        return content3;
    }

    /**
     * Sets the value of the content3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent3(String value) {
        this.content3 = value;
    }

    /**
     * Gets the value of the content4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent4() {
        return content4;
    }

    /**
     * Sets the value of the content4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent4(String value) {
        this.content4 = value;
    }

    /**
     * Gets the value of the content5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent5() {
        return content5;
    }

    /**
     * Sets the value of the content5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent5(String value) {
        this.content5 = value;
    }

    /**
     * Gets the value of the portValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortValue() {
        return portValue;
    }

    /**
     * Sets the value of the portValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortValue(String value) {
        this.portValue = value;
    }

    /**
     * Gets the value of the portCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortCurrency() {
        return portCurrency;
    }

    /**
     * Sets the value of the portCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortCurrency(String value) {
        this.portCurrency = value;
    }

    /**
     * Gets the value of the skybillRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkybillRank() {
        return skybillRank;
    }

    /**
     * Sets the value of the skybillRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkybillRank(String value) {
        this.skybillRank = value;
    }

    /**
     * Gets the value of the bulkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkNumber() {
        return bulkNumber;
    }

    /**
     * Sets the value of the bulkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkNumber(String value) {
        this.bulkNumber = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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
     * Gets the value of the modeRetour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeRetour() {
        return modeRetour;
    }

    /**
     * Sets the value of the modeRetour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeRetour(String value) {
        this.modeRetour = value;
    }

    /**
     * Gets the value of the timeSlotStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSlotStartDate() {
        return timeSlotStartDate;
    }

    /**
     * Sets the value of the timeSlotStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSlotStartDate(String value) {
        this.timeSlotStartDate = value;
    }

    /**
     * Gets the value of the timeSlotEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSlotEndDate() {
        return timeSlotEndDate;
    }

    /**
     * Sets the value of the timeSlotEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSlotEndDate(String value) {
        this.timeSlotEndDate = value;
    }

    /**
     * Gets the value of the timeSlotTariffLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSlotTariffLevel() {
        return timeSlotTariffLevel;
    }

    /**
     * Sets the value of the timeSlotTariffLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSlotTariffLevel(String value) {
        this.timeSlotTariffLevel = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the sellByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellByDate() {
        return sellByDate;
    }

    /**
     * Sets the value of the sellByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellByDate(String value) {
        this.sellByDate = value;
    }

}
