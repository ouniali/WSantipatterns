
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
 *         &lt;element name="WSI2_STAT_LabelsResult" type="{http://www.mondialrelay.fr/webservice/}ArrayOfArrayOfString" minOccurs="0"/>
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
    "wsi2STATLabelsResult"
})
@XmlRootElement(name = "WSI2_STAT_LabelsResponse")
public class WSI2STATLabelsResponse {

    @XmlElement(name = "WSI2_STAT_LabelsResult")
    protected ArrayOfArrayOfString wsi2STATLabelsResult;

    /**
     * Gets the value of the wsi2STATLabelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public ArrayOfArrayOfString getWSI2STATLabelsResult() {
        return wsi2STATLabelsResult;
    }

    /**
     * Sets the value of the wsi2STATLabelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public void setWSI2STATLabelsResult(ArrayOfArrayOfString value) {
        this.wsi2STATLabelsResult = value;
    }

}
