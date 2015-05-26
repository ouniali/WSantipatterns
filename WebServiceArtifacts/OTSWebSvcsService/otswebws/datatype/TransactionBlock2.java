
package otswebws.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionBlock2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionBlock2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transactions" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="transactionIdOut" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionBlock2", propOrder = {
    "count",
    "transactions",
    "transactionIdOut"
})
public class TransactionBlock2 {

    protected int count;
    @XmlElement(required = true)
    protected byte[] transactions;
    protected long transactionIdOut;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTransactions(byte[] value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the transactionIdOut property.
     * 
     */
    public long getTransactionIdOut() {
        return transactionIdOut;
    }

    /**
     * Sets the value of the transactionIdOut property.
     * 
     */
    public void setTransactionIdOut(long value) {
        this.transactionIdOut = value;
    }

}
