
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRatePlanCandidatesTypeRatePlanCandidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanCandidatesTypeRatePlanCandidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanCandidate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef" minOccurs="0"/>
 *                   &lt;element name="MealsIncluded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MealPlanCodes">
 *                             &lt;simpleType>
 *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfRatePlanCandidatesTypeRatePlanCandidate", propOrder = {
    "ratePlanCandidate"
})
public class ArrayOfRatePlanCandidatesTypeRatePlanCandidate {

    @XmlElement(name = "RatePlanCandidate")
    protected List<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate> ratePlanCandidate;

    /**
     * Gets the value of the ratePlanCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate }
     * 
     * 
     */
    public List<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate> getRatePlanCandidate() {
        if (ratePlanCandidate == null) {
            ratePlanCandidate = new ArrayList<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate>();
        }
        return this.ratePlanCandidate;
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
     *         &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef" minOccurs="0"/>
     *         &lt;element name="MealsIncluded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MealPlanCodes">
     *                   &lt;simpleType>
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelRefs",
        "mealsIncluded"
    })
    public static class RatePlanCandidate {

        @XmlElement(name = "HotelRefs")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef hotelRefs;
        @XmlElement(name = "MealsIncluded")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded mealsIncluded;
        @XmlAttribute(name = "RatePlanType")
        protected String ratePlanType;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "RatePlanID")
        protected String ratePlanID;
        @XmlAttribute(name = "RatePlanQualifier")
        protected Boolean ratePlanQualifier;
        @XmlAttribute(name = "RatePlanCategory")
        protected String ratePlanCategory;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the hotelRefs property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef getHotelRefs() {
            return hotelRefs;
        }

        /**
         * Sets the value of the hotelRefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
         *     
         */
        public void setHotelRefs(ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef value) {
            this.hotelRefs = value;
        }

        /**
         * Gets the value of the mealsIncluded property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded getMealsIncluded() {
            return mealsIncluded;
        }

        /**
         * Sets the value of the mealsIncluded property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
         *     
         */
        public void setMealsIncluded(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded value) {
            this.mealsIncluded = value;
        }

        /**
         * Gets the value of the ratePlanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanType() {
            return ratePlanType;
        }

        /**
         * Sets the value of the ratePlanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanType(String value) {
            this.ratePlanType = value;
        }

        /**
         * Gets the value of the ratePlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * Sets the value of the ratePlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * Gets the value of the ratePlanID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanID() {
            return ratePlanID;
        }

        /**
         * Sets the value of the ratePlanID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanID(String value) {
            this.ratePlanID = value;
        }

        /**
         * Gets the value of the ratePlanQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRatePlanQualifier() {
            return ratePlanQualifier;
        }

        /**
         * Sets the value of the ratePlanQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRatePlanQualifier(Boolean value) {
            this.ratePlanQualifier = value;
        }

        /**
         * Gets the value of the ratePlanCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCategory() {
            return ratePlanCategory;
        }

        /**
         * Sets the value of the ratePlanCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCategory(String value) {
            this.ratePlanCategory = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MealPlanCodes">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class MealsIncluded {

            @XmlAttribute(name = "Breakfast")
            protected Boolean breakfast;
            @XmlAttribute(name = "Lunch")
            protected Boolean lunch;
            @XmlAttribute(name = "Dinner")
            protected Boolean dinner;
            @XmlAttribute(name = "MealPlanIndicator")
            protected Boolean mealPlanIndicator;
            @XmlAttribute(name = "MealPlanCodes")
            protected List<String> mealPlanCodes;

            /**
             * Gets the value of the breakfast property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBreakfast() {
                return breakfast;
            }

            /**
             * Sets the value of the breakfast property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBreakfast(Boolean value) {
                this.breakfast = value;
            }

            /**
             * Gets the value of the lunch property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLunch() {
                return lunch;
            }

            /**
             * Sets the value of the lunch property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLunch(Boolean value) {
                this.lunch = value;
            }

            /**
             * Gets the value of the dinner property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDinner() {
                return dinner;
            }

            /**
             * Sets the value of the dinner property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDinner(Boolean value) {
                this.dinner = value;
            }

            /**
             * Gets the value of the mealPlanIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMealPlanIndicator() {
                return mealPlanIndicator;
            }

            /**
             * Sets the value of the mealPlanIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMealPlanIndicator(Boolean value) {
                this.mealPlanIndicator = value;
            }

            /**
             * Gets the value of the mealPlanCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlanCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMealPlanCodes() {
                if (mealPlanCodes == null) {
                    mealPlanCodes = new ArrayList<String>();
                }
                return this.mealPlanCodes;
            }

        }

    }

}
