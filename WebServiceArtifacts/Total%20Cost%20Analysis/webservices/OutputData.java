
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
 *         &lt;element name="Net_Present_Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IRR" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "netPresentValue",
    "irr"
})
public class OutputData {

    @XmlElement(name = "Net_Present_Value")
    protected double netPresentValue;
    @XmlElement(name = "IRR")
    protected double irr;

    /**
     * Gets the value of the netPresentValue property.
     * 
     */
    public double getNetPresentValue() {
        return netPresentValue;
    }

    /**
     * Sets the value of the netPresentValue property.
     * 
     */
    public void setNetPresentValue(double value) {
        this.netPresentValue = value;
    }

    /**
     * Gets the value of the irr property.
     * 
     */
    public double getIRR() {
        return irr;
    }

    /**
     * Sets the value of the irr property.
     * 
     */
    public void setIRR(double value) {
        this.irr = value;
    }

}
