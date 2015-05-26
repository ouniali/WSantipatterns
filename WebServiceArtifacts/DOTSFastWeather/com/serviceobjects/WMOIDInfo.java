
package com.serviceobjects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WMOIDInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WMOIDInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WMOIDItem" type="{http://www.serviceobjects.com/}WMOID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com/}Err" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WMOIDInfo", propOrder = {
    "wmoidItem",
    "error"
})
public class WMOIDInfo {

    @XmlElement(name = "WMOIDItem")
    protected List<WMOID> wmoidItem;
    @XmlElement(name = "Error")
    protected Err error;

    /**
     * Gets the value of the wmoidItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wmoidItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWMOIDItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WMOID }
     * 
     * 
     */
    public List<WMOID> getWMOIDItem() {
        if (wmoidItem == null) {
            wmoidItem = new ArrayList<WMOID>();
        }
        return this.wmoidItem;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Err }
     *     
     */
    public Err getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Err }
     *     
     */
    public void setError(Err value) {
        this.error = value;
    }

}
