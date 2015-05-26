
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
 *         &lt;element name="findAddressByPlanCadIdReturn" type="{http://data.address.lands.nsw.gov}LotAddressResult"/>
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
    "findAddressByPlanCadIdReturn"
})
@XmlRootElement(name = "findAddressByPlanCadIdResponse")
public class FindAddressByPlanCadIdResponse {

    @XmlElement(required = true, nillable = true)
    protected LotAddressResult findAddressByPlanCadIdReturn;

    /**
     * Gets the value of the findAddressByPlanCadIdReturn property.
     * 
     * @return
     *     possible object is
     *     {@link LotAddressResult }
     *     
     */
    public LotAddressResult getFindAddressByPlanCadIdReturn() {
        return findAddressByPlanCadIdReturn;
    }

    /**
     * Sets the value of the findAddressByPlanCadIdReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotAddressResult }
     *     
     */
    public void setFindAddressByPlanCadIdReturn(LotAddressResult value) {
        this.findAddressByPlanCadIdReturn = value;
    }

}
