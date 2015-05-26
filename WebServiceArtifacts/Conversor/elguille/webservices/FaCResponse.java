
package elguille.webservices;

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
 *         &lt;element name="FaCResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "faCResult"
})
@XmlRootElement(name = "FaCResponse")
public class FaCResponse {

    @XmlElement(name = "FaCResult")
    protected double faCResult;

    /**
     * Gets the value of the faCResult property.
     * 
     */
    public double getFaCResult() {
        return faCResult;
    }

    /**
     * Sets the value of the faCResult property.
     * 
     */
    public void setFaCResult(double value) {
        this.faCResult = value;
    }

}
