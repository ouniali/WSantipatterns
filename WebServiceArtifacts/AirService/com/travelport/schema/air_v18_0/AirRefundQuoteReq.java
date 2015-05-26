
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReq;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}TicketNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TCRNumber" type="{http://www.travelport.com/schema/air_v18_0}typeTCRNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirRefundModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}HostToken" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Ignore" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "tcrNumber",
    "airRefundModifiers",
    "hostToken"
})
@XmlRootElement(name = "AirRefundQuoteReq")
public class AirRefundQuoteReq
    extends BaseReq
{

    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<String> ticketNumber;
    @XmlElement(name = "TCRNumber")
    protected List<String> tcrNumber;
    @XmlElement(name = "AirRefundModifiers")
    protected AirRefundModifiers airRefundModifiers;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<HostToken> hostToken;
    @XmlAttribute(name = "Ignore")
    protected Boolean ignore;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * Gets the value of the tcrNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTCRNumber() {
        if (tcrNumber == null) {
            tcrNumber = new ArrayList<String>();
        }
        return this.tcrNumber;
    }

    /**
     * Gets the value of the airRefundModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirRefundModifiers }
     *     
     */
    public AirRefundModifiers getAirRefundModifiers() {
        return airRefundModifiers;
    }

    /**
     * Sets the value of the airRefundModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundModifiers }
     *     
     */
    public void setAirRefundModifiers(AirRefundModifiers value) {
        this.airRefundModifiers = value;
    }

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
     * Gets the value of the ignore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnore() {
        if (ignore == null) {
            return false;
        } else {
            return ignore;
        }
    }

    /**
     * Sets the value of the ignore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnore(Boolean value) {
        this.ignore = value;
    }

}
