
package gov.nsw.lands.address.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roadName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roadType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suburb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "houseNumber",
    "roadName",
    "roadType",
    "suburb",
    "postCode",
    "projection"
})
@XmlRootElement(name = "findAddress")
public class FindAddress {

    @XmlElement(required = true, nillable = true)
    protected String houseNumber;
    @XmlElement(required = true, nillable = true)
    protected String roadName;
    @XmlElement(required = true, nillable = true)
    protected String roadType;
    @XmlElement(required = true, nillable = true)
    protected String suburb;
    @XmlElement(required = true, nillable = true)
    protected String postCode;
    @XmlElement(required = true, nillable = true)
    protected String projection;

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
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
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjection(String value) {
        this.projection = value;
    }

}
