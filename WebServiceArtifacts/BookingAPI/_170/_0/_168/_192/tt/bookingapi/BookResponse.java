
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
 *         &lt;element name="BookResult" type="{http://192.168.0.170/TT/BookingAPI}WSBookResponse" minOccurs="0"/>
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
    "bookResult"
})
@XmlRootElement(name = "BookResponse")
public class BookResponse {

    @XmlElement(name = "BookResult")
    protected WSBookResponse bookResult;

    /**
     * Gets the value of the bookResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSBookResponse }
     *     
     */
    public WSBookResponse getBookResult() {
        return bookResult;
    }

    /**
     * Sets the value of the bookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBookResponse }
     *     
     */
    public void setBookResult(WSBookResponse value) {
        this.bookResult = value;
    }

}
