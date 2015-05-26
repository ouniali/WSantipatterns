
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineRequestPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineRequestPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SchemaVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WithExpectedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EDI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostingAtPostoffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Trace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineRequestPropertiesType", propOrder = {

})
public class OfflineRequestPropertiesType {

    @XmlElement(name = "SchemaVersion", required = true)
    protected String schemaVersion;
    @XmlElement(name = "Language", defaultValue = "no")
    protected String language;
    @XmlElement(name = "WithPrice", defaultValue = "true")
    protected Boolean withPrice;
    @XmlElement(name = "WithExpectedDelivery", defaultValue = "true")
    protected Boolean withExpectedDelivery;
    @XmlElement(name = "EDI", defaultValue = "true")
    protected Boolean edi;
    @XmlElement(name = "PostingAtPostoffice", defaultValue = "false")
    protected Boolean postingAtPostoffice;
    @XmlElement(name = "Trace", defaultValue = "true")
    protected Boolean trace;

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the withPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithPrice() {
        return withPrice;
    }

    /**
     * Sets the value of the withPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithPrice(Boolean value) {
        this.withPrice = value;
    }

    /**
     * Gets the value of the withExpectedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithExpectedDelivery() {
        return withExpectedDelivery;
    }

    /**
     * Sets the value of the withExpectedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithExpectedDelivery(Boolean value) {
        this.withExpectedDelivery = value;
    }

    /**
     * Gets the value of the edi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEDI() {
        return edi;
    }

    /**
     * Sets the value of the edi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEDI(Boolean value) {
        this.edi = value;
    }

    /**
     * Gets the value of the postingAtPostoffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostingAtPostoffice() {
        return postingAtPostoffice;
    }

    /**
     * Sets the value of the postingAtPostoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostingAtPostoffice(Boolean value) {
        this.postingAtPostoffice = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrace(Boolean value) {
        this.trace = value;
    }

}
