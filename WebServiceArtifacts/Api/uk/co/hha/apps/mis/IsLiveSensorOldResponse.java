
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
 *         &lt;element name="IsLiveSensorOldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isLiveSensorOldResult"
})
@XmlRootElement(name = "IsLiveSensorOldResponse")
public class IsLiveSensorOldResponse {

    @XmlElement(name = "IsLiveSensorOldResult")
    protected boolean isLiveSensorOldResult;

    /**
     * Gets the value of the isLiveSensorOldResult property.
     * 
     */
    public boolean isIsLiveSensorOldResult() {
        return isLiveSensorOldResult;
    }

    /**
     * Sets the value of the isLiveSensorOldResult property.
     * 
     */
    public void setIsLiveSensorOldResult(boolean value) {
        this.isLiveSensorOldResult = value;
    }

}
