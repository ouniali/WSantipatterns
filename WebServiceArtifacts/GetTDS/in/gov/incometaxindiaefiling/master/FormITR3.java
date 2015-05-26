
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element name="FormName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="75"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssessmentYear">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;minLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchemaVer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FormVer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "formName",
    "description",
    "assessmentYear",
    "schemaVer",
    "formVer"
})
@XmlRootElement(name = "Form_ITR3")
public class FormITR3 {

    @XmlElement(name = "FormName", required = true)
    protected String formName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "AssessmentYear", required = true)
    protected String assessmentYear;
    @XmlElement(name = "SchemaVer", required = true, defaultValue = "Ver1.0")
    protected String schemaVer;
    @XmlElement(name = "FormVer", required = true)
    protected String formVer;

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the assessmentYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentYear() {
        return assessmentYear;
    }

    /**
     * Sets the value of the assessmentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentYear(String value) {
        this.assessmentYear = value;
    }

    /**
     * Gets the value of the schemaVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVer() {
        return schemaVer;
    }

    /**
     * Sets the value of the schemaVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVer(String value) {
        this.schemaVer = value;
    }

    /**
     * Gets the value of the formVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormVer() {
        return formVer;
    }

    /**
     * Sets the value of the formVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormVer(String value) {
        this.formVer = value;
    }

}
