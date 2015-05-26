
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import in.gov.incometaxindiaefiling.master.TCS;


/**
 * <p>Java class for ScheduleTCSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleTCSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}TCS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleTCSType", propOrder = {
    "tcs"
})
public class ScheduleTCSType {

    @XmlElement(name = "TCS", namespace = "http://incometaxindiaefiling.gov.in/master", required = true)
    protected List<TCS> tcs;

    /**
     * Gets the value of the tcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCS }
     * 
     * 
     */
    public List<TCS> getTCS() {
        if (tcs == null) {
            tcs = new ArrayList<TCS>();
        }
        return this.tcs;
    }

}
