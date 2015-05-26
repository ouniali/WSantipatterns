
package tour.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TourItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrencySearchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Children" type="{WS_2013.Tour}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MainPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImportantInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FurtherInformation" type="{WS_2013.Tour}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="TourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPaxs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecialOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OtherPhotos" type="{WS_2013.Tour}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="TourType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableTours" type="{WS_2013.Tour}ArrayOfActivitySearch" minOccurs="0"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CheckOutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PreferredLanguage" type="{WS_2013.Tour}eServiceLanguage"/>
 *         &lt;element name="AvailableLanguages" type="{WS_2013.Tour}ArrayOfEServiceLanguage" minOccurs="0"/>
 *         &lt;element name="ProviderQuestions" type="{WS_2013.Tour}ArrayOfQuestionaryResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourItem", propOrder = {
    "activityCategory",
    "cityId",
    "clientId",
    "currencySearchCode",
    "children",
    "description",
    "available",
    "mainPhoto",
    "responseId",
    "importantInformation",
    "furtherInformation",
    "tourName",
    "numberOfPaxs",
    "specialOffer",
    "otherPhotos",
    "tourType",
    "availableTours",
    "checkInDate",
    "checkOutDate",
    "preferredLanguage",
    "availableLanguages",
    "providerQuestions"
})
public class TourItem {

    @XmlElement(name = "ActivityCategory")
    protected String activityCategory;
    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "ClientId")
    protected int clientId;
    @XmlElement(name = "CurrencySearchCode")
    protected String currencySearchCode;
    @XmlElement(name = "Children")
    protected ArrayOfInt children;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Available")
    protected boolean available;
    @XmlElement(name = "MainPhoto")
    protected String mainPhoto;
    @XmlElement(name = "ResponseId")
    protected int responseId;
    @XmlElement(name = "ImportantInformation")
    protected String importantInformation;
    @XmlElement(name = "FurtherInformation")
    protected ArrayOfString furtherInformation;
    @XmlElement(name = "TourName")
    protected String tourName;
    @XmlElement(name = "NumberOfPaxs")
    protected int numberOfPaxs;
    @XmlElement(name = "SpecialOffer")
    protected boolean specialOffer;
    @XmlElement(name = "OtherPhotos")
    protected ArrayOfString otherPhotos;
    @XmlElement(name = "TourType")
    protected String tourType;
    @XmlElement(name = "AvailableTours")
    protected ArrayOfActivitySearch availableTours;
    @XmlElement(name = "CheckInDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElement(name = "CheckOutDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOutDate;
    @XmlElement(name = "PreferredLanguage", required = true)
    @XmlSchemaType(name = "string")
    protected EServiceLanguage preferredLanguage;
    @XmlElement(name = "AvailableLanguages")
    protected ArrayOfEServiceLanguage availableLanguages;
    @XmlElement(name = "ProviderQuestions")
    protected ArrayOfQuestionaryResponse providerQuestions;

    /**
     * Gets the value of the activityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCategory() {
        return activityCategory;
    }

    /**
     * Sets the value of the activityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCategory(String value) {
        this.activityCategory = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     */
    public void setCityId(int value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the currencySearchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySearchCode() {
        return currencySearchCode;
    }

    /**
     * Sets the value of the currencySearchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySearchCode(String value) {
        this.currencySearchCode = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setChildren(ArrayOfInt value) {
        this.children = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the mainPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoto() {
        return mainPhoto;
    }

    /**
     * Sets the value of the mainPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoto(String value) {
        this.mainPhoto = value;
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
     * Gets the value of the importantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportantInformation() {
        return importantInformation;
    }

    /**
     * Sets the value of the importantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportantInformation(String value) {
        this.importantInformation = value;
    }

    /**
     * Gets the value of the furtherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFurtherInformation() {
        return furtherInformation;
    }

    /**
     * Sets the value of the furtherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFurtherInformation(ArrayOfString value) {
        this.furtherInformation = value;
    }

    /**
     * Gets the value of the tourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourName(String value) {
        this.tourName = value;
    }

    /**
     * Gets the value of the numberOfPaxs property.
     * 
     */
    public int getNumberOfPaxs() {
        return numberOfPaxs;
    }

    /**
     * Sets the value of the numberOfPaxs property.
     * 
     */
    public void setNumberOfPaxs(int value) {
        this.numberOfPaxs = value;
    }

    /**
     * Gets the value of the specialOffer property.
     * 
     */
    public boolean isSpecialOffer() {
        return specialOffer;
    }

    /**
     * Sets the value of the specialOffer property.
     * 
     */
    public void setSpecialOffer(boolean value) {
        this.specialOffer = value;
    }

    /**
     * Gets the value of the otherPhotos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOtherPhotos() {
        return otherPhotos;
    }

    /**
     * Sets the value of the otherPhotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOtherPhotos(ArrayOfString value) {
        this.otherPhotos = value;
    }

    /**
     * Gets the value of the tourType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourType() {
        return tourType;
    }

    /**
     * Sets the value of the tourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourType(String value) {
        this.tourType = value;
    }

    /**
     * Gets the value of the availableTours property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivitySearch }
     *     
     */
    public ArrayOfActivitySearch getAvailableTours() {
        return availableTours;
    }

    /**
     * Sets the value of the availableTours property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivitySearch }
     *     
     */
    public void setAvailableTours(ArrayOfActivitySearch value) {
        this.availableTours = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOutDate(XMLGregorianCalendar value) {
        this.checkOutDate = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link EServiceLanguage }
     *     
     */
    public EServiceLanguage getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EServiceLanguage }
     *     
     */
    public void setPreferredLanguage(EServiceLanguage value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the availableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEServiceLanguage }
     *     
     */
    public ArrayOfEServiceLanguage getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * Sets the value of the availableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEServiceLanguage }
     *     
     */
    public void setAvailableLanguages(ArrayOfEServiceLanguage value) {
        this.availableLanguages = value;
    }

    /**
     * Gets the value of the providerQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuestionaryResponse }
     *     
     */
    public ArrayOfQuestionaryResponse getProviderQuestions() {
        return providerQuestions;
    }

    /**
     * Sets the value of the providerQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuestionaryResponse }
     *     
     */
    public void setProviderQuestions(ArrayOfQuestionaryResponse value) {
        this.providerQuestions = value;
    }

}
