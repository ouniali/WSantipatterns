
package com.bajajallianz.bjaztravelws_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvFamilyMemberUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvFamilyMemberUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeoTrvFamilyMemberUser" type="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTrvFamilyMemberUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvFamilyMemberUserArray", propOrder = {
    "weoTrvFamilyMemberUser"
})
public class WeoTrvFamilyMemberUserArray {

    @XmlElement(name = "WeoTrvFamilyMemberUser", nillable = true)
    protected List<WeoTrvFamilyMemberUser> weoTrvFamilyMemberUser;

    /**
     * Gets the value of the weoTrvFamilyMemberUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weoTrvFamilyMemberUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeoTrvFamilyMemberUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeoTrvFamilyMemberUser }
     * 
     * 
     */
    public List<WeoTrvFamilyMemberUser> getWeoTrvFamilyMemberUser() {
        if (weoTrvFamilyMemberUser == null) {
            weoTrvFamilyMemberUser = new ArrayList<WeoTrvFamilyMemberUser>();
        }
        return this.weoTrvFamilyMemberUser;
    }

}
