
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
 *         &lt;element name="GetENOMRelNotesWebResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getENOMRelNotesWebResult"
})
@XmlRootElement(name = "GetENOMRelNotesWebResponse")
public class GetENOMRelNotesWebResponse {

    @XmlElement(name = "GetENOMRelNotesWebResult")
    protected String getENOMRelNotesWebResult;

    /**
     * Gets the value of the getENOMRelNotesWebResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetENOMRelNotesWebResult() {
        return getENOMRelNotesWebResult;
    }

    /**
     * Sets the value of the getENOMRelNotesWebResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetENOMRelNotesWebResult(String value) {
        this.getENOMRelNotesWebResult = value;
    }

}
