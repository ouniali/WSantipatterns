
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptContribution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptContribution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contribution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="conceptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptContribution", propOrder = {
    "conceptName",
    "contribution",
    "conceptId"
})
public class ConceptContribution {

    protected String conceptName;
    protected Double contribution;
    protected String conceptId;

    /**
     * Gets the value of the conceptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptName() {
        return conceptName;
    }

    /**
     * Sets the value of the conceptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptName(String value) {
        this.conceptName = value;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContribution() {
        return contribution;
    }

    /**
     * Sets the value of the contribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContribution(Double value) {
        this.contribution = value;
    }

    /**
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptId(String value) {
        this.conceptId = value;
    }

}
