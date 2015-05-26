
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtrasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtrasType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ExtrasCoreType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="PassengerCounts" type="{http://www.opentravel.org/OTA/2003/05}CustomerCountsType" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrasType", propOrder = {
    "date",
    "passengerCounts",
    "additionalInfo"
})
public class ExtrasType
    extends ExtrasCoreType
{

    @XmlElement(name = "Date")
    protected DateTimeSpanType date;
    @XmlElement(name = "PassengerCounts")
    protected CustomerCountsType passengerCounts;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlAttribute(name = "ListOfPassengerRPH")
    protected List<String> listOfPassengerRPH;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setDate(DateTimeSpanType value) {
        this.date = value;
    }

    /**
     * Gets the value of the passengerCounts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCountsType }
     *     
     */
    public CustomerCountsType getPassengerCounts() {
        return passengerCounts;
    }

    /**
     * Sets the value of the passengerCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCountsType }
     *     
     */
    public void setPassengerCounts(CustomerCountsType value) {
        this.passengerCounts = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the listOfPassengerRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfPassengerRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfPassengerRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfPassengerRPH() {
        if (listOfPassengerRPH == null) {
            listOfPassengerRPH = new ArrayList<String>();
        }
        return this.listOfPassengerRPH;
    }

}
