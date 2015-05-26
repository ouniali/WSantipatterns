
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownershipDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ownershipDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodOfReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notSubjectToSection16" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="form3HoldingsReported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="form4TransactionsReported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="issuer" type="{http://www.xignite.com/services/}issuer" minOccurs="0"/>
 *         &lt;element name="reportingOwners" type="{http://www.xignite.com/services/}ArrayOfReportingOwner" minOccurs="0"/>
 *         &lt;element name="derivativeTable" type="{http://www.xignite.com/services/}ArrayOfDerivativeTable" minOccurs="0"/>
 *         &lt;element name="nonDerivativeTable" type="{http://www.xignite.com/services/}ArrayOfNonDerivativeTable" minOccurs="0"/>
 *         &lt;element name="footnotes" type="{http://www.xignite.com/services/}ArrayOfFootnote" minOccurs="0"/>
 *         &lt;element name="ownerSignature" type="{http://www.xignite.com/services/}ownerSignature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ownershipDocument", propOrder = {
    "schemaVersion",
    "documentType",
    "periodOfReport",
    "notSubjectToSection16",
    "form3HoldingsReported",
    "form4TransactionsReported",
    "issuer",
    "reportingOwners",
    "derivativeTable",
    "nonDerivativeTable",
    "footnotes",
    "ownerSignature"
})
public class OwnershipDocument
    extends Common
{

    protected String schemaVersion;
    protected String documentType;
    protected String periodOfReport;
    protected boolean notSubjectToSection16;
    protected boolean form3HoldingsReported;
    protected boolean form4TransactionsReported;
    protected Issuer issuer;
    protected ArrayOfReportingOwner reportingOwners;
    protected ArrayOfDerivativeTable derivativeTable;
    protected ArrayOfNonDerivativeTable nonDerivativeTable;
    protected ArrayOfFootnote footnotes;
    protected OwnerSignature ownerSignature;

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the periodOfReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodOfReport() {
        return periodOfReport;
    }

    /**
     * Sets the value of the periodOfReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodOfReport(String value) {
        this.periodOfReport = value;
    }

    /**
     * Gets the value of the notSubjectToSection16 property.
     * 
     */
    public boolean isNotSubjectToSection16() {
        return notSubjectToSection16;
    }

    /**
     * Sets the value of the notSubjectToSection16 property.
     * 
     */
    public void setNotSubjectToSection16(boolean value) {
        this.notSubjectToSection16 = value;
    }

    /**
     * Gets the value of the form3HoldingsReported property.
     * 
     */
    public boolean isForm3HoldingsReported() {
        return form3HoldingsReported;
    }

    /**
     * Sets the value of the form3HoldingsReported property.
     * 
     */
    public void setForm3HoldingsReported(boolean value) {
        this.form3HoldingsReported = value;
    }

    /**
     * Gets the value of the form4TransactionsReported property.
     * 
     */
    public boolean isForm4TransactionsReported() {
        return form4TransactionsReported;
    }

    /**
     * Sets the value of the form4TransactionsReported property.
     * 
     */
    public void setForm4TransactionsReported(boolean value) {
        this.form4TransactionsReported = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setIssuer(Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the reportingOwners property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReportingOwner }
     *     
     */
    public ArrayOfReportingOwner getReportingOwners() {
        return reportingOwners;
    }

    /**
     * Sets the value of the reportingOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReportingOwner }
     *     
     */
    public void setReportingOwners(ArrayOfReportingOwner value) {
        this.reportingOwners = value;
    }

    /**
     * Gets the value of the derivativeTable property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDerivativeTable }
     *     
     */
    public ArrayOfDerivativeTable getDerivativeTable() {
        return derivativeTable;
    }

    /**
     * Sets the value of the derivativeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDerivativeTable }
     *     
     */
    public void setDerivativeTable(ArrayOfDerivativeTable value) {
        this.derivativeTable = value;
    }

    /**
     * Gets the value of the nonDerivativeTable property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNonDerivativeTable }
     *     
     */
    public ArrayOfNonDerivativeTable getNonDerivativeTable() {
        return nonDerivativeTable;
    }

    /**
     * Sets the value of the nonDerivativeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNonDerivativeTable }
     *     
     */
    public void setNonDerivativeTable(ArrayOfNonDerivativeTable value) {
        this.nonDerivativeTable = value;
    }

    /**
     * Gets the value of the footnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public ArrayOfFootnote getFootnotes() {
        return footnotes;
    }

    /**
     * Sets the value of the footnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public void setFootnotes(ArrayOfFootnote value) {
        this.footnotes = value;
    }

    /**
     * Gets the value of the ownerSignature property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerSignature }
     *     
     */
    public OwnerSignature getOwnerSignature() {
        return ownerSignature;
    }

    /**
     * Sets the value of the ownerSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerSignature }
     *     
     */
    public void setOwnerSignature(OwnerSignature value) {
        this.ownerSignature = value;
    }

}
