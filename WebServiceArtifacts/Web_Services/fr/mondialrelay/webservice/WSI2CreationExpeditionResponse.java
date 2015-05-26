
package fr.mondialrelay.webservice;

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
 *         &lt;element name="WSI2_CreationExpeditionResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_CreationExpedition" minOccurs="0"/>
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
    "wsi2CreationExpeditionResult"
})
@XmlRootElement(name = "WSI2_CreationExpeditionResponse")
public class WSI2CreationExpeditionResponse {

    @XmlElement(name = "WSI2_CreationExpeditionResult")
    protected RetWSI2CreationExpedition wsi2CreationExpeditionResult;

    /**
     * Gets the value of the wsi2CreationExpeditionResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2CreationExpedition }
     *     
     */
    public RetWSI2CreationExpedition getWSI2CreationExpeditionResult() {
        return wsi2CreationExpeditionResult;
    }

    /**
     * Sets the value of the wsi2CreationExpeditionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2CreationExpedition }
     *     
     */
    public void setWSI2CreationExpeditionResult(RetWSI2CreationExpedition value) {
        this.wsi2CreationExpeditionResult = value;
    }

}
