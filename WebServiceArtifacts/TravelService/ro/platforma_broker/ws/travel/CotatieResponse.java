
package ro.platforma_broker.ws.travel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ro.platforma_broker.ws.travel.types.TravelCotatieResponse;


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
 *         &lt;element name="CotatieResult" type="{http://www.platforma-broker.ro/ws/travel/types/}TravelCotatieResponse" minOccurs="0"/>
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
    "cotatieResult"
})
@XmlRootElement(name = "CotatieResponse")
public class CotatieResponse {

    @XmlElementRef(name = "CotatieResult", namespace = "http://www.platforma-broker.ro/ws/travel", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelCotatieResponse> cotatieResult;

    /**
     * Gets the value of the cotatieResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelCotatieResponse }{@code >}
     *     
     */
    public JAXBElement<TravelCotatieResponse> getCotatieResult() {
        return cotatieResult;
    }

    /**
     * Sets the value of the cotatieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelCotatieResponse }{@code >}
     *     
     */
    public void setCotatieResult(JAXBElement<TravelCotatieResponse> value) {
        this.cotatieResult = value;
    }

}
