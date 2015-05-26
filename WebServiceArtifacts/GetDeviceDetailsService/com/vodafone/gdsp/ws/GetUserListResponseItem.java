
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserListResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserListResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="matchedResults" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userList" type="{http://ws.gdsp.vodafone.com/}tUserList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserListResponseItem", propOrder = {
    "returnCode",
    "matchedResults",
    "userList"
})
public class GetUserListResponseItem {

    protected ReturnCode returnCode;
    protected Long matchedResults;
    protected TUserList userList;

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
     * Gets the value of the matchedResults property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedResults() {
        return matchedResults;
    }

    /**
     * Sets the value of the matchedResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedResults(Long value) {
        this.matchedResults = value;
    }

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link TUserList }
     *     
     */
    public TUserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserList }
     *     
     */
    public void setUserList(TUserList value) {
        this.userList = value;
    }

}
