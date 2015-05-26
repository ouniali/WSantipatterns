
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTravelPlanUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTravelPlanUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeoTravelPlanUser" type="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTravelPlanUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTravelPlanUserArray", propOrder = {
    "weoTravelPlanUser"
})
public class WeoTravelPlanUserArray {

    @XmlElement(name = "WeoTravelPlanUser", nillable = true)
    protected List<WeoTravelPlanUser> weoTravelPlanUser;

    /**
     * Gets the value of the weoTravelPlanUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weoTravelPlanUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeoTravelPlanUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeoTravelPlanUser }
     * 
     * 
     */
    public List<WeoTravelPlanUser> getWeoTravelPlanUser() {
        if (weoTravelPlanUser == null) {
            weoTravelPlanUser = new ArrayList<WeoTravelPlanUser>();
        }
        return this.weoTravelPlanUser;
    }

}
