
package otswebws.websvcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import otswebws.datatype.TransactionBlock;


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
 *         &lt;element name="dequeueReturn" type="{http://datatype.otswebws}TransactionBlock"/>
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
    "dequeueReturn"
})
@XmlRootElement(name = "dequeueResponse")
public class DequeueResponse {

    @XmlElement(required = true, nillable = true)
    protected TransactionBlock dequeueReturn;

    /**
     * Gets the value of the dequeueReturn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionBlock }
     *     
     */
    public TransactionBlock getDequeueReturn() {
        return dequeueReturn;
    }

    /**
     * Sets the value of the dequeueReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionBlock }
     *     
     */
    public void setDequeueReturn(TransactionBlock value) {
        this.dequeueReturn = value;
    }

}
