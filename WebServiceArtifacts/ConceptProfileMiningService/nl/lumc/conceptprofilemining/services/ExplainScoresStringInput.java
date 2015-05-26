
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for explainScoresStringInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="explainScoresStringInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutoffValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conceptCUIsAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "explainScoresStringInput", propOrder = {
    "cutoffValue",
    "conceptCUIsAsString"
})
public class ExplainScoresStringInput {

    protected int cutoffValue;
    protected String conceptCUIsAsString;

    /**
     * Gets the value of the cutoffValue property.
     * 
     */
    public int getCutoffValue() {
        return cutoffValue;
    }

    /**
     * Sets the value of the cutoffValue property.
     * 
     */
    public void setCutoffValue(int value) {
        this.cutoffValue = value;
    }

    /**
     * Gets the value of the conceptCUIsAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptCUIsAsString() {
        return conceptCUIsAsString;
    }

    /**
     * Sets the value of the conceptCUIsAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptCUIsAsString(String value) {
        this.conceptCUIsAsString = value;
    }

}
