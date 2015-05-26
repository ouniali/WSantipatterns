
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SailingCategoryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SailingCategoryInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType">
 *       &lt;sequence>
 *         &lt;element name="SelectedCategory" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinAttributes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinAttribute" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SelectedCabin" maxOccurs="3" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinAttributes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CabinAttribute" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryDetailGroup"/>
 *                 &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingCategoryInfoType", propOrder = {
    "selectedCategory"
})
public class SailingCategoryInfoType
    extends SailingInfoType
{

    @XmlElement(name = "SelectedCategory")
    protected List<SailingCategoryInfoType.SelectedCategory> selectedCategory;

    /**
     * Gets the value of the selectedCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingCategoryInfoType.SelectedCategory }
     * 
     * 
     */
    public List<SailingCategoryInfoType.SelectedCategory> getSelectedCategory() {
        if (selectedCategory == null) {
            selectedCategory = new ArrayList<SailingCategoryInfoType.SelectedCategory>();
        }
        return this.selectedCategory;
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
     *         &lt;element name="CabinAttributes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinAttribute" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SelectedCabin" maxOccurs="3" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinAttributes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CabinAttribute" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryDetailGroup"/>
     *       &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cabinAttributes",
        "selectedCabin"
    })
    public static class SelectedCategory {

        @XmlElement(name = "CabinAttributes")
        protected SailingCategoryInfoType.SelectedCategory.CabinAttributes cabinAttributes;
        @XmlElement(name = "SelectedCabin")
        protected List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> selectedCabin;
        @XmlAttribute(name = "WaitlistIndicator")
        protected Boolean waitlistIndicator;
        @XmlAttribute(name = "FareCode")
        protected String fareCode;
        @XmlAttribute(name = "GroupCode")
        protected String groupCode;
        @XmlAttribute(name = "BerthedCategoryCode")
        protected String berthedCategoryCode;
        @XmlAttribute(name = "PricedCategoryCode")
        protected String pricedCategoryCode;
        @XmlAttribute(name = "DeckNumber")
        protected String deckNumber;
        @XmlAttribute(name = "DeckName")
        protected String deckName;

        /**
         * Gets the value of the cabinAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes }
         *     
         */
        public SailingCategoryInfoType.SelectedCategory.CabinAttributes getCabinAttributes() {
            return cabinAttributes;
        }

        /**
         * Sets the value of the cabinAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes }
         *     
         */
        public void setCabinAttributes(SailingCategoryInfoType.SelectedCategory.CabinAttributes value) {
            this.cabinAttributes = value;
        }

        /**
         * Gets the value of the selectedCabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedCabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
         * 
         * 
         */
        public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> getSelectedCabin() {
            if (selectedCabin == null) {
                selectedCabin = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin>();
            }
            return this.selectedCabin;
        }

        /**
         * Gets the value of the waitlistIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWaitlistIndicator() {
            return waitlistIndicator;
        }

        /**
         * Sets the value of the waitlistIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWaitlistIndicator(Boolean value) {
            this.waitlistIndicator = value;
        }

        /**
         * Gets the value of the fareCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * Sets the value of the fareCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * Gets the value of the groupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * Sets the value of the groupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }

        /**
         * Gets the value of the berthedCategoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBerthedCategoryCode() {
            return berthedCategoryCode;
        }

        /**
         * Sets the value of the berthedCategoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBerthedCategoryCode(String value) {
            this.berthedCategoryCode = value;
        }

        /**
         * Gets the value of the pricedCategoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricedCategoryCode() {
            return pricedCategoryCode;
        }

        /**
         * Sets the value of the pricedCategoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricedCategoryCode(String value) {
            this.pricedCategoryCode = value;
        }

        /**
         * Gets the value of the deckNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeckNumber() {
            return deckNumber;
        }

        /**
         * Sets the value of the deckNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeckNumber(String value) {
            this.deckNumber = value;
        }

        /**
         * Gets the value of the deckName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeckName() {
            return deckName;
        }

        /**
         * Sets the value of the deckName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeckName(String value) {
            this.deckName = value;
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
         *         &lt;element name="CabinAttribute" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "cabinAttribute"
        })
        public static class CabinAttributes {

            @XmlElement(name = "CabinAttribute", required = true)
            protected List<SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute> cabinAttribute;

            /**
             * Gets the value of the cabinAttribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinAttribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute }
             * 
             * 
             */
            public List<SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute> getCabinAttribute() {
                if (cabinAttribute == null) {
                    cabinAttribute = new ArrayList<SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute>();
                }
                return this.cabinAttribute;
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
             *       &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CabinAttribute {

                @XmlAttribute(name = "CabinAttributeCode")
                protected String cabinAttributeCode;

                /**
                 * Gets the value of the cabinAttributeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCabinAttributeCode() {
                    return cabinAttributeCode;
                }

                /**
                 * Sets the value of the cabinAttributeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCabinAttributeCode(String value) {
                    this.cabinAttributeCode = value;
                }

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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
         *       &lt;sequence>
         *         &lt;element name="CabinAttributes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CabinAttribute" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cabinAttributes"
        })
        public static class SelectedCabin
            extends CabinOptionType
        {

            @XmlElement(name = "CabinAttributes")
            protected SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes cabinAttributes;

            /**
             * Gets the value of the cabinAttributes property.
             * 
             * @return
             *     possible object is
             *     {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes }
             *     
             */
            public SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes getCabinAttributes() {
                return cabinAttributes;
            }

            /**
             * Sets the value of the cabinAttributes property.
             * 
             * @param value
             *     allowed object is
             *     {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes }
             *     
             */
            public void setCabinAttributes(SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes value) {
                this.cabinAttributes = value;
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
             *         &lt;element name="CabinAttribute" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
                "cabinAttribute"
            })
            public static class CabinAttributes {

                @XmlElement(name = "CabinAttribute", required = true)
                protected List<SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute> cabinAttribute;

                /**
                 * Gets the value of the cabinAttribute property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cabinAttribute property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCabinAttribute().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute }
                 * 
                 * 
                 */
                public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute> getCabinAttribute() {
                    if (cabinAttribute == null) {
                        cabinAttribute = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute>();
                    }
                    return this.cabinAttribute;
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
                 *       &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CabinAttribute {

                    @XmlAttribute(name = "CabinAttributeCode")
                    protected String cabinAttributeCode;

                    /**
                     * Gets the value of the cabinAttributeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCabinAttributeCode() {
                        return cabinAttributeCode;
                    }

                    /**
                     * Sets the value of the cabinAttributeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCabinAttributeCode(String value) {
                        this.cabinAttributeCode = value;
                    }

                }

            }

        }

    }

}
