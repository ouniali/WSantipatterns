
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentFare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentFare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSaleConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MandatoryPassengerAssingnment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MandatoryRoundTrip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPaxs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferences" type="{WS_2013.TrainTicket}ArrayOfPreference" minOccurs="0"/>
 *         &lt;element name="RulesAfterSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Flexibility" type="{WS_2013.TrainTicket}eFlexibility"/>
 *         &lt;element name="ReservationType" type="{WS_2013.TrainTicket}eReservationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentFare", propOrder = {
    "availableSeats",
    "serviceClassCode",
    "serviceClassDescription",
    "paxTypeCode",
    "webSaleConditions",
    "familyId",
    "mandatoryPassengerAssingnment",
    "mandatoryRoundTrip",
    "familyName",
    "fareName",
    "numberOfPaxs",
    "preferences",
    "rulesAfterSale",
    "saleRules",
    "segmentId",
    "flexibility",
    "reservationType"
})
public class SegmentFare {

    @XmlElement(name = "AvailableSeats", required = true, type = Integer.class, nillable = true)
    protected Integer availableSeats;
    @XmlElement(name = "ServiceClassCode")
    protected String serviceClassCode;
    @XmlElement(name = "ServiceClassDescription")
    protected String serviceClassDescription;
    @XmlElement(name = "PaxTypeCode")
    protected String paxTypeCode;
    @XmlElement(name = "WebSaleConditions")
    protected String webSaleConditions;
    @XmlElement(name = "FamilyId")
    protected int familyId;
    @XmlElement(name = "MandatoryPassengerAssingnment")
    protected boolean mandatoryPassengerAssingnment;
    @XmlElement(name = "MandatoryRoundTrip")
    protected boolean mandatoryRoundTrip;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "FareName")
    protected String fareName;
    @XmlElement(name = "NumberOfPaxs")
    protected String numberOfPaxs;
    @XmlElement(name = "Preferences")
    protected ArrayOfPreference preferences;
    @XmlElement(name = "RulesAfterSale")
    protected String rulesAfterSale;
    @XmlElement(name = "SaleRules")
    protected String saleRules;
    @XmlElement(name = "SegmentId")
    protected int segmentId;
    @XmlElement(name = "Flexibility", required = true)
    @XmlSchemaType(name = "string")
    protected EFlexibility flexibility;
    @XmlElement(name = "ReservationType", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationType reservationType;

    /**
     * Gets the value of the availableSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the value of the availableSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableSeats(Integer value) {
        this.availableSeats = value;
    }

    /**
     * Gets the value of the serviceClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClassCode() {
        return serviceClassCode;
    }

    /**
     * Sets the value of the serviceClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClassCode(String value) {
        this.serviceClassCode = value;
    }

    /**
     * Gets the value of the serviceClassDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClassDescription() {
        return serviceClassDescription;
    }

    /**
     * Sets the value of the serviceClassDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClassDescription(String value) {
        this.serviceClassDescription = value;
    }

    /**
     * Gets the value of the paxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxTypeCode() {
        return paxTypeCode;
    }

    /**
     * Sets the value of the paxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxTypeCode(String value) {
        this.paxTypeCode = value;
    }

    /**
     * Gets the value of the webSaleConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSaleConditions() {
        return webSaleConditions;
    }

    /**
     * Sets the value of the webSaleConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSaleConditions(String value) {
        this.webSaleConditions = value;
    }

    /**
     * Gets the value of the familyId property.
     * 
     */
    public int getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     */
    public void setFamilyId(int value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the mandatoryPassengerAssingnment property.
     * 
     */
    public boolean isMandatoryPassengerAssingnment() {
        return mandatoryPassengerAssingnment;
    }

    /**
     * Sets the value of the mandatoryPassengerAssingnment property.
     * 
     */
    public void setMandatoryPassengerAssingnment(boolean value) {
        this.mandatoryPassengerAssingnment = value;
    }

    /**
     * Gets the value of the mandatoryRoundTrip property.
     * 
     */
    public boolean isMandatoryRoundTrip() {
        return mandatoryRoundTrip;
    }

    /**
     * Sets the value of the mandatoryRoundTrip property.
     * 
     */
    public void setMandatoryRoundTrip(boolean value) {
        this.mandatoryRoundTrip = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the fareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareName() {
        return fareName;
    }

    /**
     * Sets the value of the fareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareName(String value) {
        this.fareName = value;
    }

    /**
     * Gets the value of the numberOfPaxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPaxs() {
        return numberOfPaxs;
    }

    /**
     * Sets the value of the numberOfPaxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPaxs(String value) {
        this.numberOfPaxs = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPreference }
     *     
     */
    public ArrayOfPreference getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPreference }
     *     
     */
    public void setPreferences(ArrayOfPreference value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the rulesAfterSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesAfterSale() {
        return rulesAfterSale;
    }

    /**
     * Sets the value of the rulesAfterSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesAfterSale(String value) {
        this.rulesAfterSale = value;
    }

    /**
     * Gets the value of the saleRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRules() {
        return saleRules;
    }

    /**
     * Sets the value of the saleRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRules(String value) {
        this.saleRules = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     */
    public int getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     */
    public void setSegmentId(int value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the flexibility property.
     * 
     * @return
     *     possible object is
     *     {@link EFlexibility }
     *     
     */
    public EFlexibility getFlexibility() {
        return flexibility;
    }

    /**
     * Sets the value of the flexibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFlexibility }
     *     
     */
    public void setFlexibility(EFlexibility value) {
        this.flexibility = value;
    }

    /**
     * Gets the value of the reservationType property.
     * 
     * @return
     *     possible object is
     *     {@link EReservationType }
     *     
     */
    public EReservationType getReservationType() {
        return reservationType;
    }

    /**
     * Sets the value of the reservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EReservationType }
     *     
     */
    public void setReservationType(EReservationType value) {
        this.reservationType = value;
    }

}
