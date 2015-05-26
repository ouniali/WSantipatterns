
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inserted" type="{http://www.travelport.com/schema/universal_v16_0}typeChangedKeyStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Deleted" type="{http://www.travelport.com/schema/universal_v16_0}typeChangedKeyStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inserted",
    "deleted"
})
@XmlRootElement(name = "ChangedKeyStatus")
public class ChangedKeyStatus {

    @XmlElement(name = "Inserted")
    protected List<TypeChangedKeyStatus> inserted;
    @XmlElement(name = "Deleted")
    protected List<TypeChangedKeyStatus> deleted;

    /**
     * Gets the value of the inserted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inserted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInserted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeChangedKeyStatus }
     * 
     * 
     */
    public List<TypeChangedKeyStatus> getInserted() {
        if (inserted == null) {
            inserted = new ArrayList<TypeChangedKeyStatus>();
        }
        return this.inserted;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeChangedKeyStatus }
     * 
     * 
     */
    public List<TypeChangedKeyStatus> getDeleted() {
        if (deleted == null) {
            deleted = new ArrayList<TypeChangedKeyStatus>();
        }
        return this.deleted;
    }

}
