
package in.gov.incometaxindiaefiling.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="SWVersionNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SWCreatedBy">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XMLCreatedBy">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XMLCreationDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="2012-04-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntermediaryCity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
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
    "swVersionNo",
    "swCreatedBy",
    "xmlCreatedBy",
    "xmlCreationDate",
    "intermediaryCity"
})
@XmlRootElement(name = "CreationInfo")
public class CreationInfo {

    @XmlElement(name = "SWVersionNo", required = true, defaultValue = "1.0")
    protected String swVersionNo;
    @XmlElement(name = "SWCreatedBy", required = true, defaultValue = "DIT")
    protected String swCreatedBy;
    @XmlElement(name = "XMLCreatedBy", required = true, defaultValue = "DIT")
    protected String xmlCreatedBy;
    @XmlElement(name = "XMLCreationDate", required = true)
    protected XMLGregorianCalendar xmlCreationDate;
    @XmlElement(name = "IntermediaryCity", required = true, defaultValue = "Delhi")
    protected String intermediaryCity;

    /**
     * Gets the value of the swVersionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWVersionNo() {
        return swVersionNo;
    }

    /**
     * Sets the value of the swVersionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWVersionNo(String value) {
        this.swVersionNo = value;
    }

    /**
     * Gets the value of the swCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWCreatedBy() {
        return swCreatedBy;
    }

    /**
     * Sets the value of the swCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWCreatedBy(String value) {
        this.swCreatedBy = value;
    }

    /**
     * Gets the value of the xmlCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLCreatedBy() {
        return xmlCreatedBy;
    }

    /**
     * Sets the value of the xmlCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLCreatedBy(String value) {
        this.xmlCreatedBy = value;
    }

    /**
     * Gets the value of the xmlCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXMLCreationDate() {
        return xmlCreationDate;
    }

    /**
     * Sets the value of the xmlCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXMLCreationDate(XMLGregorianCalendar value) {
        this.xmlCreationDate = value;
    }

    /**
     * Gets the value of the intermediaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryCity() {
        return intermediaryCity;
    }

    /**
     * Sets the value of the intermediaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryCity(String value) {
        this.intermediaryCity = value;
    }

}
