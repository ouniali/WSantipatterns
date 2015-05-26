
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
 *         &lt;element name="RefuseTransactionReturn" type="{https://ivrs.elections.il.gov/api}RefuseTransactionReturn"/>
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
    "refuseTransactionReturn"
})
@XmlRootElement(name = "RefuseTransactionStdResponse")
public class RefuseTransactionStdResponse {

    @XmlElement(name = "RefuseTransactionReturn", required = true, nillable = true)
    protected RefuseTransactionReturn refuseTransactionReturn;

    /**
     * Gets the value of the refuseTransactionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RefuseTransactionReturn }
     *     
     */
    public RefuseTransactionReturn getRefuseTransactionReturn() {
        return refuseTransactionReturn;
    }

    /**
     * Sets the value of the refuseTransactionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefuseTransactionReturn }
     *     
     */
    public void setRefuseTransactionReturn(RefuseTransactionReturn value) {
        this.refuseTransactionReturn = value;
    }

}
