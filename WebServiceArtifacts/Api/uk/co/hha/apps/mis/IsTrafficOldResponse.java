
package uk.co.hha.apps.mis;

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
 *         &lt;element name="IsTrafficOldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isTrafficOldResult"
})
@XmlRootElement(name = "IsTrafficOldResponse")
public class IsTrafficOldResponse {

    @XmlElement(name = "IsTrafficOldResult")
    protected boolean isTrafficOldResult;

    /**
     * Gets the value of the isTrafficOldResult property.
     * 
     */
    public boolean isIsTrafficOldResult() {
        return isTrafficOldResult;
    }

    /**
     * Sets the value of the isTrafficOldResult property.
     * 
     */
    public void setIsTrafficOldResult(boolean value) {
        this.isTrafficOldResult = value;
    }

}
