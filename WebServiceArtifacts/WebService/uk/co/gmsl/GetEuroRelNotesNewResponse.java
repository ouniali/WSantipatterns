
package uk.co.gmsl;

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
 *         &lt;element name="GetEuroRelNotesNewResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getEuroRelNotesNewResult"
})
@XmlRootElement(name = "GetEuroRelNotesNewResponse")
public class GetEuroRelNotesNewResponse {

    @XmlElement(name = "GetEuroRelNotesNewResult")
    protected String getEuroRelNotesNewResult;

    /**
     * Gets the value of the getEuroRelNotesNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetEuroRelNotesNewResult() {
        return getEuroRelNotesNewResult;
    }

    /**
     * Sets the value of the getEuroRelNotesNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetEuroRelNotesNewResult(String value) {
        this.getEuroRelNotesNewResult = value;
    }

}
