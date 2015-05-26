
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetEarningAnnouncementsResult" type="{http://www.xignite.com/services/}ArrayOfEarningAnnouncement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEarningAnnouncementsResult"
})
@XmlRootElement(name = "GetEarningAnnouncementsResponse")
public class GetEarningAnnouncementsResponse {

    @XmlElement(name = "GetEarningAnnouncementsResult")
    protected ArrayOfEarningAnnouncement getEarningAnnouncementsResult;

    /**
     * Gets the value of the getEarningAnnouncementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEarningAnnouncement }
     *     
     */
    public ArrayOfEarningAnnouncement getGetEarningAnnouncementsResult() {
        return getEarningAnnouncementsResult;
    }

    /**
     * Sets the value of the getEarningAnnouncementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEarningAnnouncement }
     *     
     */
    public void setGetEarningAnnouncementsResult(ArrayOfEarningAnnouncement value) {
        this.getEarningAnnouncementsResult = value;
    }

}
