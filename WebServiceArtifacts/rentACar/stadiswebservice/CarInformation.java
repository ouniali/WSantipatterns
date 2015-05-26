
package stadiswebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="baggageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeAdress" type="{http://stadiswebservice/}locationAdress" minOccurs="0"/>
 *         &lt;element name="passengerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="recommendedAdultPassangerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recommendedChildPassangerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recommendedLargeBaggageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recommendedSmallBaggageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlPictureBig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlPictureMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlPictureSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carInformation", propOrder = {
    "airport",
    "baggageCount",
    "carcode",
    "configuration",
    "doorCount",
    "name",
    "officeAdress",
    "passengerCount",
    "price",
    "recommendedAdultPassangerCount",
    "recommendedChildPassangerCount",
    "recommendedLargeBaggageCount",
    "recommendedSmallBaggageCount",
    "status",
    "urlDescription",
    "urlPictureBig",
    "urlPictureMedium",
    "urlPictureSmall"
})
public class CarInformation {

    protected boolean airport;
    protected Integer baggageCount;
    protected String carcode;
    protected String configuration;
    protected Integer doorCount;
    protected String name;
    protected LocationAdress officeAdress;
    protected Integer passengerCount;
    protected double price;
    protected Integer recommendedAdultPassangerCount;
    protected Integer recommendedChildPassangerCount;
    protected Integer recommendedLargeBaggageCount;
    protected Integer recommendedSmallBaggageCount;
    protected String status;
    protected String urlDescription;
    protected String urlPictureBig;
    protected String urlPictureMedium;
    protected String urlPictureSmall;

    /**
     * Gets the value of the airport property.
     * 
     */
    public boolean isAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     */
    public void setAirport(boolean value) {
        this.airport = value;
    }

    /**
     * Gets the value of the baggageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaggageCount() {
        return baggageCount;
    }

    /**
     * Sets the value of the baggageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaggageCount(Integer value) {
        this.baggageCount = value;
    }

    /**
     * Gets the value of the carcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarcode() {
        return carcode;
    }

    /**
     * Sets the value of the carcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarcode(String value) {
        this.carcode = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the doorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoorCount() {
        return doorCount;
    }

    /**
     * Sets the value of the doorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoorCount(Integer value) {
        this.doorCount = value;
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
     * Gets the value of the officeAdress property.
     * 
     * @return
     *     possible object is
     *     {@link LocationAdress }
     *     
     */
    public LocationAdress getOfficeAdress() {
        return officeAdress;
    }

    /**
     * Sets the value of the officeAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAdress }
     *     
     */
    public void setOfficeAdress(LocationAdress value) {
        this.officeAdress = value;
    }

    /**
     * Gets the value of the passengerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerCount() {
        return passengerCount;
    }

    /**
     * Sets the value of the passengerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerCount(Integer value) {
        this.passengerCount = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the recommendedAdultPassangerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecommendedAdultPassangerCount() {
        return recommendedAdultPassangerCount;
    }

    /**
     * Sets the value of the recommendedAdultPassangerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecommendedAdultPassangerCount(Integer value) {
        this.recommendedAdultPassangerCount = value;
    }

    /**
     * Gets the value of the recommendedChildPassangerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecommendedChildPassangerCount() {
        return recommendedChildPassangerCount;
    }

    /**
     * Sets the value of the recommendedChildPassangerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecommendedChildPassangerCount(Integer value) {
        this.recommendedChildPassangerCount = value;
    }

    /**
     * Gets the value of the recommendedLargeBaggageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecommendedLargeBaggageCount() {
        return recommendedLargeBaggageCount;
    }

    /**
     * Sets the value of the recommendedLargeBaggageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecommendedLargeBaggageCount(Integer value) {
        this.recommendedLargeBaggageCount = value;
    }

    /**
     * Gets the value of the recommendedSmallBaggageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecommendedSmallBaggageCount() {
        return recommendedSmallBaggageCount;
    }

    /**
     * Sets the value of the recommendedSmallBaggageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecommendedSmallBaggageCount(Integer value) {
        this.recommendedSmallBaggageCount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the urlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDescription() {
        return urlDescription;
    }

    /**
     * Sets the value of the urlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDescription(String value) {
        this.urlDescription = value;
    }

    /**
     * Gets the value of the urlPictureBig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPictureBig() {
        return urlPictureBig;
    }

    /**
     * Sets the value of the urlPictureBig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPictureBig(String value) {
        this.urlPictureBig = value;
    }

    /**
     * Gets the value of the urlPictureMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPictureMedium() {
        return urlPictureMedium;
    }

    /**
     * Sets the value of the urlPictureMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPictureMedium(String value) {
        this.urlPictureMedium = value;
    }

    /**
     * Gets the value of the urlPictureSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPictureSmall() {
        return urlPictureSmall;
    }

    /**
     * Sets the value of the urlPictureSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPictureSmall(String value) {
        this.urlPictureSmall = value;
    }

}
