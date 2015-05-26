
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
 *         &lt;element name="WSI2_STAT_LabelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wsi2STATLabelResult"
})
@XmlRootElement(name = "WSI2_STAT_LabelResponse")
public class WSI2STATLabelResponse {

    @XmlElement(name = "WSI2_STAT_LabelResult")
    protected String wsi2STATLabelResult;

    /**
     * Gets the value of the wsi2STATLabelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSI2STATLabelResult() {
        return wsi2STATLabelResult;
    }

    /**
     * Sets the value of the wsi2STATLabelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSI2STATLabelResult(String value) {
        this.wsi2STATLabelResult = value;
    }

}
