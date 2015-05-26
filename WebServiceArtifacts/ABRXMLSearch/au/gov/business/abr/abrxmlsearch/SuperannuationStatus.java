
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuperannuationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuperannuationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complyingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complyingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regulator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperannuationStatus", propOrder = {
    "complyingCode",
    "complyingDescription",
    "regulator",
    "exceptionMessage"
})
public class SuperannuationStatus {

    protected String complyingCode;
    protected String complyingDescription;
    protected String regulator;
    protected String exceptionMessage;

    /**
     * Gets the value of the complyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplyingCode() {
        return complyingCode;
    }

    /**
     * Sets the value of the complyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplyingCode(String value) {
        this.complyingCode = value;
    }

    /**
     * Gets the value of the complyingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplyingDescription() {
        return complyingDescription;
    }

    /**
     * Sets the value of the complyingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplyingDescription(String value) {
        this.complyingDescription = value;
    }

    /**
     * Gets the value of the regulator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulator() {
        return regulator;
    }

    /**
     * Sets the value of the regulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulator(String value) {
        this.regulator = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

}
