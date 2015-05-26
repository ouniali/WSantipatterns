
package insurance.ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import common.ws_2013.CancellationPolicy;


/**
 * <p>Java class for ArrayOfCancellationPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancellationPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancellationPolicy" type="{WS_2013.Common}CancellationPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancellationPolicy", propOrder = {
    "cancellationPolicy"
})
public class ArrayOfCancellationPolicy {

    @XmlElement(name = "CancellationPolicy", nillable = true)
    protected List<CancellationPolicy> cancellationPolicy;

    /**
     * Gets the value of the cancellationPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellationPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellationPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationPolicy }
     * 
     * 
     */
    public List<CancellationPolicy> getCancellationPolicy() {
        if (cancellationPolicy == null) {
            cancellationPolicy = new ArrayList<CancellationPolicy>();
        }
        return this.cancellationPolicy;
    }

}
