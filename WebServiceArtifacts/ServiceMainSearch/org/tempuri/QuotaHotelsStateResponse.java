
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services.QuotaHotelsState;


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
 *         &lt;element name="QuotaHotelsStateResult" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaHotelsState" minOccurs="0"/>
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
    "quotaHotelsStateResult"
})
@XmlRootElement(name = "QuotaHotelsStateResponse")
public class QuotaHotelsStateResponse {

    @XmlElementRef(name = "QuotaHotelsStateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuotaHotelsState> quotaHotelsStateResult;

    /**
     * Gets the value of the quotaHotelsStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuotaHotelsState }{@code >}
     *     
     */
    public JAXBElement<QuotaHotelsState> getQuotaHotelsStateResult() {
        return quotaHotelsStateResult;
    }

    /**
     * Sets the value of the quotaHotelsStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuotaHotelsState }{@code >}
     *     
     */
    public void setQuotaHotelsStateResult(JAXBElement<QuotaHotelsState> value) {
        this.quotaHotelsStateResult = value;
    }

}
