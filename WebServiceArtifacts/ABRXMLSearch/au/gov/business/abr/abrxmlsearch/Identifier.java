
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifierValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCurrentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacedIdentifierValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replacedFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", propOrder = {
    "identifierValue",
    "isCurrentIndicator",
    "replacedIdentifierValue",
    "replacedFrom"
})
public class Identifier {

    protected String identifierValue;
    protected String isCurrentIndicator;
    protected String replacedIdentifierValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar replacedFrom;

    /**
     * Gets the value of the identifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierValue() {
        return identifierValue;
    }

    /**
     * Sets the value of the identifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierValue(String value) {
        this.identifierValue = value;
    }

    /**
     * Gets the value of the isCurrentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCurrentIndicator() {
        return isCurrentIndicator;
    }

    /**
     * Sets the value of the isCurrentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCurrentIndicator(String value) {
        this.isCurrentIndicator = value;
    }

    /**
     * Gets the value of the replacedIdentifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacedIdentifierValue() {
        return replacedIdentifierValue;
    }

    /**
     * Sets the value of the replacedIdentifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacedIdentifierValue(String value) {
        this.replacedIdentifierValue = value;
    }

    /**
     * Gets the value of the replacedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReplacedFrom() {
        return replacedFrom;
    }

    /**
     * Sets the value of the replacedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReplacedFrom(XMLGregorianCalendar value) {
        this.replacedFrom = value;
    }

}
