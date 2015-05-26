
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazWsPolicyReportObjUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazWsPolicyReportObjUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BjazWsPolicyReportObjUser" type="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}BjazWsPolicyReportObjUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazWsPolicyReportObjUserArray", propOrder = {
    "bjazWsPolicyReportObjUser"
})
public class BjazWsPolicyReportObjUserArray {

    @XmlElement(name = "BjazWsPolicyReportObjUser", nillable = true)
    protected List<BjazWsPolicyReportObjUser> bjazWsPolicyReportObjUser;

    /**
     * Gets the value of the bjazWsPolicyReportObjUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bjazWsPolicyReportObjUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBjazWsPolicyReportObjUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BjazWsPolicyReportObjUser }
     * 
     * 
     */
    public List<BjazWsPolicyReportObjUser> getBjazWsPolicyReportObjUser() {
        if (bjazWsPolicyReportObjUser == null) {
            bjazWsPolicyReportObjUser = new ArrayList<BjazWsPolicyReportObjUser>();
        }
        return this.bjazWsPolicyReportObjUser;
    }

}
