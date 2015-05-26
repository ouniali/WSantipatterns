
package ro.bvb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DividendInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DividendForNaturalPersons" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DividendForLegalPersons" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DividendsTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DividendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceDateForGMS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GMS_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RecordDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExDividendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AnnouncementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MethodOfDividendDistribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendInfo", propOrder = {
    "year",
    "dividendForNaturalPersons",
    "dividendForLegalPersons",
    "dividendsTotal",
    "dividendType",
    "referenceDateForGMS",
    "gmsDate",
    "recordDate",
    "exDividendDate",
    "announcementDate",
    "startPaymentDate",
    "endPaymentDate",
    "methodOfDividendDistribution"
})
public class DividendInfo {

    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "DividendForNaturalPersons", required = true, nillable = true)
    protected BigDecimal dividendForNaturalPersons;
    @XmlElement(name = "DividendForLegalPersons", required = true, nillable = true)
    protected BigDecimal dividendForLegalPersons;
    @XmlElement(name = "DividendsTotal", required = true, nillable = true)
    protected BigDecimal dividendsTotal;
    @XmlElement(name = "DividendType")
    protected String dividendType;
    @XmlElement(name = "ReferenceDateForGMS", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDateForGMS;
    @XmlElement(name = "GMS_Date", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gmsDate;
    @XmlElement(name = "RecordDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordDate;
    @XmlElement(name = "ExDividendDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exDividendDate;
    @XmlElement(name = "AnnouncementDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar announcementDate;
    @XmlElement(name = "StartPaymentDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startPaymentDate;
    @XmlElement(name = "EndPaymentDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endPaymentDate;
    @XmlElement(name = "MethodOfDividendDistribution")
    protected String methodOfDividendDistribution;

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the dividendForNaturalPersons property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendForNaturalPersons() {
        return dividendForNaturalPersons;
    }

    /**
     * Sets the value of the dividendForNaturalPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendForNaturalPersons(BigDecimal value) {
        this.dividendForNaturalPersons = value;
    }

    /**
     * Gets the value of the dividendForLegalPersons property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendForLegalPersons() {
        return dividendForLegalPersons;
    }

    /**
     * Sets the value of the dividendForLegalPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendForLegalPersons(BigDecimal value) {
        this.dividendForLegalPersons = value;
    }

    /**
     * Gets the value of the dividendsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendsTotal() {
        return dividendsTotal;
    }

    /**
     * Sets the value of the dividendsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendsTotal(BigDecimal value) {
        this.dividendsTotal = value;
    }

    /**
     * Gets the value of the dividendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividendType() {
        return dividendType;
    }

    /**
     * Sets the value of the dividendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividendType(String value) {
        this.dividendType = value;
    }

    /**
     * Gets the value of the referenceDateForGMS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDateForGMS() {
        return referenceDateForGMS;
    }

    /**
     * Sets the value of the referenceDateForGMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDateForGMS(XMLGregorianCalendar value) {
        this.referenceDateForGMS = value;
    }

    /**
     * Gets the value of the gmsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGMSDate() {
        return gmsDate;
    }

    /**
     * Sets the value of the gmsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGMSDate(XMLGregorianCalendar value) {
        this.gmsDate = value;
    }

    /**
     * Gets the value of the recordDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the value of the recordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordDate(XMLGregorianCalendar value) {
        this.recordDate = value;
    }

    /**
     * Gets the value of the exDividendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExDividendDate() {
        return exDividendDate;
    }

    /**
     * Sets the value of the exDividendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExDividendDate(XMLGregorianCalendar value) {
        this.exDividendDate = value;
    }

    /**
     * Gets the value of the announcementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnouncementDate() {
        return announcementDate;
    }

    /**
     * Sets the value of the announcementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnouncementDate(XMLGregorianCalendar value) {
        this.announcementDate = value;
    }

    /**
     * Gets the value of the startPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPaymentDate() {
        return startPaymentDate;
    }

    /**
     * Sets the value of the startPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartPaymentDate(XMLGregorianCalendar value) {
        this.startPaymentDate = value;
    }

    /**
     * Gets the value of the endPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPaymentDate() {
        return endPaymentDate;
    }

    /**
     * Sets the value of the endPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPaymentDate(XMLGregorianCalendar value) {
        this.endPaymentDate = value;
    }

    /**
     * Gets the value of the methodOfDividendDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOfDividendDistribution() {
        return methodOfDividendDistribution;
    }

    /**
     * Sets the value of the methodOfDividendDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOfDividendDistribution(String value) {
        this.methodOfDividendDistribution = value;
    }

}
