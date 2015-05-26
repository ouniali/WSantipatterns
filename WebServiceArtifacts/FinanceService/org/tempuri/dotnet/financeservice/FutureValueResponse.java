
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
 *         &lt;element name="FutureValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "futureValueResult"
})
@XmlRootElement(name = "FutureValueResponse")
public class FutureValueResponse {

    @XmlElement(name = "FutureValueResult")
    protected double futureValueResult;

    /**
     * Gets the value of the futureValueResult property.
     * 
     */
    public double getFutureValueResult() {
        return futureValueResult;
    }

    /**
     * Sets the value of the futureValueResult property.
     * 
     */
    public void setFutureValueResult(double value) {
        this.futureValueResult = value;
    }

}
