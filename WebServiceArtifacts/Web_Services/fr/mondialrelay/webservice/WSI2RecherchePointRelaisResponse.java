
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
 *         &lt;element name="WSI2_RecherchePointRelaisResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RecherchePointRelais" minOccurs="0"/>
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
    "wsi2RecherchePointRelaisResult"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisResponse")
public class WSI2RecherchePointRelaisResponse {

    @XmlElement(name = "WSI2_RecherchePointRelaisResult")
    protected RetWSI2RecherchePointRelais wsi2RecherchePointRelaisResult;

    /**
     * Gets the value of the wsi2RecherchePointRelaisResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RecherchePointRelais }
     *     
     */
    public RetWSI2RecherchePointRelais getWSI2RecherchePointRelaisResult() {
        return wsi2RecherchePointRelaisResult;
    }

    /**
     * Sets the value of the wsi2RecherchePointRelaisResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RecherchePointRelais }
     *     
     */
    public void setWSI2RecherchePointRelaisResult(RetWSI2RecherchePointRelais value) {
        this.wsi2RecherchePointRelaisResult = value;
    }

}
