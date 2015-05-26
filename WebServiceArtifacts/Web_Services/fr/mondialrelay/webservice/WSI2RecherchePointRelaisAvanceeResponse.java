
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
 *         &lt;element name="WSI2_RecherchePointRelaisAvanceeResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RecherchePointRelaisAvancee" minOccurs="0"/>
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
    "wsi2RecherchePointRelaisAvanceeResult"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisAvanceeResponse")
public class WSI2RecherchePointRelaisAvanceeResponse {

    @XmlElement(name = "WSI2_RecherchePointRelaisAvanceeResult")
    protected RetWSI2RecherchePointRelaisAvancee wsi2RecherchePointRelaisAvanceeResult;

    /**
     * Gets the value of the wsi2RecherchePointRelaisAvanceeResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RecherchePointRelaisAvancee }
     *     
     */
    public RetWSI2RecherchePointRelaisAvancee getWSI2RecherchePointRelaisAvanceeResult() {
        return wsi2RecherchePointRelaisAvanceeResult;
    }

    /**
     * Sets the value of the wsi2RecherchePointRelaisAvanceeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RecherchePointRelaisAvancee }
     *     
     */
    public void setWSI2RecherchePointRelaisAvanceeResult(RetWSI2RecherchePointRelaisAvancee value) {
        this.wsi2RecherchePointRelaisAvanceeResult = value;
    }

}
