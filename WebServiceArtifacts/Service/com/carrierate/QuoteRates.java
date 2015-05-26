
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CrossBorderFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DiscountedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalLiftGateFeeForShipment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalResidentialFeeForShipment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InsideDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InsidePickupFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SortnSegregateFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtremeLength" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TradeShowFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="WeightInspectionFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NotifyPriorToArrivalFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NonCommercialDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InsuranceFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SingleShipmentFeeCustomer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FinalBillAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OriginCarrierLocation" type="{http://carrierate.com/}CarrierAddress"/>
 *         &lt;element name="DestinationCarrierLocation" type="{http://carrierate.com/}CarrierAddress"/>
 *         &lt;element name="EstimatedServiceDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanInitialFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanFuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanInsideDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanLiftGateDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanNonCommercialDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanNotifyFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OceanResidentialDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ProtectFromFreeze" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRates", propOrder = {
    "carrierId",
    "carrierCodeId",
    "carrierName",
    "initialAmount",
    "crossBorderFee",
    "discountedAmount",
    "totalLiftGateFeeForShipment",
    "totalResidentialFeeForShipment",
    "insideDeliveryFee",
    "insidePickupFee",
    "sortnSegregateFee",
    "extremeLength",
    "tradeShowFee",
    "weightInspectionFee",
    "notifyPriorToArrivalFee",
    "nonCommercialDeliveryFee",
    "insuranceFee",
    "singleShipmentFeeCustomer",
    "fuelSurcharge",
    "finalBillAmount",
    "originCarrierLocation",
    "destinationCarrierLocation",
    "estimatedServiceDays",
    "serviceTransactionId",
    "hazardousFee",
    "oceanInitialFee",
    "oceanFuelSurcharge",
    "oceanInsideDeliveryFee",
    "oceanLiftGateDeliveryFee",
    "oceanNonCommercialDeliveryFee",
    "oceanNotifyFee",
    "oceanResidentialDeliveryFee",
    "protectFromFreeze"
})
@XmlSeeAlso({
    QuoteRatesWithCarrierLiability.class
})
public class QuoteRates {

    @XmlElement(name = "CarrierId")
    protected String carrierId;
    @XmlElement(name = "CarrierCodeId")
    protected String carrierCodeId;
    @XmlElement(name = "CarrierName")
    protected String carrierName;
    @XmlElement(name = "InitialAmount")
    protected double initialAmount;
    @XmlElement(name = "CrossBorderFee")
    protected double crossBorderFee;
    @XmlElement(name = "DiscountedAmount")
    protected double discountedAmount;
    @XmlElement(name = "TotalLiftGateFeeForShipment")
    protected double totalLiftGateFeeForShipment;
    @XmlElement(name = "TotalResidentialFeeForShipment")
    protected double totalResidentialFeeForShipment;
    @XmlElement(name = "InsideDeliveryFee")
    protected double insideDeliveryFee;
    @XmlElement(name = "InsidePickupFee")
    protected double insidePickupFee;
    @XmlElement(name = "SortnSegregateFee")
    protected double sortnSegregateFee;
    @XmlElement(name = "ExtremeLength")
    protected double extremeLength;
    @XmlElement(name = "TradeShowFee")
    protected double tradeShowFee;
    @XmlElement(name = "WeightInspectionFee")
    protected double weightInspectionFee;
    @XmlElement(name = "NotifyPriorToArrivalFee")
    protected double notifyPriorToArrivalFee;
    @XmlElement(name = "NonCommercialDeliveryFee")
    protected double nonCommercialDeliveryFee;
    @XmlElement(name = "InsuranceFee")
    protected double insuranceFee;
    @XmlElement(name = "SingleShipmentFeeCustomer")
    protected double singleShipmentFeeCustomer;
    @XmlElement(name = "FuelSurcharge")
    protected double fuelSurcharge;
    @XmlElement(name = "FinalBillAmount")
    protected double finalBillAmount;
    @XmlElement(name = "OriginCarrierLocation", required = true)
    protected CarrierAddress originCarrierLocation;
    @XmlElement(name = "DestinationCarrierLocation", required = true)
    protected CarrierAddress destinationCarrierLocation;
    @XmlElement(name = "EstimatedServiceDays")
    protected int estimatedServiceDays;
    @XmlElement(name = "ServiceTransactionId")
    protected String serviceTransactionId;
    @XmlElement(name = "HazardousFee")
    protected double hazardousFee;
    @XmlElement(name = "OceanInitialFee")
    protected double oceanInitialFee;
    @XmlElement(name = "OceanFuelSurcharge")
    protected double oceanFuelSurcharge;
    @XmlElement(name = "OceanInsideDeliveryFee")
    protected double oceanInsideDeliveryFee;
    @XmlElement(name = "OceanLiftGateDeliveryFee")
    protected double oceanLiftGateDeliveryFee;
    @XmlElement(name = "OceanNonCommercialDeliveryFee")
    protected double oceanNonCommercialDeliveryFee;
    @XmlElement(name = "OceanNotifyFee")
    protected double oceanNotifyFee;
    @XmlElement(name = "OceanResidentialDeliveryFee")
    protected double oceanResidentialDeliveryFee;
    @XmlElement(name = "ProtectFromFreeze")
    protected double protectFromFreeze;

