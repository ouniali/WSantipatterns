
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAffiliationInfoTypeLoyalProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypeLoyalProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyalProgram" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProgramDescription" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProgramRestriction" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType1" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfAffiliationInfoTypeLoyalProgram", propOrder = {
    "loyalProgram"
})
public class ArrayOfAffiliationInfoTypeLoyalProgram {

    @XmlElement(name = "LoyalProgram")
    protected List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram> loyalProgram;

    /**
     * Gets the value of the loyalProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram }
     * 
     * 
     */
    public List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram> getLoyalProgram() {
        if (loyalProgram == null) {
            loyalProgram = new ArrayList<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram>();
        }
        return this.loyalProgram;
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
     *         &lt;element name="ProgramDescription" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProgramRestriction" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType1" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "programDescription",
        "programRestriction",
        "blackoutDates"
    })
    public static class LoyalProgram {

        @XmlElement(name = "ProgramDescription")
        protected List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription> programDescription;
        @XmlElement(name = "ProgramRestriction")
        protected ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction programRestriction;
        @XmlElement(name = "BlackoutDates")
        protected ArrayOfDateTimeSpanType1 blackoutDates;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "ProgramName")
        protected String programName;
        @XmlAttribute(name = "SecondaryProgramName")
        protected String secondaryProgramName;
        @XmlAttribute(name = "AffiliateProgramName")
        protected String affiliateProgramName;
        @XmlAttribute(name = "HotelLevel")
        protected String hotelLevel;
        @XmlAttribute(name = "ProgramCode")
        protected String programCode;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;

        /**
         * Gets the value of the programDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the programDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgramDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription }
         * 
         * 
         */
        public List<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription> getProgramDescription() {
            if (programDescription == null) {
                programDescription = new ArrayList<ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription>();
            }
            return this.programDescription;
        }

        /**
         * Gets the value of the programRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
         *     
         */
        public ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction getProgramRestriction() {
            return programRestriction;
        }

        /**
         * Sets the value of the programRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
         *     
         */
        public void setProgramRestriction(ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction value) {
            this.programRestriction = value;
        }

        /**
         * Gets the value of the blackoutDates property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfDateTimeSpanType1 }
         *     
         */
        public ArrayOfDateTimeSpanType1 getBlackoutDates() {
            return blackoutDates;
        }

        /**
         * Sets the value of the blackoutDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfDateTimeSpanType1 }
         *     
         */
        public void setBlackoutDates(ArrayOfDateTimeSpanType1 value) {
            this.blackoutDates = value;
        }

        /**
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRemoval() {
            if (removal == null) {
                return false;
            } else {
                return removal;
            }
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * Gets the value of the secondaryProgramName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryProgramName() {
            return secondaryProgramName;
        }

        /**
         * Sets the value of the secondaryProgramName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryProgramName(String value) {
            this.secondaryProgramName = value;
        }

        /**
         * Gets the value of the affiliateProgramName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAffiliateProgramName() {
            return affiliateProgramName;
        }

        /**
         * Sets the value of the affiliateProgramName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAffiliateProgramName(String value) {
            this.affiliateProgramName = value;
        }

        /**
         * Gets the value of the hotelLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelLevel() {
            return hotelLevel;
        }

        /**
         * Sets the value of the hotelLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelLevel(String value) {
            this.hotelLevel = value;
        }

        /**
         * Gets the value of the programCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * Sets the value of the programCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProgramDescription
            extends ParagraphType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProgramRestriction
            extends ParagraphType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }

    }

}
