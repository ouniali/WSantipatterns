
package travelpackage.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for Tax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureCityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PriceSaleCHD" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PercentComission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ComissionCHD" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PriceSaleSGL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="ComissionSGL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PriceSaleDBL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="ComissionDBL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PriceSaleTPL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="ComissionTPL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PriceSaleQPL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="ComissionQPL" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxPerAge" type="{WS_2013.TravelPackage}ArrayOfTaxAge" minOccurs="0"/>
 *         &lt;element name="NightsDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AdministrationFeeValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AdministrationFeePercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BoardingfeeValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PriceWithoutTaxes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax", propOrder = {
    "departureCityId",
    "departureCityName",
    "departureDate",
    "priceSaleCHD",
    "percentComission",
    "comissionCHD",
    "priceSaleSGL",
    "comissionSGL",
    "priceSaleDBL",
    "comissionDBL",
    "priceSaleTPL",
    "comissionTPL",
    "priceSaleQPL",
    "comissionQPL",
    "availableQuantity",
    "taxPerAge",
    "nightsDuration",
    "active",
    "administrationFeeValue",
    "administrationFeePercent",
    "boardingfeeValue",
    "priceWithoutTaxes"
})
public class Tax {

    @XmlElement(name = "DepartureCityId")
    protected int departureCityId;
    @XmlElement(name = "DepartureCityName")
    protected String departureCityName;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "PriceSaleCHD")
    protected PriceValue priceSaleCHD;
    @XmlElement(name = "PercentComission")
    protected double percentComission;
    @XmlElement(name = "ComissionCHD")
    protected PriceValue comissionCHD;
    @XmlElement(name = "PriceSaleSGL")
    protected PriceValue priceSaleSGL;
    @XmlElement(name = "ComissionSGL")
    protected PriceValue comissionSGL;
    @XmlElement(name = "PriceSaleDBL")
    protected PriceValue priceSaleDBL;
    @XmlElement(name = "ComissionDBL")
    protected PriceValue comissionDBL;
    @XmlElement(name = "PriceSaleTPL")
    protected PriceValue priceSaleTPL;
    @XmlElement(name = "ComissionTPL")
    protected PriceValue comissionTPL;
    @XmlElement(name = "PriceSaleQPL")
    protected PriceValue priceSaleQPL;
    @XmlElement(name = "ComissionQPL")
    protected PriceValue comissionQPL;
    @XmlElement(name = "AvailableQuantity")
    protected int availableQuantity;
    @XmlElement(name = "TaxPerAge")
    protected ArrayOfTaxAge taxPerAge;
    @XmlElement(name = "NightsDuration")
    protected int nightsDuration;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "AdministrationFeeValue")
    protected double administrationFeeValue;
    @XmlElement(name = "AdministrationFeePercent")
    protected double administrationFeePercent;
    @XmlElement(name = "BoardingfeeValue")
    protected double boardingfeeValue;
    @XmlElement(name = "PriceWithoutTaxes")
    protected double priceWithoutTaxes;

    /**
     * Gets the value of the departureCityId property.
     * 
     */
    public int getDepartureCityId() {
        return departureCityId;
    }

    /**
     * Sets the value of the departureCityId property.
     * 
     */
    public void setDepartureCityId(int value) {
        this.departureCityId = value;
    }

    /**
     * Gets the value of the departureCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCityName() {
        return departureCityName;
    }

    /**
     * Sets the value of the departureCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCityName(String value) {
        this.departureCityName = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the priceSaleCHD property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSaleCHD() {
        return priceSaleCHD;
    }

    /**
     * Sets the value of the priceSaleCHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSaleCHD(PriceValue value) {
        this.priceSaleCHD = value;
    }

    /**
     * Gets the value of the percentComission property.
     * 
     */
    public double getPercentComission() {
        return percentComission;
    }

    /**
     * Sets the value of the percentComission property.
     * 
     */
    public void setPercentComission(double value) {
        this.percentComission = value;
    }

    /**
     * Gets the value of the comissionCHD property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComissionCHD() {
        return comissionCHD;
    }

    /**
     * Sets the value of the comissionCHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComissionCHD(PriceValue value) {
        this.comissionCHD = value;
    }

    /**
     * Gets the value of the priceSaleSGL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSaleSGL() {
        return priceSaleSGL;
    }

    /**
     * Sets the value of the priceSaleSGL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSaleSGL(PriceValue value) {
        this.priceSaleSGL = value;
    }

    /**
     * Gets the value of the comissionSGL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComissionSGL() {
        return comissionSGL;
    }

    /**
     * Sets the value of the comissionSGL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComissionSGL(PriceValue value) {
        this.comissionSGL = value;
    }

    /**
     * Gets the value of the priceSaleDBL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSaleDBL() {
        return priceSaleDBL;
    }

    /**
     * Sets the value of the priceSaleDBL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSaleDBL(PriceValue value) {
        this.priceSaleDBL = value;
    }

    /**
     * Gets the value of the comissionDBL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComissionDBL() {
        return comissionDBL;
    }

    /**
     * Sets the value of the comissionDBL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComissionDBL(PriceValue value) {
        this.comissionDBL = value;
    }

    /**
     * Gets the value of the priceSaleTPL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSaleTPL() {
        return priceSaleTPL;
    }

    /**
     * Sets the value of the priceSaleTPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSaleTPL(PriceValue value) {
        this.priceSaleTPL = value;
    }

    /**
     * Gets the value of the comissionTPL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComissionTPL() {
        return comissionTPL;
    }

    /**
     * Sets the value of the comissionTPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComissionTPL(PriceValue value) {
        this.comissionTPL = value;
    }

    /**
     * Gets the value of the priceSaleQPL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPriceSaleQPL() {
        return priceSaleQPL;
    }

    /**
     * Sets the value of the priceSaleQPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPriceSaleQPL(PriceValue value) {
        this.priceSaleQPL = value;
    }

    /**
     * Gets the value of the comissionQPL property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComissionQPL() {
        return comissionQPL;
    }

    /**
     * Sets the value of the comissionQPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComissionQPL(PriceValue value) {
        this.comissionQPL = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     */
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     */
    public void setAvailableQuantity(int value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the taxPerAge property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxAge }
     *     
     */
    public ArrayOfTaxAge getTaxPerAge() {
        return taxPerAge;
    }

    /**
     * Sets the value of the taxPerAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxAge }
     *     
     */
    public void setTaxPerAge(ArrayOfTaxAge value) {
        this.taxPerAge = value;
    }

    /**
     * Gets the value of the nightsDuration property.
     * 
     */
    public int getNightsDuration() {
        return nightsDuration;
    }

    /**
     * Sets the value of the nightsDuration property.
     * 
     */
    public void setNightsDuration(int value) {
        this.nightsDuration = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the administrationFeeValue property.
     * 
     */
    public double getAdministrationFeeValue() {
        return administrationFeeValue;
    }

    /**
     * Sets the value of the administrationFeeValue property.
     * 
     */
    public void setAdministrationFeeValue(double value) {
        this.administrationFeeValue = value;
    }

    /**
     * Gets the value of the administrationFeePercent property.
     * 
     */
    public double getAdministrationFeePercent() {
        return administrationFeePercent;
    }

    /**
     * Sets the value of the administrationFeePercent property.
     * 
     */
    public void setAdministrationFeePercent(double value) {
        this.administrationFeePercent = value;
    }

    /**
     * Gets the value of the boardingfeeValue property.
     * 
     */
    public double getBoardingfeeValue() {
        return boardingfeeValue;
    }

    /**
     * Sets the value of the boardingfeeValue property.
     * 
     */
    public void setBoardingfeeValue(double value) {
        this.boardingfeeValue = value;
    }

    /**
     * Gets the value of the priceWithoutTaxes property.
     * 
     */
    public double getPriceWithoutTaxes() {
        return priceWithoutTaxes;
    }

    /**
     * Sets the value of the priceWithoutTaxes property.
     * 
     */
    public void setPriceWithoutTaxes(double value) {
        this.priceWithoutTaxes = value;
    }

}
