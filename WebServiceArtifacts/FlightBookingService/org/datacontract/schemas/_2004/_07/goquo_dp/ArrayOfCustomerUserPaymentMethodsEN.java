
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomerUserPaymentMethodsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomerUserPaymentMethodsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerUserPaymentMethodsEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CustomerUserPaymentMethodsEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomerUserPaymentMethodsEN", propOrder = {
    "customerUserPaymentMethodsEN"
})
public class ArrayOfCustomerUserPaymentMethodsEN {

    @XmlElement(name = "CustomerUserPaymentMethodsEN", nillable = true)
    protected List<CustomerUserPaymentMethodsEN> customerUserPaymentMethodsEN;

    /**
     * Gets the value of the customerUserPaymentMethodsEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerUserPaymentMethodsEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerUserPaymentMethodsEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerUserPaymentMethodsEN }
     * 
     * 
     */
    public List<CustomerUserPaymentMethodsEN> getCustomerUserPaymentMethodsEN() {
        if (customerUserPaymentMethodsEN == null) {
            customerUserPaymentMethodsEN = new ArrayList<CustomerUserPaymentMethodsEN>();
        }
        return this.customerUserPaymentMethodsEN;
    }

}
