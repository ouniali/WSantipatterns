
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpuTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAtServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractRS", propOrder = {
    "resultCode",
    "message",
    "cpuTime",
    "dateAtServer",
    "rqId"
})
@XmlSeeAlso({
    CavalHotelBookingValuationRS.class,
    CavalHotelAvailabilityRS.class,
    CavalGetEstablishmentDataSheetsRS.class,
    CavalGetOffersListRS.class,
    CavalGetListOfBoardTypesRS.class,
    CavalHotelBookingNotificationRS.class,
    CavalHotelBookingConfirmRS.class
})
public abstract class AbstractRS {

    protected int resultCode;
    protected String message;
    protected String cpuTime;
    protected String dateAtServer;
    protected String rqId;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the cpuTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpuTime() {
        return cpuTime;
    }

    /**
     * Sets the value of the cpuTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpuTime(String value) {
        this.cpuTime = value;
    }

    /**
     * Gets the value of the dateAtServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAtServer() {
        return dateAtServer;
    }

    /**
     * Sets the value of the dateAtServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAtServer(String value) {
        this.dateAtServer = value;
    }

    /**
     * Gets the value of the rqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqId() {
        return rqId;
    }

    /**
     * Sets the value of the rqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqId(String value) {
        this.rqId = value;
    }

}
