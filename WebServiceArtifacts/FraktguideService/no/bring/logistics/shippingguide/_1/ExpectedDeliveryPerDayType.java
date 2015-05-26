
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedDeliveryPerDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedDeliveryPerDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Monday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tuesday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Wednesday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Thursday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Friday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="toPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedDeliveryPerDayType", propOrder = {
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday"
})
public class ExpectedDeliveryPerDayType {

    @XmlElement(name = "Monday", required = true)
    protected String monday;
    @XmlElement(name = "Tuesday", required = true)
    protected String tuesday;
    @XmlElement(name = "Wednesday", required = true)
    protected String wednesday;
    @XmlElement(name = "Thursday", required = true)
    protected String thursday;
    @XmlElement(name = "Friday", required = true)
    protected String friday;
    @XmlAttribute(name = "toPostalCode")
    protected String toPostalCode;

    /**
     * Gets the value of the monday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonday(String value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuesday(String value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWednesday(String value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThursday(String value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriday(String value) {
        this.friday = value;
    }

    /**
     * Gets the value of the toPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalCode() {
        return toPostalCode;
    }

    /**
     * Sets the value of the toPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalCode(String value) {
        this.toPostalCode = value;
    }

}
