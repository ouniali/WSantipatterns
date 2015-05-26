
package ro.platforma_broker.ws.travel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ro.platforma_broker.ws.travel.types.TravelSalvareResponse;


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
 *         &lt;element name="SalvareCerereResult" type="{http://www.platforma-broker.ro/ws/travel/types/}TravelSalvareResponse" minOccurs="0"/>
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
    "salvareCerereResult"
})
@XmlRootElement(name = "SalvareCerereResponse")
public class SalvareCerereResponse {

    @XmlElementRef(name = "SalvareCerereResult", namespace = "http://www.platforma-broker.ro/ws/travel", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelSalvareResponse> salvareCerereResult;

    /**
     * Gets the value of the salvareCerereResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelSalvareResponse }{@code >}
     *     
     */
    public JAXBElement<TravelSalvareResponse> getSalvareCerereResult() {
        return salvareCerereResult;
    }

    /**
     * Sets the value of the salvareCerereResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelSalvareResponse }{@code >}
     *     
     */
    public void setSalvareCerereResult(JAXBElement<TravelSalvareResponse> value) {
        this.salvareCerereResult = value;
    }

}
