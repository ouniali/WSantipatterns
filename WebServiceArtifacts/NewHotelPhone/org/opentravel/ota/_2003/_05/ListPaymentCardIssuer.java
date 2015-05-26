
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for List_PaymentCardIssuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_PaymentCardIssuer">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_PaymentCardIssuer_Base">
 *       &lt;attribute name="RemovalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DescriptionDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="ResourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_PaymentCardIssuer", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.PaymentCardType.Issuer.class
})
public class ListPaymentCardIssuer {

    @XmlValue
    protected ListPaymentCardIssuerBase value;
    @XmlAttribute(name = "RemovalInd")
    protected Boolean removalInd;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DescriptionDetail")
    protected String descriptionDetail;
    @XmlAttribute(name = "SourceName")
    protected String sourceName;
    @XmlAttribute(name = "SourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String sourceURL;
    @XmlAttribute(name = "ResourceName")
    protected String resourceName;
    @XmlAttribute(name = "ResourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String resourceURL;
    @XmlAttribute(name = "UniqueID")
    protected String uniqueID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ListPaymentCardIssuerBase }
     *     
     */
    public ListPaymentCardIssuerBase getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPaymentCardIssuerBase }
     *     
     */
    public void setValue(ListPaymentCardIssuerBase value) {
        this.value = value;
    }

    /**
     * Gets the value of the removalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovalInd() {
        return removalInd;
    }

    /**
     * Sets the value of the removalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovalInd(Boolean value) {
        this.removalInd = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    /**
     * Sets the value of the descriptionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionDetail(String value) {
        this.descriptionDetail = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the sourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURL() {
        return sourceURL;
    }

    /**
     * Sets the value of the sourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURL(String value) {
        this.sourceURL = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the resourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceURL() {
        return resourceURL;
    }

    /**
     * Sets the value of the resourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceURL(String value) {
        this.resourceURL = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(String value) {
        this.uniqueID = value;
    }

}
