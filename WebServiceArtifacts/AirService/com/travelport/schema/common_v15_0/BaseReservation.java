
package com.travelport.schema.common_v15_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v18_0.AirReservation;
import com.travelport.schema.hotel_v17_0.HotelReservation;
import com.travelport.schema.passive_v14_0.PassiveReservation;
import com.travelport.schema.rail_v12_0.RailReservation;
import com.travelport.schema.vehicle_v17_0.VehicleReservation;


/**
 * <p>Java class for BaseReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountingRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Restriction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PassiveInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="CreateDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReservation", propOrder = {
    "accountingRemark",
    "generalRemark",
    "restriction",
    "passiveInfo"
})
@XmlSeeAlso({
    RailReservation.class,
    PassiveReservation.class,
    VehicleReservation.class,
    HotelReservation.class,
    AirReservation.class
})
public class BaseReservation {

    @XmlElement(name = "AccountingRemark")
    protected List<AccountingRemark> accountingRemark;
    @XmlElement(name = "GeneralRemark")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "Restriction")
    protected List<Restriction> restriction;
    @XmlElement(name = "PassiveInfo")
    protected PassiveInfo passiveInfo;
    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;
    @XmlAttribute(name = "CreateDate", required = true)
    protected String createDate;
    @XmlAttribute(name = "ModifiedDate", required = true)
    protected String modifiedDate;
    @XmlAttribute(name = "CustomerNumber")
    protected String customerNumber;

    /**
     * Gets the value of the accountingRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * 
     * 
     */
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<AccountingRemark>();
        }
        return this.accountingRemark;
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
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * 
     * 
     */
    public List<Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<Restriction>();
        }
        return this.restriction;
    }

    /**
     * Gets the value of the passiveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveInfo }
     *     
     */
    public PassiveInfo getPassiveInfo() {
        return passiveInfo;
    }

    /**
     * Sets the value of the passiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveInfo }
     *     
     */
    public void setPassiveInfo(PassiveInfo value) {
        this.passiveInfo = value;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

}
