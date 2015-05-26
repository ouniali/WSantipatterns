
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *         &lt;element name="RoundTrip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Result" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSResult" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityInfo" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfArrayOfCityAirport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSearchResponse", propOrder = {
    "isDomestic",
    "status",
    "roundTrip",
    "result",
    "sessionId",
    "errorMsg",
    "cityInfo"
})
public class WSSearchResponse {

    @XmlElement(name = "IsDomestic")
    protected boolean isDomestic;
    @XmlElement(name = "Status")
    protected WSStatus status;
    @XmlElement(name = "RoundTrip")
    protected boolean roundTrip;
    @XmlElement(name = "Result")
    protected ArrayOfWSResult result;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "ErrorMsg")
    protected String errorMsg;
    @XmlElement(name = "CityInfo")
    protected ArrayOfArrayOfCityAirport cityInfo;

    /**
     * Gets the value of the isDomestic property.
     * 
     */
    public boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     */
    public void setIsDomestic(boolean value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the roundTrip property.
     * 
     */
    public boolean isRoundTrip() {
        return roundTrip;
    }

    /**
     * Sets the value of the roundTrip property.
     * 
     */
    public void setRoundTrip(boolean value) {
        this.roundTrip = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSResult }
     *     
     */
    public ArrayOfWSResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSResult }
     *     
     */
    public void setResult(ArrayOfWSResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the cityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfCityAirport }
     *     
     */
    public ArrayOfArrayOfCityAirport getCityInfo() {
        return cityInfo;
    }

    /**
     * Sets the value of the cityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfCityAirport }
     *     
     */
    public void setCityInfo(ArrayOfArrayOfCityAirport value) {
        this.cityInfo = value;
    }

}
