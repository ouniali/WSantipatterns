
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
 *         &lt;element name="CheckOperationType_StringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkOperationTypeStringResult"
})
@XmlRootElement(name = "CheckOperationType_StringResponse")
public class CheckOperationTypeStringResponse {

    @XmlElement(name = "CheckOperationType_StringResult")
    protected String checkOperationTypeStringResult;

    /**
     * Gets the value of the checkOperationTypeStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOperationTypeStringResult() {
        return checkOperationTypeStringResult;
    }

    /**
     * Sets the value of the checkOperationTypeStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOperationTypeStringResult(String value) {
        this.checkOperationTypeStringResult = value;
    }

}
