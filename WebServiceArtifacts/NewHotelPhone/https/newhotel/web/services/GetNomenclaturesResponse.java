
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetNomenclaturesResult" type="{https://NewHotel/Web/Services/}NomenclatureResponse" minOccurs="0"/>
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
    "getNomenclaturesResult"
})
@XmlRootElement(name = "GetNomenclaturesResponse")
public class GetNomenclaturesResponse {

    @XmlElement(name = "GetNomenclaturesResult")
    protected NomenclatureResponse getNomenclaturesResult;

    /**
     * Gets the value of the getNomenclaturesResult property.
     * 
     * @return
     *     possible object is
     *     {@link NomenclatureResponse }
     *     
     */
    public NomenclatureResponse getGetNomenclaturesResult() {
        return getNomenclaturesResult;
    }

    /**
     * Sets the value of the getNomenclaturesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomenclatureResponse }
     *     
     */
    public void setGetNomenclaturesResult(NomenclatureResponse value) {
        this.getNomenclaturesResult = value;
    }

}
