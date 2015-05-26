
package uk.co.hha.apps.mis;

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
 *         &lt;element name="GetAreasExternalPortsResult" type="{http://apps.hha.co.uk/mis}AreaLines" minOccurs="0"/>
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
    "getAreasExternalPortsResult"
})
@XmlRootElement(name = "GetAreasExternalPortsResponse")
public class GetAreasExternalPortsResponse {

    @XmlElement(name = "GetAreasExternalPortsResult")
    protected AreaLines getAreasExternalPortsResult;

    /**
     * Gets the value of the getAreasExternalPortsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLines }
     *     
     */
    public AreaLines getGetAreasExternalPortsResult() {
        return getAreasExternalPortsResult;
    }

    /**
     * Sets the value of the getAreasExternalPortsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLines }
     *     
     */
    public void setGetAreasExternalPortsResult(AreaLines value) {
        this.getAreasExternalPortsResult = value;
    }

}
