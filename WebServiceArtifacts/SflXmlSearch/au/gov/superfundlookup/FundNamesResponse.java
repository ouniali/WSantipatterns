
package au.gov.superfundlookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FundNamesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundNamesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTimeRetrieved" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;choice>
 *           &lt;element name="Exception" type="{http://superfundlookup.gov.au}ResponseException" minOccurs="0"/>
 *           &lt;element name="MatchingFundNames" type="{http://superfundlookup.gov.au}MatchingFundNames" minOccurs="0"/>
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
@XmlType(name = "FundNamesResponse", propOrder = {
    "dateTimeRetrieved",
    "exception",
    "matchingFundNames"
})
public class FundNamesResponse {

    @XmlElement(name = "DateTimeRetrieved", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeRetrieved;
    @XmlElement(name = "Exception")
    protected ResponseException exception;
    @XmlElement(name = "MatchingFundNames")
    protected MatchingFundNames matchingFundNames;

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

    /**
     * Gets the value of the matchingFundNames property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingFundNames }
     *     
     */
    public MatchingFundNames getMatchingFundNames() {
        return matchingFundNames;
    }

    /**
     * Sets the value of the matchingFundNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingFundNames }
     *     
     */
    public void setMatchingFundNames(MatchingFundNames value) {
        this.matchingFundNames = value;
    }

}
