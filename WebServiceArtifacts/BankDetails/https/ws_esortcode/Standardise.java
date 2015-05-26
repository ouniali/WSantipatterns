
package https.ws_esortcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Standardise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Standardise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardisedSortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardisedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Standardise", propOrder = {
    "validationMessage",
    "isError",
    "errorMessage",
    "standardisedSortcode",
    "standardisedAccountNumber"
})
public class Standardise {

    @XmlElement(name = "ValidationMessage")
    protected String validationMessage;
    @XmlElement(name = "IsError")
    protected boolean isError;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "StandardisedSortcode")
    protected String standardisedSortcode;
    @XmlElement(name = "StandardisedAccountNumber")
    protected String standardisedAccountNumber;

    /**
     * Gets the value of the validationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationMessage() {
        return validationMessage;
    }

    /**
     * Sets the value of the validationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationMessage(String value) {
        this.validationMessage = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     */
    public boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the standardisedSortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardisedSortcode() {
        return standardisedSortcode;
    }

    /**
     * Sets the value of the standardisedSortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardisedSortcode(String value) {
        this.standardisedSortcode = value;
    }

    /**
     * Gets the value of the standardisedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardisedAccountNumber() {
        return standardisedAccountNumber;
    }

    /**
     * Sets the value of the standardisedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardisedAccountNumber(String value) {
        this.standardisedAccountNumber = value;
    }

}
