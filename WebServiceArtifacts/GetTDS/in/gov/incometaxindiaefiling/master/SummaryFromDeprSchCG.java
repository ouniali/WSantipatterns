
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}PlantMachinerySummaryCG" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}BuildingSummaryCG" minOccurs="0"/>
 *         &lt;element name="FurnitureSummary" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IntangibleAssetSummary" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShipsSummary" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDepreciation">
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
    "plantMachinerySummaryCG",
    "buildingSummaryCG",
    "furnitureSummary",
    "intangibleAssetSummary",
    "shipsSummary",
    "totalDepreciation"
})
@XmlRootElement(name = "SummaryFromDeprSchCG")
public class SummaryFromDeprSchCG {

    @XmlElement(name = "PlantMachinerySummaryCG")
    protected PlantMachinerySummaryCG plantMachinerySummaryCG;
    @XmlElement(name = "BuildingSummaryCG")
    protected BuildingSummaryCG buildingSummaryCG;
    @XmlElement(name = "FurnitureSummary", defaultValue = "0")
    protected Long furnitureSummary;
    @XmlElement(name = "IntangibleAssetSummary", defaultValue = "0")
    protected Long intangibleAssetSummary;
    @XmlElement(name = "ShipsSummary", defaultValue = "0")
    protected Long shipsSummary;
    @XmlElement(name = "TotalDepreciation", defaultValue = "0")
    protected long totalDepreciation;

    /**
     * Gets the value of the plantMachinerySummaryCG property.
     * 
     * @return
     *     possible object is
     *     {@link PlantMachinerySummaryCG }
     *     
     */
    public PlantMachinerySummaryCG getPlantMachinerySummaryCG() {
        return plantMachinerySummaryCG;
    }

    /**
     * Sets the value of the plantMachinerySummaryCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlantMachinerySummaryCG }
     *     
     */
    public void setPlantMachinerySummaryCG(PlantMachinerySummaryCG value) {
        this.plantMachinerySummaryCG = value;
    }

    /**
     * Gets the value of the buildingSummaryCG property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingSummaryCG }
     *     
     */
    public BuildingSummaryCG getBuildingSummaryCG() {
        return buildingSummaryCG;
    }

    /**
     * Sets the value of the buildingSummaryCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingSummaryCG }
     *     
     */
    public void setBuildingSummaryCG(BuildingSummaryCG value) {
        this.buildingSummaryCG = value;
    }

    /**
     * Gets the value of the furnitureSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFurnitureSummary() {
        return furnitureSummary;
    }

    /**
     * Sets the value of the furnitureSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFurnitureSummary(Long value) {
        this.furnitureSummary = value;
    }

    /**
     * Gets the value of the intangibleAssetSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntangibleAssetSummary() {
        return intangibleAssetSummary;
    }

    /**
     * Sets the value of the intangibleAssetSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntangibleAssetSummary(Long value) {
        this.intangibleAssetSummary = value;
    }

    /**
     * Gets the value of the shipsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipsSummary() {
        return shipsSummary;
    }

    /**
     * Sets the value of the shipsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipsSummary(Long value) {
        this.shipsSummary = value;
    }

    /**
     * Gets the value of the totalDepreciation property.
     * 
     */
    public long getTotalDepreciation() {
        return totalDepreciation;
    }

    /**
     * Sets the value of the totalDepreciation property.
     * 
     */
    public void setTotalDepreciation(long value) {
        this.totalDepreciation = value;
    }

}
