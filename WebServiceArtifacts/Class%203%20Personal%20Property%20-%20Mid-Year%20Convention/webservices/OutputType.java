
package webservices;

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
 *         &lt;element name="OutputData" type="{http://webservices}OutputData"/>
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
    "outputData"
})
@XmlRootElement(name = "OutputType")
public class OutputType {

    @XmlElement(name = "OutputData", required = true)
    protected OutputData outputData;

    /**
     * Gets the value of the outputData property.
     * 
     * @return
     *     possible object is
     *     {@link OutputData }
     *     
     */
    public OutputData getOutputData() {
        return outputData;
    }

    /**
     * Sets the value of the outputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputData }
     *     
     */
    public void setOutputData(OutputData value) {
        this.outputData = value;
    }

}
