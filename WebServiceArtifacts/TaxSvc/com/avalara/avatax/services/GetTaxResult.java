
package com.avalara.avatax.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetTaxResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTaxResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://avatax.avalara.com/services}BaseResult">
 *       &lt;sequence>
 *         &lt;element name="DocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://avatax.avalara.com/services}DocumentType"/>
 *         &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DocStatus" type="{http://avatax.avalara.com/services}DocStatus"/>
 *         &lt;element name="Reconciled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalExemption" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalTaxable" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalTaxCalculated" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="HashCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxLines" type="{http://avatax.avalara.com/services}ArrayOfTaxLine" minOccurs="0"/>
 *         &lt;element name="TaxAddresses" type="{http://avatax.avalara.com/services}ArrayOfTaxAddress" minOccurs="0"/>
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AdjustmentReason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdjustmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TaxSummary" type="{http://avatax.avalara.com/services}ArrayOfTaxDetail" minOccurs="0"/>
 *         &lt;element name="VolatileTaxRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTaxResult", propOrder = {
    "docId",
    "docType",
    "docCode",
    "docDate",
    "docStatus",
    "reconciled",
    "timestamp",
    "totalAmount",
    "totalDiscount",
    "totalExemption",
    "totalTaxable",
    "totalTax",
    "totalTaxCalculated",
    "hashCode",
    "taxLines",
    "taxAddresses",
    "locked",
    "adjustmentReason",
    "adjustmentDescription",
    "version",
    "taxDate",
    "taxSummary",
    "volatileTaxRates"
})
@XmlSeeAlso({
    AdjustTaxResult.class
})
public class GetTaxResult
    extends BaseResult
{

    @XmlElement(name = "DocId")
    protected String docId;
    @XmlElement(name = "DocType", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType docType;
    @XmlElement(name = "DocCode")
    protected String docCode;
    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "DocStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DocStatus docStatus;
    @XmlElement(name = "Reconciled")
    protected boolean reconciled;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "TotalDiscount", required = true)
    protected BigDecimal totalDiscount;
    @XmlElement(name = "TotalExemption", required = true)
    protected BigDecimal totalExemption;
    @XmlElement(name = "TotalTaxable", required = true)
    protected BigDecimal totalTaxable;
    @XmlElement(name = "TotalTax", required = true)
    protected BigDecimal totalTax;
    @XmlElement(name = "TotalTaxCalculated", required = true)
    protected BigDecimal totalTaxCalculated;
    @XmlElement(name = "HashCode")
    protected int hashCode;
    @XmlElement(name = "TaxLines")
    protected ArrayOfTaxLine taxLines;
    @XmlElement(name = "TaxAddresses")
    protected ArrayOfTaxAddress taxAddresses;
    @XmlElement(name = "Locked")
    protected boolean locked;
    @XmlElement(name = "AdjustmentReason")
    protected int adjustmentReason;
    @XmlElement(name = "AdjustmentDescription")
    protected String adjustmentDescription;
    @XmlElement(name = "Version")
    protected int version;
    @XmlElement(name = "TaxDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "TaxSummary")
    protected ArrayOfTaxDetail taxSummary;
    @XmlElement(name = "VolatileTaxRates")
    protected Boolean volatileTaxRates;

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocType(DocumentType value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets the value of the docCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DocStatus }
     *     
     */
    public DocStatus getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocStatus }
     *     
     */
    public void setDocStatus(DocStatus value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the reconciled property.
     * 
     */
    public boolean isReconciled() {
        return reconciled;
    }

    /**
     * Sets the value of the reconciled property.
     * 
     */
    public void setReconciled(boolean value) {
        this.reconciled = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscount(BigDecimal value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the totalExemption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExemption() {
        return totalExemption;
    }

    /**
     * Sets the value of the totalExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExemption(BigDecimal value) {
        this.totalExemption = value;
    }

    /**
     * Gets the value of the totalTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxable() {
        return totalTaxable;
    }

    /**
     * Sets the value of the totalTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxable(BigDecimal value) {
        this.totalTaxable = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the totalTaxCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxCalculated() {
        return totalTaxCalculated;
    }

    /**
     * Sets the value of the totalTaxCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxCalculated(BigDecimal value) {
        this.totalTaxCalculated = value;
    }

    /**
     * Gets the value of the hashCode property.
     * 
     */
    public int getHashCode() {
        return hashCode;
    }

    /**
     * Sets the value of the hashCode property.
     * 
     */
    public void setHashCode(int value) {
        this.hashCode = value;
    }

    /**
     * Gets the value of the taxLines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxLine }
     *     
     */
    public ArrayOfTaxLine getTaxLines() {
        return taxLines;
    }

    /**
     * Sets the value of the taxLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxLine }
     *     
     */
    public void setTaxLines(ArrayOfTaxLine value) {
        this.taxLines = value;
    }

    /**
     * Gets the value of the taxAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxAddress }
     *     
     */
    public ArrayOfTaxAddress getTaxAddresses() {
        return taxAddresses;
    }

    /**
     * Sets the value of the taxAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxAddress }
     *     
     */
    public void setTaxAddresses(ArrayOfTaxAddress value) {
        this.taxAddresses = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the adjustmentReason property.
     * 
     */
    public int getAdjustmentReason() {
        return adjustmentReason;
    }

    /**
     * Sets the value of the adjustmentReason property.
     * 
     */
    public void setAdjustmentReason(int value) {
        this.adjustmentReason = value;
    }

    /**
     * Gets the value of the adjustmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentDescription() {
        return adjustmentDescription;
    }

    /**
     * Sets the value of the adjustmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentDescription(String value) {
        this.adjustmentDescription = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

    /**
     * Gets the value of the taxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDate() {
        return taxDate;
    }

    /**
     * Sets the value of the taxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDate(XMLGregorianCalendar value) {
        this.taxDate = value;
    }

    /**
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxDetail }
     *     
     */
    public ArrayOfTaxDetail getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxDetail }
     *     
     */
    public void setTaxSummary(ArrayOfTaxDetail value) {
        this.taxSummary = value;
    }

    /**
     * Gets the value of the volatileTaxRates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolatileTaxRates() {
        return volatileTaxRates;
    }

    /**
     * Sets the value of the volatileTaxRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolatileTaxRates(Boolean value) {
        this.volatileTaxRates = value;
    }

}
