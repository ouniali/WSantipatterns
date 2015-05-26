
package uk.ac.ebi.ook.web.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotationNumberValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="annotationStringValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annotationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataHolder", propOrder = {
    "annotationNumberValue",
    "annotationStringValue",
    "annotationType",
    "termId",
    "termName"
})
public class DataHolder {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double annotationNumberValue;
    @XmlElement(required = true, nillable = true)
    protected String annotationStringValue;
    @XmlElement(required = true, nillable = true)
    protected String annotationType;
    @XmlElement(required = true, nillable = true)
    protected String termId;
    @XmlElement(required = true, nillable = true)
    protected String termName;

    /**
     * Gets the value of the annotationNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnotationNumberValue() {
        return annotationNumberValue;
    }

    /**
     * Sets the value of the annotationNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnotationNumberValue(Double value) {
        this.annotationNumberValue = value;
    }

    /**
     * Gets the value of the annotationStringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationStringValue() {
        return annotationStringValue;
    }

    /**
     * Sets the value of the annotationStringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationStringValue(String value) {
        this.annotationStringValue = value;
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
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermId(String value) {
        this.termId = value;
    }

    /**
     * Gets the value of the termName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermName() {
        return termName;
    }

    /**
     * Sets the value of the termName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermName(String value) {
        this.termName = value;
    }

}
