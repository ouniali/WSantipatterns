
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
 *         &lt;element name="isAirlineLcc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isAirlineLcc"
})
@XmlRootElement(name = "GetAgencyBalance")
public class GetAgencyBalance {

    protected boolean isAirlineLcc;

    /**
     * Gets the value of the isAirlineLcc property.
     * 
     */
    public boolean isIsAirlineLcc() {
        return isAirlineLcc;
    }

    /**
     * Sets the value of the isAirlineLcc property.
     * 
     */
    public void setIsAirlineLcc(boolean value) {
        this.isAirlineLcc = value;
    }

}
