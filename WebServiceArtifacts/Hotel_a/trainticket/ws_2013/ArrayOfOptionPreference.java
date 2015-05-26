
package trainticket.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOptionPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOptionPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionPreference" type="{WS_2013.TrainTicket}OptionPreference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOptionPreference", propOrder = {
    "optionPreference"
})
public class ArrayOfOptionPreference {

    @XmlElement(name = "OptionPreference", nillable = true)
    protected List<OptionPreference> optionPreference;

    /**
     * Gets the value of the optionPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionPreference }
     * 
     * 
     */
    public List<OptionPreference> getOptionPreference() {
        if (optionPreference == null) {
            optionPreference = new ArrayList<OptionPreference>();
        }
        return this.optionPreference;
    }

}
