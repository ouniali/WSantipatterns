
package in.gov.incometaxindiaefiling.master;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "", propOrder = {
    "tdSonSalary"
})
@XmlRootElement(name = "ScheduleTDS1")
public class ScheduleTDS1 {

    @XmlElement(name = "TDSonSalary", required = true)
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
