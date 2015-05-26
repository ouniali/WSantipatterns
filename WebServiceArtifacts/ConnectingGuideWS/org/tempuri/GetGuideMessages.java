
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airlineFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airlineTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrFrom",
    "airlineFrom",
    "depTo",
    "airlineTo"
})
@XmlRootElement(name = "GetGuideMessages")
public class GetGuideMessages {

    protected String arrFrom;
    protected String airlineFrom;
    protected String depTo;
    protected String airlineTo;

    /**
     * Gets the value of the arrFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrFrom() {
        return arrFrom;
    }

    /**
     * Sets the value of the arrFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrFrom(String value) {
        this.arrFrom = value;
    }

    /**
     * Gets the value of the airlineFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineFrom() {
        return airlineFrom;
    }

    /**
     * Sets the value of the airlineFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineFrom(String value) {
        this.airlineFrom = value;
    }

    /**
     * Gets the value of the depTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTo() {
        return depTo;
    }

    /**
     * Sets the value of the depTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTo(String value) {
        this.depTo = value;
    }

    /**
     * Gets the value of the airlineTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineTo() {
        return airlineTo;
    }

    /**
     * Sets the value of the airlineTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineTo(String value) {
        this.airlineTo = value;
    }

}
