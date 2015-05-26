
package com.exactor.ns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="InvoiceResponse" type="{http://www.exactor.com/ns}InvoiceResponseType"/>
 *           &lt;element name="CommitResponse" type="{http://www.exactor.com/ns}CommitResponseType"/>
 *           &lt;element name="RefundResponse" type="{http://www.exactor.com/ns}RefundResponseType"/>
 *           &lt;element name="DeleteResponse" type="{http://www.exactor.com/ns}DeleteResponseType"/>
 *           &lt;element name="ErrorResponse" type="{http://www.exactor.com/ns}ErrorResponseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxResponse", propOrder = {
    "merchantId",
    "userId",
    "partnerId",
    "invoiceResponseOrCommitResponseOrRefundResponse"
})
public class TaxResponse {

    @XmlElement(name = "MerchantId", required = true)
    protected String merchantId;
    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "PartnerId")
    protected String partnerId;
    @XmlElements({
        @XmlElement(name = "InvoiceResponse", type = InvoiceResponseType.class),
        @XmlElement(name = "CommitResponse", type = CommitResponseType.class),
        @XmlElement(name = "RefundResponse", type = RefundResponseType.class),
        @XmlElement(name = "DeleteResponse", type = DeleteResponseType.class),
        @XmlElement(name = "ErrorResponse", type = ErrorResponseType.class)
    })
    protected List<Object> invoiceResponseOrCommitResponseOrRefundResponse;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the invoiceResponseOrCommitResponseOrRefundResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceResponseOrCommitResponseOrRefundResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceResponseOrCommitResponseOrRefundResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceResponseType }
     * {@link CommitResponseType }
     * {@link RefundResponseType }
     * {@link DeleteResponseType }
     * {@link ErrorResponseType }
     * 
     * 
     */
    public List<Object> getInvoiceResponseOrCommitResponseOrRefundResponse() {
        if (invoiceResponseOrCommitResponseOrRefundResponse == null) {
            invoiceResponseOrCommitResponseOrRefundResponse = new ArrayList<Object>();
        }
        return this.invoiceResponseOrCommitResponseOrRefundResponse;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
