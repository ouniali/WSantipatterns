
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDAProductInfoUnspsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDAProductInfoUnspsc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.digikey.com/SearchWS}EDAProductInfo">
 *       &lt;sequence>
 *         &lt;element name="UnspscCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDAProductInfoUnspsc", propOrder = {
    "unspscCode"
})
public class EDAProductInfoUnspsc
    extends EDAProductInfo
{

    @XmlElement(name = "UnspscCode")
    protected int unspscCode;

    /**
     * Gets the value of the unspscCode property.
     * 
     */
    public int getUnspscCode() {
        return unspscCode;
    }

    /**
     * Sets the value of the unspscCode property.
     * 
     */
    public void setUnspscCode(int value) {
        this.unspscCode = value;
    }

}
