
package com.nuwave_tech.soapam.services.bankdemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txOperation" type="{http://soapam.nuwave-tech.com/services/bankdemo}txOperationType"/>
 *         &lt;element name="txURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="txRange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txOutcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txControl", propOrder = {
    "txOperation",
    "txURL",
    "txTimeout",
    "txRange",
    "txOutcome",
    "txResult"
})
public class TxControl {

    @XmlElement(required = true)
    protected TxOperationType txOperation;
    @XmlElement(required = true)
    protected String txURL;
    protected int txTimeout;
    @XmlElement(required = true)
    protected String txRange;
    @XmlElement(required = true)
    protected String txOutcome;
    protected int txResult;

    /**
     * Gets the value of the txOperation property.
     * 
     * @return
     *     possible object is
     *     {@link TxOperationType }
     *     
     */
    public TxOperationType getTxOperation() {
        return txOperation;
    }

    /**
     * Sets the value of the txOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxOperationType }
     *     
     */
    public void setTxOperation(TxOperationType value) {
        this.txOperation = value;
    }

    /**
     * Gets the value of the txURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxURL() {
        return txURL;
    }

    /**
     * Sets the value of the txURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxURL(String value) {
        this.txURL = value;
    }

    /**
     * Gets the value of the txTimeout property.
     * 
     */
    public int getTxTimeout() {
        return txTimeout;
    }

    /**
     * Sets the value of the txTimeout property.
     * 
     */
    public void setTxTimeout(int value) {
        this.txTimeout = value;
    }

    /**
     * Gets the value of the txRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxRange() {
        return txRange;
    }

    /**
     * Sets the value of the txRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxRange(String value) {
        this.txRange = value;
    }

    /**
     * Gets the value of the txOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxOutcome() {
        return txOutcome;
    }

    /**
     * Sets the value of the txOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxOutcome(String value) {
        this.txOutcome = value;
    }

    /**
     * Gets the value of the txResult property.
     * 
     */
    public int getTxResult() {
        return txResult;
    }

    /**
     * Sets the value of the txResult property.
     * 
     */
    public void setTxResult(int value) {
        this.txResult = value;
    }

}
