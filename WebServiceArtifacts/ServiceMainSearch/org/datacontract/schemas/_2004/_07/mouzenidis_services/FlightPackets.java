
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * <p>Java class for FlightPackets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPackets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacketsBack" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="PacketsTo" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPackets", propOrder = {
    "packetsBack",
    "packetsTo"
})
public class FlightPackets {

    @XmlElementRef(name = "PacketsBack", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> packetsBack;
    @XmlElementRef(name = "PacketsTo", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> packetsTo;

    /**
     * Gets the value of the packetsBack property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getPacketsBack() {
        return packetsBack;
    }

    /**
     * Sets the value of the packetsBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setPacketsBack(JAXBElement<ArrayOfint> value) {
        this.packetsBack = value;
    }

    /**
     * Gets the value of the packetsTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getPacketsTo() {
        return packetsTo;
    }

    /**
     * Sets the value of the packetsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setPacketsTo(JAXBElement<ArrayOfint> value) {
        this.packetsTo = value;
    }

}
