
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestFilters2012 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestFilters2012">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameType" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestFilterNameType2012"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateCode" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestFilterStateCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRequestFilters2012", propOrder = {
    "nameType",
    "postcode",
    "stateCode"
})
public class ExternalRequestFilters2012 {

    @XmlElement(required = true, nillable = true)
    protected ExternalRequestFilterNameType2012 nameType;
    @XmlElement(required = true, nillable = true)
    protected String postcode;
    @XmlElement(required = true, nillable = true)
    protected ExternalRequestFilterStateCode stateCode;

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestFilterNameType2012 }
     *     
     */
    public ExternalRequestFilterNameType2012 getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestFilterNameType2012 }
     *     
     */
    public void setNameType(ExternalRequestFilterNameType2012 value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestFilterStateCode }
     *     
     */
    public ExternalRequestFilterStateCode getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestFilterStateCode }
     *     
     */
    public void setStateCode(ExternalRequestFilterStateCode value) {
        this.stateCode = value;
    }

}
