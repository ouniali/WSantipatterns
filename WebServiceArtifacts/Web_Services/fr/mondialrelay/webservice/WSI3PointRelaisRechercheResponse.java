
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
 *         &lt;element name="WSI3_PointRelais_RechercheResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI3_PointRelais_Recherche" minOccurs="0"/>
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
    "wsi3PointRelaisRechercheResult"
})
@XmlRootElement(name = "WSI3_PointRelais_RechercheResponse")
public class WSI3PointRelaisRechercheResponse {

    @XmlElement(name = "WSI3_PointRelais_RechercheResult")
    protected RetWSI3PointRelaisRecherche wsi3PointRelaisRechercheResult;

    /**
     * Gets the value of the wsi3PointRelaisRechercheResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI3PointRelaisRecherche }
     *     
     */
    public RetWSI3PointRelaisRecherche getWSI3PointRelaisRechercheResult() {
        return wsi3PointRelaisRechercheResult;
    }

    /**
     * Sets the value of the wsi3PointRelaisRechercheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI3PointRelaisRecherche }
     *     
     */
    public void setWSI3PointRelaisRechercheResult(RetWSI3PointRelaisRecherche value) {
        this.wsi3PointRelaisRechercheResult = value;
    }

}
