
package uk.ac.ebi.ontology_lookup.ontologyquery;

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
 *         &lt;element name="ontologyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annotationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDblValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="toDblValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "ontologyName",
    "annotationType",
    "strValue",
    "fromDblValue",
    "toDblValue"
})
@XmlRootElement(name = "getTermsByAnnotationData")
public class GetTermsByAnnotationData {

    @XmlElement(required = true)
    protected String ontologyName;
    @XmlElement(required = true)
    protected String annotationType;
    @XmlElement(required = true)
    protected String strValue;
    protected double fromDblValue;
    protected double toDblValue;

    /**
     * Gets the value of the ontologyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyName() {
        return ontologyName;
    }

    /**
     * Sets the value of the ontologyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyName(String value) {
        this.ontologyName = value;
    }

    /**
     * Gets the value of the annotationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationType() {
        return annotationType;
    }

    /**
     * Sets the value of the annotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationType(String value) {
        this.annotationType = value;
    }

    /**
     * Gets the value of the strValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrValue() {
        return strValue;
    }

    /**
     * Sets the value of the strValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrValue(String value) {
        this.strValue = value;
    }

    /**
     * Gets the value of the fromDblValue property.
     * 
     */
    public double getFromDblValue() {
        return fromDblValue;
    }

    /**
     * Sets the value of the fromDblValue property.
     * 
     */
    public void setFromDblValue(double value) {
        this.fromDblValue = value;
    }

    /**
     * Gets the value of the toDblValue property.
     * 
     */
    public double getToDblValue() {
        return toDblValue;
    }

    /**
     * Sets the value of the toDblValue property.
     * 
     */
    public void setToDblValue(double value) {
        this.toDblValue = value;
    }

}
