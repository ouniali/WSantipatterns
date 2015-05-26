
package trainpass.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UpperLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Range", propOrder = {
    "lowerLimit",
    "upperLimit"
})
public class Range {

    @XmlElement(name = "LowerLimit")
    protected int lowerLimit;
    @XmlElement(name = "UpperLimit")
    protected int upperLimit;

    /**
     * Gets the value of the lowerLimit property.
     * 
     */
    public int getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     */
    public void setLowerLimit(int value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     */
    public int getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     */
    public void setUpperLimit(int value) {
        this.upperLimit = value;
    }

}
