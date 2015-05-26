
package by.bisc.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSRelWSRel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSRelWSRel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSRel" type="{http://www.bisc.by/webservices}WSRel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSRelWSRel", propOrder = {
    "wsRel"
})
public class ArrayOfWSRelWSRel {

    @XmlElement(name = "WSRel", nillable = true)
    protected List<WSRel> wsRel;

    /**
     * Gets the value of the wsRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRel }
     * 
     * 
     */
    public List<WSRel> getWSRel() {
        if (wsRel == null) {
            wsRel = new ArrayList<WSRel>();
        }
        return this.wsRel;
    }

}
