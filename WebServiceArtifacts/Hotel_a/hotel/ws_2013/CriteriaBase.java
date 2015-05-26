
package hotel.ws_2013;

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
 *         &lt;element name="Rooms" type="{WS_2013.Hotel}ArrayOfSearchRoom" minOccurs="0"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOfNights" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccomodationSearchType" type="{WS_2013.Hotel}eAccomodationSearchType"/>
 *         &lt;element name="UserIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultManipulation" type="{WS_2013.Hotel}ResultManipulation" minOccurs="0"/>
 *         &lt;element name="ResultPagination" type="{WS_2013.Hotel}SearchFilter" minOccurs="0"/>
 *         &lt;element name="ReturnRoomOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rooms",
    "cityId",
    "checkInDate",
    "numberOfNights",
    "accomodationSearchType",
    "userIP",
    "resultManipulation",
    "resultPagination",
    "returnRoomOnRequest"
})
@XmlSeeAlso({
    Criteria.class
})
public abstract class CriteriaBase {

    @XmlElement(name = "Rooms")
    protected ArrayOfSearchRoom rooms;
    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "CheckInDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElement(name = "NumberOfNights")
    protected int numberOfNights;
    @XmlElement(name = "AccomodationSearchType", required = true)
    @XmlSchemaType(name = "string")
    protected EAccomodationSearchType accomodationSearchType;
    @XmlElement(name = "UserIP")
    protected String userIP;
    @XmlElement(name = "ResultManipulation")
    protected ResultManipulation resultManipulation;
    @XmlElement(name = "ResultPagination")
    protected SearchFilter resultPagination;
    @XmlElement(name = "ReturnRoomOnRequest")
    protected boolean returnRoomOnRequest;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchRoom }
     *     
     */
    public ArrayOfSearchRoom getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchRoom }
     *     
     */
    public void setRooms(ArrayOfSearchRoom value) {
        this.rooms = value;
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
     * Gets the value of the numberOfNights property.
     * 
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     */
    public void setNumberOfNights(int value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the accomodationSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link EAccomodationSearchType }
     *     
     */
    public EAccomodationSearchType getAccomodationSearchType() {
        return accomodationSearchType;
    }

    /**
     * Sets the value of the accomodationSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAccomodationSearchType }
     *     
     */
    public void setAccomodationSearchType(EAccomodationSearchType value) {
        this.accomodationSearchType = value;
    }

    /**
     * Gets the value of the userIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIP() {
        return userIP;
    }

    /**
     * Sets the value of the userIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIP(String value) {
        this.userIP = value;
    }

    /**
     * Gets the value of the resultManipulation property.
     * 
     * @return
     *     possible object is
     *     {@link ResultManipulation }
     *     
     */
    public ResultManipulation getResultManipulation() {
        return resultManipulation;
    }

    /**
     * Sets the value of the resultManipulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultManipulation }
     *     
     */
    public void setResultManipulation(ResultManipulation value) {
        this.resultManipulation = value;
    }

    /**
     * Gets the value of the resultPagination property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFilter }
     *     
     */
    public SearchFilter getResultPagination() {
        return resultPagination;
    }

    /**
     * Sets the value of the resultPagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFilter }
     *     
     */
    public void setResultPagination(SearchFilter value) {
        this.resultPagination = value;
    }

    /**
     * Gets the value of the returnRoomOnRequest property.
     * 
     */
    public boolean isReturnRoomOnRequest() {
        return returnRoomOnRequest;
    }

    /**
     * Sets the value of the returnRoomOnRequest property.
     * 
     */
    public void setReturnRoomOnRequest(boolean value) {
        this.returnRoomOnRequest = value;
    }

}
