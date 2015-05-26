
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaHotelsState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaHotelsState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaHotelItems" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaHotelItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaHotelsState", propOrder = {
    "quotaHotelItems"
})
public class QuotaHotelsState {

    @XmlElementRef(name = "QuotaHotelItems", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaHotelItem> quotaHotelItems;

    /**
     * Gets the value of the quotaHotelItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaHotelItem> getQuotaHotelItems() {
        return quotaHotelItems;
    }

    /**
     * Sets the value of the quotaHotelItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelItem }{@code >}
     *     
     */
    public void setQuotaHotelItems(JAXBElement<ArrayOfQuotaHotelItem> value) {
        this.quotaHotelItems = value;
    }

}
