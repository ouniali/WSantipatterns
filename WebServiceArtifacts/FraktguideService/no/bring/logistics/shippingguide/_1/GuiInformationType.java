
package no.bring.logistics.shippingguide._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuiInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuiInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MainDisplayCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubDisplayCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HelpText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxWeightInKgs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuiInformationType", propOrder = {
    "sortOrder",
    "mainDisplayCategory",
    "subDisplayCategory",
    "displayName",
    "productName",
    "descriptionText",
    "helpText",
    "tip",
    "maxWeightInKgs"
})
public class GuiInformationType {

    @XmlElement(name = "SortOrder", required = true)
    protected String sortOrder;
    @XmlElement(name = "MainDisplayCategory", required = true)
    protected String mainDisplayCategory;
    @XmlElement(name = "SubDisplayCategory", required = true)
    protected String subDisplayCategory;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "ProductName", required = true)
    protected String productName;
    @XmlElement(name = "DescriptionText", required = true)
    protected String descriptionText;
    @XmlElement(name = "HelpText", required = true)
    protected String helpText;
    @XmlElement(name = "Tip", required = true)
    protected String tip;
    @XmlElement(name = "MaxWeightInKgs", required = true, nillable = true)
    protected BigDecimal maxWeightInKgs;

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the mainDisplayCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDisplayCategory() {
        return mainDisplayCategory;
    }

    /**
     * Sets the value of the mainDisplayCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDisplayCategory(String value) {
        this.mainDisplayCategory = value;
    }

    /**
     * Gets the value of the subDisplayCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDisplayCategory() {
        return subDisplayCategory;
    }

    /**
     * Sets the value of the subDisplayCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDisplayCategory(String value) {
        this.subDisplayCategory = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the descriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTip(String value) {
        this.tip = value;
    }

    /**
     * Gets the value of the maxWeightInKgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWeightInKgs() {
        return maxWeightInKgs;
    }

    /**
     * Sets the value of the maxWeightInKgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWeightInKgs(BigDecimal value) {
        this.maxWeightInKgs = value;
    }

}
