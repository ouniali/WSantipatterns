
package org.tempuri;

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
 *         &lt;element name="EfemeridesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "efemeridesResult"
})
@XmlRootElement(name = "EfemeridesResponse")
public class EfemeridesResponse {

    @XmlElement(name = "EfemeridesResult")
    protected String efemeridesResult;

    /**
     * Gets the value of the efemeridesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfemeridesResult() {
        return efemeridesResult;
    }

    /**
     * Sets the value of the efemeridesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfemeridesResult(String value) {
        this.efemeridesResult = value;
    }

}
