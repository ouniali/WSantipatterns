
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExtrasInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtrasInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ExtrasCoreType">
 *       &lt;sequence>
 *         &lt;element name="Criteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="YearsExperience" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DateRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DurationRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="StockControlledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaximumOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Periods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Period" type="{http://www.opentravel.org/OTA/2003/05}PeriodPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInfoPrompt" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AdditionalInfoText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="LineNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ParentExtras" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtrasSelectionGroup"/>
 *                 &lt;attribute name="ListOfParentRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExtraLocationInfo" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="PickUp"/>
 *                       &lt;enumeration value="DropOff"/>
 *                       &lt;enumeration value="Both"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtrasSelectionGroup"/>
 *       &lt;attribute name="ApplyTo">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="SelectedPax"/>
 *             &lt;enumeration value="AllPax"/>
 *             &lt;enumeration value="NoPax"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrasInfoType", propOrder = {
    "criteria",
    "periods",
    "additionalInfoPrompt",
    "parentExtras",
    "extraLocationInfo"
})
public class ExtrasInfoType
    extends ExtrasCoreType
{

    @XmlElement(name = "Criteria")
    protected ExtrasInfoType.Criteria criteria;
    @XmlElement(name = "Periods")
    protected ExtrasInfoType.Periods periods;
    @XmlElement(name = "AdditionalInfoPrompt")
    protected List<ExtrasInfoType.AdditionalInfoPrompt> additionalInfoPrompt;
    @XmlElement(name = "ParentExtras")
    protected ExtrasInfoType.ParentExtras parentExtras;
    @XmlElement(name = "ExtraLocationInfo")
    protected List<ExtrasInfoType.ExtraLocationInfo> extraLocationInfo;
    @XmlAttribute(name = "ApplyTo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String applyTo;
    @XmlAttribute(name = "SelectionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectionType;
    @XmlAttribute(name = "RuleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ruleCode;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasInfoType.Criteria }
     *     
     */
    public ExtrasInfoType.Criteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasInfoType.Criteria }
     *     
     */
    public void setCriteria(ExtrasInfoType.Criteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasInfoType.Periods }
     *     
     */
    public ExtrasInfoType.Periods getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasInfoType.Periods }
     *     
     */
    public void setPeriods(ExtrasInfoType.Periods value) {
        this.periods = value;
    }

    /**
     * Gets the value of the additionalInfoPrompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoPrompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoPrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrasInfoType.AdditionalInfoPrompt }
     * 
     * 
     */
    public List<ExtrasInfoType.AdditionalInfoPrompt> getAdditionalInfoPrompt() {
        if (additionalInfoPrompt == null) {
            additionalInfoPrompt = new ArrayList<ExtrasInfoType.AdditionalInfoPrompt>();
        }
        return this.additionalInfoPrompt;
    }

    /**
     * Gets the value of the parentExtras property.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasInfoType.ParentExtras }
     *     
     */
    public ExtrasInfoType.ParentExtras getParentExtras() {
        return parentExtras;
    }

    /**
     * Sets the value of the parentExtras property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasInfoType.ParentExtras }
     *     
     */
    public void setParentExtras(ExtrasInfoType.ParentExtras value) {
        this.parentExtras = value;
    }

    /**
     * Gets the value of the extraLocationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraLocationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraLocationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrasInfoType.ExtraLocationInfo }
     * 
     * 
     */
    public List<ExtrasInfoType.ExtraLocationInfo> getExtraLocationInfo() {
        if (extraLocationInfo == null) {
            extraLocationInfo = new ArrayList<ExtrasInfoType.ExtraLocationInfo>();
        }
        return this.extraLocationInfo;
    }

    /**
     * Gets the value of the applyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTo() {
        return applyTo;
    }

    /**
     * Sets the value of the applyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTo(String value) {
        this.applyTo = value;
    }

    /**
     * Gets the value of the selectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * Sets the value of the selectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionType(String value) {
        this.selectionType = value;
    }

    /**
     * Gets the value of the ruleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * Sets the value of the ruleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCode(String value) {
        this.ruleCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AdditionalInfoText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="LineNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalInfoPrompt {

        @XmlAttribute(name = "AdditionalInfoText")
        protected String additionalInfoText;
        @XmlAttribute(name = "LineNumber")
        protected Integer lineNumber;

        /**
         * Gets the value of the additionalInfoText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfoText() {
            return additionalInfoText;
        }

        /**
         * Sets the value of the additionalInfoText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalInfoText(String value) {
            this.additionalInfoText = value;
        }

        /**
         * Gets the value of the lineNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLineNumber() {
            return lineNumber;
        }

        /**
         * Sets the value of the lineNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLineNumber(Integer value) {
            this.lineNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="YearsExperience" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DateRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DurationRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="StockControlledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaximumOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Criteria {

        @XmlAttribute(name = "MinimumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minimumAge;
        @XmlAttribute(name = "MaximumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maximumAge;
        @XmlAttribute(name = "YearsExperience")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger yearsExperience;
        @XmlAttribute(name = "DateRequiredInd")
        protected Boolean dateRequiredInd;
        @XmlAttribute(name = "DurationRequiredInd")
        protected Boolean durationRequiredInd;
        @XmlAttribute(name = "StockControlledInd")
        protected Boolean stockControlledInd;
        @XmlAttribute(name = "MaximumOccupancy")
        protected Integer maximumOccupancy;

        /**
         * Gets the value of the minimumAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumAge() {
            return minimumAge;
        }

        /**
         * Sets the value of the minimumAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumAge(BigInteger value) {
            this.minimumAge = value;
        }

        /**
         * Gets the value of the maximumAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAge() {
            return maximumAge;
        }

        /**
         * Sets the value of the maximumAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAge(BigInteger value) {
            this.maximumAge = value;
        }

        /**
         * Gets the value of the yearsExperience property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getYearsExperience() {
            return yearsExperience;
        }

        /**
         * Sets the value of the yearsExperience property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setYearsExperience(BigInteger value) {
            this.yearsExperience = value;
        }

        /**
         * Gets the value of the dateRequiredInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDateRequiredInd() {
            return dateRequiredInd;
        }

        /**
         * Sets the value of the dateRequiredInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDateRequiredInd(Boolean value) {
            this.dateRequiredInd = value;
        }

        /**
         * Gets the value of the durationRequiredInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDurationRequiredInd() {
            return durationRequiredInd;
        }

        /**
         * Sets the value of the durationRequiredInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDurationRequiredInd(Boolean value) {
            this.durationRequiredInd = value;
        }

        /**
         * Gets the value of the stockControlledInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStockControlledInd() {
            return stockControlledInd;
        }

        /**
         * Sets the value of the stockControlledInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStockControlledInd(Boolean value) {
            this.stockControlledInd = value;
        }

        /**
         * Gets the value of the maximumOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaximumOccupancy() {
            return maximumOccupancy;
        }

        /**
         * Sets the value of the maximumOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaximumOccupancy(Integer value) {
            this.maximumOccupancy = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="PickUp"/>
     *             &lt;enumeration value="DropOff"/>
     *             &lt;enumeration value="Both"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtraLocationInfo {

        @XmlAttribute(name = "Location")
        protected String location;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtrasSelectionGroup"/>
     *       &lt;attribute name="ListOfParentRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ParentExtras {

        @XmlAttribute(name = "ListOfParentRPH")
        protected List<String> listOfParentRPH;
        @XmlAttribute(name = "SelectionType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String selectionType;
        @XmlAttribute(name = "RuleCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String ruleCode;

        /**
         * Gets the value of the listOfParentRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfParentRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfParentRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfParentRPH() {
            if (listOfParentRPH == null) {
                listOfParentRPH = new ArrayList<String>();
            }
            return this.listOfParentRPH;
        }

        /**
         * Gets the value of the selectionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectionType() {
            return selectionType;
        }

        /**
         * Sets the value of the selectionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectionType(String value) {
            this.selectionType = value;
        }

        /**
         * Gets the value of the ruleCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleCode() {
            return ruleCode;
        }

        /**
         * Sets the value of the ruleCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleCode(String value) {
            this.ruleCode = value;
        }

    }


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
     *         &lt;element name="Period" type="{http://www.opentravel.org/OTA/2003/05}PeriodPriceType" maxOccurs="unbounded"/>
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
        "period"
    })
    public static class Periods {

        @XmlElement(name = "Period", required = true)
        protected List<PeriodPriceType> period;

        /**
         * Gets the value of the period property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the period property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PeriodPriceType }
         * 
         * 
         */
        public List<PeriodPriceType> getPeriod() {
            if (period == null) {
                period = new ArrayList<PeriodPriceType>();
            }
            return this.period;
        }

    }

}
