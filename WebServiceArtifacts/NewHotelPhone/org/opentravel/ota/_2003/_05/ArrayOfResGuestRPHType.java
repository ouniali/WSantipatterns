
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResGuestRPHType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResGuestRPHType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResGuestRPHType", propOrder = {
    "resGuestRPH"
})
public class ArrayOfResGuestRPHType {

    @XmlElement(name = "ResGuestRPH")
    protected List<ResGuestRPHType> resGuestRPH;

    /**
     * Gets the value of the resGuestRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGuestRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGuestRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResGuestRPHType }
     * 
     * 
     */
    public List<ResGuestRPHType> getResGuestRPH() {
        if (resGuestRPH == null) {
            resGuestRPH = new ArrayList<ResGuestRPHType>();
        }
        return this.resGuestRPH;
    }

}
