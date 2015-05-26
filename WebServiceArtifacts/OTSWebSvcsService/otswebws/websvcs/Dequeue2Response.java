
package otswebws.websvcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import otswebws.datatype.TransactionBlock2;


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
 *         &lt;element name="dequeue2Return" type="{http://datatype.otswebws}TransactionBlock2"/>
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
    "dequeue2Return"
})
@XmlRootElement(name = "dequeue2Response")
public class Dequeue2Response {

    @XmlElement(required = true, nillable = true)
    protected TransactionBlock2 dequeue2Return;

    /**
     * Gets the value of the dequeue2Return property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionBlock2 }
     *     
     */
    public TransactionBlock2 getDequeue2Return() {
        return dequeue2Return;
    }

    /**
     * Sets the value of the dequeue2Return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionBlock2 }
     *     
     */
    public void setDequeue2Return(TransactionBlock2 value) {
        this.dequeue2Return = value;
    }

}
