
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefuseTransactionReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefuseTransactionReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Information" type="{https://ivrs.elections.il.gov/api}InformationInternal" minOccurs="0"/>
 *         &lt;element name="Errors" type="{https://ivrs.elections.il.gov/api}ArrayOfBaseError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefuseTransactionReturn", propOrder = {
    "information",
    "errors"
})
public class RefuseTransactionReturn {

    @XmlElement(name = "Information")
    protected InformationInternal information;
    @XmlElement(name = "Errors")
    protected ArrayOfBaseError errors;

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link InformationInternal }
     *     
     */
    public InformationInternal getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationInternal }
     *     
     */
    public void setInformation(InformationInternal value) {
        this.information = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseError }
     *     
     */
    public ArrayOfBaseError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseError }
     *     
     */
    public void setErrors(ArrayOfBaseError value) {
        this.errors = value;
    }

}
