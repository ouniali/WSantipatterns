
package gov.nsw.lands.address.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nsw.lands.address.data.LotAddressResult;


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
 *         &lt;element name="findAddressByPlanReturn" type="{http://data.address.lands.nsw.gov}LotAddressResult"/>
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
    "findAddressByPlanReturn"
})
@XmlRootElement(name = "findAddressByPlanResponse")
public class FindAddressByPlanResponse {

    @XmlElement(required = true, nillable = true)
    protected LotAddressResult findAddressByPlanReturn;

    /**
     * Gets the value of the findAddressByPlanReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LotAddressResult }
     *     
     */
    public LotAddressResult getFindAddressByPlanReturn() {
        return findAddressByPlanReturn;
    }

    /**
     * Sets the value of the findAddressByPlanReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotAddressResult }
     *     
     */
    public void setFindAddressByPlanReturn(LotAddressResult value) {
        this.findAddressByPlanReturn = value;
    }

}
