
package transfer.ws_2013;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for TransferTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OriginalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerDropOffLocation" type="{WS_2013.Transfer}TransferProvider" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MainImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxLuggage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxPaxs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnotherImages" type="{WS_2013.Transfer}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="SellerPickUpLocation" type="{WS_2013.Transfer}TransferProvider" minOccurs="0"/>
 *         &lt;element name="SellPrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="CancellationPolicies" type="{WS_2013.Transfer}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferTransport", propOrder = {
    "commission",
    "paymentDeadline",
    "originalDescription",
    "serviceDescription",
    "vehicleDescription",
    "sellerDropOffLocation",
    "language",
    "responseId",
    "mainImage",
    "maxLuggage",
    "maxPaxs",
    "anotherImages",
    "sellerPickUpLocation",
    "sellPrice",
    "cancellationPolicies",
    "conversionRate"
})
public class TransferTransport {

    @XmlElement(name = "Commission")
    protected double commission;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "OriginalDescription")
    protected String originalDescription;
    @XmlElement(name = "ServiceDescription")
    protected String serviceDescription;
    @XmlElement(name = "VehicleDescription")
    protected String vehicleDescription;
    @XmlElement(name = "SellerDropOffLocation")
    protected TransferProvider sellerDropOffLocation;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "ResponseId")
    protected int responseId;
    @XmlElement(name = "MainImage")
    protected String mainImage;
    @XmlElement(name = "MaxLuggage")
    protected int maxLuggage;
    @XmlElement(name = "MaxPaxs")
    protected int maxPaxs;
    @XmlElement(name = "AnotherImages")
    protected ArrayOfString anotherImages;
    @XmlElement(name = "SellerPickUpLocation")
    protected TransferProvider sellerPickUpLocation;
    @XmlElement(name = "SellPrice")
    protected PriceValue sellPrice;
    @XmlElement(name = "CancellationPolicies")
    protected ArrayOfCancellationPolicy cancellationPolicies;
    @XmlElement(name = "ConversionRate", required = true)
    protected BigDecimal conversionRate;

    /**
     * Gets the value of the commission property.
     * 
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     */
    public void setCommission(double value) {
        this.commission = value;
    }

    /**
     * Gets the value of the paymentDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDeadline() {
        return paymentDeadline;
    }

    /**
     * Sets the value of the paymentDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDeadline(XMLGregorianCalendar value) {
        this.paymentDeadline = value;
    }

    /**
     * Gets the value of the originalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDescription() {
        return originalDescription;
    }

    /**
     * Sets the value of the originalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDescription(String value) {
        this.originalDescription = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the vehicleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDescription(String value) {
        this.vehicleDescription = value;
    }

    /**
     * Gets the value of the sellerDropOffLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TransferProvider }
     *     
     */
    public TransferProvider getSellerDropOffLocation() {
        return sellerDropOffLocation;
    }

    /**
     * Sets the value of the sellerDropOffLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferProvider }
     *     
     */
    public void setSellerDropOffLocation(TransferProvider value) {
        this.sellerDropOffLocation = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the responseId property.
     * 
     */
    public int getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     * 
     */
    public void setResponseId(int value) {
        this.responseId = value;
    }

    /**
     * Gets the value of the mainImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * Sets the value of the mainImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainImage(String value) {
        this.mainImage = value;
    }

    /**
     * Gets the value of the maxLuggage property.
     * 
     */
    public int getMaxLuggage() {
        return maxLuggage;
    }

    /**
     * Sets the value of the maxLuggage property.
     * 
     */
    public void setMaxLuggage(int value) {
        this.maxLuggage = value;
    }

    /**
     * Gets the value of the maxPaxs property.
     * 
     */
    public int getMaxPaxs() {
        return maxPaxs;
    }

    /**
     * Sets the value of the maxPaxs property.
     * 
     */
    public void setMaxPaxs(int value) {
        this.maxPaxs = value;
    }

    /**
     * Gets the value of the anotherImages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAnotherImages() {
        return anotherImages;
    }

    /**
     * Sets the value of the anotherImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAnotherImages(ArrayOfString value) {
        this.anotherImages = value;
    }

    /**
     * Gets the value of the sellerPickUpLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TransferProvider }
     *     
     */
    public TransferProvider getSellerPickUpLocation() {
        return sellerPickUpLocation;
    }

    /**
     * Sets the value of the sellerPickUpLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferProvider }
     *     
     */
    public void setSellerPickUpLocation(TransferProvider value) {
        this.sellerPickUpLocation = value;
    }

    /**
     * Gets the value of the sellPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSellPrice() {
        return sellPrice;
    }

    /**
     * Sets the value of the sellPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSellPrice(PriceValue value) {
        this.sellPrice = value;
    }

    /**
     * Gets the value of the cancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Sets the value of the cancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setCancellationPolicies(ArrayOfCancellationPolicy value) {
        this.cancellationPolicies = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

}
