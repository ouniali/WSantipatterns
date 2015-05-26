
package gov.nsw.lands.address.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotAddressRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotAddressRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.address.lands.nsw.gov}AddressRecord">
 *       &lt;sequence>
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="planType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sectionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotAddressRecord", propOrder = {
    "lotNumber",
    "planNumber",
    "planType",
    "sectionNumber"
})
public class LotAddressRecord
    extends AddressRecord
{

    @XmlElement(required = true, nillable = true)
    protected String lotNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer planNumber;
    @XmlElement(required = true, nillable = true)
    protected String planType;
    @XmlElement(required = true, nillable = true)
    protected String sectionNumber;

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the planNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanNumber() {
        return planNumber;
    }

    /**
     * Sets the value of the planNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanNumber(Integer value) {
        this.planNumber = value;
    }

    /**
     * Gets the value of the planType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Sets the value of the planType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanType(String value) {
        this.planType = value;
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionNumber(String value) {
        this.sectionNumber = value;
    }

}
