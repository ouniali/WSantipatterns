
package by.bisc.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSSpWSSp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSSpWSSp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSSp" type="{http://www.bisc.by/webservices}WSSp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSSpWSSp", propOrder = {
    "wsSp"
})
public class ArrayOfWSSpWSSp {

    @XmlElement(name = "WSSp", nillable = true)
    protected List<WSSp> wsSp;

    /**
     * Gets the value of the wsSp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsSp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSSp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSSp }
     * 
     * 
     */
    public List<WSSp> getWSSp() {
        if (wsSp == null) {
            wsSp = new ArrayList<WSSp>();
        }
        return this.wsSp;
    }

}
