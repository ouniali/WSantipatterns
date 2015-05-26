
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
 *         &lt;element name="WSI2_TracingColisDetailleResult" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_TracingColisDetaille" minOccurs="0"/>
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
    "wsi2TracingColisDetailleResult"
})
@XmlRootElement(name = "WSI2_TracingColisDetailleResponse")
public class WSI2TracingColisDetailleResponse {

    @XmlElement(name = "WSI2_TracingColisDetailleResult")
    protected RetWSI2TracingColisDetaille wsi2TracingColisDetailleResult;

    /**
     * Gets the value of the wsi2TracingColisDetailleResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2TracingColisDetaille }
     *     
     */
    public RetWSI2TracingColisDetaille getWSI2TracingColisDetailleResult() {
        return wsi2TracingColisDetailleResult;
    }

    /**
     * Sets the value of the wsi2TracingColisDetailleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2TracingColisDetaille }
     *     
     */
    public void setWSI2TracingColisDetailleResult(RetWSI2TracingColisDetaille value) {
        this.wsi2TracingColisDetailleResult = value;
    }

}
