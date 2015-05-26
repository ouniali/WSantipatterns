
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element name="CoOwnersSNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameCoOwner">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAN_CoOwner" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PercentShareProperty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "coOwnersSNo",
    "nameCoOwner",
    "panCoOwner",
    "percentShareProperty"
})
@XmlRootElement(name = "CoOwners")
public class CoOwners {

    @XmlElement(name = "CoOwnersSNo")
    protected int coOwnersSNo;
    @XmlElement(name = "NameCoOwner", required = true)
    protected String nameCoOwner;
    @XmlElement(name = "PAN_CoOwner")
    protected String panCoOwner;
    @XmlElement(name = "PercentShareProperty", defaultValue = "0")
    protected Double percentShareProperty;

    /**
     * Gets the value of the coOwnersSNo property.
     * 
     */
    public int getCoOwnersSNo() {
        return coOwnersSNo;
    }

    /**
     * Sets the value of the coOwnersSNo property.
     * 
     */
    public void setCoOwnersSNo(int value) {
        this.coOwnersSNo = value;
    }

    /**
     * Gets the value of the nameCoOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCoOwner() {
        return nameCoOwner;
    }

    /**
     * Sets the value of the nameCoOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCoOwner(String value) {
        this.nameCoOwner = value;
    }

    /**
     * Gets the value of the panCoOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANCoOwner() {
        return panCoOwner;
    }

    /**
     * Sets the value of the panCoOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANCoOwner(String value) {
        this.panCoOwner = value;
    }

    /**
     * Gets the value of the percentShareProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentShareProperty() {
        return percentShareProperty;
    }

    /**
     * Sets the value of the percentShareProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentShareProperty(Double value) {
        this.percentShareProperty = value;
    }

}