    /**
     * Gets the value of the carrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * Sets the value of the carrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierId(String value) {
        this.carrierId = value;
    }

    /**
     * Gets the value of the carrierCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCodeId() {
        return carrierCodeId;
    }

    /**
     * Sets the value of the carrierCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCodeId(String value) {
        this.carrierCodeId = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the initialAmount property.
     * 
     */
    public double getInitialAmount() {
        return initialAmount;
    }

    /**
     * Sets the value of the initialAmount property.
     * 
     */
    public void setInitialAmount(double value) {
        this.initialAmount = value;
    }

    /**
     * Gets the value of the crossBorderFee property.
     * 
     */
    public double getCrossBorderFee() {
        return crossBorderFee;
    }

    /**
     * Sets the value of the crossBorderFee property.
     * 
     */
    public void setCrossBorderFee(double value) {
        this.crossBorderFee = value;
    }

    /**
     * Gets the value of the discountedAmount property.
     * 
     */
    public double getDiscountedAmount() {
        return discountedAmount;
    }

    /**
     * Sets the value of the discountedAmount property.
     * 
     */
    public void setDiscountedAmount(double value) {
        this.discountedAmount = value;
    }

    /**
     * Gets the value of the totalLiftGateFeeForShipment property.
     * 
     */
    public double getTotalLiftGateFeeForShipment() {
        return totalLiftGateFeeForShipment;
    }

    /**
     * Sets the value of the totalLiftGateFeeForShipment property.
     * 
     */
    public void setTotalLiftGateFeeForShipment(double value) {
        this.totalLiftGateFeeForShipment = value;
    }

    /**
     * Gets the value of the totalResidentialFeeForShipment property.
     * 
     */
    public double getTotalResidentialFeeForShipment() {
        return totalResidentialFeeForShipment;
    }

    /**
     * Sets the value of the totalResidentialFeeForShipment property.
     * 
     */
    public void setTotalResidentialFeeForShipment(double value) {
        this.totalResidentialFeeForShipment = value;
    }

    /**
     * Gets the value of the insideDeliveryFee property.
     * 
     */
    public double getInsideDeliveryFee() {
        return insideDeliveryFee;
    }

    /**
     * Sets the value of the insideDeliveryFee property.
     * 
     */
    public void setInsideDeliveryFee(double value) {
        this.insideDeliveryFee = value;
    }

    /**
     * Gets the value of the insidePickupFee property.
     * 
     */
    public double getInsidePickupFee() {
        return insidePickupFee;
    }

    /**
     * Sets the value of the insidePickupFee property.
     * 
     */
    public void setInsidePickupFee(double value) {
        this.insidePickupFee = value;
    }

