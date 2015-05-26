
package com.bajajallianz.bjaztravelws_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTygeErrorMessageUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTygeErrorMessageUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeoTygeErrorMessageUser" type="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTygeErrorMessageUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTygeErrorMessageUserArray", propOrder = {
    "weoTygeErrorMessageUser"
})
public class WeoTygeErrorMessageUserArray {

    @XmlElement(name = "WeoTygeErrorMessageUser", nillable = true)
    protected List<WeoTygeErrorMessageUser> weoTygeErrorMessageUser;

    /**
     * Gets the value of the weoTygeErrorMessageUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weoTygeErrorMessageUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeoTygeErrorMessageUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeoTygeErrorMessageUser }
     * 
     * 
     */
    public List<WeoTygeErrorMessageUser> getWeoTygeErrorMessageUser() {
        if (weoTygeErrorMessageUser == null) {
            weoTygeErrorMessageUser = new ArrayList<WeoTygeErrorMessageUser>();
        }
        return this.weoTygeErrorMessageUser;
    }

}
