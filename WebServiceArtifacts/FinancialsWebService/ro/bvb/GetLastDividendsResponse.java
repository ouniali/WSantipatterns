
package ro.bvb;

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
 *         &lt;element name="GetLastDividendsResult" type="{http://www.bvb.ro}ArrayOfDividendIdentification" minOccurs="0"/>
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
    "getLastDividendsResult"
})
@XmlRootElement(name = "GetLastDividendsResponse")
public class GetLastDividendsResponse {

    @XmlElement(name = "GetLastDividendsResult")
    protected ArrayOfDividendIdentification getLastDividendsResult;

    /**
     * Gets the value of the getLastDividendsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDividendIdentification }
     *     
     */
    public ArrayOfDividendIdentification getGetLastDividendsResult() {
        return getLastDividendsResult;
    }

    /**
     * Sets the value of the getLastDividendsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDividendIdentification }
     *     
     */
    public void setGetLastDividendsResult(ArrayOfDividendIdentification value) {
        this.getLastDividendsResult = value;
    }

}
