
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaFlightsState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaFlightsState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaBackFlightItems" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaFlightItem" minOccurs="0"/>
 *         &lt;element name="QuotaFlightItems" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaFlightItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaFlightsState", propOrder = {
    "quotaBackFlightItems",
    "quotaFlightItems"
})
public class QuotaFlightsState {

    @XmlElementRef(name = "QuotaBackFlightItems", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaFlightItem> quotaBackFlightItems;
    @XmlElementRef(name = "QuotaFlightItems", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaFlightItem> quotaFlightItems;

    /**
     * Gets the value of the quotaBackFlightItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaFlightItem> getQuotaBackFlightItems() {
        return quotaBackFlightItems;
    }

    /**
     * Sets the value of the quotaBackFlightItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}
     *     
     */
    public void setQuotaBackFlightItems(JAXBElement<ArrayOfQuotaFlightItem> value) {
        this.quotaBackFlightItems = value;
    }

    /**
     * Gets the value of the quotaFlightItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaFlightItem> getQuotaFlightItems() {
        return quotaFlightItems;
    }

    /**
     * Sets the value of the quotaFlightItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightItem }{@code >}
     *     
     */
    public void setQuotaFlightItems(JAXBElement<ArrayOfQuotaFlightItem> value) {
        this.quotaFlightItems = value;
    }

}
