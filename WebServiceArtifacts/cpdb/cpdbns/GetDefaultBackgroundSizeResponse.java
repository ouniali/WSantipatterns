
package cpdbns;

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
 *         &lt;element name="bgSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "bgSize"
})
@XmlRootElement(name = "getDefaultBackgroundSizeResponse")
public class GetDefaultBackgroundSizeResponse {

    @XmlElement(required = true)
    protected String bgSize;

    /**
     * Gets the value of the bgSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgSize() {
        return bgSize;
    }

    /**
     * Sets the value of the bgSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgSize(String value) {
        this.bgSize = value;
    }

}
