
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
 *         &lt;element name="Include_Milling_Machine_R1220" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Milling_Machine_R2337" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "includeMillingMachineR1220",
    "includeMillingMachineR2337"
})
@XmlRootElement(name = "InputType")
public class InputType {

    @XmlElement(name = "Include_Milling_Machine_R1220")
    protected Boolean includeMillingMachineR1220;
    @XmlElement(name = "Include_Milling_Machine_R2337")
    protected Boolean includeMillingMachineR2337;

    /**
     * Gets the value of the includeMillingMachineR1220 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeMillingMachineR1220() {
        return includeMillingMachineR1220;
    }

    /**
     * Sets the value of the includeMillingMachineR1220 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeMillingMachineR1220(Boolean value) {
        this.includeMillingMachineR1220 = value;
    }

    /**
     * Gets the value of the includeMillingMachineR2337 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeMillingMachineR2337() {
        return includeMillingMachineR2337;
    }

    /**
     * Sets the value of the includeMillingMachineR2337 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeMillingMachineR2337(Boolean value) {
        this.includeMillingMachineR2337 = value;
    }

}
