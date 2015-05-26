
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRealCourse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRealCourse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RealCourse" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}RealCourse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRealCourse", propOrder = {
    "realCourse"
})
public class ArrayOfRealCourse {

    @XmlElement(name = "RealCourse", nillable = true)
    protected List<RealCourse> realCourse;

    /**
     * Gets the value of the realCourse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realCourse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealCourse }
     * 
     * 
     */
    public List<RealCourse> getRealCourse() {
        if (realCourse == null) {
            realCourse = new ArrayList<RealCourse>();
        }
        return this.realCourse;
    }

}
