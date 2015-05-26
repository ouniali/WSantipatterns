
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Please note that you don't need all elements. The more elements the better result.
 *           
 * 
 * <p>Java class for PackageInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Height" type="{http://www.bring.no/logistics/shippingguide/1.0}UnitCodeLengthType" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.bring.no/logistics/shippingguide/1.0}UnitCodeLengthType" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.bring.no/logistics/shippingguide/1.0}UnitCodeLengthType" minOccurs="0"/>
 *         &lt;element name="GrossWeight" type="{http://www.bring.no/logistics/shippingguide/1.0}UnitCodeWeightType" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.bring.no/logistics/shippingguide/1.0}UnitCodeCubicType" minOccurs="0"/>
 *         &lt;element name="VolumeSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="packageId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageInputType", propOrder = {

})
public class PackageInputType {

    @XmlElement(name = "Height")
    protected UnitCodeLengthType height;
    @XmlElement(name = "Width")
    protected UnitCodeLengthType width;
    @XmlElement(name = "Length")
    protected UnitCodeLengthType length;
    @XmlElement(name = "GrossWeight")
    protected UnitCodeWeightType grossWeight;
    @XmlElement(name = "Volume")
    protected UnitCodeCubicType volume;
    @XmlElement(name = "VolumeSpecial", defaultValue = "false")
    protected Boolean volumeSpecial;
    @XmlAttribute(name = "packageId")
    protected String packageId;

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link UnitCodeLengthType }
     *     
     */
    public UnitCodeLengthType getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitCodeLengthType }
     *     
     */
    public void setHeight(UnitCodeLengthType value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link UnitCodeLengthType }
     *     
     */
    public UnitCodeLengthType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitCodeLengthType }
     *     
     */
    public void setWidth(UnitCodeLengthType value) {
        this.width = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link UnitCodeLengthType }
     *     
     */
    public UnitCodeLengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitCodeLengthType }
     *     
     */
    public void setLength(UnitCodeLengthType value) {
        this.length = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link UnitCodeWeightType }
     *     
     */
    public UnitCodeWeightType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitCodeWeightType }
     *     
     */
    public void setGrossWeight(UnitCodeWeightType value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link UnitCodeCubicType }
     *     
     */
    public UnitCodeCubicType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitCodeCubicType }
     *     
     */
    public void setVolume(UnitCodeCubicType value) {
        this.volume = value;
    }

    /**
     * Gets the value of the volumeSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolumeSpecial() {
        return volumeSpecial;
    }

    /**
     * Sets the value of the volumeSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolumeSpecial(Boolean value) {
        this.volumeSpecial = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

}
