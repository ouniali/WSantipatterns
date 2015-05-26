
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
 *         &lt;element name="WSI2_CreationEtiquetteResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_CreationEtiquette" minOccurs="0"/>
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
    "wsi2CreationEtiquetteResult"
})
@XmlRootElement(name = "WSI2_CreationEtiquetteResponse")
public class WSI2CreationEtiquetteResponse {

    @XmlElement(name = "WSI2_CreationEtiquetteResult")
    protected RetWSI2CreationEtiquette wsi2CreationEtiquetteResult;

    /**
     * Gets the value of the wsi2CreationEtiquetteResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2CreationEtiquette }
     *     
     */
    public RetWSI2CreationEtiquette getWSI2CreationEtiquetteResult() {
        return wsi2CreationEtiquetteResult;
    }

    /**
     * Sets the value of the wsi2CreationEtiquetteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2CreationEtiquette }
     *     
     */
    public void setWSI2CreationEtiquetteResult(RetWSI2CreationEtiquette value) {
        this.wsi2CreationEtiquetteResult = value;
    }

}
