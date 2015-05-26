
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductCodeInProductionSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuiInformation" type="{http://www.bring.no/logistics/shippingguide/1.0}GuiInformationType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.bring.no/logistics/shippingguide/1.0}PriceType" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://www.bring.no/logistics/shippingguide/1.0}PriceType" minOccurs="0"/>
 *         &lt;element name="ExpectedDelivery" type="{http://www.bring.no/logistics/shippingguide/1.0}ExpectedDeliveryType" minOccurs="0"/>
 *         &lt;element name="EnvironmentalInfo" type="{http://www.bring.no/logistics/shippingguide/1.0}EnvironmentalInfoType" minOccurs="0"/>
 *         &lt;element name="CourierSpecificEdiParameters" type="{http://www.bring.no/logistics/shippingguide/1.0}CourierSpecificEdiParametersType" minOccurs="0"/>
 *         &lt;element name="QuickpackSpecificEdiParameters" type="{http://www.bring.no/logistics/shippingguide/1.0}QuickpackSpecificEdiParametersType" minOccurs="0"/>
 *         &lt;element name="CargoSpecificEdiParameters" type="{http://www.bring.no/logistics/shippingguide/1.0}CargoSpecificEdiParametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOutputType", propOrder = {
    "productId",
    "productCodeInProductionSystem",
    "guiInformation",
    "price",
    "netPrice",
    "expectedDelivery",
    "environmentalInfo",
    "courierSpecificEdiParameters",
    "quickpackSpecificEdiParameters",
    "cargoSpecificEdiParameters"
})
public class ProductOutputType {

    @XmlElement(name = "ProductId", required = true)
    protected String productId;
    @XmlElement(name = "ProductCodeInProductionSystem")
    protected String productCodeInProductionSystem;
    @XmlElement(name = "GuiInformation")
    protected GuiInformationType guiInformation;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "NetPrice")
    protected PriceType netPrice;
    @XmlElement(name = "ExpectedDelivery")
    protected ExpectedDeliveryType expectedDelivery;
    @XmlElement(name = "EnvironmentalInfo")
    protected EnvironmentalInfoType environmentalInfo;
    @XmlElement(name = "CourierSpecificEdiParameters")
    protected CourierSpecificEdiParametersType courierSpecificEdiParameters;
    @XmlElement(name = "QuickpackSpecificEdiParameters")
    protected QuickpackSpecificEdiParametersType quickpackSpecificEdiParameters;
    @XmlElement(name = "CargoSpecificEdiParameters")
    protected CargoSpecificEdiParametersType cargoSpecificEdiParameters;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productCodeInProductionSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCodeInProductionSystem() {
        return productCodeInProductionSystem;
    }

    /**
     * Sets the value of the productCodeInProductionSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCodeInProductionSystem(String value) {
        this.productCodeInProductionSystem = value;
    }

    /**
     * Gets the value of the guiInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GuiInformationType }
     *     
     */
    public GuiInformationType getGuiInformation() {
        return guiInformation;
    }

    /**
     * Sets the value of the guiInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiInformationType }
     *     
     */
    public void setGuiInformation(GuiInformationType value) {
        this.guiInformation = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setNetPrice(PriceType value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the expectedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedDeliveryType }
     *     
     */
    public ExpectedDeliveryType getExpectedDelivery() {
        return expectedDelivery;
    }

    /**
     * Sets the value of the expectedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedDeliveryType }
     *     
     */
    public void setExpectedDelivery(ExpectedDeliveryType value) {
        this.expectedDelivery = value;
    }

    /**
     * Gets the value of the environmentalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalInfoType }
     *     
     */
    public EnvironmentalInfoType getEnvironmentalInfo() {
        return environmentalInfo;
    }

    /**
     * Sets the value of the environmentalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalInfoType }
     *     
     */
    public void setEnvironmentalInfo(EnvironmentalInfoType value) {
        this.environmentalInfo = value;
    }

    /**
     * Gets the value of the courierSpecificEdiParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CourierSpecificEdiParametersType }
     *     
     */
    public CourierSpecificEdiParametersType getCourierSpecificEdiParameters() {
        return courierSpecificEdiParameters;
    }

    /**
     * Sets the value of the courierSpecificEdiParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourierSpecificEdiParametersType }
     *     
     */
    public void setCourierSpecificEdiParameters(CourierSpecificEdiParametersType value) {
        this.courierSpecificEdiParameters = value;
    }

    /**
     * Gets the value of the quickpackSpecificEdiParameters property.
     * 
     * @return
     *     possible object is
     *     {@link QuickpackSpecificEdiParametersType }
     *     
     */
    public QuickpackSpecificEdiParametersType getQuickpackSpecificEdiParameters() {
        return quickpackSpecificEdiParameters;
    }

    /**
     * Sets the value of the quickpackSpecificEdiParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickpackSpecificEdiParametersType }
     *     
     */
    public void setQuickpackSpecificEdiParameters(QuickpackSpecificEdiParametersType value) {
        this.quickpackSpecificEdiParameters = value;
    }

    /**
     * Gets the value of the cargoSpecificEdiParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CargoSpecificEdiParametersType }
     *     
     */
    public CargoSpecificEdiParametersType getCargoSpecificEdiParameters() {
        return cargoSpecificEdiParameters;
    }

    /**
     * Sets the value of the cargoSpecificEdiParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoSpecificEdiParametersType }
     *     
     */
    public void setCargoSpecificEdiParameters(CargoSpecificEdiParametersType value) {
        this.cargoSpecificEdiParameters = value;
    }

}
