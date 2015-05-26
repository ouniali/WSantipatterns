
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import in.gov.incometaxindiaefiling.master.TaxPayment;


/**
 * <p>Java class for TaxPaymentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPaymentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}TaxPayment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPaymentsType", propOrder = {
    "taxPayment"
})
public class TaxPaymentsType {

    @XmlElement(name = "TaxPayment", namespace = "http://incometaxindiaefiling.gov.in/master", required = true)
    protected List<TaxPayment> taxPayment;

    /**
     * Gets the value of the taxPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxPayment }
     * 
     * 
     */
    public List<TaxPayment> getTaxPayment() {
        if (taxPayment == null) {
            taxPayment = new ArrayList<TaxPayment>();
        }
        return this.taxPayment;
    }

}
