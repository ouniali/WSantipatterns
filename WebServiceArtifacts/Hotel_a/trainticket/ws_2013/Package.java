
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassHoldersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PhysicalClassServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalClassServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Criteria" type="{WS_2013.TrainTicket}Criteria" minOccurs="0"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsTheCheaperPackage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CommissionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPaxs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OtherFares" type="{WS_2013.TrainTicket}ArrayOfRate" minOccurs="0"/>
 *         &lt;element name="SaleBasePrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="CancellationPolicies" type="{WS_2013.TrainTicket}ArrayOfCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="IncludedBooking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Segments" type="{WS_2013.TrainTicket}ArrayOfSegment" minOccurs="0"/>
 *         &lt;element name="SolutionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PackageFareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompatibleFaresWithEachOther" type="{WS_2013.TrainTicket}ArrayOfCompatibleFaresOnTheOtherLeg" minOccurs="0"/>
 *         &lt;element name="SegmentFares" type="{WS_2013.TrainTicket}ArrayOfSegmentFare" minOccurs="0"/>
 *         &lt;element name="CommunicationFare" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="EmissionFare" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="AccommodationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccommodationTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnlyPrintAtHome" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrintingOptions" type="{WS_2013.TrainTicket}ArrayOfString" minOccurs="0"/>
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
@XmlType(name = "Package", propOrder = {
    "passHoldersOnly",
    "physicalClassServiceCode",
    "physicalClassServiceDescription",
    "commission",
    "commissionPercent",
    "criteria",
    "paymentDeadline",
    "isTheCheaperPackage",
    "commissionCurrency",
    "numberOfPaxs",
    "otherFares",
    "saleBasePrice",
    "salePrice",
    "cancellationPolicies",
    "includedBooking",
    "segments",
    "solutionId",
    "packageFareId",
    "compatibleFaresWithEachOther",
    "segmentFares",
    "communicationFare",
    "emissionFare",
    "accommodationTypeCode",
    "accommodationTypeDescription",
    "inventoryType",
    "isOnlyPrintAtHome",
    "printingOptions",
    "reservationType"
})
public class Package {

