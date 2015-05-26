
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSmsCommunicationOverviewResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSmsCommunicationOverviewResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="smsCommunicationList" type="{http://ws.gdsp.vodafone.com/}SmsCommunication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="smsCommunicationListLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="smsCommunicationTableLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSmsCommunicationOverviewResponseItem", propOrder = {
    "returnCode",
    "smsCommunicationList",
    "smsCommunicationListLength",
    "smsCommunicationTableLength"
})
public class GetSmsCommunicationOverviewResponseItem {

    protected ReturnCode returnCode;
    @XmlElement(nillable = true)
    protected List<SmsCommunication> smsCommunicationList;
    protected Integer smsCommunicationListLength;
    protected Long smsCommunicationTableLength;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the smsCommunicationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsCommunicationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsCommunicationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsCommunication }
     * 
     * 
     */
    public List<SmsCommunication> getSmsCommunicationList() {
        if (smsCommunicationList == null) {
            smsCommunicationList = new ArrayList<SmsCommunication>();
        }
        return this.smsCommunicationList;
    }

    /**
     * Gets the value of the smsCommunicationListLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSmsCommunicationListLength() {
        return smsCommunicationListLength;
    }

    /**
     * Sets the value of the smsCommunicationListLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSmsCommunicationListLength(Integer value) {
        this.smsCommunicationListLength = value;
    }

    /**
     * Gets the value of the smsCommunicationTableLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSmsCommunicationTableLength() {
        return smsCommunicationTableLength;
    }

    /**
     * Sets the value of the smsCommunicationTableLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSmsCommunicationTableLength(Long value) {
        this.smsCommunicationTableLength = value;
    }

}
