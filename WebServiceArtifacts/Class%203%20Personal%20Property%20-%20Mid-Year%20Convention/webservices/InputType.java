
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
 *         &lt;element name="Year_Index" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "yearIndex"
})
@XmlRootElement(name = "InputType")
public class InputType {

    @XmlElement(name = "Year_Index")
    protected Double yearIndex;

    /**
     * Gets the value of the yearIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYearIndex() {
        return yearIndex;
    }

    /**
     * Sets the value of the yearIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYearIndex(Double value) {
        this.yearIndex = value;
    }

}
