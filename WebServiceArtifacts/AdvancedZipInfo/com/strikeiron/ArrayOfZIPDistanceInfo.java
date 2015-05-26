
package com.strikeiron;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfZIPDistanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfZIPDistanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIPDistanceInfo" type="{http://www.strikeiron.com}ZIPDistanceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfZIPDistanceInfo", propOrder = {
    "zipDistanceInfo"
})
public class ArrayOfZIPDistanceInfo {

    @XmlElement(name = "ZIPDistanceInfo", nillable = true)
    protected List<ZIPDistanceInfo> zipDistanceInfo;

    /**
     * Gets the value of the zipDistanceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zipDistanceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZIPDistanceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZIPDistanceInfo }
     * 
     * 
     */
    public List<ZIPDistanceInfo> getZIPDistanceInfo() {
        if (zipDistanceInfo == null) {
            zipDistanceInfo = new ArrayList<ZIPDistanceInfo>();
        }
        return this.zipDistanceInfo;
    }

}
