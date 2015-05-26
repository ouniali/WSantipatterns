
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirRows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirRow" type="{http://www.opentravel.org/OTA/2003/05}RowDetailsType" maxOccurs="999"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassType", propOrder = {
    "airRows"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.SeatMapDetailsType.CabinClass.class
})
public class CabinClassType {

    @XmlElement(name = "AirRows")
    protected CabinClassType.AirRows airRows;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the airRows property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassType.AirRows }
     *     
     */
    public CabinClassType.AirRows getAirRows() {
        return airRows;
    }

    /**
     * Sets the value of the airRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassType.AirRows }
     *     
     */
    public void setAirRows(CabinClassType.AirRows value) {
        this.airRows = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AirRow" type="{http://www.opentravel.org/OTA/2003/05}RowDetailsType" maxOccurs="999"/>
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
        "airRow"
    })
    public static class AirRows {

        @XmlElement(name = "AirRow", required = true)
        protected List<RowDetailsType> airRow;

        /**
         * Gets the value of the airRow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airRow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RowDetailsType }
         * 
         * 
         */
        public List<RowDetailsType> getAirRow() {
            if (airRow == null) {
                airRow = new ArrayList<RowDetailsType>();
            }
            return this.airRow;
        }

    }

}
