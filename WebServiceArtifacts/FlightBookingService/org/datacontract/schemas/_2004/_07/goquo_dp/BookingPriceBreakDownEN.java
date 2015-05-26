
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingPriceBreakDownEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingPriceBreakDownEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BreakupCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BreakupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBreakupAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaxPriceBreakup" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfPaxPriceBreakDown" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingPriceBreakDownEN", propOrder = {
    "breakupCurrency",
    "breakupType",
    "isBreakupAvailable",
    "paxPriceBreakup"
})
public class BookingPriceBreakDownEN {

    @XmlElementRef(name = "BreakupCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakupCurrency;
    @XmlElementRef(name = "BreakupType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakupType;
    @XmlElement(name = "IsBreakupAvailable")
    protected Boolean isBreakupAvailable;
    @XmlElementRef(name = "PaxPriceBreakup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaxPriceBreakDown> paxPriceBreakup;

    /**
     * Gets the value of the breakupCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakupCurrency() {
        return breakupCurrency;
    }

    /**
     * Sets the value of the breakupCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakupCurrency(JAXBElement<String> value) {
        this.breakupCurrency = value;
    }

    /**
     * Gets the value of the breakupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakupType() {
        return breakupType;
    }

    /**
     * Sets the value of the breakupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakupType(JAXBElement<String> value) {
        this.breakupType = value;
    }

    /**
     * Gets the value of the isBreakupAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBreakupAvailable() {
        return isBreakupAvailable;
    }

    /**
     * Sets the value of the isBreakupAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBreakupAvailable(Boolean value) {
        this.isBreakupAvailable = value;
    }

    /**
     * Gets the value of the paxPriceBreakup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaxPriceBreakDown }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaxPriceBreakDown> getPaxPriceBreakup() {
        return paxPriceBreakup;
    }

    /**
     * Sets the value of the paxPriceBreakup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaxPriceBreakDown }{@code >}
     *     
     */
    public void setPaxPriceBreakup(JAXBElement<ArrayOfPaxPriceBreakDown> value) {
        this.paxPriceBreakup = value;
    }

}
