
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
 *         &lt;element name="SpecifiedPersonName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="75"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PANofSpecPerson" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReltnShip">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NatureOfInc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmtIncluded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
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
    "specifiedPersonName",
    "paNofSpecPerson",
    "reltnShip",
    "natureOfInc",
    "amtIncluded"
})
@XmlRootElement(name = "SpecifiedPerson")
public class SpecifiedPerson {

    @XmlElement(name = "SpecifiedPersonName", required = true)
    protected String specifiedPersonName;
    @XmlElement(name = "PANofSpecPerson")
    protected String paNofSpecPerson;
    @XmlElement(name = "ReltnShip", required = true)
    protected String reltnShip;
    @XmlElement(name = "NatureOfInc", required = true)
    protected String natureOfInc;
    @XmlElement(name = "AmtIncluded", defaultValue = "0")
    protected long amtIncluded;

    /**
     * Gets the value of the specifiedPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifiedPersonName() {
        return specifiedPersonName;
    }

    /**
     * Sets the value of the specifiedPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecifiedPersonName(String value) {
        this.specifiedPersonName = value;
    }

    /**
     * Gets the value of the paNofSpecPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANofSpecPerson() {
        return paNofSpecPerson;
    }

    /**
     * Sets the value of the paNofSpecPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANofSpecPerson(String value) {
        this.paNofSpecPerson = value;
    }

    /**
     * Gets the value of the reltnShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReltnShip() {
        return reltnShip;
    }

    /**
     * Sets the value of the reltnShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReltnShip(String value) {
        this.reltnShip = value;
    }

    /**
     * Gets the value of the natureOfInc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfInc() {
        return natureOfInc;
    }

    /**
     * Sets the value of the natureOfInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfInc(String value) {
        this.natureOfInc = value;
    }

    /**
     * Gets the value of the amtIncluded property.
     * 
     */
    public long getAmtIncluded() {
        return amtIncluded;
    }

    /**
     * Sets the value of the amtIncluded property.
     * 
     */
    public void setAmtIncluded(long value) {
        this.amtIncluded = value;
    }

}
