
package au.gov.superfundlookup;

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
 *         &lt;element name="SuperFundPayload" type="{http://superfundlookup.gov.au}FundPayload"/>
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
    "superFundPayload"
})
@XmlRootElement(name = "SearchByABNResponse")
public class SearchByABNResponse {

    @XmlElement(name = "SuperFundPayload", required = true, nillable = true)
    protected FundPayload superFundPayload;

    /**
     * Gets the value of the superFundPayload property.
     * 
     * @return
     *     possible object is
     *     {@link FundPayload }
     *     
     */
    public FundPayload getSuperFundPayload() {
        return superFundPayload;
    }

    /**
     * Sets the value of the superFundPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPayload }
     *     
     */
    public void setSuperFundPayload(FundPayload value) {
        this.superFundPayload = value;
    }

}
