
package in.gov.incometaxindiaefiling.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameOfBank" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfBranch" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameOfBank",
    "nameOfBranch"
})
@XmlRootElement(name = "NameOfBankAndBranch")
public class NameOfBankAndBranch {

    @XmlElement(name = "NameOfBank")
    protected String nameOfBank;
    @XmlElement(name = "NameOfBranch")
    protected String nameOfBranch;

    /**
     * Gets the value of the nameOfBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfBank() {
        return nameOfBank;
    }

    /**
     * Sets the value of the nameOfBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfBank(String value) {
        this.nameOfBank = value;
    }

    /**
     * Gets the value of the nameOfBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfBranch() {
        return nameOfBranch;
    }

    /**
     * Sets the value of the nameOfBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfBranch(String value) {
        this.nameOfBranch = value;
    }

}
