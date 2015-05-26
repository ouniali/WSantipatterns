
package com.xignite.services;

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
 *         &lt;element name="ListDividendClassificationsResult" type="{http://www.xignite.com/services/}PossibleValues" minOccurs="0"/>
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
    "listDividendClassificationsResult"
})
@XmlRootElement(name = "ListDividendClassificationsResponse")
public class ListDividendClassificationsResponse {

    @XmlElement(name = "ListDividendClassificationsResult")
    protected PossibleValues listDividendClassificationsResult;

    /**
     * Gets the value of the listDividendClassificationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleValues }
     *     
     */
    public PossibleValues getListDividendClassificationsResult() {
        return listDividendClassificationsResult;
    }

    /**
     * Sets the value of the listDividendClassificationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleValues }
     *     
     */
    public void setListDividendClassificationsResult(PossibleValues value) {
        this.listDividendClassificationsResult = value;
    }

}
