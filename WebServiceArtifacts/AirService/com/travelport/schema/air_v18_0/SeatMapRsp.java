
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseRsp;
import com.travelport.schema.common_v15_0.HostToken;
import com.travelport.schema.common_v15_0.PaymentRestriction;
import com.travelport.schema.common_v15_0.Remark;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}HostToken" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}CabinClass"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SearchTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Remark" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Row" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PaymentRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GroupSeatPrice" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
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
    "cabinClass",
    "airSegment",
    "searchTraveler",
    "remark",
    "row",
    "paymentRestriction"
})
@XmlRootElement(name = "SeatMapRsp")
public class SeatMapRsp
    extends BaseRsp
{

    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected HostToken hostToken;
    @XmlElement(name = "CabinClass", required = true)
    protected CabinClass cabinClass;
    @XmlElement(name = "AirSegment")
    protected AirSegment airSegment;
    @XmlElement(name = "SearchTraveler")
    protected List<SearchTraveler> searchTraveler;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Remark remark;
    @XmlElement(name = "Row", required = true)
    protected List<Row> row;
    @XmlElement(name = "PaymentRestriction", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<PaymentRestriction> paymentRestriction;
    @XmlAttribute(name = "GroupSeatPrice")
    protected String groupSeatPrice;

    /**
     * Gets the value of the hostToken property.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     */
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the airSegment property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegment }
     *     
     */
    public AirSegment getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegment }
     *     
     */
    public void setAirSegment(AirSegment value) {
        this.airSegment = value;
    }

    /**
     * Gets the value of the searchTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * 
     * 
     */
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<SearchTraveler>();
        }
        return this.searchTraveler;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link Remark }
     *     
     */
    public Remark getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remark }
     *     
     */
    public void setRemark(Remark value) {
        this.remark = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Row }
     * 
     * 
     */
    public List<Row> getRow() {
        if (row == null) {
            row = new ArrayList<Row>();
        }
        return this.row;
    }

    /**
     * Information regarding valid payment types, if restrictions apply(supplier specific) Gets the value of the paymentRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRestriction }
     * 
     * 
     */
    public List<PaymentRestriction> getPaymentRestriction() {
        if (paymentRestriction == null) {
            paymentRestriction = new ArrayList<PaymentRestriction>();
        }
        return this.paymentRestriction;
    }

    /**
     * Gets the value of the groupSeatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSeatPrice() {
        return groupSeatPrice;
    }

    /**
     * Sets the value of the groupSeatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSeatPrice(String value) {
        this.groupSeatPrice = value;
    }

}
