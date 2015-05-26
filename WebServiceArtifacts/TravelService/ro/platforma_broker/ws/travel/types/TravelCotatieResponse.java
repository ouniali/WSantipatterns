
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelCotatieResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelCotatieResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cotatii" type="{http://www.platforma-broker.ro/ws/travel/types/}ArrayOfTravelCotatie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelCotatieResponse", propOrder = {
    "cotatii"
})
public class TravelCotatieResponse {

    @XmlElementRef(name = "Cotatii", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTravelCotatie> cotatii;

    /**
     * Gets the value of the cotatii property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTravelCotatie }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTravelCotatie> getCotatii() {
        return cotatii;
    }

    /**
     * Sets the value of the cotatii property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTravelCotatie }{@code >}
     *     
     */
    public void setCotatii(JAXBElement<ArrayOfTravelCotatie> value) {
        this.cotatii = value;
    }

}
