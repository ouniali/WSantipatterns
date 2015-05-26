
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTaxInfoWithPaymentRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTaxInfoWithPaymentRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/air_v18_0}typeTaxInfo">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PaymentRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTaxInfoWithPaymentRef", propOrder = {
    "paymentRef"
})
public class TypeTaxInfoWithPaymentRef
    extends TypeTaxInfo
{

    @XmlElement(name = "PaymentRef")
    protected List<PaymentRef> paymentRef;

    /**
     * This reference elements will associate relevant payment to this tax Gets the value of the paymentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRef }
     * 
     * 
     */
    public List<PaymentRef> getPaymentRef() {
        if (paymentRef == null) {
            paymentRef = new ArrayList<PaymentRef>();
        }
        return this.paymentRef;
    }

}
