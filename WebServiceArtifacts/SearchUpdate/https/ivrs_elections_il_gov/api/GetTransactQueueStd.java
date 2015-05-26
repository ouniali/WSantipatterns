
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
 *         &lt;element name="TransactQueueRequest" type="{https://ivrs.elections.il.gov/api}TransactQueueRequest"/>
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
    "transactQueueRequest"
})
@XmlRootElement(name = "GetTransactQueueStd")
public class GetTransactQueueStd {

    @XmlElement(name = "TransactQueueRequest", required = true, nillable = true)
    protected TransactQueueRequest transactQueueRequest;

    /**
     * Gets the value of the transactQueueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TransactQueueRequest }
     *     
     */
    public TransactQueueRequest getTransactQueueRequest() {
        return transactQueueRequest;
    }

    /**
     * Sets the value of the transactQueueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactQueueRequest }
     *     
     */
    public void setTransactQueueRequest(TransactQueueRequest value) {
        this.transactQueueRequest = value;
    }

}
