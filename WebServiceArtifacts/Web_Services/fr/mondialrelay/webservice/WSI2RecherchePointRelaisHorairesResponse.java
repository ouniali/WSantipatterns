
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
 *         &lt;element name="WSI2_RecherchePointRelaisHorairesResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_RecherchePointRelaisHoraires" minOccurs="0"/>
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
    "wsi2RecherchePointRelaisHorairesResult"
})
@XmlRootElement(name = "WSI2_RecherchePointRelaisHorairesResponse")
public class WSI2RecherchePointRelaisHorairesResponse {

    @XmlElement(name = "WSI2_RecherchePointRelaisHorairesResult")
    protected RetWSI2RecherchePointRelaisHoraires wsi2RecherchePointRelaisHorairesResult;

    /**
     * Gets the value of the wsi2RecherchePointRelaisHorairesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2RecherchePointRelaisHoraires }
     *     
     */
    public RetWSI2RecherchePointRelaisHoraires getWSI2RecherchePointRelaisHorairesResult() {
        return wsi2RecherchePointRelaisHorairesResult;
    }

    /**
     * Sets the value of the wsi2RecherchePointRelaisHorairesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2RecherchePointRelaisHoraires }
     *     
     */
    public void setWSI2RecherchePointRelaisHorairesResult(RetWSI2RecherchePointRelaisHoraires value) {
        this.wsi2RecherchePointRelaisHorairesResult = value;
    }

}
