
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
 *         &lt;element name="GetAreasBerthsResult" type="{http://apps.hha.co.uk/mis}AreaLines" minOccurs="0"/>
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
    "getAreasBerthsResult"
})
@XmlRootElement(name = "GetAreasBerthsResponse")
public class GetAreasBerthsResponse {

    @XmlElement(name = "GetAreasBerthsResult")
    protected AreaLines getAreasBerthsResult;

    /**
     * Gets the value of the getAreasBerthsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLines }
     *     
     */
    public AreaLines getGetAreasBerthsResult() {
        return getAreasBerthsResult;
    }

    /**
     * Sets the value of the getAreasBerthsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLines }
     *     
     */
    public void setGetAreasBerthsResult(AreaLines value) {
        this.getAreasBerthsResult = value;
    }

}
