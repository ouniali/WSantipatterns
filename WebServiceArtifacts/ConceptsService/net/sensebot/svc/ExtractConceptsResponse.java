
package net.sensebot.svc;

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
 *         &lt;element name="ExtractConceptsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "extractConceptsResult"
})
@XmlRootElement(name = "ExtractConceptsResponse")
public class ExtractConceptsResponse {

    @XmlElement(name = "ExtractConceptsResult")
    protected String extractConceptsResult;

    /**
     * Gets the value of the extractConceptsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractConceptsResult() {
        return extractConceptsResult;
    }

    /**
     * Sets the value of the extractConceptsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractConceptsResult(String value) {
        this.extractConceptsResult = value;
    }

}
