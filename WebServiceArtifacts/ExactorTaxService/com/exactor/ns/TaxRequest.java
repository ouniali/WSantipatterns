
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
 * <p>Java class for taxRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigitalSignature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="InvoiceRequest" type="{http://www.exactor.com/ns}InvoiceRequestType"/>
 *           &lt;element name="CommitRequest" type="{http://www.exactor.com/ns}CommitRequestType"/>
 *           &lt;element name="RefundRequest" type="{http://www.exactor.com/ns}RefundRequestType"/>
 *           &lt;element name="DeleteRequest" type="{http://www.exactor.com/ns}DeleteRequestType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="plugin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxRequest", propOrder = {
    "merchantId",
    "userId",
    "partnerId",
    "digitalSignature",
    "invoiceRequestOrCommitRequestOrRefundRequest"
})
public class TaxRequest {

    @XmlElement(name = "MerchantId", required = true)
    protected String merchantId;
    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "PartnerId")
    protected String partnerId;
    @XmlElement(name = "DigitalSignature")
    protected byte[] digitalSignature;
    @XmlElements({
        @XmlElement(name = "InvoiceRequest", type = InvoiceRequestType.class),
        @XmlElement(name = "CommitRequest", type = CommitRequestType.class),
        @XmlElement(name = "RefundRequest", type = RefundRequestType.class),
        @XmlElement(name = "DeleteRequest", type = DeleteRequestType.class)
    })
    protected List<Object> invoiceRequestOrCommitRequestOrRefundRequest;
    @XmlAttribute(name = "plugin")
    protected String plugin;
    @XmlAttribute(name = "version")
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
     * Gets the value of the digitalSignature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigitalSignature() {
        return digitalSignature;
    }

    /**
     * Sets the value of the digitalSignature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigitalSignature(byte[] value) {
        this.digitalSignature = value;
    }

    /**
     * Gets the value of the invoiceRequestOrCommitRequestOrRefundRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceRequestOrCommitRequestOrRefundRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceRequestOrCommitRequestOrRefundRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRequestType }
     * {@link CommitRequestType }
     * {@link RefundRequestType }
     * {@link DeleteRequestType }
     * 
     * 
     */
    public List<Object> getInvoiceRequestOrCommitRequestOrRefundRequest() {
        if (invoiceRequestOrCommitRequestOrRefundRequest == null) {
            invoiceRequestOrCommitRequestOrRefundRequest = new ArrayList<Object>();
        }
        return this.invoiceRequestOrCommitRequestOrRefundRequest;
    }

    /**
     * Gets the value of the plugin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugin() {
        return plugin;
    }

    /**
     * Sets the value of the plugin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugin(String value) {
        this.plugin = value;
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
