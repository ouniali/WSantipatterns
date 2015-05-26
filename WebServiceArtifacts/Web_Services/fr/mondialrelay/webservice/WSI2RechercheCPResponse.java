
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
 *         &lt;element name="WSI2_RechercheCPResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RechercheCP" minOccurs="0"/>
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
    "wsi2RechercheCPResult"
})
@XmlRootElement(name = "WSI2_RechercheCPResponse")
public class WSI2RechercheCPResponse {

    @XmlElement(name = "WSI2_RechercheCPResult")
    protected RetWSI2RechercheCP wsi2RechercheCPResult;

    /**
     * Gets the value of the wsi2RechercheCPResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RechercheCP }
     *     
     */
    public RetWSI2RechercheCP getWSI2RechercheCPResult() {
        return wsi2RechercheCPResult;
    }

    /**
     * Sets the value of the wsi2RechercheCPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RechercheCP }
     *     
     */
    public void setWSI2RechercheCPResult(RetWSI2RechercheCP value) {
        this.wsi2RechercheCPResult = value;
    }

}
