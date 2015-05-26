
package ro.bvb;

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
 *         &lt;element name="GetCalendarEventsResult" type="{http://www.bvb.ro}ArrayOfCalendarEvent" minOccurs="0"/>
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
    "getCalendarEventsResult"
})
@XmlRootElement(name = "GetCalendarEventsResponse")
public class GetCalendarEventsResponse {

    @XmlElement(name = "GetCalendarEventsResult")
    protected ArrayOfCalendarEvent getCalendarEventsResult;

    /**
     * Gets the value of the getCalendarEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCalendarEvent }
     *     
     */
    public ArrayOfCalendarEvent getGetCalendarEventsResult() {
        return getCalendarEventsResult;
    }

    /**
     * Sets the value of the getCalendarEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCalendarEvent }
     *     
     */
    public void setGetCalendarEventsResult(ArrayOfCalendarEvent value) {
        this.getCalendarEventsResult = value;
    }

}
