
package au.gov.superfundlookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingFundName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingFundName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABN" type="{http://superfundlookup.gov.au}FundNameAbn" minOccurs="0"/>
 *         &lt;element name="FundName" type="{http://superfundlookup.gov.au}FundName" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://superfundlookup.gov.au}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingFundName", propOrder = {
    "abn",
    "fundName",
    "location"
})
public class MatchingFundName {

    @XmlElement(name = "ABN")
    protected FundNameAbn abn;
    @XmlElement(name = "FundName")
    protected FundName fundName;
    @XmlElement(name = "Location")
    protected Location location;

    /**
     * Gets the value of the abn property.
     * 
     * @return
     *     possible object is
     *     {@link FundNameAbn }
     *     
     */
    public FundNameAbn getABN() {
        return abn;
    }

    /**
     * Sets the value of the abn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundNameAbn }
     *     
     */
    public void setABN(FundNameAbn value) {
        this.abn = value;
    }

    /**
     * Gets the value of the fundName property.
     * 
     * @return
     *     possible object is
     *     {@link FundName }
     *     
     */
    public FundName getFundName() {
        return fundName;
    }

    /**
     * Sets the value of the fundName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundName }
     *     
     */
    public void setFundName(FundName value) {
        this.fundName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
