
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *               This section holds the data required to make a booking for Quickpack using UPS as Transport Service Provider.
 *           
 * 
 * <p>Java class for UpsSpecificEdiParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpsSpecificEdiParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpsServiceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsRoutingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsRoutingCodeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsServiceIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Leg1CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Leg1TransportServiceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateProvinceCounty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BringStreamIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsServiceIcon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsClassOfService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsBillingOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsDocumentationIndicator1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsDocumentationIndicator2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpsSignatureRequiredString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpsSpecificEdiParametersType", propOrder = {
    "upsServiceTitle",
    "upsRoutingCode",
    "upsRoutingCodeVersion",
    "upsAccountNumber",
    "upsServiceIndicator",
    "leg1CustomerNumber",
    "leg1TransportServiceProvider",
    "stateProvinceCounty",
    "bringStreamIndicator",
    "upsServiceIcon",
    "upsClassOfService",
    "upsBillingOption",
    "upsDocumentationIndicator1",
    "upsDocumentationIndicator2",
    "upsSignatureRequiredString"
})
public class UpsSpecificEdiParametersType {

    @XmlElement(name = "UpsServiceTitle", required = true)
    protected String upsServiceTitle;
    @XmlElement(name = "UpsRoutingCode", required = true)
    protected String upsRoutingCode;
    @XmlElement(name = "UpsRoutingCodeVersion", required = true)
    protected String upsRoutingCodeVersion;
    @XmlElement(name = "UpsAccountNumber", required = true)
    protected String upsAccountNumber;
    @XmlElement(name = "UpsServiceIndicator", required = true)
    protected String upsServiceIndicator;
    @XmlElement(name = "Leg1CustomerNumber", required = true)
    protected String leg1CustomerNumber;
    @XmlElement(name = "Leg1TransportServiceProvider", required = true)
    protected String leg1TransportServiceProvider;
    @XmlElement(name = "StateProvinceCounty", required = true)
    protected String stateProvinceCounty;
    @XmlElement(name = "BringStreamIndicator", required = true)
    protected String bringStreamIndicator;
    @XmlElement(name = "UpsServiceIcon", required = true)
    protected String upsServiceIcon;
    @XmlElement(name = "UpsClassOfService", required = true)
    protected String upsClassOfService;
    @XmlElement(name = "UpsBillingOption", required = true)
    protected String upsBillingOption;
    @XmlElement(name = "UpsDocumentationIndicator1", required = true)
    protected String upsDocumentationIndicator1;
    @XmlElement(name = "UpsDocumentationIndicator2", required = true)
    protected String upsDocumentationIndicator2;
    @XmlElement(name = "UpsSignatureRequiredString", required = true)
    protected String upsSignatureRequiredString;

    /**
     * Gets the value of the upsServiceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsServiceTitle() {
        return upsServiceTitle;
    }

    /**
     * Sets the value of the upsServiceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsServiceTitle(String value) {
        this.upsServiceTitle = value;
    }

    /**
     * Gets the value of the upsRoutingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsRoutingCode() {
        return upsRoutingCode;
    }

    /**
     * Sets the value of the upsRoutingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsRoutingCode(String value) {
        this.upsRoutingCode = value;
    }

    /**
     * Gets the value of the upsRoutingCodeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsRoutingCodeVersion() {
        return upsRoutingCodeVersion;
    }

    /**
     * Sets the value of the upsRoutingCodeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsRoutingCodeVersion(String value) {
        this.upsRoutingCodeVersion = value;
    }

    /**
     * Gets the value of the upsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsAccountNumber() {
        return upsAccountNumber;
    }

    /**
     * Sets the value of the upsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsAccountNumber(String value) {
        this.upsAccountNumber = value;
    }

    /**
     * Gets the value of the upsServiceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsServiceIndicator() {
        return upsServiceIndicator;
    }

    /**
     * Sets the value of the upsServiceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsServiceIndicator(String value) {
        this.upsServiceIndicator = value;
    }

    /**
     * Gets the value of the leg1CustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeg1CustomerNumber() {
        return leg1CustomerNumber;
    }

    /**
     * Sets the value of the leg1CustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeg1CustomerNumber(String value) {
        this.leg1CustomerNumber = value;
    }

    /**
     * Gets the value of the leg1TransportServiceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeg1TransportServiceProvider() {
        return leg1TransportServiceProvider;
    }

    /**
     * Sets the value of the leg1TransportServiceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeg1TransportServiceProvider(String value) {
        this.leg1TransportServiceProvider = value;
    }

    /**
     * Gets the value of the stateProvinceCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceCounty() {
        return stateProvinceCounty;
    }

    /**
     * Sets the value of the stateProvinceCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceCounty(String value) {
        this.stateProvinceCounty = value;
    }

    /**
     * Gets the value of the bringStreamIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBringStreamIndicator() {
        return bringStreamIndicator;
    }

    /**
     * Sets the value of the bringStreamIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBringStreamIndicator(String value) {
        this.bringStreamIndicator = value;
    }

    /**
     * Gets the value of the upsServiceIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsServiceIcon() {
        return upsServiceIcon;
    }

    /**
     * Sets the value of the upsServiceIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsServiceIcon(String value) {
        this.upsServiceIcon = value;
    }

    /**
     * Gets the value of the upsClassOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsClassOfService() {
        return upsClassOfService;
    }

    /**
     * Sets the value of the upsClassOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsClassOfService(String value) {
        this.upsClassOfService = value;
    }

    /**
     * Gets the value of the upsBillingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsBillingOption() {
        return upsBillingOption;
    }

    /**
     * Sets the value of the upsBillingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsBillingOption(String value) {
        this.upsBillingOption = value;
    }

    /**
     * Gets the value of the upsDocumentationIndicator1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsDocumentationIndicator1() {
        return upsDocumentationIndicator1;
    }

    /**
     * Sets the value of the upsDocumentationIndicator1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsDocumentationIndicator1(String value) {
        this.upsDocumentationIndicator1 = value;
    }

    /**
     * Gets the value of the upsDocumentationIndicator2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsDocumentationIndicator2() {
        return upsDocumentationIndicator2;
    }

    /**
     * Sets the value of the upsDocumentationIndicator2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsDocumentationIndicator2(String value) {
        this.upsDocumentationIndicator2 = value;
    }

    /**
     * Gets the value of the upsSignatureRequiredString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsSignatureRequiredString() {
        return upsSignatureRequiredString;
    }

    /**
     * Sets the value of the upsSignatureRequiredString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsSignatureRequiredString(String value) {
        this.upsSignatureRequiredString = value;
    }

}
