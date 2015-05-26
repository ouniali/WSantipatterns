
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PeriodPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}PkgPriceType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="Category">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Room"/>
 *             &lt;enumeration value="Booking"/>
 *             &lt;enumeration value="Person"/>
 *             &lt;enumeration value="Adult"/>
 *             &lt;enumeration value="Child"/>
 *             &lt;enumeration value="Car"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Base"/>
 *             &lt;enumeration value="AddOn"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DurationPeriod" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
 *       &lt;attribute name="PriceBasis" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
 *       &lt;attribute name="BasePeriodRPHs" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="GuidePriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaximumPeriod" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodPriceType", propOrder = {
    "price"
})
public class PeriodPriceType
    extends OperationScheduleType
{

    @XmlElement(name = "Price")
    protected List<PkgPriceType> price;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Category")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String category;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "DurationPeriod")
    protected String durationPeriod;
    @XmlAttribute(name = "PriceBasis")
    protected PricingType priceBasis;
    @XmlAttribute(name = "BasePeriodRPHs")
    protected List<String> basePeriodRPHs;
    @XmlAttribute(name = "GuidePriceIndicator")
    protected Boolean guidePriceIndicator;
    @XmlAttribute(name = "MaximumPeriod")
    protected String maximumPeriod;

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PkgPriceType }
     * 
     * 
     */
    public List<PkgPriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<PkgPriceType>();
        }
        return this.price;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the durationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Sets the value of the durationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationPeriod(String value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the priceBasis property.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPriceBasis() {
        return priceBasis;
    }

    /**
     * Sets the value of the priceBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPriceBasis(PricingType value) {
        this.priceBasis = value;
    }

    /**
     * Gets the value of the basePeriodRPHs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePeriodRPHs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePeriodRPHs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBasePeriodRPHs() {
        if (basePeriodRPHs == null) {
            basePeriodRPHs = new ArrayList<String>();
        }
        return this.basePeriodRPHs;
    }

    /**
     * Gets the value of the guidePriceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuidePriceIndicator() {
        return guidePriceIndicator;
    }

    /**
     * Sets the value of the guidePriceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuidePriceIndicator(Boolean value) {
        this.guidePriceIndicator = value;
    }

    /**
     * Gets the value of the maximumPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumPeriod() {
        return maximumPeriod;
    }

    /**
     * Sets the value of the maximumPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumPeriod(String value) {
        this.maximumPeriod = value;
    }

}
