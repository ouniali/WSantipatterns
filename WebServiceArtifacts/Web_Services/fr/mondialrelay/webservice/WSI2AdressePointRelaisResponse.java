
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
 *         &lt;element name="WSI2_AdressePointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_AdressePointRelais" minOccurs="0"/>
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
    "wsi2AdressePointRelaisResult"
})
@XmlRootElement(name = "WSI2_AdressePointRelaisResponse")
public class WSI2AdressePointRelaisResponse {

    @XmlElement(name = "WSI2_AdressePointRelaisResult")
    protected RetWSI2AdressePointRelais wsi2AdressePointRelaisResult;

    /**
     * Gets the value of the wsi2AdressePointRelaisResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2AdressePointRelais }
     *     
     */
    public RetWSI2AdressePointRelais getWSI2AdressePointRelaisResult() {
        return wsi2AdressePointRelaisResult;
    }

    /**
     * Sets the value of the wsi2AdressePointRelaisResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2AdressePointRelais }
     *     
     */
    public void setWSI2AdressePointRelaisResult(RetWSI2AdressePointRelais value) {
        this.wsi2AdressePointRelaisResult = value;
    }

}
