
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}PlantMachinerySummary" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}BuildingSummary" minOccurs="0"/>
 *         &lt;element name="FurnitureSummary" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntangibleAssetSummary" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipsSummary" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDepreciation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
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
    "plantMachinerySummary",
    "buildingSummary",
    "furnitureSummary",
    "intangibleAssetSummary",
    "shipsSummary",
    "totalDepreciation"
})
@XmlRootElement(name = "SummaryFromDeprSch")
public class SummaryFromDeprSch {

    @XmlElement(name = "PlantMachinerySummary")
    protected PlantMachinerySummary plantMachinerySummary;
    @XmlElement(name = "BuildingSummary")
    protected BuildingSummary buildingSummary;
    @XmlElement(name = "FurnitureSummary", defaultValue = "0")
    protected BigInteger furnitureSummary;
    @XmlElement(name = "IntangibleAssetSummary", defaultValue = "0")
    protected BigInteger intangibleAssetSummary;
    @XmlElement(name = "ShipsSummary", defaultValue = "0")
    protected BigInteger shipsSummary;
    @XmlElement(name = "TotalDepreciation", required = true, defaultValue = "0")
    protected BigInteger totalDepreciation;

    /**
     * Gets the value of the plantMachinerySummary property.
     * 
     * @return
     *     possible object is
     *     {@link PlantMachinerySummary }
     *     
     */
    public PlantMachinerySummary getPlantMachinerySummary() {
        return plantMachinerySummary;
    }

    /**
     * Sets the value of the plantMachinerySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlantMachinerySummary }
     *     
     */
    public void setPlantMachinerySummary(PlantMachinerySummary value) {
        this.plantMachinerySummary = value;
    }

    /**
     * Gets the value of the buildingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingSummary }
     *     
     */
    public BuildingSummary getBuildingSummary() {
        return buildingSummary;
    }

    /**
     * Sets the value of the buildingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingSummary }
     *     
     */
    public void setBuildingSummary(BuildingSummary value) {
        this.buildingSummary = value;
    }

    /**
     * Gets the value of the furnitureSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFurnitureSummary() {
        return furnitureSummary;
    }

    /**
     * Sets the value of the furnitureSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFurnitureSummary(BigInteger value) {
        this.furnitureSummary = value;
    }

    /**
     * Gets the value of the intangibleAssetSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntangibleAssetSummary() {
        return intangibleAssetSummary;
    }

    /**
     * Sets the value of the intangibleAssetSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntangibleAssetSummary(BigInteger value) {
        this.intangibleAssetSummary = value;
    }

    /**
     * Gets the value of the shipsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShipsSummary() {
        return shipsSummary;
    }

    /**
     * Sets the value of the shipsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShipsSummary(BigInteger value) {
        this.shipsSummary = value;
    }

    /**
     * Gets the value of the totalDepreciation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDepreciation() {
        return totalDepreciation;
    }

    /**
     * Sets the value of the totalDepreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDepreciation(BigInteger value) {
        this.totalDepreciation = value;
    }

}
