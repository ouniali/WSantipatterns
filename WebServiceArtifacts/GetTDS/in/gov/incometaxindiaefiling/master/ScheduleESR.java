
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
 *         &lt;element name="DeductionUs35">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Section35_1_i">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Section35_1_ii">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Section35_1_iii">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Section35_1_iv">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Section35_2AA">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Section35_2AB">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TotUs35">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
 *                           &lt;/sequence>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deductionUs35"
})
@XmlRootElement(name = "ScheduleESR")
public class ScheduleESR {

    @XmlElement(name = "DeductionUs35", required = true)
    protected ScheduleESR.DeductionUs35 deductionUs35;

    /**
     * Gets the value of the deductionUs35 property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleESR.DeductionUs35 }
     *     
     */
    public ScheduleESR.DeductionUs35 getDeductionUs35() {
        return deductionUs35;
    }

    /**
     * Sets the value of the deductionUs35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleESR.DeductionUs35 }
     *     
     */
    public void setDeductionUs35(ScheduleESR.DeductionUs35 value) {
        this.deductionUs35 = value;
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
     *         &lt;element name="Section35_1_i">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Section35_1_ii">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Section35_1_iii">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Section35_1_iv">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Section35_2AA">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Section35_2AB">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TotUs35">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
     *                 &lt;/sequence>
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
        "section351I",
        "section351Ii",
        "section351Iii",
        "section351Iv",
        "section352AA",
        "section352AB",
        "totUs35"
    })
    public static class DeductionUs35 {

        @XmlElement(name = "Section35_1_i", required = true)
        protected ScheduleESR.DeductionUs35 .Section351I section351I;
        @XmlElement(name = "Section35_1_ii", required = true)
        protected ScheduleESR.DeductionUs35 .Section351Ii section351Ii;
        @XmlElement(name = "Section35_1_iii", required = true)
        protected ScheduleESR.DeductionUs35 .Section351Iii section351Iii;
        @XmlElement(name = "Section35_1_iv", required = true)
        protected ScheduleESR.DeductionUs35 .Section351Iv section351Iv;
        @XmlElement(name = "Section35_2AA", required = true)
        protected ScheduleESR.DeductionUs35 .Section352AA section352AA;
        @XmlElement(name = "Section35_2AB", required = true)
        protected ScheduleESR.DeductionUs35 .Section352AB section352AB;
        @XmlElement(name = "TotUs35", required = true)
        protected ScheduleESR.DeductionUs35 .TotUs35 totUs35;

        /**
         * Gets the value of the section351I property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .Section351I }
         *     
         */
        public ScheduleESR.DeductionUs35 .Section351I getSection351I() {
            return section351I;
        }

        /**
         * Sets the value of the section351I property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .Section351I }
         *     
         */
        public void setSection351I(ScheduleESR.DeductionUs35 .Section351I value) {
            this.section351I = value;
        }

        /**
         * Gets the value of the section351Ii property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .Section351Ii }
         *     
         */
        public ScheduleESR.DeductionUs35 .Section351Ii getSection351Ii() {
            return section351Ii;
        }

        /**
         * Sets the value of the section351Ii property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .Section351Ii }
         *     
         */
        public void setSection351Ii(ScheduleESR.DeductionUs35 .Section351Ii value) {
            this.section351Ii = value;
        }

        /**
         * Gets the value of the section351Iii property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .Section351Iii }
         *     
         */
        public ScheduleESR.DeductionUs35 .Section351Iii getSection351Iii() {
            return section351Iii;
        }

        /**
         * Sets the value of the section351Iii property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .Section351Iii }
         *     
         */
        public void setSection351Iii(ScheduleESR.DeductionUs35 .Section351Iii value) {
            this.section351Iii = value;
        }

        /**
         * Gets the value of the section351Iv property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .Section351Iv }
         *     
         */
        public ScheduleESR.DeductionUs35 .Section351Iv getSection351Iv() {
            return section351Iv;
        }

        /**
         * Sets the value of the section351Iv property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .Section351Iv }
         *     
         */
        public void setSection351Iv(ScheduleESR.DeductionUs35 .Section351Iv value) {
            this.section351Iv = value;
        }

        /**
         * Gets the value of the section352AA property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .Section352AA }
         *     
         */
        public ScheduleESR.DeductionUs35 .Section352AA getSection352AA() {
            return section352AA;
        }

        /**
         * Sets the value of the section352AA property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .Section352AA }
         *     
         */
        public void setSection352AA(ScheduleESR.DeductionUs35 .Section352AA value) {
            this.section352AA = value;
        }

        /**
         * Gets the value of the section352AB property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .Section352AB }
         *     
         */
        public ScheduleESR.DeductionUs35 .Section352AB getSection352AB() {
            return section352AB;
        }

        /**
         * Sets the value of the section352AB property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .Section352AB }
         *     
         */
        public void setSection352AB(ScheduleESR.DeductionUs35 .Section352AB value) {
            this.section352AB = value;
        }

        /**
         * Gets the value of the totUs35 property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleESR.DeductionUs35 .TotUs35 }
         *     
         */
        public ScheduleESR.DeductionUs35 .TotUs35 getTotUs35() {
            return totUs35;
        }

        /**
         * Sets the value of the totUs35 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleESR.DeductionUs35 .TotUs35 }
         *     
         */
        public void setTotUs35(ScheduleESR.DeductionUs35 .TotUs35 value) {
            this.totUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class Section351I {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class Section351Ii {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class Section351Iii {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class Section351Iv {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class Section352AA {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class Section352AB {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUs35"/>
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
            "deductUs35"
        })
        public static class TotUs35 {

            @XmlElement(name = "DeductUs35", required = true)
            protected DeductUs35 deductUs35;

            /**
             * Gets the value of the deductUs35 property.
             * 
             * @return
             *     possible object is
             *     {@link DeductUs35 }
             *     
             */
            public DeductUs35 getDeductUs35() {
                return deductUs35;
            }

            /**
             * Sets the value of the deductUs35 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DeductUs35 }
             *     
             */
            public void setDeductUs35(DeductUs35 value) {
                this.deductUs35 = value;
            }

        }

    }

}