    /**
     * Gets the value of the sortnSegregateFee property.
     * 
     */
    public double getSortnSegregateFee() {
        return sortnSegregateFee;
    }

    /**
     * Sets the value of the sortnSegregateFee property.
     * 
     */
    public void setSortnSegregateFee(double value) {
        this.sortnSegregateFee = value;
    }

    /**
     * Gets the value of the extremeLength property.
     * 
     */
    public double getExtremeLength() {
        return extremeLength;
    }

    /**
     * Sets the value of the extremeLength property.
     * 
     */
    public void setExtremeLength(double value) {
        this.extremeLength = value;
    }

    /**
     * Gets the value of the tradeShowFee property.
     * 
     */
    public double getTradeShowFee() {
        return tradeShowFee;
    }

    /**
     * Sets the value of the tradeShowFee property.
     * 
     */
    public void setTradeShowFee(double value) {
        this.tradeShowFee = value;
    }

    /**
     * Gets the value of the weightInspectionFee property.
     * 
     */
    public double getWeightInspectionFee() {
        return weightInspectionFee;
    }

    /**
     * Sets the value of the weightInspectionFee property.
     * 
     */
    public void setWeightInspectionFee(double value) {
        this.weightInspectionFee = value;
    }

    /**
     * Gets the value of the notifyPriorToArrivalFee property.
     * 
     */
    public double getNotifyPriorToArrivalFee() {
        return notifyPriorToArrivalFee;
    }

    /**
     * Sets the value of the notifyPriorToArrivalFee property.
     * 
     */
    public void setNotifyPriorToArrivalFee(double value) {
        this.notifyPriorToArrivalFee = value;
    }

    /**
     * Gets the value of the nonCommercialDeliveryFee property.
     * 
     */
    public double getNonCommercialDeliveryFee() {
        return nonCommercialDeliveryFee;
    }

    /**
     * Sets the value of the nonCommercialDeliveryFee property.
     * 
     */
    public void setNonCommercialDeliveryFee(double value) {
        this.nonCommercialDeliveryFee = value;
    }

    /**
     * Gets the value of the insuranceFee property.
     * 
     */
    public double getInsuranceFee() {
        return insuranceFee;
    }

    /**
     * Sets the value of the insuranceFee property.
     * 
     */
    public void setInsuranceFee(double value) {
        this.insuranceFee = value;
    }

    /**
     * Gets the value of the singleShipmentFeeCustomer property.
     * 
     */
    public double getSingleShipmentFeeCustomer() {
        return singleShipmentFeeCustomer;
    }

    /**
     * Sets the value of the singleShipmentFeeCustomer property.
     * 
     */
    public void setSingleShipmentFeeCustomer(double value) {
        this.singleShipmentFeeCustomer = value;
    }

    /**
     * Gets the value of the fuelSurcharge property.
     * 
     */
    public double getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the value of the fuelSurcharge property.
     * 
     */
    public void setFuelSurcharge(double value) {
        this.fuelSurcharge = value;
    }

    /**
     * Gets the value of the finalBillAmount property.
     * 
     */
    public double getFinalBillAmount() {
        return finalBillAmount;
    }

    /**
     * Sets the value of the finalBillAmount property.
     * 
     */
    public void setFinalBillAmount(double value) {
        this.finalBillAmount = value;
    }

    /**
     * Gets the value of the originCarrierLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAddress }
     *     
     */
    public CarrierAddress getOriginCarrierLocation() {
        return originCarrierLocation;
    }

    /**
     * Sets the value of the originCarrierLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAddress }
     *     
     */
    public void setOriginCarrierLocation(CarrierAddress value) {
        this.originCarrierLocation = value;
    }

    /**
     * Gets the value of the destinationCarrierLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAddress }
     *     
     */
    public CarrierAddress getDestinationCarrierLocation() {
        return destinationCarrierLocation;
    }

