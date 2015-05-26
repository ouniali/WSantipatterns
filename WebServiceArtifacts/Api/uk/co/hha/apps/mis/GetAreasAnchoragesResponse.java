
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
 *         &lt;element name="GetAreasAnchoragesResult" type="{http://apps.hha.co.uk/mis}AreaLines" minOccurs="0"/>
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
    "getAreasAnchoragesResult"
})
@XmlRootElement(name = "GetAreasAnchoragesResponse")
public class GetAreasAnchoragesResponse {

    @XmlElement(name = "GetAreasAnchoragesResult")
    protected AreaLines getAreasAnchoragesResult;

    /**
     * Gets the value of the getAreasAnchoragesResult property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLines }
     *     
     */
    public AreaLines getGetAreasAnchoragesResult() {
        return getAreasAnchoragesResult;
    }

    /**
     * Sets the value of the getAreasAnchoragesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLines }
     *     
     */
    public void setGetAreasAnchoragesResult(AreaLines value) {
        this.getAreasAnchoragesResult = value;
    }

}
