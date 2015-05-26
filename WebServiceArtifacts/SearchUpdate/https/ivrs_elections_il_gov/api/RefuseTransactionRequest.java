
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefuseTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefuseTransactionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AuthenticationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Reason" use="required" type="{https://ivrs.elections.il.gov/api}RefuseTransactionReasons" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefuseTransactionRequest")
public class RefuseTransactionRequest {

    @XmlAttribute(name = "AuthenticationCode")
    protected String authenticationCode;
    @XmlAttribute(name = "TransactID", required = true)
    protected long transactID;
    @XmlAttribute(name = "Reason", required = true)
    protected RefuseTransactionReasons reason;

    /**
     * Gets the value of the authenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Sets the value of the authenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationCode(String value) {
        this.authenticationCode = value;
    }

    /**
     * Gets the value of the transactID property.
     * 
     */
    public long getTransactID() {
        return transactID;
    }

    /**
     * Sets the value of the transactID property.
     * 
     */
    public void setTransactID(long value) {
        this.transactID = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RefuseTransactionReasons }
     *     
     */
    public RefuseTransactionReasons getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefuseTransactionReasons }
     *     
     */
    public void setReason(RefuseTransactionReasons value) {
        this.reason = value;
    }

}
