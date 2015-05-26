
package _170._0._168._192.tt.bookingapi;

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
 *         &lt;element name="GetPreferencesResult" type="{http://192.168.0.170/TT/BookingAPI}WSUserPreference" minOccurs="0"/>
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
    "getPreferencesResult"
})
@XmlRootElement(name = "GetPreferencesResponse")
public class GetPreferencesResponse {

    @XmlElement(name = "GetPreferencesResult")
    protected WSUserPreference getPreferencesResult;

    /**
     * Gets the value of the getPreferencesResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSUserPreference }
     *     
     */
    public WSUserPreference getGetPreferencesResult() {
        return getPreferencesResult;
    }

    /**
     * Sets the value of the getPreferencesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSUserPreference }
     *     
     */
    public void setGetPreferencesResult(WSUserPreference value) {
        this.getPreferencesResult = value;
    }

}
