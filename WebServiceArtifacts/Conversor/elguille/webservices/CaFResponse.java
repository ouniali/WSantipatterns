
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
 *         &lt;element name="CaFResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "caFResult"
})
@XmlRootElement(name = "CaFResponse")
public class CaFResponse {

    @XmlElement(name = "CaFResult")
    protected double caFResult;

    /**
     * Gets the value of the caFResult property.
     * 
     */
    public double getCaFResult() {
        return caFResult;
    }

    /**
     * Sets the value of the caFResult property.
     * 
     */
    public void setCaFResult(double value) {
        this.caFResult = value;
    }

}