    @XmlElement(name = "PassHoldersOnly")
    protected boolean passHoldersOnly;
    @XmlElement(name = "PhysicalClassServiceCode")
    protected String physicalClassServiceCode;
    @XmlElement(name = "PhysicalClassServiceDescription")
    protected String physicalClassServiceDescription;
    @XmlElement(name = "Commission")
    protected double commission;
    @XmlElement(name = "CommissionPercent")
    protected double commissionPercent;
    @XmlElement(name = "Criteria")
    protected Criteria criteria;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "IsTheCheaperPackage")
    protected boolean isTheCheaperPackage;
    @XmlElement(name = "CommissionCurrency")
    protected String commissionCurrency;
    @XmlElement(name = "NumberOfPaxs")
    protected int numberOfPaxs;
    @XmlElement(name = "OtherFares")
    protected ArrayOfRate otherFares;
    @XmlElement(name = "SaleBasePrice")
    protected PriceValue saleBasePrice;
    @XmlElement(name = "SalePrice")
    protected PriceValue salePrice;
    @XmlElement(name = "CancellationPolicies")
    protected ArrayOfCancellationPolicy cancellationPolicies;
    @XmlElement(name = "IncludedBooking")
    protected boolean includedBooking;
    @XmlElement(name = "Segments")
    protected ArrayOfSegment segments;
    @XmlElement(name = "SolutionId")
    protected int solutionId;
    @XmlElement(name = "PackageFareId")
    protected String packageFareId;
    @XmlElement(name = "CompatibleFaresWithEachOther")
    protected ArrayOfCompatibleFaresOnTheOtherLeg compatibleFaresWithEachOther;
    @XmlElement(name = "SegmentFares")
    protected ArrayOfSegmentFare segmentFares;
    @XmlElement(name = "CommunicationFare")
    protected PriceValue communicationFare;
    @XmlElement(name = "EmissionFare")
    protected PriceValue emissionFare;
    @XmlElement(name = "AccommodationTypeCode")
    protected String accommodationTypeCode;
    @XmlElement(name = "AccommodationTypeDescription")
    protected String accommodationTypeDescription;
    @XmlElement(name = "InventoryType")
    protected String inventoryType;
    @XmlElement(name = "IsOnlyPrintAtHome")
    protected boolean isOnlyPrintAtHome;
    @XmlElement(name = "PrintingOptions")
    protected ArrayOfString printingOptions;
    @XmlElement(name = "ReservationType", required = true)
    @XmlSchemaType(name = "string")
    protected EReservationType reservationType;

    /**
     * Gets the value of the passHoldersOnly property.
     * 
     */
    public boolean isPassHoldersOnly() {
        return passHoldersOnly;
    }

    /**
     * Sets the value of the passHoldersOnly property.
     * 
     */
    public void setPassHoldersOnly(boolean value) {
        this.passHoldersOnly = value;
    }

    /**
     * Gets the value of the physicalClassServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalClassServiceCode() {
        return physicalClassServiceCode;
    }

    /**
     * Sets the value of the physicalClassServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalClassServiceCode(String value) {
        this.physicalClassServiceCode = value;
    }

    /**
     * Gets the value of the physicalClassServiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalClassServiceDescription() {
        return physicalClassServiceDescription;
    }

    /**
     * Sets the value of the physicalClassServiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalClassServiceDescription(String value) {
        this.physicalClassServiceDescription = value;
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
     * Gets the value of the commissionPercent property.
     * 
     */
    public double getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * Sets the value of the commissionPercent property.
     * 
     */
    public void setCommissionPercent(double value) {
        this.commissionPercent = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link Criteria }
     *     
     */
    public Criteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteria }
     *     
     */
    public void setCriteria(Criteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the paymentDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDeadline() {
        return paymentDeadline;
    }

    /**
     * Sets the value of the paymentDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDeadline(XMLGregorianCalendar value) {
        this.paymentDeadline = value;
    }

    /**
     * Gets the value of the isTheCheaperPackage property.
     * 
     */
    public boolean isIsTheCheaperPackage() {
        return isTheCheaperPackage;
    }

    /**
     * Sets the value of the isTheCheaperPackage property.
     * 
     */
    public void setIsTheCheaperPackage(boolean value) {
        this.isTheCheaperPackage = value;
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
     * Gets the value of the numberOfPaxs property.
     * 
     */
    public int getNumberOfPaxs() {
        return numberOfPaxs;
    }

    /**
     * Sets the value of the numberOfPaxs property.
     * 
     */
    public void setNumberOfPaxs(int value) {
        this.numberOfPaxs = value;
    }

    /**
     * Gets the value of the otherFares property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRate }
     *     
     */
    public ArrayOfRate getOtherFares() {
        return otherFares;
    }

    /**
     * Sets the value of the otherFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRate }
     *     
     */
    public void setOtherFares(ArrayOfRate value) {
        this.otherFares = value;
    }

    /**
     * Gets the value of the saleBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getSaleBasePrice() {
        return saleBasePrice;
    }

    /**
     * Sets the value of the saleBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setSaleBasePrice(PriceValue value) {
        this.saleBasePrice = value;
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
     * Gets the value of the includedBooking property.
     * 
     */
    public boolean isIncludedBooking() {
        return includedBooking;
    }

    /**
     * Sets the value of the includedBooking property.
     * 
     */
    public void setIncludedBooking(boolean value) {
        this.includedBooking = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegment }
     *     
     */
    public ArrayOfSegment getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegment }
     *     
     */
    public void setSegments(ArrayOfSegment value) {
        this.segments = value;
    }

    /**
     * Gets the value of the solutionId property.
     * 
     */
    public int getSolutionId() {
        return solutionId;
    }

    /**
     * Sets the value of the solutionId property.
     * 
     */
    public void setSolutionId(int value) {
        this.solutionId = value;
    }

    /**
     * Gets the value of the packageFareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageFareId() {
        return packageFareId;
    }

    /**
     * Sets the value of the packageFareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageFareId(String value) {
        this.packageFareId = value;
    }

    /**
     * Gets the value of the compatibleFaresWithEachOther property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompatibleFaresOnTheOtherLeg }
     *     
     */
    public ArrayOfCompatibleFaresOnTheOtherLeg getCompatibleFaresWithEachOther() {
        return compatibleFaresWithEachOther;
    }

    /**
     * Sets the value of the compatibleFaresWithEachOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompatibleFaresOnTheOtherLeg }
     *     
     */
    public void setCompatibleFaresWithEachOther(ArrayOfCompatibleFaresOnTheOtherLeg value) {
        this.compatibleFaresWithEachOther = value;
    }

    /**
     * Gets the value of the segmentFares property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegmentFare }
     *     
     */
    public ArrayOfSegmentFare getSegmentFares() {
        return segmentFares;
    }

    /**
     * Sets the value of the segmentFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegmentFare }
     *     
     */
    public void setSegmentFares(ArrayOfSegmentFare value) {
        this.segmentFares = value;
    }

    /**
     * Gets the value of the communicationFare property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getCommunicationFare() {
        return communicationFare;
    }

    /**
     * Sets the value of the communicationFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setCommunicationFare(PriceValue value) {
        this.communicationFare = value;
    }

    /**
     * Gets the value of the emissionFare property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getEmissionFare() {
        return emissionFare;
    }

    /**
     * Sets the value of the emissionFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setEmissionFare(PriceValue value) {
        this.emissionFare = value;
    }

    /**
     * Gets the value of the accommodationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationTypeCode() {
        return accommodationTypeCode;
    }

    /**
     * Sets the value of the accommodationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationTypeCode(String value) {
        this.accommodationTypeCode = value;
    }

    /**
     * Gets the value of the accommodationTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationTypeDescription() {
        return accommodationTypeDescription;
    }

    /**
     * Sets the value of the accommodationTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationTypeDescription(String value) {
        this.accommodationTypeDescription = value;
    }

    /**
     * Gets the value of the inventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * Sets the value of the inventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryType(String value) {
        this.inventoryType = value;
    }

    /**
     * Gets the value of the isOnlyPrintAtHome property.
     * 
     */
    public boolean isIsOnlyPrintAtHome() {
        return isOnlyPrintAtHome;
    }

    /**
     * Sets the value of the isOnlyPrintAtHome property.
     * 
     */
    public void setIsOnlyPrintAtHome(boolean value) {
        this.isOnlyPrintAtHome = value;
    }

    /**
     * Gets the value of the printingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrintingOptions() {
        return printingOptions;
    }

    /**
     * Sets the value of the printingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrintingOptions(ArrayOfString value) {
        this.printingOptions = value;
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
