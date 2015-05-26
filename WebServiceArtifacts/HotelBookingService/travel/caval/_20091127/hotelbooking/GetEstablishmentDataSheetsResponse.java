
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEstablishmentDataSheetsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEstablishmentDataSheetsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://caval.travel/20091127/hotelBooking}cavalGetEstablishmentDataSheetsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEstablishmentDataSheetsResponse", propOrder = {
    "_return"
})
public class GetEstablishmentDataSheetsResponse {

    @XmlElement(name = "return")
    protected CavalGetEstablishmentDataSheetsRS _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CavalGetEstablishmentDataSheetsRS }
     *     
     */
    public CavalGetEstablishmentDataSheetsRS getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CavalGetEstablishmentDataSheetsRS }
     *     
     */
    public void setReturn(CavalGetEstablishmentDataSheetsRS value) {
        this._return = value;
    }

}
