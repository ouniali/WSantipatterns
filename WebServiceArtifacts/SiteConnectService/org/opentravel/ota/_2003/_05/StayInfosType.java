
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayInfosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayInfosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StayInfo" type="{http://www.opentravel.org/OTA/2003/05}StayInfoType" maxOccurs="99"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayInfosType", propOrder = {
    "stayInfo"
})
public class StayInfosType {

    @XmlElement(name = "StayInfo", required = true)
    protected List<StayInfoType> stayInfo;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "AreaID")
    protected String areaID;

    /**
     * Gets the value of the stayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StayInfoType }
     * 
     * 
     */
    public List<StayInfoType> getStayInfo() {
        if (stayInfo == null) {
            stayInfo = new ArrayList<StayInfoType>();
        }
        return this.stayInfo;
    }

    /**
     * Gets the value of the chainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Sets the value of the chainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * Sets the value of the hotelCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelCodeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * Sets the value of the hotelCodeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * Gets the value of the chainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Sets the value of the chainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the areaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Sets the value of the areaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

}
