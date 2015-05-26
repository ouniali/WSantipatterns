
package by.bisc.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSTBItemWSTBItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSTBItemWSTBItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSTBItem" type="{http://www.bisc.by/webservices}WSTBItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSTBItemWSTBItem", propOrder = {
    "wstbItem"
})
public class ArrayOfWSTBItemWSTBItem {

    @XmlElement(name = "WSTBItem", nillable = true)
    protected List<WSTBItem> wstbItem;

    /**
     * Gets the value of the wstbItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wstbItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSTBItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTBItem }
     * 
     * 
     */
    public List<WSTBItem> getWSTBItem() {
        if (wstbItem == null) {
            wstbItem = new ArrayList<WSTBItem>();
        }
        return this.wstbItem;
    }

}
