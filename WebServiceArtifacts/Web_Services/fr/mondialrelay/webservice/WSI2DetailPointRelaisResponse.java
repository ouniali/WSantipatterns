
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
 *         &lt;element name="WSI2_DetailPointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_DetailPointRelais" minOccurs="0"/>
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
    "wsi2DetailPointRelaisResult"
})
@XmlRootElement(name = "WSI2_DetailPointRelaisResponse")
public class WSI2DetailPointRelaisResponse {

    @XmlElement(name = "WSI2_DetailPointRelaisResult")
    protected RetWSI2DetailPointRelais wsi2DetailPointRelaisResult;

    /**
     * Gets the value of the wsi2DetailPointRelaisResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2DetailPointRelais }
     *     
     */
    public RetWSI2DetailPointRelais getWSI2DetailPointRelaisResult() {
        return wsi2DetailPointRelaisResult;
    }

    /**
     * Sets the value of the wsi2DetailPointRelaisResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2DetailPointRelais }
     *     
     */
    public void setWSI2DetailPointRelaisResult(RetWSI2DetailPointRelais value) {
        this.wsi2DetailPointRelaisResult = value;
    }

}
