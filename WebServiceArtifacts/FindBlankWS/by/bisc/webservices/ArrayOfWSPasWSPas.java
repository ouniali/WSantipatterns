
package by.bisc.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSPasWSPas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSPasWSPas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSPas" type="{http://www.bisc.by/webservices}WSPas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSPasWSPas", propOrder = {
    "wsPas"
})
public class ArrayOfWSPasWSPas {

    @XmlElement(name = "WSPas", nillable = true)
    protected List<WSPas> wsPas;

    /**
     * Gets the value of the wsPas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsPas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSPas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPas }
     * 
     * 
     */
    public List<WSPas> getWSPas() {
        if (wsPas == null) {
            wsPas = new ArrayList<WSPas>();
        }
        return this.wsPas;
    }

}
