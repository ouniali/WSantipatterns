
package com.bajajallianz.bjaztravelws_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvFamilyNewWsUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvFamilyNewWsUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeoTrvFamilyNewWsUser" type="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTrvFamilyNewWsUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvFamilyNewWsUserArray", propOrder = {
    "weoTrvFamilyNewWsUser"
})
public class WeoTrvFamilyNewWsUserArray {

    @XmlElement(name = "WeoTrvFamilyNewWsUser", nillable = true)
    protected List<WeoTrvFamilyNewWsUser> weoTrvFamilyNewWsUser;

    /**
     * Gets the value of the weoTrvFamilyNewWsUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weoTrvFamilyNewWsUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeoTrvFamilyNewWsUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeoTrvFamilyNewWsUser }
     * 
     * 
     */
    public List<WeoTrvFamilyNewWsUser> getWeoTrvFamilyNewWsUser() {
        if (weoTrvFamilyNewWsUser == null) {
            weoTrvFamilyNewWsUser = new ArrayList<WeoTrvFamilyNewWsUser>();
        }
        return this.weoTrvFamilyNewWsUser;
    }

}
