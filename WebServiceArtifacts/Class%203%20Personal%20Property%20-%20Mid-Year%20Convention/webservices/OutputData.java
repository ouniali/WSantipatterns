
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MACRS_Percentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputData", propOrder = {
    "macrsPercentage"
})
public class OutputData {

    @XmlElement(name = "MACRS_Percentage")
    protected double macrsPercentage;

    /**
     * Gets the value of the macrsPercentage property.
     * 
     */
    public double getMACRSPercentage() {
        return macrsPercentage;
    }

    /**
     * Sets the value of the macrsPercentage property.
     * 
     */
    public void setMACRSPercentage(double value) {
        this.macrsPercentage = value;
    }

}
