
package org.tempuri.dotnet.financeservice;

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
 *         &lt;element name="PaymentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "paymentResult"
})
@XmlRootElement(name = "PaymentResponse")
public class PaymentResponse {

    @XmlElement(name = "PaymentResult")
    protected double paymentResult;

    /**
     * Gets the value of the paymentResult property.
     * 
     */
    public double getPaymentResult() {
        return paymentResult;
    }

    /**
     * Sets the value of the paymentResult property.
     * 
     */
    public void setPaymentResult(double value) {
        this.paymentResult = value;
    }

}
