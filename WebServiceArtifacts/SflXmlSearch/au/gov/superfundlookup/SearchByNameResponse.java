
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
 *         &lt;element name="SuperFundNamesPayload" type="{http://superfundlookup.gov.au}FundNamesPayload"/>
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
    "superFundNamesPayload"
})
@XmlRootElement(name = "SearchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(name = "SuperFundNamesPayload", required = true, nillable = true)
    protected FundNamesPayload superFundNamesPayload;

    /**
     * Gets the value of the superFundNamesPayload property.
     * 
     * @return
     *     possible object is
     *     {@link FundNamesPayload }
     *     
     */
    public FundNamesPayload getSuperFundNamesPayload() {
        return superFundNamesPayload;
    }

    /**
     * Sets the value of the superFundNamesPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundNamesPayload }
     *     
     */
    public void setSuperFundNamesPayload(FundNamesPayload value) {
        this.superFundNamesPayload = value;
    }

}
