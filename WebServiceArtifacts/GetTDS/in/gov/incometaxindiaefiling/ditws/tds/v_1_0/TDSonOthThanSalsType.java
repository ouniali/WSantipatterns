
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import in.gov.incometaxindiaefiling.master.TDSonOthThanSal;


/**
 * <p>Java class for TDSonOthThanSalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDSonOthThanSalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}TDSonOthThanSal" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDSonOthThanSalsType", propOrder = {
    "tdSonOthThanSal"
})
public class TDSonOthThanSalsType {

    @XmlElement(name = "TDSonOthThanSal", namespace = "http://incometaxindiaefiling.gov.in/master", required = true)
    protected List<TDSonOthThanSal> tdSonOthThanSal;

    /**
     * Gets the value of the tdSonOthThanSal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdSonOthThanSal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDSonOthThanSal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDSonOthThanSal }
     * 
     * 
     */
    public List<TDSonOthThanSal> getTDSonOthThanSal() {
        if (tdSonOthThanSal == null) {
            tdSonOthThanSal = new ArrayList<TDSonOthThanSal>();
        }
        return this.tdSonOthThanSal;
    }

}
