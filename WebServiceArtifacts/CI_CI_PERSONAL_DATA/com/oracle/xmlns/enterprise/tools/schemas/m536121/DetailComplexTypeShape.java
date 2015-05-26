
package com.oracle.xmlns.enterprise.tools.schemas.m536121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CI_PERSONAL_DATA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M536121.V1}CI_PERSONAL_DATAComplexTypeShape"/>
 *         &lt;element name="messages" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M536121.V1}messagesComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailComplexTypeShape", propOrder = {
    "cipersonaldata",
    "messages"
})
public class DetailComplexTypeShape {

    @XmlElement(name = "CI_PERSONAL_DATA", required = true)
    protected CIPERSONALDATAComplexTypeShape cipersonaldata;
    protected List<MessagesComplexTypeShape> messages;

    /**
     * Gets the value of the cipersonaldata property.
     * 
     * @return
     *     possible object is
     *     {@link CIPERSONALDATAComplexTypeShape }
     *     
     */
    public CIPERSONALDATAComplexTypeShape getCIPERSONALDATA() {
        return cipersonaldata;
    }

    /**
     * Sets the value of the cipersonaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIPERSONALDATAComplexTypeShape }
     *     
     */
    public void setCIPERSONALDATA(CIPERSONALDATAComplexTypeShape value) {
        this.cipersonaldata = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagesComplexTypeShape }
     * 
     * 
     */
    public List<MessagesComplexTypeShape> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessagesComplexTypeShape>();
        }
        return this.messages;
    }

}
