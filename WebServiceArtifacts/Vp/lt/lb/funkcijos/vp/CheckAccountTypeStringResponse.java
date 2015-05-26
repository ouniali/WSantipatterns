
package lt.lb.funkcijos.vp;

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
 *         &lt;element name="CheckAccountType_StringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkAccountTypeStringResult"
})
@XmlRootElement(name = "CheckAccountType_StringResponse")
public class CheckAccountTypeStringResponse {

    @XmlElement(name = "CheckAccountType_StringResult")
    protected String checkAccountTypeStringResult;

    /**
     * Gets the value of the checkAccountTypeStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckAccountTypeStringResult() {
        return checkAccountTypeStringResult;
    }

    /**
     * Sets the value of the checkAccountTypeStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckAccountTypeStringResult(String value) {
        this.checkAccountTypeStringResult = value;
    }

}
