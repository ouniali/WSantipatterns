
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for headerValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="headerValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identWebPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerValue", propOrder = {
    "accountNumber",
    "idEmit",
    "identWebPro",
    "subAccount"
})
public class HeaderValue {

    protected int accountNumber;
    protected String idEmit;
    protected String identWebPro;
    protected int subAccount;

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the idEmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEmit() {
        return idEmit;
    }

    /**
     * Sets the value of the idEmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEmit(String value) {
        this.idEmit = value;
    }

    /**
     * Gets the value of the identWebPro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentWebPro() {
        return identWebPro;
    }

    /**
     * Sets the value of the identWebPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentWebPro(String value) {
        this.identWebPro = value;
    }

    /**
     * Gets the value of the subAccount property.
     * 
     */
    public int getSubAccount() {
        return subAccount;
    }

    /**
     * Sets the value of the subAccount property.
     * 
     */
    public void setSubAccount(int value) {
        this.subAccount = value;
    }

}
