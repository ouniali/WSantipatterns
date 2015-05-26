
package insurance.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for InsuranceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverages" type="{WS_2013.Insurance}ArrayOfCoverage" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeOfTheChildren" type="{WS_2013.Insurance}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="CommissionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SalePrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="CancellationPolicies" type="{WS_2013.Insurance}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="InsuranceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceResult", propOrder = {
    "cityId",
    "clientId",
    "coverages",
    "commission",
    "serviceDate",
    "description",
    "destination",
    "ageOfTheChildren",
    "commissionCurrency",
    "searchCurrency",
    "name",
    "numberOfAdults",
    "numberOfDays",
    "salePrice",
    "cancellationPolicies",
    "insuranceId"
})
public class InsuranceResult {

    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "ClientId")
    protected String clientId;
    @XmlElement(name = "Coverages")
    protected ArrayOfCoverage coverages;
    @XmlElement(name = "Commission")
    protected double commission;
    @XmlElement(name = "ServiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "AgeOfTheChildren")
    protected ArrayOfInt ageOfTheChildren;
    @XmlElement(name = "CommissionCurrency")
    protected String commissionCurrency;
    @XmlElement(name = "SearchCurrency")
    protected String searchCurrency;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfDays")
    protected int numberOfDays;
    @XmlElement(name = "SalePrice")
    protected PriceValue salePrice;
    @XmlElement(name = "CancellationPolicies")
    protected ArrayOfCancellationPolicy cancellationPolicies;
    @XmlElement(name = "InsuranceId")
    protected String insuranceId;

    /**
     * Gets the value of the cityId property.
     * 
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     */
    public void setCityId(int value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the coverages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoverage }
     *     
     */
    public ArrayOfCoverage getCoverages() {
        return coverages;
    }

    /**
     * Sets the value of the coverages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoverage }
     *     
     */
    public void setCoverages(ArrayOfCoverage value) {
        this.coverages = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     */
    public void setCommission(double value) {
        this.commission = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the ageOfTheChildren property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAgeOfTheChildren() {
        return ageOfTheChildren;
    }

    /**
     * Sets the value of the ageOfTheChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAgeOfTheChildren(ArrayOfInt value) {
        this.ageOfTheChildren = value;
    }

    /**
     * Gets the value of the commissionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionCurrency() {
        return commissionCurrency;
    }

    /**
     * Sets the value of the commissionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionCurrency(String value) {
        this.commissionCurrency = value;
    }

    /**
     * Gets the value of the searchCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCurrency() {
        return searchCurrency;
    }

    /**
     * Sets the value of the searchCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCurrency(String value) {
        this.searchCurrency = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     */
    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     */
    public void setNumberOfAdults(int value) {
        this.numberOfAdults = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     */
    public void setNumberOfDays(int value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSalePrice(PriceValue value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the cancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Sets the value of the cancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setCancellationPolicies(ArrayOfCancellationPolicy value) {
        this.cancellationPolicies = value;
    }

    /**
     * Gets the value of the insuranceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceId() {
        return insuranceId;
    }

    /**
     * Sets the value of the insuranceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceId(String value) {
        this.insuranceId = value;
    }

}
