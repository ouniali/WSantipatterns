
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
 *         &lt;element name="Net_Income" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Assets" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "netIncome",
    "assets"
})
public class OutputData {

    @XmlElement(name = "Net_Income")
    protected double netIncome;
    @XmlElement(name = "Assets")
    protected double assets;

    /**
     * Gets the value of the netIncome property.
     * 
     */
    public double getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     */
    public void setNetIncome(double value) {
        this.netIncome = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     */
    public double getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     */
    public void setAssets(double value) {
        this.assets = value;
    }

}
