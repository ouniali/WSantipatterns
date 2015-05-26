
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReconcileTaxHistoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconcileTaxHistoryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastDocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reconciled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DocStatus" type="{http://avatax.avalara.com/services}DocStatus"/>
 *         &lt;element name="DocType" type="{http://avatax.avalara.com/services}DocumentType"/>
 *         &lt;element name="LastDocCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconcileTaxHistoryRequest", propOrder = {
    "companyCode",
    "lastDocId",
    "reconciled",
    "startDate",
    "endDate",
    "docStatus",
    "docType",
    "lastDocCode",
    "pageSize"
})
public class ReconcileTaxHistoryRequest {

    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "LastDocId")
    protected String lastDocId;
    @XmlElement(name = "Reconciled")
    protected boolean reconciled;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "DocStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DocStatus docStatus;
    @XmlElement(name = "DocType", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType docType;
    @XmlElement(name = "LastDocCode", required = true)
    protected String lastDocCode;
    @XmlElement(name = "PageSize")
    protected int pageSize;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the lastDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDocId() {
        return lastDocId;
    }

    /**
     * Sets the value of the lastDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDocId(String value) {
        this.lastDocId = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the lastDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDocCode() {
        return lastDocCode;
    }

    /**
     * Sets the value of the lastDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDocCode(String value) {
        this.lastDocCode = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
