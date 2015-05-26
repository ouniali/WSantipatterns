
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
 *         &lt;element name="Total_Cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Completion_Time" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "totalCost",
    "completionTime"
})
public class OutputData {

    @XmlElement(name = "Total_Cost")
    protected double totalCost;
    @XmlElement(name = "Completion_Time")
    protected double completionTime;

    /**
     * Gets the value of the totalCost property.
     * 
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     */
    public void setTotalCost(double value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     */
    public double getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     */
    public void setCompletionTime(double value) {
        this.completionTime = value;
    }

}
