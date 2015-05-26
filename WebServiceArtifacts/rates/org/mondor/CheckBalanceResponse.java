
package org.mondor;

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
 *         &lt;element name="CheckBalanceResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "checkBalanceResult"
})
@XmlRootElement(name = "CheckBalanceResponse")
public class CheckBalanceResponse {

    @XmlElement(name = "CheckBalanceResult")
    protected int checkBalanceResult;

    /**
     * Gets the value of the checkBalanceResult property.
     * 
     */
    public int getCheckBalanceResult() {
        return checkBalanceResult;
    }

    /**
     * Sets the value of the checkBalanceResult property.
     * 
     */
    public void setCheckBalanceResult(int value) {
        this.checkBalanceResult = value;
    }

}
