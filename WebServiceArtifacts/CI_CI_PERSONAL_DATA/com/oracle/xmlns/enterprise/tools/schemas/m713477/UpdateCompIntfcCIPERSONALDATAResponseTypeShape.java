
package com.oracle.xmlns.enterprise.tools.schemas.m713477;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Update__CompIntfc__CI_PERSONAL_DATAResponseTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Update__CompIntfc__CI_PERSONAL_DATAResponseTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notification" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}notificationTypeShape"/>
 *         &lt;element name="detail" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1}detailComplexTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Update__CompIntfc__CI_PERSONAL_DATAResponseTypeShape", propOrder = {
    "notification",
    "detail"
})
public class UpdateCompIntfcCIPERSONALDATAResponseTypeShape {

    @XmlElement(required = true)
    protected NotificationTypeShape notification;
    protected DetailComplexTypeShape detail;

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTypeShape }
     *     
     */
    public NotificationTypeShape getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTypeShape }
     *     
     */
    public void setNotification(NotificationTypeShape value) {
        this.notification = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link DetailComplexTypeShape }
     *     
     */
    public DetailComplexTypeShape getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailComplexTypeShape }
     *     
     */
    public void setDetail(DetailComplexTypeShape value) {
        this.detail = value;
    }

}
