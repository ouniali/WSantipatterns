
package https.ivrs_elections_il_gov.api;

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
 *         &lt;element name="RefuseTransactionRequest" type="{https://ivrs.elections.il.gov/api}RefuseTransactionRequest"/>
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
    "refuseTransactionRequest"
})
@XmlRootElement(name = "RefuseTransactionStd")
public class RefuseTransactionStd {

    @XmlElement(name = "RefuseTransactionRequest", required = true, nillable = true)
    protected RefuseTransactionRequest refuseTransactionRequest;

    /**
     * Gets the value of the refuseTransactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RefuseTransactionRequest }
     *     
     */
    public RefuseTransactionRequest getRefuseTransactionRequest() {
        return refuseTransactionRequest;
    }

    /**
     * Sets the value of the refuseTransactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefuseTransactionRequest }
     *     
     */
    public void setRefuseTransactionRequest(RefuseTransactionRequest value) {
        this.refuseTransactionRequest = value;
    }

}
