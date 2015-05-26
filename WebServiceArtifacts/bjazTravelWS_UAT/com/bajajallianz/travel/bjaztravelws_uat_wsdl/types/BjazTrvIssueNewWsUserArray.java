
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazTrvIssueNewWsUserArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazTrvIssueNewWsUserArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BjazTrvIssueNewWsUser" type="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}BjazTrvIssueNewWsUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazTrvIssueNewWsUserArray", propOrder = {
    "bjazTrvIssueNewWsUser"
})
public class BjazTrvIssueNewWsUserArray {

    @XmlElement(name = "BjazTrvIssueNewWsUser", nillable = true)
    protected List<BjazTrvIssueNewWsUser> bjazTrvIssueNewWsUser;

    /**
     * Gets the value of the bjazTrvIssueNewWsUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bjazTrvIssueNewWsUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBjazTrvIssueNewWsUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BjazTrvIssueNewWsUser }
     * 
     * 
     */
    public List<BjazTrvIssueNewWsUser> getBjazTrvIssueNewWsUser() {
        if (bjazTrvIssueNewWsUser == null) {
            bjazTrvIssueNewWsUser = new ArrayList<BjazTrvIssueNewWsUser>();
        }
        return this.bjazTrvIssueNewWsUser;
    }

}
