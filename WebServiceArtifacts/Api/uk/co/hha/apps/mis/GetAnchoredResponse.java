
package uk.co.hha.apps.mis;

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
 *         &lt;element name="GetAnchoredResult" type="{http://apps.hha.co.uk/mis}Visits" minOccurs="0"/>
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
    "getAnchoredResult"
})
@XmlRootElement(name = "GetAnchoredResponse")
public class GetAnchoredResponse {

    @XmlElement(name = "GetAnchoredResult")
    protected Visits getAnchoredResult;

    /**
     * Gets the value of the getAnchoredResult property.
     * 
     * @return
     *     possible object is
     *     {@link Visits }
     *     
     */
    public Visits getGetAnchoredResult() {
        return getAnchoredResult;
    }

    /**
     * Sets the value of the getAnchoredResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visits }
     *     
     */
    public void setGetAnchoredResult(Visits value) {
        this.getAnchoredResult = value;
    }

}
