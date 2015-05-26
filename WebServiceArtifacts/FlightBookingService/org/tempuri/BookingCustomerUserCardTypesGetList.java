
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.CustomerUserCardTypesEN;


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
 *         &lt;element name="argEn" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CustomerUserCardTypesEN" minOccurs="0"/>
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
    "argEn"
})
@XmlRootElement(name = "Booking_CustomerUserCardTypes_GetList")
public class BookingCustomerUserCardTypesGetList {

    @XmlElementRef(name = "argEn", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerUserCardTypesEN> argEn;

    /**
     * Gets the value of the argEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerUserCardTypesEN }{@code >}
     *     
     */
    public JAXBElement<CustomerUserCardTypesEN> getArgEn() {
        return argEn;
    }

    /**
     * Sets the value of the argEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerUserCardTypesEN }{@code >}
     *     
     */
    public void setArgEn(JAXBElement<CustomerUserCardTypesEN> value) {
        this.argEn = value;
    }

}
