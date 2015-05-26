
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
 *         &lt;element name="TransactQueueReturn" type="{https://ivrs.elections.il.gov/api}TransactQueueReturn"/>
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
    "transactQueueReturn"
})
@XmlRootElement(name = "GetTransactQueueStdResponse")
public class GetTransactQueueStdResponse {

    @XmlElement(name = "TransactQueueReturn", required = true, nillable = true)
    protected TransactQueueReturn transactQueueReturn;

    /**
     * Gets the value of the transactQueueReturn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactQueueReturn }
     *     
     */
    public TransactQueueReturn getTransactQueueReturn() {
        return transactQueueReturn;
    }

    /**
     * Sets the value of the transactQueueReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactQueueReturn }
     *     
     */
    public void setTransactQueueReturn(TransactQueueReturn value) {
        this.transactQueueReturn = value;
    }

}
