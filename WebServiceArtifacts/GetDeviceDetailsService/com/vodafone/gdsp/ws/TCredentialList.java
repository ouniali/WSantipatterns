
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCredentialList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCredentialList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentialItem" type="{http://ws.gdsp.vodafone.com/}tCredentialItem" maxOccurs="50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCredentialList", propOrder = {
    "credentialItem"
})
public class TCredentialList {

    @XmlElement(nillable = true)
    protected List<TCredentialItem> credentialItem;

    /**
     * Gets the value of the credentialItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentialItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentialItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCredentialItem }
     * 
     * 
     */
    public List<TCredentialItem> getCredentialItem() {
        if (credentialItem == null) {
            credentialItem = new ArrayList<TCredentialItem>();
        }
        return this.credentialItem;
    }

}
