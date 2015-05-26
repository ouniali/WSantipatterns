
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="BaseFarePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCardCommision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="FPromoAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="PerSegPaxPriceDiff" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxPriceDifference" minOccurs="0"/>
 *         &lt;element name="PkgAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PkgDispAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Totalb2bMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispPriceDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPriceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "adultPrice",
    "baseFarePrice",
    "cCardCommision",
    "cRatio",
    "childPrice",
    "fPromoAmount",
    "infantPrice",
    "perSegPaxPriceDiff",
    "pkgAmt",
    "pkgDispAmt",
    "priceDiff",
    "totalMarkup",
    "totalPrice",
    "totalTax",
    "totalb2BMarkup",
    "dispPriceDiff",
    "dispPriceText",
    "dispTotalPrice",
    "dispTotalTax"
})
public class PriceInformation {

    @XmlElementRef(name = "AdultPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PerPaxPriceInfo> adultPrice;
    @XmlElement(name = "BaseFarePrice")
    protected BigDecimal baseFarePrice;
    @XmlElement(name = "CCardCommision")
    protected BigDecimal cCardCommision;
    @XmlElement(name = "CRatio")
    protected BigDecimal cRatio;
    @XmlElementRef(name = "ChildPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PerPaxPriceInfo> childPrice;
    @XmlElement(name = "FPromoAmount")
    protected BigDecimal fPromoAmount;
    @XmlElementRef(name = "InfantPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PerPaxPriceInfo> infantPrice;
    @XmlElementRef(name = "PerSegPaxPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxPriceDifference> perSegPaxPriceDiff;
    @XmlElement(name = "PkgAmt")
    protected BigDecimal pkgAmt;
    @XmlElementRef(name = "PkgDispAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pkgDispAmt;
    @XmlElement(name = "PriceDiff")
    protected BigDecimal priceDiff;
    @XmlElement(name = "TotalMarkup")
    protected BigDecimal totalMarkup;
    @XmlElement(name = "TotalPrice")
    protected BigDecimal totalPrice;
    @XmlElement(name = "TotalTax")
    protected BigDecimal totalTax;
    @XmlElement(name = "Totalb2bMarkup")
    protected BigDecimal totalb2BMarkup;
    @XmlElementRef(name = "dispPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPriceDiff;
    @XmlElementRef(name = "dispPriceText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPriceText;
    @XmlElementRef(name = "dispTotalPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalPrice;
    @XmlElementRef(name = "dispTotalTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalTax;

    /**
     * Gets the value of the adultPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
     *     
     */
    public JAXBElement<PerPaxPriceInfo> getAdultPrice() {
        return adultPrice;
    }

    /**
     * Sets the value of the adultPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
     *     
     */
    public void setAdultPrice(JAXBElement<PerPaxPriceInfo> value) {
        this.adultPrice = value;
    }

    /**
     * Gets the value of the baseFarePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFarePrice() {
        return baseFarePrice;
    }

    /**
     * Sets the value of the baseFarePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFarePrice(BigDecimal value) {
        this.baseFarePrice = value;
    }

    /**
     * Gets the value of the cCardCommision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCardCommision() {
        return cCardCommision;
    }

    /**
     * Sets the value of the cCardCommision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCardCommision(BigDecimal value) {
        this.cCardCommision = value;
    }

    /**
     * Gets the value of the cRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRatio() {
        return cRatio;
    }

    /**
     * Sets the value of the cRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRatio(BigDecimal value) {
        this.cRatio = value;
    }

    /**
     * Gets the value of the childPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
     *     
     */
    public JAXBElement<PerPaxPriceInfo> getChildPrice() {
        return childPrice;
    }

    /**
     * Sets the value of the childPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
     *     
     */
    public void setChildPrice(JAXBElement<PerPaxPriceInfo> value) {
        this.childPrice = value;
    }

    /**
     * Gets the value of the fPromoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFPromoAmount() {
        return fPromoAmount;
    }

    /**
     * Sets the value of the fPromoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFPromoAmount(BigDecimal value) {
        this.fPromoAmount = value;
    }

    /**
     * Gets the value of the infantPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
     *     
     */
    public JAXBElement<PerPaxPriceInfo> getInfantPrice() {
        return infantPrice;
    }

    /**
     * Sets the value of the infantPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
     *     
     */
    public void setInfantPrice(JAXBElement<PerPaxPriceInfo> value) {
        this.infantPrice = value;
    }

    /**
     * Gets the value of the perSegPaxPriceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}
     *     
     */
    public JAXBElement<PaxPriceDifference> getPerSegPaxPriceDiff() {
        return perSegPaxPriceDiff;
    }

    /**
     * Sets the value of the perSegPaxPriceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}
     *     
     */
    public void setPerSegPaxPriceDiff(JAXBElement<PaxPriceDifference> value) {
        this.perSegPaxPriceDiff = value;
    }

    /**
     * Gets the value of the pkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPkgAmt() {
        return pkgAmt;
    }

    /**
     * Sets the value of the pkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPkgAmt(BigDecimal value) {
        this.pkgAmt = value;
    }

    /**
     * Gets the value of the pkgDispAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgDispAmt() {
        return pkgDispAmt;
    }

    /**
     * Sets the value of the pkgDispAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgDispAmt(JAXBElement<String> value) {
        this.pkgDispAmt = value;
    }

    /**
     * Gets the value of the priceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDiff() {
        return priceDiff;
    }

    /**
     * Sets the value of the priceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDiff(BigDecimal value) {
        this.priceDiff = value;
    }

    /**
     * Gets the value of the totalMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMarkup() {
        return totalMarkup;
    }

    /**
     * Sets the value of the totalMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMarkup(BigDecimal value) {
        this.totalMarkup = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the totalb2BMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalb2BMarkup() {
        return totalb2BMarkup;
    }

    /**
     * Sets the value of the totalb2BMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalb2BMarkup(BigDecimal value) {
        this.totalb2BMarkup = value;
    }

    /**
     * Gets the value of the dispPriceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPriceDiff() {
        return dispPriceDiff;
    }

    /**
     * Sets the value of the dispPriceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPriceDiff(JAXBElement<String> value) {
        this.dispPriceDiff = value;
    }

    /**
     * Gets the value of the dispPriceText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPriceText() {
        return dispPriceText;
    }

    /**
     * Sets the value of the dispPriceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPriceText(JAXBElement<String> value) {
        this.dispPriceText = value;
    }

    /**
     * Gets the value of the dispTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalPrice() {
        return dispTotalPrice;
    }

    /**
     * Sets the value of the dispTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalPrice(JAXBElement<String> value) {
        this.dispTotalPrice = value;
    }

    /**
     * Gets the value of the dispTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalTax() {
        return dispTotalTax;
    }

    /**
     * Sets the value of the dispTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalTax(JAXBElement<String> value) {
        this.dispTotalTax = value;
    }

}
