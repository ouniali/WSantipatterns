
package ro.platforma_broker.ws.travel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ro.platforma_broker.ws.travel.types.TravelSalvareRequest;


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
 *         &lt;element name="request" type="{http://www.platforma-broker.ro/ws/travel/types/}TravelSalvareRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "SalvareCerere")
public class SalvareCerere {

    @XmlElementRef(name = "request", namespace = "http://www.platforma-broker.ro/ws/travel", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelSalvareRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelSalvareRequest }{@code >}
     *     
     */
    public JAXBElement<TravelSalvareRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelSalvareRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<TravelSalvareRequest> value) {
        this.request = value;
    }

}
