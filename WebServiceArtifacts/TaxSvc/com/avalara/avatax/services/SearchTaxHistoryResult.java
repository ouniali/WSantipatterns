
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTaxHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchTaxHistoryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://avatax.avalara.com/services}BaseResult">
 *       &lt;sequence>
 *         &lt;element name="GetTaxResults" type="{http://avatax.avalara.com/services}ArrayOfGetTaxResult" minOccurs="0"/>
 *         &lt;element name="LastDocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastDocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchTaxHistoryResult", propOrder = {
    "getTaxResults",
    "lastDocId",
    "lastDocCode"
})
@XmlSeeAlso({
    ReconcileTaxHistoryResult.class
})
public class SearchTaxHistoryResult
    extends BaseResult
{

    @XmlElement(name = "GetTaxResults")
    protected ArrayOfGetTaxResult getTaxResults;
    @XmlElement(name = "LastDocId")
    protected String lastDocId;
    @XmlElement(name = "LastDocCode")
    protected String lastDocCode;

    /**
     * Gets the value of the getTaxResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetTaxResult }
     *     
     */
    public ArrayOfGetTaxResult getGetTaxResults() {
        return getTaxResults;
    }

    /**
     * Sets the value of the getTaxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetTaxResult }
     *     
     */
    public void setGetTaxResults(ArrayOfGetTaxResult value) {
        this.getTaxResults = value;
    }

    /**
     * Gets the value of the lastDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDocId() {
        return lastDocId;
    }

    /**
     * Sets the value of the lastDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDocId(String value) {
        this.lastDocId = value;
    }

    /**
     * Gets the value of the lastDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDocCode() {
        return lastDocCode;
    }

    /**
     * Sets the value of the lastDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDocCode(String value) {
        this.lastDocCode = value;
    }

}
