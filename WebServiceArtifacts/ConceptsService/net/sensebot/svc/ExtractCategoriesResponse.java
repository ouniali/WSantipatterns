
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
 *         &lt;element name="ExtractCategoriesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "extractCategoriesResult"
})
@XmlRootElement(name = "ExtractCategoriesResponse")
public class ExtractCategoriesResponse {

    @XmlElement(name = "ExtractCategoriesResult")
    protected String extractCategoriesResult;

    /**
     * Gets the value of the extractCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractCategoriesResult() {
        return extractCategoriesResult;
    }

    /**
     * Sets the value of the extractCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractCategoriesResult(String value) {
        this.extractCategoriesResult = value;
    }

}
