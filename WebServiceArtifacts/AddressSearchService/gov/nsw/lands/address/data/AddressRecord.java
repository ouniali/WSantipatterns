
package gov.nsw.lands.address.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseNumberFirst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="houseNumberFirstSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseNumberSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="houseNumberSecondSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="roadName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roadSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roadType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortAddressString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suburbName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="council" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseNumberString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressPoint" type="{http://data.address.lands.nsw.gov}AddressPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressRecord", propOrder = {
    "houseNumberFirst",
    "houseNumberFirstSuffix",
    "houseNumberSecond",
    "houseNumberSecondSuffix",
    "objectId",
    "postCode",
    "roadName",
    "roadSuffix",
    "roadType",
    "shortAddressString",
    "suburbName",
    "addressType",
    "council",
    "houseNumberString",
    "addressPoint"
})
@XmlSeeAlso({
    LotAddressRecord.class
})
public class AddressRecord {

    protected int houseNumberFirst;
    @XmlElement(required = true, nillable = true)
    protected String houseNumberFirstSuffix;
    protected int houseNumberSecond;
    @XmlElement(required = true, nillable = true)
    protected String houseNumberSecondSuffix;
    protected long objectId;
    protected long postCode;
    @XmlElement(required = true, nillable = true)
    protected String roadName;
    @XmlElement(required = true, nillable = true)
    protected String roadSuffix;
    @XmlElement(required = true, nillable = true)
    protected String roadType;
    @XmlElement(required = true, nillable = true)
    protected String shortAddressString;
    @XmlElement(required = true, nillable = true)
    protected String suburbName;
    @XmlElement(required = true, nillable = true)
    protected String addressType;
    @XmlElement(required = true, nillable = true)
    protected String council;
    @XmlElement(required = true, nillable = true)
    protected String houseNumberString;
    @XmlElement(required = true, nillable = true)
    protected AddressPoint addressPoint;

    /**
     * Gets the value of the houseNumberFirst property.
     * 
     */
    public int getHouseNumberFirst() {
        return houseNumberFirst;
    }

    /**
     * Sets the value of the houseNumberFirst property.
     * 
     */
    public void setHouseNumberFirst(int value) {
        this.houseNumberFirst = value;
    }

    /**
     * Gets the value of the houseNumberFirstSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberFirstSuffix() {
        return houseNumberFirstSuffix;
    }

    /**
     * Sets the value of the houseNumberFirstSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberFirstSuffix(String value) {
        this.houseNumberFirstSuffix = value;
    }

    /**
     * Gets the value of the houseNumberSecond property.
     * 
     */
    public int getHouseNumberSecond() {
        return houseNumberSecond;
    }

    /**
     * Sets the value of the houseNumberSecond property.
     * 
     */
    public void setHouseNumberSecond(int value) {
        this.houseNumberSecond = value;
    }

    /**
     * Gets the value of the houseNumberSecondSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberSecondSuffix() {
        return houseNumberSecondSuffix;
    }

    /**
     * Sets the value of the houseNumberSecondSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberSecondSuffix(String value) {
        this.houseNumberSecondSuffix = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     */
    public long getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     */
    public void setObjectId(long value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     */
    public long getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     */
    public void setPostCode(long value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the roadSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadSuffix() {
        return roadSuffix;
    }

    /**
     * Sets the value of the roadSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadSuffix(String value) {
        this.roadSuffix = value;
    }

    /**
     * Gets the value of the roadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadType() {
        return roadType;
    }

    /**
     * Sets the value of the roadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadType(String value) {
        this.roadType = value;
    }

    /**
     * Gets the value of the shortAddressString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortAddressString() {
        return shortAddressString;
    }

    /**
     * Sets the value of the shortAddressString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortAddressString(String value) {
        this.shortAddressString = value;
    }

    /**
     * Gets the value of the suburbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburbName() {
        return suburbName;
    }

    /**
     * Sets the value of the suburbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburbName(String value) {
        this.suburbName = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the council property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouncil() {
        return council;
    }

    /**
     * Sets the value of the council property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouncil(String value) {
        this.council = value;
    }

    /**
     * Gets the value of the houseNumberString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberString() {
        return houseNumberString;
    }

    /**
     * Sets the value of the houseNumberString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberString(String value) {
        this.houseNumberString = value;
    }

    /**
     * Gets the value of the addressPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPoint }
     *     
     */
    public AddressPoint getAddressPoint() {
        return addressPoint;
    }

    /**
     * Sets the value of the addressPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPoint }
     *     
     */
    public void setAddressPoint(AddressPoint value) {
        this.addressPoint = value;
    }

}
