
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
 *         &lt;element name="PlantMachinery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate15" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate30" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate40" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate50" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate60" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate80" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate100" minOccurs="0"/>
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
    "plantMachinery"
})
@XmlRootElement(name = "ScheduleDPM")
public class ScheduleDPM {

    @XmlElement(name = "PlantMachinery", required = true)
    protected ScheduleDPM.PlantMachinery plantMachinery;

    /**
     * Gets the value of the plantMachinery property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDPM.PlantMachinery }
     *     
     */
    public ScheduleDPM.PlantMachinery getPlantMachinery() {
        return plantMachinery;
    }

    /**
     * Sets the value of the plantMachinery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDPM.PlantMachinery }
     *     
     */
    public void setPlantMachinery(ScheduleDPM.PlantMachinery value) {
        this.plantMachinery = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate15" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate30" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate40" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate50" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate60" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate80" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate100" minOccurs="0"/>
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
        "rate15",
        "rate30",
        "rate40",
        "rate50",
        "rate60",
        "rate80",
        "rate100"
    })
    public static class PlantMachinery {

        @XmlElement(name = "Rate15")
        protected Rate15 rate15;
        @XmlElement(name = "Rate30")
        protected Rate30 rate30;
        @XmlElement(name = "Rate40")
        protected Rate40 rate40;
        @XmlElement(name = "Rate50")
        protected Rate50 rate50;
        @XmlElement(name = "Rate60")
        protected Rate60 rate60;
        @XmlElement(name = "Rate80")
        protected Rate80 rate80;
        @XmlElement(name = "Rate100")
        protected Rate100 rate100;

        /**
         * Gets the value of the rate15 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate15 }
         *     
         */
        public Rate15 getRate15() {
            return rate15;
        }

        /**
         * Sets the value of the rate15 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate15 }
         *     
         */
        public void setRate15(Rate15 value) {
            this.rate15 = value;
        }

        /**
         * Gets the value of the rate30 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate30 }
         *     
         */
        public Rate30 getRate30() {
            return rate30;
        }

        /**
         * Sets the value of the rate30 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate30 }
         *     
         */
        public void setRate30(Rate30 value) {
            this.rate30 = value;
        }

        /**
         * Gets the value of the rate40 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate40 }
         *     
         */
        public Rate40 getRate40() {
            return rate40;
        }

        /**
         * Sets the value of the rate40 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate40 }
         *     
         */
        public void setRate40(Rate40 value) {
            this.rate40 = value;
        }

        /**
         * Gets the value of the rate50 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate50 }
         *     
         */
        public Rate50 getRate50() {
            return rate50;
        }

        /**
         * Sets the value of the rate50 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate50 }
         *     
         */
        public void setRate50(Rate50 value) {
            this.rate50 = value;
        }

        /**
         * Gets the value of the rate60 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate60 }
         *     
         */
        public Rate60 getRate60() {
            return rate60;
        }

        /**
         * Sets the value of the rate60 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate60 }
         *     
         */
        public void setRate60(Rate60 value) {
            this.rate60 = value;
        }

        /**
         * Gets the value of the rate80 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate80 }
         *     
         */
        public Rate80 getRate80() {
            return rate80;
        }

        /**
         * Sets the value of the rate80 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate80 }
         *     
         */
        public void setRate80(Rate80 value) {
            this.rate80 = value;
        }

        /**
         * Gets the value of the rate100 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate100 }
         *     
         */
        public Rate100 getRate100() {
            return rate100;
        }

        /**
         * Sets the value of the rate100 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate100 }
         *     
         */
        public void setRate100(Rate100 value) {
            this.rate100 = value;
        }

    }

}