    /**
     * Sets the value of the destinationCarrierLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAddress }
     *     
     */
    public void setDestinationCarrierLocation(CarrierAddress value) {
        this.destinationCarrierLocation = value;
    }

    /**
     * Gets the value of the estimatedServiceDays property.
     * 
     */
    public int getEstimatedServiceDays() {
        return estimatedServiceDays;
    }

    /**
     * Sets the value of the estimatedServiceDays property.
     * 
     */
    public void setEstimatedServiceDays(int value) {
        this.estimatedServiceDays = value;
    }

    /**
     * Gets the value of the serviceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    /**
     * Sets the value of the serviceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTransactionId(String value) {
        this.serviceTransactionId = value;
    }

    /**
     * Gets the value of the hazardousFee property.
     * 
     */
    public double getHazardousFee() {
        return hazardousFee;
    }

    /**
     * Sets the value of the hazardousFee property.
     * 
     */
    public void setHazardousFee(double value) {
        this.hazardousFee = value;
    }

    /**
     * Gets the value of the oceanInitialFee property.
     * 
     */
    public double getOceanInitialFee() {
        return oceanInitialFee;
    }

    /**
     * Sets the value of the oceanInitialFee property.
     * 
     */
    public void setOceanInitialFee(double value) {
        this.oceanInitialFee = value;
    }

    /**
     * Gets the value of the oceanFuelSurcharge property.
     * 
     */
    public double getOceanFuelSurcharge() {
        return oceanFuelSurcharge;
    }

    /**
     * Sets the value of the oceanFuelSurcharge property.
     * 
     */
    public void setOceanFuelSurcharge(double value) {
        this.oceanFuelSurcharge = value;
    }

    /**
     * Gets the value of the oceanInsideDeliveryFee property.
     * 
     */
    public double getOceanInsideDeliveryFee() {
        return oceanInsideDeliveryFee;
    }

    /**
     * Sets the value of the oceanInsideDeliveryFee property.
     * 
     */
    public void setOceanInsideDeliveryFee(double value) {
        this.oceanInsideDeliveryFee = value;
    }

    /**
     * Gets the value of the oceanLiftGateDeliveryFee property.
     * 
     */
    public double getOceanLiftGateDeliveryFee() {
        return oceanLiftGateDeliveryFee;
    }

    /**
     * Sets the value of the oceanLiftGateDeliveryFee property.
     * 
     */
    public void setOceanLiftGateDeliveryFee(double value) {
        this.oceanLiftGateDeliveryFee = value;
    }

    /**
     * Gets the value of the oceanNonCommercialDeliveryFee property.
     * 
     */
    public double getOceanNonCommercialDeliveryFee() {
        return oceanNonCommercialDeliveryFee;
    }

    /**
     * Sets the value of the oceanNonCommercialDeliveryFee property.
     * 
     */
    public void setOceanNonCommercialDeliveryFee(double value) {
        this.oceanNonCommercialDeliveryFee = value;
    }

    /**
     * Gets the value of the oceanNotifyFee property.
     * 
     */
    public double getOceanNotifyFee() {
        return oceanNotifyFee;
    }

    /**
     * Sets the value of the oceanNotifyFee property.
     * 
     */
    public void setOceanNotifyFee(double value) {
        this.oceanNotifyFee = value;
    }

    /**
     * Gets the value of the oceanResidentialDeliveryFee property.
     * 
     */
    public double getOceanResidentialDeliveryFee() {
        return oceanResidentialDeliveryFee;
    }

    /**
     * Sets the value of the oceanResidentialDeliveryFee property.
     * 
     */
    public void setOceanResidentialDeliveryFee(double value) {
        this.oceanResidentialDeliveryFee = value;
    }

    /**
     * Gets the value of the protectFromFreeze property.
     * 
     */
    public double getProtectFromFreeze() {
        return protectFromFreeze;
    }

    /**
     * Sets the value of the protectFromFreeze property.
     * 
     */
    public void setProtectFromFreeze(double value) {
        this.protectFromFreeze = value;
    }

}
