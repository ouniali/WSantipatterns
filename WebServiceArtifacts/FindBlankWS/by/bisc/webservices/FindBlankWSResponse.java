
package by.bisc.webservices;

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
 *         &lt;element name="FindBlankWSResult" type="{http://www.bisc.by/webservices}WSAnswer" minOccurs="0"/>
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
    "findBlankWSResult"
})
@XmlRootElement(name = "FindBlankWSResponse")
public class FindBlankWSResponse {

    @XmlElement(name = "FindBlankWSResult")
    protected WSAnswer findBlankWSResult;

    /**
     * Gets the value of the findBlankWSResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSAnswer }
     *     
     */
    public WSAnswer getFindBlankWSResult() {
        return findBlankWSResult;
    }

    /**
     * Sets the value of the findBlankWSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAnswer }
     *     
     */
    public void setFindBlankWSResult(WSAnswer value) {
        this.findBlankWSResult = value;
    }

}
