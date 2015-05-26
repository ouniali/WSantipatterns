
package uk.ac.ebi.webservices.chebi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompoundOrigins complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundOrigins">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="speciesText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="speciesAccession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentAccession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strainAccession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceAccession" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundOrigins", propOrder = {
    "speciesText",
    "speciesAccession",
    "componentText",
    "componentAccession",
    "strainText",
    "strainAccession",
    "sourceType",
    "sourceAccession"
})
public class CompoundOrigins {

    @XmlElement(required = true)
    protected String speciesText;
    protected String speciesAccession;
    protected String componentText;
    protected String componentAccession;
    protected String strainText;
    protected String strainAccession;
    @XmlElement(name = "SourceType", required = true)
    protected String sourceType;
    @XmlElement(name = "SourceAccession", required = true)
    protected String sourceAccession;

    /**
     * Gets the value of the speciesText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesText() {
        return speciesText;
    }

    /**
     * Sets the value of the speciesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesText(String value) {
        this.speciesText = value;
    }

    /**
     * Gets the value of the speciesAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesAccession() {
        return speciesAccession;
    }

    /**
     * Sets the value of the speciesAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesAccession(String value) {
        this.speciesAccession = value;
    }

    /**
     * Gets the value of the componentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentText() {
        return componentText;
    }

    /**
     * Sets the value of the componentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentText(String value) {
        this.componentText = value;
    }

    /**
     * Gets the value of the componentAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentAccession() {
        return componentAccession;
    }

    /**
     * Sets the value of the componentAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentAccession(String value) {
        this.componentAccession = value;
    }

    /**
     * Gets the value of the strainText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrainText() {
        return strainText;
    }

    /**
     * Sets the value of the strainText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrainText(String value) {
        this.strainText = value;
    }

    /**
     * Gets the value of the strainAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrainAccession() {
        return strainAccession;
    }

    /**
     * Sets the value of the strainAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrainAccession(String value) {
        this.strainAccession = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceAccession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAccession() {
        return sourceAccession;
    }

    /**
     * Sets the value of the sourceAccession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAccession(String value) {
        this.sourceAccession = value;
    }

}
