
package fr.mondialrelay.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPointRelais_Details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPointRelais_Details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PointRelais_Details" type="{http://www.mondialrelay.fr/webservice/}PointRelais_Details" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPointRelais_Details", propOrder = {
    "pointRelaisDetails"
})
public class ArrayOfPointRelaisDetails {

    @XmlElement(name = "PointRelais_Details", nillable = true)
    protected List<PointRelaisDetails> pointRelaisDetails;

    /**
     * Gets the value of the pointRelaisDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointRelaisDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointRelaisDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointRelaisDetails }
     * 
     * 
     */
    public List<PointRelaisDetails> getPointRelaisDetails() {
        if (pointRelaisDetails == null) {
            pointRelaisDetails = new ArrayList<PointRelaisDetails>();
        }
        return this.pointRelaisDetails;
    }

}
