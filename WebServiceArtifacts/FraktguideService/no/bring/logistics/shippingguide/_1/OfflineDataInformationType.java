
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineDataInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineDataInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EDI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PostingAtPostoffice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FormattedGeneratedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FormattedValidFromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineDataInformationType", propOrder = {
    "fromPostalCode",
    "edi",
    "postingAtPostoffice",
    "formattedGeneratedDate",
    "formattedValidFromDate",
    "checksum"
})
public class OfflineDataInformationType {

    @XmlElement(name = "FromPostalCode", required = true)
    protected String fromPostalCode;
    @XmlElement(name = "EDI")
    protected boolean edi;
    @XmlElement(name = "PostingAtPostoffice")
    protected boolean postingAtPostoffice;
    @XmlElement(name = "FormattedGeneratedDate", required = true)
    protected String formattedGeneratedDate;
    @XmlElement(name = "FormattedValidFromDate", required = true)
    protected String formattedValidFromDate;
    @XmlElement(name = "Checksum", required = true)
    protected String checksum;

    /**
     * Gets the value of the fromPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalCode() {
        return fromPostalCode;
    }

    /**
     * Sets the value of the fromPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalCode(String value) {
        this.fromPostalCode = value;
    }

    /**
     * Gets the value of the edi property.
     * 
     */
    public boolean isEDI() {
        return edi;
    }

    /**
     * Sets the value of the edi property.
     * 
     */
    public void setEDI(boolean value) {
        this.edi = value;
    }

    /**
     * Gets the value of the postingAtPostoffice property.
     * 
     */
    public boolean isPostingAtPostoffice() {
        return postingAtPostoffice;
    }

    /**
     * Sets the value of the postingAtPostoffice property.
     * 
     */
    public void setPostingAtPostoffice(boolean value) {
        this.postingAtPostoffice = value;
    }

    /**
     * Gets the value of the formattedGeneratedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedGeneratedDate() {
        return formattedGeneratedDate;
    }

    /**
     * Sets the value of the formattedGeneratedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedGeneratedDate(String value) {
        this.formattedGeneratedDate = value;
    }

    /**
     * Gets the value of the formattedValidFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedValidFromDate() {
        return formattedValidFromDate;
    }

    /**
     * Sets the value of the formattedValidFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedValidFromDate(String value) {
        this.formattedValidFromDate = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

}
