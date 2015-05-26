
package otswebws.websvcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import otswebws.datatype.SubscriberInfo;


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
 *         &lt;element name="getSubscriberInfoReturn" type="{http://datatype.otswebws}SubscriberInfo"/>
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
    "getSubscriberInfoReturn"
})
@XmlRootElement(name = "getSubscriberInfoResponse")
public class GetSubscriberInfoResponse {

    @XmlElement(required = true, nillable = true)
    protected SubscriberInfo getSubscriberInfoReturn;

    /**
     * Gets the value of the getSubscriberInfoReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfo }
     *     
     */
    public SubscriberInfo getGetSubscriberInfoReturn() {
        return getSubscriberInfoReturn;
    }

    /**
     * Sets the value of the getSubscriberInfoReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfo }
     *     
     */
    public void setGetSubscriberInfoReturn(SubscriberInfo value) {
        this.getSubscriberInfoReturn = value;
    }

}
