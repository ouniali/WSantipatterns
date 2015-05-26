
package in.gov.incometaxindiaefiling.master;

import java.math.BigDecimal;
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
 *         &lt;element name="ItemName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnitOfMeasure">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *               &lt;enumeration value="101"/>
 *               &lt;enumeration value="102"/>
 *               &lt;enumeration value="103"/>
 *               &lt;enumeration value="104"/>
 *               &lt;enumeration value="105"/>
 *               &lt;enumeration value="106"/>
 *               &lt;enumeration value="107"/>
 *               &lt;enumeration value="108"/>
 *               &lt;enumeration value="109"/>
 *               &lt;enumeration value="110"/>
 *               &lt;enumeration value="111"/>
 *               &lt;enumeration value="112"/>
 *               &lt;enumeration value="113"/>
 *               &lt;enumeration value="114"/>
 *               &lt;enumeration value="115"/>
 *               &lt;enumeration value="116"/>
 *               &lt;enumeration value="117"/>
 *               &lt;enumeration value="118"/>
 *               &lt;enumeration value="119"/>
 *               &lt;enumeration value="120"/>
 *               &lt;enumeration value="121"/>
 *               &lt;enumeration value="122"/>
 *               &lt;enumeration value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OpeningStock">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PurchaseQty">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrevYrConsum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrevyrManfact" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SaleQty">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClgStock">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="yldFinisProd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PercentYld" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AnyShortExces">
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
    "itemName",
    "unitOfMeasure",
    "openingStock",
    "purchaseQty",
    "prevYrConsum",
    "prevyrManfact",
    "saleQty",
    "clgStock",
    "yldFinisProd",
    "percentYld",
    "anyShortExces"
})
@XmlRootElement(name = "QuantitDet")
public class QuantitDet {

    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "UnitOfMeasure", required = true)
    protected String unitOfMeasure;
    @XmlElement(name = "OpeningStock", required = true, defaultValue = "0")
    protected BigInteger openingStock;
    @XmlElement(name = "PurchaseQty", required = true, defaultValue = "0")
    protected BigInteger purchaseQty;
    @XmlElement(name = "PrevYrConsum", defaultValue = "0")
    protected BigInteger prevYrConsum;
    @XmlElement(name = "PrevyrManfact", defaultValue = "0")
    protected BigInteger prevyrManfact;
    @XmlElement(name = "SaleQty", required = true, defaultValue = "0")
    protected BigInteger saleQty;
    @XmlElement(name = "ClgStock", required = true, defaultValue = "0")
    protected BigInteger clgStock;
    @XmlElement(defaultValue = "0")
    protected BigInteger yldFinisProd;
    @XmlElement(name = "PercentYld", defaultValue = "0")
    protected BigDecimal percentYld;
    @XmlElement(name = "AnyShortExces", defaultValue = "0")
    protected long anyShortExces;

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the openingStock property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpeningStock() {
        return openingStock;
    }

    /**
     * Sets the value of the openingStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpeningStock(BigInteger value) {
        this.openingStock = value;
    }

    /**
     * Gets the value of the purchaseQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseQty() {
        return purchaseQty;
    }

    /**
     * Sets the value of the purchaseQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseQty(BigInteger value) {
        this.purchaseQty = value;
    }

    /**
     * Gets the value of the prevYrConsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrevYrConsum() {
        return prevYrConsum;
    }

    /**
     * Sets the value of the prevYrConsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrevYrConsum(BigInteger value) {
        this.prevYrConsum = value;
    }

    /**
     * Gets the value of the prevyrManfact property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrevyrManfact() {
        return prevyrManfact;
    }

    /**
     * Sets the value of the prevyrManfact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrevyrManfact(BigInteger value) {
        this.prevyrManfact = value;
    }

    /**
     * Gets the value of the saleQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSaleQty() {
        return saleQty;
    }

    /**
     * Sets the value of the saleQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSaleQty(BigInteger value) {
        this.saleQty = value;
    }

    /**
     * Gets the value of the clgStock property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClgStock() {
        return clgStock;
    }

    /**
     * Sets the value of the clgStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClgStock(BigInteger value) {
        this.clgStock = value;
    }

    /**
     * Gets the value of the yldFinisProd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYldFinisProd() {
        return yldFinisProd;
    }

    /**
     * Sets the value of the yldFinisProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYldFinisProd(BigInteger value) {
        this.yldFinisProd = value;
    }

    /**
     * Gets the value of the percentYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentYld() {
        return percentYld;
    }

    /**
     * Sets the value of the percentYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentYld(BigDecimal value) {
        this.percentYld = value;
    }

    /**
     * Gets the value of the anyShortExces property.
     * 
     */
    public long getAnyShortExces() {
        return anyShortExces;
    }

    /**
     * Sets the value of the anyShortExces property.
     * 
     */
    public void setAnyShortExces(long value) {
        this.anyShortExces = value;
    }

}
