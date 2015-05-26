
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
 *         &lt;element name="Down_Payment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="House_Payment" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "downPayment",
    "housePayment"
})
public class OutputData {

    @XmlElement(name = "Down_Payment")
    protected double downPayment;
    @XmlElement(name = "House_Payment")
    protected double housePayment;

    /**
     * Gets the value of the downPayment property.
     * 
     */
    public double getDownPayment() {
        return downPayment;
    }

    /**
     * Sets the value of the downPayment property.
     * 
     */
    public void setDownPayment(double value) {
        this.downPayment = value;
    }

    /**
     * Gets the value of the housePayment property.
     * 
     */
    public double getHousePayment() {
        return housePayment;
    }

    /**
     * Sets the value of the housePayment property.
     * 
     */
    public void setHousePayment(double value) {
        this.housePayment = value;
    }

}
