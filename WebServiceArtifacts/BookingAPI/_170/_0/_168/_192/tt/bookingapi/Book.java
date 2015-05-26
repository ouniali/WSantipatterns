
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bookRequest" type="{http://192.168.0.170/TT/BookingAPI}WSBookRequest" minOccurs="0"/>
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
    "bookRequest"
})
@XmlRootElement(name = "Book")
public class Book {

    protected WSBookRequest bookRequest;

    /**
     * Gets the value of the bookRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSBookRequest }
     *     
     */
    public WSBookRequest getBookRequest() {
        return bookRequest;
    }

    /**
     * Sets the value of the bookRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBookRequest }
     *     
     */
    public void setBookRequest(WSBookRequest value) {
        this.bookRequest = value;
    }

}
