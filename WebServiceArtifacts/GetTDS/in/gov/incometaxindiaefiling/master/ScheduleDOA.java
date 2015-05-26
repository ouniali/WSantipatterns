
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
 *         &lt;element name="Building" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate5" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate10" minOccurs="0"/>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate100" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FurnitureFittings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IntangibleAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate25" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ships" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate20" minOccurs="0"/>
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
    "building",
    "furnitureFittings",
    "intangibleAssets",
    "ships"
})
@XmlRootElement(name = "ScheduleDOA")
public class ScheduleDOA {

    @XmlElement(name = "Building")
    protected ScheduleDOA.Building building;
    @XmlElement(name = "FurnitureFittings")
    protected ScheduleDOA.FurnitureFittings furnitureFittings;
    @XmlElement(name = "IntangibleAssets")
    protected ScheduleDOA.IntangibleAssets intangibleAssets;
    @XmlElement(name = "Ships")
    protected ScheduleDOA.Ships ships;

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDOA.Building }
     *     
     */
    public ScheduleDOA.Building getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDOA.Building }
     *     
     */
    public void setBuilding(ScheduleDOA.Building value) {
        this.building = value;
    }

    /**
     * Gets the value of the furnitureFittings property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDOA.FurnitureFittings }
     *     
     */
    public ScheduleDOA.FurnitureFittings getFurnitureFittings() {
        return furnitureFittings;
    }

    /**
     * Sets the value of the furnitureFittings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDOA.FurnitureFittings }
     *     
     */
    public void setFurnitureFittings(ScheduleDOA.FurnitureFittings value) {
        this.furnitureFittings = value;
    }

    /**
     * Gets the value of the intangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDOA.IntangibleAssets }
     *     
     */
    public ScheduleDOA.IntangibleAssets getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * Sets the value of the intangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDOA.IntangibleAssets }
     *     
     */
    public void setIntangibleAssets(ScheduleDOA.IntangibleAssets value) {
        this.intangibleAssets = value;
    }

    /**
     * Gets the value of the ships property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDOA.Ships }
     *     
     */
    public ScheduleDOA.Ships getShips() {
        return ships;
    }

    /**
     * Sets the value of the ships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDOA.Ships }
     *     
     */
    public void setShips(ScheduleDOA.Ships value) {
        this.ships = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate5" minOccurs="0"/>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate10" minOccurs="0"/>
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
        "rate5",
        "rate10",
        "rate100"
    })
    public static class Building {

        @XmlElement(name = "Rate5")
        protected Rate5 rate5;
        @XmlElement(name = "Rate10")
        protected Rate10 rate10;
        @XmlElement(name = "Rate100")
        protected Rate100 rate100;

        /**
         * Gets the value of the rate5 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate5 }
         *     
         */
        public Rate5 getRate5() {
            return rate5;
        }

        /**
         * Sets the value of the rate5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate5 }
         *     
         */
        public void setRate5(Rate5 value) {
            this.rate5 = value;
        }

        /**
         * Gets the value of the rate10 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate10 }
         *     
         */
        public Rate10 getRate10() {
            return rate10;
        }

        /**
         * Sets the value of the rate10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate10 }
         *     
         */
        public void setRate10(Rate10 value) {
            this.rate10 = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate10" minOccurs="0"/>
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
        "rate10"
    })
    public static class FurnitureFittings {

        @XmlElement(name = "Rate10")
        protected Rate10 rate10;

        /**
         * Gets the value of the rate10 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate10 }
         *     
         */
        public Rate10 getRate10() {
            return rate10;
        }

        /**
         * Sets the value of the rate10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate10 }
         *     
         */
        public void setRate10(Rate10 value) {
            this.rate10 = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate25" minOccurs="0"/>
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
        "rate25"
    })
    public static class IntangibleAssets {

        @XmlElement(name = "Rate25")
        protected Rate25 rate25;

        /**
         * Gets the value of the rate25 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate25 }
         *     
         */
        public Rate25 getRate25() {
            return rate25;
        }

        /**
         * Sets the value of the rate25 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate25 }
         *     
         */
        public void setRate25(Rate25 value) {
            this.rate25 = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Rate20" minOccurs="0"/>
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
        "rate20"
    })
    public static class Ships {

        @XmlElement(name = "Rate20")
        protected Rate20 rate20;

        /**
         * Gets the value of the rate20 property.
         * 
         * @return
         *     possible object is
         *     {@link Rate20 }
         *     
         */
        public Rate20 getRate20() {
            return rate20;
        }

        /**
         * Sets the value of the rate20 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rate20 }
         *     
         */
        public void setRate20(Rate20 value) {
            this.rate20 = value;
        }

    }

}
