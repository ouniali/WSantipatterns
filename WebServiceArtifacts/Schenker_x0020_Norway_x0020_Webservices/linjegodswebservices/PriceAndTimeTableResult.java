
package linjegodswebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAndTimeTableResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAndTimeTableResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{LinjegodsWebServices}FreightPriceResultat" minOccurs="0"/>
 *         &lt;element name="timeTable" type="{LinjegodsWebServices}ScheduledDeliveryTimeResultat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAndTimeTableResult", propOrder = {
    "responseCode",
    "responseMessage",
    "price",
    "timeTable"
})
public class PriceAndTimeTableResult {

    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    protected FreightPriceResultat price;
    protected ScheduledDeliveryTimeResultat timeTable;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPriceResultat }
     *     
     */
    public FreightPriceResultat getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPriceResultat }
     *     
     */
    public void setPrice(FreightPriceResultat value) {
        this.price = value;
    }

    /**
     * Gets the value of the timeTable property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledDeliveryTimeResultat }
     *     
     */
    public ScheduledDeliveryTimeResultat getTimeTable() {
        return timeTable;
    }

    /**
     * Sets the value of the timeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledDeliveryTimeResultat }
     *     
     */
    public void setTimeTable(ScheduledDeliveryTimeResultat value) {
        this.timeTable = value;
    }

}
