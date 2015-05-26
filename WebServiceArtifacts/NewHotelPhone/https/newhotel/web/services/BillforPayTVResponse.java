
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
 *         &lt;element name="BillforPayTVResult" type="{https://NewHotel/Web/Services/}BillPayTVResponse" minOccurs="0"/>
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
    "billforPayTVResult"
})
@XmlRootElement(name = "BillforPayTVResponse")
public class BillforPayTVResponse {

    @XmlElement(name = "BillforPayTVResult")
    protected BillPayTVResponse billforPayTVResult;

    /**
     * Gets the value of the billforPayTVResult property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayTVResponse }
     *     
     */
    public BillPayTVResponse getBillforPayTVResult() {
        return billforPayTVResult;
    }

    /**
     * Sets the value of the billforPayTVResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayTVResponse }
     *     
     */
    public void setBillforPayTVResult(BillPayTVResponse value) {
        this.billforPayTVResult = value;
    }

}
