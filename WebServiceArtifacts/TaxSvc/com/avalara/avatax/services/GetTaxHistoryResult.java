
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTaxHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTaxHistoryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://avatax.avalara.com/services}BaseResult">
 *       &lt;sequence>
 *         &lt;element name="GetTaxRequest" type="{http://avatax.avalara.com/services}GetTaxRequest" minOccurs="0"/>
 *         &lt;element name="GetTaxResult" type="{http://avatax.avalara.com/services}GetTaxResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTaxHistoryResult", propOrder = {
    "getTaxRequest",
    "getTaxResult"
})
public class GetTaxHistoryResult
    extends BaseResult
{

    @XmlElement(name = "GetTaxRequest")
    protected GetTaxRequest getTaxRequest;
    @XmlElement(name = "GetTaxResult")
    protected GetTaxResult getTaxResult;

    /**
     * Gets the value of the getTaxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxRequest }
     *     
     */
    public GetTaxRequest getGetTaxRequest() {
        return getTaxRequest;
    }

    /**
     * Sets the value of the getTaxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxRequest }
     *     
     */
    public void setGetTaxRequest(GetTaxRequest value) {
        this.getTaxRequest = value;
    }

    /**
     * Gets the value of the getTaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxResult }
     *     
     */
    public GetTaxResult getGetTaxResult() {
        return getTaxResult;
    }

    /**
     * Sets the value of the getTaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxResult }
     *     
     */
    public void setGetTaxResult(GetTaxResult value) {
        this.getTaxResult = value;
    }

}
