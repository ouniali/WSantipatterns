
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.CustomerUserPaymentMethodsEN;


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
 *         &lt;element name="insuranceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedPaymentMethod" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CustomerUserPaymentMethodsEN" minOccurs="0"/>
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
    "insuranceStatus",
    "selectedPaymentMethod"
})
@XmlRootElement(name = "Booking_GetPackageSummary")
public class BookingGetPackageSummary {

    @XmlElementRef(name = "insuranceStatus", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceStatus;
    @XmlElementRef(name = "SelectedPaymentMethod", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerUserPaymentMethodsEN> selectedPaymentMethod;

    /**
     * Gets the value of the insuranceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceStatus() {
        return insuranceStatus;
    }

    /**
     * Sets the value of the insuranceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceStatus(JAXBElement<String> value) {
        this.insuranceStatus = value;
    }

    /**
     * Gets the value of the selectedPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}
     *     
     */
    public JAXBElement<CustomerUserPaymentMethodsEN> getSelectedPaymentMethod() {
        return selectedPaymentMethod;
    }

    /**
     * Sets the value of the selectedPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}
     *     
     */
    public void setSelectedPaymentMethod(JAXBElement<CustomerUserPaymentMethodsEN> value) {
        this.selectedPaymentMethod = value;
    }

}
