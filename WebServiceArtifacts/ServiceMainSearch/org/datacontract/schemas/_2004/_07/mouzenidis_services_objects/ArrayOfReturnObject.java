
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReturnObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReturnObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnObject" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}ReturnObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReturnObject", propOrder = {
    "returnObject"
})
public class ArrayOfReturnObject {

    @XmlElement(name = "ReturnObject", nillable = true)
    protected List<ReturnObject> returnObject;

    /**
     * Gets the value of the returnObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnObject }
     * 
     * 
     */
    public List<ReturnObject> getReturnObject() {
        if (returnObject == null) {
            returnObject = new ArrayList<ReturnObject>();
        }
        return this.returnObject;
    }

}
