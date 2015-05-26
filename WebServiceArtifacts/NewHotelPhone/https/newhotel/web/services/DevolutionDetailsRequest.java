
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevolutionDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevolutionDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberTransationCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberTransationBCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevolutionDetailsRequest", propOrder = {
    "numberTransationCO",
    "numberTransationBCO",
    "autorizationCode",
    "issueDate"
})
public class DevolutionDetailsRequest {

    @XmlElement(name = "NumberTransationCO")
    protected String numberTransationCO;
    @XmlElement(name = "NumberTransationBCO")
    protected String numberTransationBCO;
    @XmlElement(name = "AutorizationCode")
    protected String autorizationCode;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;

    /**
     * Gets the value of the numberTransationCO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberTransationCO() {
        return numberTransationCO;
    }

    /**
     * Sets the value of the numberTransationCO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberTransationCO(String value) {
        this.numberTransationCO = value;
    }

    /**
     * Gets the value of the numberTransationBCO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberTransationBCO() {
        return numberTransationBCO;
    }

    /**
     * Sets the value of the numberTransationBCO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberTransationBCO(String value) {
        this.numberTransationBCO = value;
    }

    /**
     * Gets the value of the autorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizationCode() {
        return autorizationCode;
    }

    /**
     * Sets the value of the autorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizationCode(String value) {
        this.autorizationCode = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

}
