
package au.gov.superfundlookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SuperannuationFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuperannuationFund">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordLastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrganisationName" type="{http://superfundlookup.gov.au}OrganisationName" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{http://superfundlookup.gov.au}Identifier" minOccurs="0"/>
 *         &lt;element name="FundType" type="{http://superfundlookup.gov.au}FundType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://superfundlookup.gov.au}Address" minOccurs="0"/>
 *         &lt;element name="ComplyingStatus" type="{http://superfundlookup.gov.au}ComplyingStatus" minOccurs="0"/>
 *         &lt;element name="Exception" type="{http://superfundlookup.gov.au}ResponseException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperannuationFund", propOrder = {
    "recordLastUpdatedDate",
    "organisationName",
    "identifier",
    "fundType",
    "address",
    "complyingStatus",
    "exception"
})
public class SuperannuationFund {

    @XmlElement(name = "RecordLastUpdatedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordLastUpdatedDate;
    @XmlElement(name = "OrganisationName")
    protected OrganisationName organisationName;
    @XmlElement(name = "Identifier")
    protected Identifier identifier;
    @XmlElement(name = "FundType")
    protected FundType fundType;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "ComplyingStatus")
    protected ComplyingStatus complyingStatus;
    @XmlElement(name = "Exception")
    protected ResponseException exception;

    /**
     * Gets the value of the recordLastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordLastUpdatedDate() {
        return recordLastUpdatedDate;
    }

    /**
     * Sets the value of the recordLastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordLastUpdatedDate(XMLGregorianCalendar value) {
        this.recordLastUpdatedDate = value;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setOrganisationName(OrganisationName value) {
        this.organisationName = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the fundType property.
     * 
     * @return
     *     possible object is
     *     {@link FundType }
     *     
     */
    public FundType getFundType() {
        return fundType;
    }

    /**
     * Sets the value of the fundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundType }
     *     
     */
    public void setFundType(FundType value) {
        this.fundType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the complyingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ComplyingStatus }
     *     
     */
    public ComplyingStatus getComplyingStatus() {
        return complyingStatus;
    }

    /**
     * Sets the value of the complyingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplyingStatus }
     *     
     */
    public void setComplyingStatus(ComplyingStatus value) {
        this.complyingStatus = value;
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
