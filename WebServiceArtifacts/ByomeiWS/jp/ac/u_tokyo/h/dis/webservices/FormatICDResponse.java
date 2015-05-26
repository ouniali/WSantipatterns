
package jp.ac.u_tokyo.h.dis.webservices;

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
 *         &lt;element name="FormatICDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "formatICDResult"
})
@XmlRootElement(name = "FormatICDResponse")
public class FormatICDResponse {

    @XmlElement(name = "FormatICDResult")
    protected String formatICDResult;

    /**
     * Gets the value of the formatICDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatICDResult() {
        return formatICDResult;
    }

    /**
     * Sets the value of the formatICDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatICDResult(String value) {
        this.formatICDResult = value;
    }

}
