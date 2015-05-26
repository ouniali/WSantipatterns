
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastTradePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastTradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrevClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DayLow" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DayHigh" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputData", propOrder = {
    "lastTradePrice",
    "lastTradeTime",
    "open",
    "prevClose",
    "volume",
    "dayLow",
    "dayHigh"
})
public class OutputData {

    @XmlElement(name = "LastTradePrice")
    protected double lastTradePrice;
    @XmlElement(name = "LastTradeTime", required = true)
    protected String lastTradeTime;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "PrevClose")
    protected double prevClose;
    @XmlElement(name = "Volume")
    protected double volume;
    @XmlElement(name = "DayLow")
    protected double dayLow;
    @XmlElement(name = "DayHigh")
    protected double dayHigh;

    /**
     * Gets the value of the lastTradePrice property.
     * 
     */
    public double getLastTradePrice() {
        return lastTradePrice;
    }

    /**
     * Sets the value of the lastTradePrice property.
     * 
     */
    public void setLastTradePrice(double value) {
        this.lastTradePrice = value;
    }

    /**
     * Gets the value of the lastTradeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTradeTime() {
        return lastTradeTime;
    }

    /**
     * Sets the value of the lastTradeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTradeTime(String value) {
        this.lastTradeTime = value;
    }

    /**
     * Gets the value of the open property.
     * 
     */
    public double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     */
    public void setOpen(double value) {
        this.open = value;
    }

    /**
     * Gets the value of the prevClose property.
     * 
     */
    public double getPrevClose() {
        return prevClose;
    }

    /**
     * Sets the value of the prevClose property.
     * 
     */
    public void setPrevClose(double value) {
        this.prevClose = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the dayLow property.
     * 
     */
    public double getDayLow() {
        return dayLow;
    }

    /**
     * Sets the value of the dayLow property.
     * 
     */
    public void setDayLow(double value) {
        this.dayLow = value;
    }

    /**
     * Gets the value of the dayHigh property.
     * 
     */
    public double getDayHigh() {
        return dayHigh;
    }

    /**
     * Sets the value of the dayHigh property.
     * 
     */
    public void setDayHigh(double value) {
        this.dayHigh = value;
    }

}
