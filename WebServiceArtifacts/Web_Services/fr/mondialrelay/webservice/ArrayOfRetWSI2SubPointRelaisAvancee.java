
package fr.mondialrelay.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRet_WSI2_sub_PointRelaisAvancee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRet_WSI2_sub_PointRelaisAvancee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ret_WSI2_sub_PointRelaisAvancee" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelaisAvancee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRet_WSI2_sub_PointRelaisAvancee", propOrder = {
    "retWSI2SubPointRelaisAvancee"
})
public class ArrayOfRetWSI2SubPointRelaisAvancee {

    @XmlElement(name = "ret_WSI2_sub_PointRelaisAvancee", nillable = true)
    protected List<RetWSI2SubPointRelaisAvancee> retWSI2SubPointRelaisAvancee;

    /**
     * Gets the value of the retWSI2SubPointRelaisAvancee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retWSI2SubPointRelaisAvancee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetWSI2SubPointRelaisAvancee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetWSI2SubPointRelaisAvancee }
     * 
     * 
     */
    public List<RetWSI2SubPointRelaisAvancee> getRetWSI2SubPointRelaisAvancee() {
        if (retWSI2SubPointRelaisAvancee == null) {
            retWSI2SubPointRelaisAvancee = new ArrayList<RetWSI2SubPointRelaisAvancee>();
        }
        return this.retWSI2SubPointRelaisAvancee;
    }

}
