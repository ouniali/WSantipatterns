
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
 *         &lt;element name="GetWarningsResult" type="{http://apps.hha.co.uk/mis}Warnings" minOccurs="0"/>
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
    "getWarningsResult"
})
@XmlRootElement(name = "GetWarningsResponse")
public class GetWarningsResponse {

    @XmlElement(name = "GetWarningsResult")
    protected Warnings getWarningsResult;

    /**
     * Gets the value of the getWarningsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getGetWarningsResult() {
        return getWarningsResult;
    }

    /**
     * Sets the value of the getWarningsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setGetWarningsResult(Warnings value) {
        this.getWarningsResult = value;
    }

}
