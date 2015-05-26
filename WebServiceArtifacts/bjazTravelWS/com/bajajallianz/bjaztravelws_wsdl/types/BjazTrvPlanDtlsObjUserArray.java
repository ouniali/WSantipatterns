
package com.bajajallianz.bjaztravelws_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazTrvPlanDtlsObjUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazTrvPlanDtlsObjUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BjazTrvPlanDtlsObjUser" type="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}BjazTrvPlanDtlsObjUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazTrvPlanDtlsObjUserArray", propOrder = {
    "bjazTrvPlanDtlsObjUser"
})
public class BjazTrvPlanDtlsObjUserArray {

    @XmlElement(name = "BjazTrvPlanDtlsObjUser", nillable = true)
    protected List<BjazTrvPlanDtlsObjUser> bjazTrvPlanDtlsObjUser;

    /**
     * Gets the value of the bjazTrvPlanDtlsObjUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bjazTrvPlanDtlsObjUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBjazTrvPlanDtlsObjUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BjazTrvPlanDtlsObjUser }
     * 
     * 
     */
    public List<BjazTrvPlanDtlsObjUser> getBjazTrvPlanDtlsObjUser() {
        if (bjazTrvPlanDtlsObjUser == null) {
            bjazTrvPlanDtlsObjUser = new ArrayList<BjazTrvPlanDtlsObjUser>();
        }
        return this.bjazTrvPlanDtlsObjUser;
    }

}
