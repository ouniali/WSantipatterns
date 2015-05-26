
package com.travelport.schema.common_v15_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v18_0.AirBaseReq;
import com.travelport.schema.air_v18_0.AirCancelReq;
import com.travelport.schema.air_v18_0.AirExchangeQuoteReq;
import com.travelport.schema.air_v18_0.AirExchangeReq;
import com.travelport.schema.air_v18_0.AirExchangeTicketingReq;
import com.travelport.schema.air_v18_0.AirFareDisplayReq;
import com.travelport.schema.air_v18_0.AirFareRulesReq;
import com.travelport.schema.air_v18_0.AirMerchandisingFulfillmentReq;
import com.travelport.schema.air_v18_0.AirMerchandisingOfferAvailabilityReq;
import com.travelport.schema.air_v18_0.AirPrePayReq;
import com.travelport.schema.air_v18_0.AirRefundQuoteReq;
import com.travelport.schema.air_v18_0.AirRefundReq;
import com.travelport.schema.air_v18_0.AirRetrieveDocumentReq;
import com.travelport.schema.air_v18_0.AirVoidTicketReq;
import com.travelport.schema.air_v18_0.BaseAirPriceReq;
import com.travelport.schema.air_v18_0.FlightDetailsReq;
import com.travelport.schema.air_v18_0.FlightInformationReq;
import com.travelport.schema.air_v18_0.RetrieveLowFareSearchReq;
import com.travelport.schema.air_v18_0.SeatMapReq;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BillingPointOfSaleInfo"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgentIDOverride" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuthorizedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetBranch" type="{http://www.travelport.com/schema/common_v15_0}typeBranchCode" />
 *       &lt;attribute name="OverrideLogging" type="{http://www.travelport.com/schema/common_v15_0}typeLoggingLevel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "billingPointOfSaleInfo",
    "agentIDOverride"
})
@XmlSeeAlso({
    FlightInformationReq.class,
    AirExchangeTicketingReq.class,
    AirFareRulesReq.class,
    AirCancelReq.class,
    AirMerchandisingFulfillmentReq.class,
    FlightDetailsReq.class,
    BaseAirPriceReq.class,
    AirRetrieveDocumentReq.class,
    BaseCreateReservationReq.class,
    AirExchangeReq.class,
    AirMerchandisingOfferAvailabilityReq.class,
    BaseSearchReq.class,
    AirRefundQuoteReq.class,
    AirFareDisplayReq.class,
    AirExchangeQuoteReq.class,
    AirPrePayReq.class,
    SeatMapReq.class,
    RetrieveLowFareSearchReq.class,
    AirVoidTicketReq.class,
    AirRefundReq.class,
    AirBaseReq.class
})
public class BaseReq {

    @XmlElement(name = "BillingPointOfSaleInfo", required = true)
    protected BillingPointOfSaleInfo billingPointOfSaleInfo;
    @XmlElement(name = "AgentIDOverride")
    protected List<AgentIDOverride> agentIDOverride;
    @XmlAttribute(name = "TraceId")
    protected String traceId;
    @XmlAttribute(name = "TokenId")
    protected String tokenId;
    @XmlAttribute(name = "AuthorizedBy")
    protected String authorizedBy;
    @XmlAttribute(name = "TargetBranch")
    protected String targetBranch;
    @XmlAttribute(name = "OverrideLogging")
    protected TypeLoggingLevel overrideLogging;

    /**
     * Gets the value of the billingPointOfSaleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    public BillingPointOfSaleInfo getBillingPointOfSaleInfo() {
        return billingPointOfSaleInfo;
    }

    /**
     * Sets the value of the billingPointOfSaleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    public void setBillingPointOfSaleInfo(BillingPointOfSaleInfo value) {
        this.billingPointOfSaleInfo = value;
    }

    /**
     * Gets the value of the agentIDOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentIDOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentIDOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentIDOverride }
     * 
     * 
     */
    public List<AgentIDOverride> getAgentIDOverride() {
        if (agentIDOverride == null) {
            agentIDOverride = new ArrayList<AgentIDOverride>();
        }
        return this.agentIDOverride;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the authorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedBy(String value) {
        this.authorizedBy = value;
    }

    /**
     * Gets the value of the targetBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * Sets the value of the targetBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBranch(String value) {
        this.targetBranch = value;
    }

    /**
     * Gets the value of the overrideLogging property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLoggingLevel }
     *     
     */
    public TypeLoggingLevel getOverrideLogging() {
        return overrideLogging;
    }

    /**
     * Sets the value of the overrideLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLoggingLevel }
     *     
     */
    public void setOverrideLogging(TypeLoggingLevel value) {
        this.overrideLogging = value;
    }

}
