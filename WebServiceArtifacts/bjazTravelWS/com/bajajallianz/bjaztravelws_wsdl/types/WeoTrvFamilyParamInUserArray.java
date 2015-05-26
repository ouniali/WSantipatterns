
package com.bajajallianz.bjaztravelws_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvFamilyParamInUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvFamilyParamInUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeoTrvFamilyParamInUser" type="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTrvFamilyParamInUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvFamilyParamInUserArray", propOrder = {
    "weoTrvFamilyParamInUser"
})
public class WeoTrvFamilyParamInUserArray {

    @XmlElement(name = "WeoTrvFamilyParamInUser", nillable = true)
    protected List<WeoTrvFamilyParamInUser> weoTrvFamilyParamInUser;

    /**
     * Gets the value of the weoTrvFamilyParamInUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weoTrvFamilyParamInUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeoTrvFamilyParamInUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeoTrvFamilyParamInUser }
     * 
     * 
     */
    public List<WeoTrvFamilyParamInUser> getWeoTrvFamilyParamInUser() {
        if (weoTrvFamilyParamInUser == null) {
            weoTrvFamilyParamInUser = new ArrayList<WeoTrvFamilyParamInUser>();
        }
        return this.weoTrvFamilyParamInUser;
    }

}
