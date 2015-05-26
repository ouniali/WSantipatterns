
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}ProductInfo">
 *       &lt;sequence>
 *         &lt;element name="Segments" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSegment" minOccurs="0"/>
 *         &lt;element name="Passenger" type="{http://schemas.tourico.com/webservices/hotelv3}FlightPassenger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="flightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="pnr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eTick" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="srvFee" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="dlvFee" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfo", propOrder = {
    "segments",
    "passenger"
})
public class FlightInfo
    extends ProductInfo
{

    @XmlElement(name = "Segments")
    protected ArrayOfSegment segments;
    @XmlElement(name = "Passenger")
    protected List<FlightPassenger> passenger;
    @XmlAttribute(name = "flightMode", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short flightMode;
    @XmlAttribute(name = "pnr")
    protected String pnr;
    @XmlAttribute(name = "eTick", required = true)
    protected boolean eTick;
    @XmlAttribute(name = "srvFee", required = true)
    protected BigDecimal srvFee;
    @XmlAttribute(name = "dlvFee", required = true)
    protected BigDecimal dlvFee;

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegment }
     *     
     */
    public ArrayOfSegment getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegment }
     *     
     */
    public void setSegments(ArrayOfSegment value) {
        this.segments = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightPassenger }
     * 
     * 
     */
    public List<FlightPassenger> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<FlightPassenger>();
        }
        return this.passenger;
    }

    /**
     * Gets the value of the flightMode property.
     * 
     */
    public short getFlightMode() {
        return flightMode;
    }

    /**
     * Sets the value of the flightMode property.
     * 
     */
    public void setFlightMode(short value) {
        this.flightMode = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnr(String value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the eTick property.
     * 
     */
    public boolean isETick() {
        return eTick;
    }

    /**
     * Sets the value of the eTick property.
     * 
     */
    public void setETick(boolean value) {
        this.eTick = value;
    }

    /**
     * Gets the value of the srvFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrvFee() {
        return srvFee;
    }

    /**
     * Sets the value of the srvFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrvFee(BigDecimal value) {
        this.srvFee = value;
    }

    /**
     * Gets the value of the dlvFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDlvFee() {
        return dlvFee;
    }

    /**
     * Sets the value of the dlvFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDlvFee(BigDecimal value) {
        this.dlvFee = value;
    }

}
