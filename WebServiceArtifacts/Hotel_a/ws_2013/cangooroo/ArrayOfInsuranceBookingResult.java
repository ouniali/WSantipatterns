
package ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import insurance.ws_2013.cangooroo.InsuranceBookingResult;


/**
 * <p>Java class for ArrayOfInsuranceBookingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInsuranceBookingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceBookingResult" type="{Cangooroo.WS_2013.Insurance}InsuranceBookingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsuranceBookingResult", propOrder = {
    "insuranceBookingResult"
})
public class ArrayOfInsuranceBookingResult {

    @XmlElement(name = "InsuranceBookingResult", nillable = true)
    protected List<InsuranceBookingResult> insuranceBookingResult;

    /**
     * Gets the value of the insuranceBookingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceBookingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceBookingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBookingResult }
     * 
     * 
     */
    public List<InsuranceBookingResult> getInsuranceBookingResult() {
        if (insuranceBookingResult == null) {
            insuranceBookingResult = new ArrayList<InsuranceBookingResult>();
        }
        return this.insuranceBookingResult;
    }

}
