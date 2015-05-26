
package ro.bvb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBalanceField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBalanceField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceField" type="{http://www.bvb.ro}BalanceField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBalanceField", propOrder = {
    "balanceField"
})
public class ArrayOfBalanceField {

    @XmlElement(name = "BalanceField", nillable = true)
    protected List<BalanceField> balanceField;

    /**
     * Gets the value of the balanceField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceField }
     * 
     * 
     */
    public List<BalanceField> getBalanceField() {
        if (balanceField == null) {
            balanceField = new ArrayList<BalanceField>();
        }
        return this.balanceField;
    }

}
