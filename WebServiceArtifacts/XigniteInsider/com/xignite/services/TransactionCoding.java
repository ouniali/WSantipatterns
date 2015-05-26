
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionCoding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionCoding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionFormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equitySwapInvolved" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="footnotes" type="{http://www.xignite.com/services/}ArrayOfFootnote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionCoding", propOrder = {
    "transactionFormType",
    "transactionCode",
    "equitySwapInvolved",
    "footnotes"
})
public class TransactionCoding {

    protected String transactionFormType;
    protected String transactionCode;
    protected int equitySwapInvolved;
    protected ArrayOfFootnote footnotes;

    /**
     * Gets the value of the transactionFormType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionFormType() {
        return transactionFormType;
    }

    /**
     * Sets the value of the transactionFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionFormType(String value) {
        this.transactionFormType = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the equitySwapInvolved property.
     * 
     */
    public int getEquitySwapInvolved() {
        return equitySwapInvolved;
    }

    /**
     * Sets the value of the equitySwapInvolved property.
     * 
     */
    public void setEquitySwapInvolved(int value) {
        this.equitySwapInvolved = value;
    }

    /**
     * Gets the value of the footnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public ArrayOfFootnote getFootnotes() {
        return footnotes;
    }

    /**
     * Sets the value of the footnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public void setFootnotes(ArrayOfFootnote value) {
        this.footnotes = value;
    }

}
