
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockIdentCheckResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockIdentCheckResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockIdentCheckResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockIdentCheckResults", propOrder = {
    "blockIdentCheckResult"
})
public class BlockIdentCheckResults {

    @XmlElement(name = "BlockIdentCheckResult")
    protected int blockIdentCheckResult;

    /**
     * Gets the value of the blockIdentCheckResult property.
     * 
     */
    public int getBlockIdentCheckResult() {
        return blockIdentCheckResult;
    }

    /**
     * Sets the value of the blockIdentCheckResult property.
     * 
     */
    public void setBlockIdentCheckResult(int value) {
        this.blockIdentCheckResult = value;
    }

}
