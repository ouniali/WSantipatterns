
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConformedSubmissionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicDocumentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConformedPeriodOfReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiledAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfFilingChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SROS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Filer" type="{http://www.xignite.com/services/}SECFiler" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECHeader", propOrder = {
    "number",
    "accessionNumber",
    "conformedSubmissionType",
    "publicDocumentCount",
    "conformedPeriodOfReport",
    "itemInformation",
    "filedAsOfDate",
    "dateOfFilingChange",
    "sros",
    "filer"
})
public class SECHeader
    extends Common
{

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "AccessionNumber")
    protected String accessionNumber;
    @XmlElement(name = "ConformedSubmissionType")
    protected String conformedSubmissionType;
    @XmlElement(name = "PublicDocumentCount")
    protected String publicDocumentCount;
    @XmlElement(name = "ConformedPeriodOfReport")
    protected String conformedPeriodOfReport;
    @XmlElement(name = "ItemInformation")
    protected String itemInformation;
    @XmlElement(name = "FiledAsOfDate")
    protected String filedAsOfDate;
    @XmlElement(name = "DateOfFilingChange")
    protected String dateOfFilingChange;
    @XmlElement(name = "SROS")
    protected String sros;
    @XmlElement(name = "Filer")
    protected SECFiler filer;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the accessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumber() {
        return accessionNumber;
    }

    /**
     * Sets the value of the accessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumber(String value) {
        this.accessionNumber = value;
    }

    /**
     * Gets the value of the conformedSubmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformedSubmissionType() {
        return conformedSubmissionType;
    }

    /**
     * Sets the value of the conformedSubmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformedSubmissionType(String value) {
        this.conformedSubmissionType = value;
    }

    /**
     * Gets the value of the publicDocumentCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDocumentCount() {
        return publicDocumentCount;
    }

    /**
     * Sets the value of the publicDocumentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDocumentCount(String value) {
        this.publicDocumentCount = value;
    }

    /**
     * Gets the value of the conformedPeriodOfReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformedPeriodOfReport() {
        return conformedPeriodOfReport;
    }

    /**
     * Sets the value of the conformedPeriodOfReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformedPeriodOfReport(String value) {
        this.conformedPeriodOfReport = value;
    }

    /**
     * Gets the value of the itemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemInformation() {
        return itemInformation;
    }

    /**
     * Sets the value of the itemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemInformation(String value) {
        this.itemInformation = value;
    }

    /**
     * Gets the value of the filedAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledAsOfDate() {
        return filedAsOfDate;
    }

    /**
     * Sets the value of the filedAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledAsOfDate(String value) {
        this.filedAsOfDate = value;
    }

    /**
     * Gets the value of the dateOfFilingChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfFilingChange() {
        return dateOfFilingChange;
    }

    /**
     * Sets the value of the dateOfFilingChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfFilingChange(String value) {
        this.dateOfFilingChange = value;
    }

    /**
     * Gets the value of the sros property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSROS() {
        return sros;
    }

    /**
     * Sets the value of the sros property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSROS(String value) {
        this.sros = value;
    }

    /**
     * Gets the value of the filer property.
     * 
     * @return
     *     possible object is
     *     {@link SECFiler }
     *     
     */
    public SECFiler getFiler() {
        return filer;
    }

    /**
     * Sets the value of the filer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECFiler }
     *     
     */
    public void setFiler(SECFiler value) {
        this.filer = value;
    }

}
