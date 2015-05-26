
package au.gov.superfundlookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FundResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsageStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTimeRetrieved" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;choice>
 *           &lt;element name="SuperannuationFund" type="{http://superfundlookup.gov.au}SuperannuationFund" minOccurs="0"/>
 *           &lt;element name="Exception" type="{http://superfundlookup.gov.au}ResponseException" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundResponse", propOrder = {
    "usageStatement",
    "dateTimeRetrieved",
    "superannuationFund",
    "exception"
})
public class FundResponse {

    @XmlElement(name = "UsageStatement")
    protected String usageStatement;
    @XmlElement(name = "DateTimeRetrieved", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeRetrieved;
    @XmlElement(name = "SuperannuationFund")
    protected SuperannuationFund superannuationFund;
    @XmlElement(name = "Exception")
    protected ResponseException exception;

    /**
     * Gets the value of the usageStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageStatement() {
        return usageStatement;
    }

    /**
     * Sets the value of the usageStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageStatement(String value) {
        this.usageStatement = value;
    }

    /**
     * Gets the value of the dateTimeRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeRetrieved() {
        return dateTimeRetrieved;
    }

    /**
     * Sets the value of the dateTimeRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeRetrieved(XMLGregorianCalendar value) {
        this.dateTimeRetrieved = value;
    }

    /**
     * Gets the value of the superannuationFund property.
     * 
     * @return
     *     possible object is
     *     {@link SuperannuationFund }
     *     
     */
    public SuperannuationFund getSuperannuationFund() {
        return superannuationFund;
    }

    /**
     * Sets the value of the superannuationFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperannuationFund }
     *     
     */
    public void setSuperannuationFund(SuperannuationFund value) {
        this.superannuationFund = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseException }
     *     
     */
    public ResponseException getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseException }
     *     
     */
    public void setException(ResponseException value) {
        this.exception = value;
    }

}
