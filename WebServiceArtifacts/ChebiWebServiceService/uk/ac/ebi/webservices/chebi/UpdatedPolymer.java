
package uk.ac.ebi.webservices.chebi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatedPolymer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatedPolymer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedStructure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="globalFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="globalCharge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chebiId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedPolymer", propOrder = {
    "updatedStructure",
    "globalFormula",
    "globalCharge",
    "chebiId"
})
public class UpdatedPolymer {

    @XmlElement(required = true)
    protected String updatedStructure;
    @XmlElement(required = true)
    protected String globalFormula;
    @XmlElement(required = true)
    protected String globalCharge;
    @XmlElement(required = true)
    protected String chebiId;

    /**
     * Gets the value of the updatedStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedStructure() {
        return updatedStructure;
    }

    /**
     * Sets the value of the updatedStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedStructure(String value) {
        this.updatedStructure = value;
    }

    /**
     * Gets the value of the globalFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalFormula() {
        return globalFormula;
    }

    /**
     * Sets the value of the globalFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalFormula(String value) {
        this.globalFormula = value;
    }

    /**
     * Gets the value of the globalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCharge() {
        return globalCharge;
    }

    /**
     * Sets the value of the globalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCharge(String value) {
        this.globalCharge = value;
    }

    /**
     * Gets the value of the chebiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChebiId() {
        return chebiId;
    }

    /**
     * Sets the value of the chebiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChebiId(String value) {
        this.chebiId = value;
    }

}
