
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AgencySellInfo;
import com.travelport.schema.common_v15_0.BaseReq;
import com.travelport.schema.common_v15_0.CreditCard;
import com.travelport.schema.common_v15_0.GeneralRemark;
import com.travelport.schema.common_v15_0.HostToken;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}HostToken" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}HostReservation" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencySellInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSolution"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CreditCard" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}OptionalService" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostToken",
    "hostReservation",
    "agencySellInfo",
    "airSolution",
    "creditCard",
    "optionalService",
    "generalRemark",
    "confirmationEmail"
})
@XmlRootElement(name = "AirMerchandisingFulfillmentReq")
public class AirMerchandisingFulfillmentReq
    extends BaseReq
{

    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<HostToken> hostToken;
    @XmlElement(name = "HostReservation", required = true)
    protected List<HostReservation> hostReservation;
    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSolution", required = true)
    protected AirSolution airSolution;
    @XmlElement(name = "CreditCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected CreditCard creditCard;
    @XmlElement(name = "OptionalService", required = true)
    protected List<OptionalService> optionalService;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "ConfirmationEmail")
    protected String confirmationEmail;

    /**
     * Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Gets the value of the hostReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostReservation }
     * 
     * 
     */
    public List<HostReservation> getHostReservation() {
        if (hostReservation == null) {
            hostReservation = new ArrayList<HostReservation>();
        }
        return this.hostReservation;
    }

    /**
     * Gets the value of the agencySellInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Gets the value of the airSolution property.
     * 
     * @return
     *     possible object is
     *     {@link AirSolution }
     *     
     */
    public AirSolution getAirSolution() {
        return airSolution;
    }

    /**
     * Sets the value of the airSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolution }
     *     
     */
    public void setAirSolution(AirSolution value) {
        this.airSolution = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the optionalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalService }
     * 
     * 
     */
    public List<OptionalService> getOptionalService() {
        if (optionalService == null) {
            optionalService = new ArrayList<OptionalService>();
        }
        return this.optionalService;
    }

    /**
     * Gets the value of the generalRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * 
     * 
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<GeneralRemark>();
        }
        return this.generalRemark;
    }

    /**
     * Gets the value of the confirmationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationEmail() {
        return confirmationEmail;
    }

    /**
     * Sets the value of the confirmationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationEmail(String value) {
        this.confirmationEmail = value;
    }

}
