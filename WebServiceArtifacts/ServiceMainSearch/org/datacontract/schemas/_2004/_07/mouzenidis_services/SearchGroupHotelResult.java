
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGroupHotelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchGroupHotelResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasMore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TourHotelGroups" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfTourHotelGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGroupHotelResult", propOrder = {
    "hasMore",
    "tourHotelGroups"
})
public class SearchGroupHotelResult {

    @XmlElement(name = "HasMore")
    protected Boolean hasMore;
    @XmlElementRef(name = "TourHotelGroups", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTourHotelGroup> tourHotelGroups;

    /**
     * Gets the value of the hasMore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }

    /**
     * Gets the value of the tourHotelGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourHotelGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTourHotelGroup> getTourHotelGroups() {
        return tourHotelGroups;
    }

    /**
     * Sets the value of the tourHotelGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourHotelGroup }{@code >}
     *     
     */
    public void setTourHotelGroups(JAXBElement<ArrayOfTourHotelGroup> value) {
        this.tourHotelGroups = value;
    }

}
