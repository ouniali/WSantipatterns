
package com.bajajallianz.bjaztravelws_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvIntermediaryUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvIntermediaryUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeoTrvIntermediaryUser" type="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTrvIntermediaryUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvIntermediaryUserArray", propOrder = {
    "weoTrvIntermediaryUser"
})
public class WeoTrvIntermediaryUserArray {

    @XmlElement(name = "WeoTrvIntermediaryUser", nillable = true)
    protected List<WeoTrvIntermediaryUser> weoTrvIntermediaryUser;

    /**
     * Gets the value of the weoTrvIntermediaryUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weoTrvIntermediaryUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeoTrvIntermediaryUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeoTrvIntermediaryUser }
     * 
     * 
     */
    public List<WeoTrvIntermediaryUser> getWeoTrvIntermediaryUser() {
        if (weoTrvIntermediaryUser == null) {
            weoTrvIntermediaryUser = new ArrayList<WeoTrvIntermediaryUser>();
        }
        return this.weoTrvIntermediaryUser;
    }

}
