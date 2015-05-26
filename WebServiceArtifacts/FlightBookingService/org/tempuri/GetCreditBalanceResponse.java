
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.B2BCompanyDetails;


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
 *         &lt;element name="GetCreditBalanceResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}B2BCompanyDetails" minOccurs="0"/>
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
    "getCreditBalanceResult"
})
@XmlRootElement(name = "GetCreditBalanceResponse")
public class GetCreditBalanceResponse {

    @XmlElementRef(name = "GetCreditBalanceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<B2BCompanyDetails> getCreditBalanceResult;

    /**
     * Gets the value of the getCreditBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link B2BCompanyDetails }{@code >}
     *     
     */
    public JAXBElement<B2BCompanyDetails> getGetCreditBalanceResult() {
        return getCreditBalanceResult;
    }

    /**
     * Sets the value of the getCreditBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link B2BCompanyDetails }{@code >}
     *     
     */
    public void setGetCreditBalanceResult(JAXBElement<B2BCompanyDetails> value) {
        this.getCreditBalanceResult = value;
    }

}
