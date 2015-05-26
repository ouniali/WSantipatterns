
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import in.gov.incometaxindiaefiling.master.TDSonSalary;


/**
 * <p>Java class for TDSonSalariesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDSonSalariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}TDSonSalary" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDSonSalariesType", propOrder = {
    "tdSonSalary"
})
public class TDSonSalariesType {

    @XmlElement(name = "TDSonSalary", namespace = "http://incometaxindiaefiling.gov.in/master", required = true)
    protected List<TDSonSalary> tdSonSalary;

    /**
     * Gets the value of the tdSonSalary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdSonSalary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDSonSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDSonSalary }
     * 
     * 
     */
    public List<TDSonSalary> getTDSonSalary() {
        if (tdSonSalary == null) {
            tdSonSalary = new ArrayList<TDSonSalary>();
        }
        return this.tdSonSalary;
    }

}
