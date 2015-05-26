
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAlertTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAlertTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertType" type="{http://ws.gdsp.vodafone.com/}tAlertTypeOptions" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAlertTypeList", propOrder = {
    "alertType"
})
public class TAlertTypeList {

    @XmlSchemaType(name = "string")
    protected List<TAlertTypeOptions> alertType;

    /**
     * Gets the value of the alertType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAlertTypeOptions }
     * 
     * 
     */
    public List<TAlertTypeOptions> getAlertType() {
        if (alertType == null) {
            alertType = new ArrayList<TAlertTypeOptions>();
        }
        return this.alertType;
    }

}
