
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CriteriaBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationCityCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginCityCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DestinationStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialReturnTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalReturnTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeOfThePassengers" type="{WS_2013.TrainTicket}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="DirectTrainsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllPassengersHaveRailPass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TripType" type="{WS_2013.TrainTicket}eForwardAndReturnType"/>
 *         &lt;element name="ForwardServiceTime" type="{WS_2013.TrainTicket}eTrainTimeService"/>
 *         &lt;element name="ReturnServiceTime" type="{WS_2013.TrainTicket}eTrainTimeService"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaBase", propOrder = {
    "destinationCityCode",
    "originCityCode",
    "departureDate",
    "returnDate",
    "destinationStationCode",
    "destinationStationName",
    "originStationCode",
    "originStationName",
    "initialDepartureTime",
    "finalDepartureTime",
    "initialReturnTime",
    "finalReturnTime",
    "ageOfThePassengers",
    "directTrainsOnly",
    "allPassengersHaveRailPass",
    "tripType",
    "forwardServiceTime",
    "returnServiceTime"
})
@XmlSeeAlso({
    Criteria.class
})
public abstract class CriteriaBase {

    @XmlElement(name = "DestinationCityCode")
    protected int destinationCityCode;
    @XmlElement(name = "OriginCityCode")
    protected int originCityCode;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ReturnDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    @XmlElement(name = "DestinationStationCode")
    protected String destinationStationCode;
    @XmlElement(name = "DestinationStationName")
    protected String destinationStationName;
    @XmlElement(name = "OriginStationCode")
    protected String originStationCode;
    @XmlElement(name = "OriginStationName")
    protected String originStationName;
    @XmlElement(name = "InitialDepartureTime")
    protected String initialDepartureTime;
    @XmlElement(name = "FinalDepartureTime")
    protected String finalDepartureTime;
    @XmlElement(name = "InitialReturnTime")
    protected String initialReturnTime;
    @XmlElement(name = "FinalReturnTime")
    protected String finalReturnTime;
    @XmlElement(name = "AgeOfThePassengers")
    protected ArrayOfInt ageOfThePassengers;
    @XmlElement(name = "DirectTrainsOnly")
    protected boolean directTrainsOnly;
    @XmlElement(name = "AllPassengersHaveRailPass")
    protected boolean allPassengersHaveRailPass;
    @XmlElement(name = "TripType", required = true)
    @XmlSchemaType(name = "string")
    protected EForwardAndReturnType tripType;
    @XmlElement(name = "ForwardServiceTime", required = true)
    @XmlSchemaType(name = "string")
    protected ETrainTimeService forwardServiceTime;
    @XmlElement(name = "ReturnServiceTime", required = true)
    @XmlSchemaType(name = "string")
    protected ETrainTimeService returnServiceTime;

    /**
     * Gets the value of the destinationCityCode property.
     * 
     */
    public int getDestinationCityCode() {
        return destinationCityCode;
    }

    /**
     * Sets the value of the destinationCityCode property.
     * 
     */
    public void setDestinationCityCode(int value) {
        this.destinationCityCode = value;
    }

    /**
     * Gets the value of the originCityCode property.
     * 
     */
    public int getOriginCityCode() {
        return originCityCode;
    }

    /**
     * Sets the value of the originCityCode property.
     * 
     */
    public void setOriginCityCode(int value) {
        this.originCityCode = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the destinationStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationCode() {
        return destinationStationCode;
    }

    /**
     * Sets the value of the destinationStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationCode(String value) {
        this.destinationStationCode = value;
    }

    /**
     * Gets the value of the destinationStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationName() {
        return destinationStationName;
    }

    /**
     * Sets the value of the destinationStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationName(String value) {
        this.destinationStationName = value;
    }

    /**
     * Gets the value of the originStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationCode() {
        return originStationCode;
    }

    /**
     * Sets the value of the originStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationCode(String value) {
        this.originStationCode = value;
    }

    /**
     * Gets the value of the originStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationName() {
        return originStationName;
    }

    /**
     * Sets the value of the originStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationName(String value) {
        this.originStationName = value;
    }

    /**
     * Gets the value of the initialDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialDepartureTime() {
        return initialDepartureTime;
    }

    /**
     * Sets the value of the initialDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialDepartureTime(String value) {
        this.initialDepartureTime = value;
    }

    /**
     * Gets the value of the finalDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalDepartureTime() {
        return finalDepartureTime;
    }

    /**
     * Sets the value of the finalDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalDepartureTime(String value) {
        this.finalDepartureTime = value;
    }

    /**
     * Gets the value of the initialReturnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialReturnTime() {
        return initialReturnTime;
    }

    /**
     * Sets the value of the initialReturnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialReturnTime(String value) {
        this.initialReturnTime = value;
    }

    /**
     * Gets the value of the finalReturnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalReturnTime() {
        return finalReturnTime;
    }

    /**
     * Sets the value of the finalReturnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalReturnTime(String value) {
        this.finalReturnTime = value;
    }

    /**
     * Gets the value of the ageOfThePassengers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAgeOfThePassengers() {
        return ageOfThePassengers;
    }

    /**
     * Sets the value of the ageOfThePassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAgeOfThePassengers(ArrayOfInt value) {
        this.ageOfThePassengers = value;
    }

    /**
     * Gets the value of the directTrainsOnly property.
     * 
     */
    public boolean isDirectTrainsOnly() {
        return directTrainsOnly;
    }

    /**
     * Sets the value of the directTrainsOnly property.
     * 
     */
    public void setDirectTrainsOnly(boolean value) {
        this.directTrainsOnly = value;
    }

    /**
     * Gets the value of the allPassengersHaveRailPass property.
     * 
     */
    public boolean isAllPassengersHaveRailPass() {
        return allPassengersHaveRailPass;
    }

    /**
     * Sets the value of the allPassengersHaveRailPass property.
     * 
     */
    public void setAllPassengersHaveRailPass(boolean value) {
        this.allPassengersHaveRailPass = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link EForwardAndReturnType }
     *     
     */
    public EForwardAndReturnType getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EForwardAndReturnType }
     *     
     */
    public void setTripType(EForwardAndReturnType value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the forwardServiceTime property.
     * 
     * @return
     *     possible object is
     *     {@link ETrainTimeService }
     *     
     */
    public ETrainTimeService getForwardServiceTime() {
        return forwardServiceTime;
    }

    /**
     * Sets the value of the forwardServiceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETrainTimeService }
     *     
     */
    public void setForwardServiceTime(ETrainTimeService value) {
        this.forwardServiceTime = value;
    }

    /**
     * Gets the value of the returnServiceTime property.
     * 
     * @return
     *     possible object is
     *     {@link ETrainTimeService }
     *     
     */
    public ETrainTimeService getReturnServiceTime() {
        return returnServiceTime;
    }

    /**
     * Sets the value of the returnServiceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETrainTimeService }
     *     
     */
    public void setReturnServiceTime(ETrainTimeService value) {
        this.returnServiceTime = value;
    }

}
