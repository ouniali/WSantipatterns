
package in.gov.incometaxindiaefiling.master;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="TradingConcern" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ManfactrConcern" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RawMaterial">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FinishrByProd">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
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
    "tradingConcern",
    "manfactrConcern"
})
@XmlRootElement(name = "PARTA_QD")
public class PARTAQD {

    @XmlElement(name = "TradingConcern")
    protected PARTAQD.TradingConcern tradingConcern;
    @XmlElement(name = "ManfactrConcern")
    protected PARTAQD.ManfactrConcern manfactrConcern;

    /**
     * Gets the value of the tradingConcern property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAQD.TradingConcern }
     *     
     */
    public PARTAQD.TradingConcern getTradingConcern() {
        return tradingConcern;
    }

    /**
     * Sets the value of the tradingConcern property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAQD.TradingConcern }
     *     
     */
    public void setTradingConcern(PARTAQD.TradingConcern value) {
        this.tradingConcern = value;
    }

    /**
     * Gets the value of the manfactrConcern property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAQD.ManfactrConcern }
     *     
     */
    public PARTAQD.ManfactrConcern getManfactrConcern() {
        return manfactrConcern;
    }

    /**
     * Sets the value of the manfactrConcern property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAQD.ManfactrConcern }
     *     
     */
    public void setManfactrConcern(PARTAQD.ManfactrConcern value) {
        this.manfactrConcern = value;
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
     *         &lt;element name="RawMaterial">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FinishrByProd">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
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
        "rawMaterial",
        "finishrByProd"
    })
    public static class ManfactrConcern {

        @XmlElement(name = "RawMaterial", required = true)
        protected PARTAQD.ManfactrConcern.RawMaterial rawMaterial;
        @XmlElement(name = "FinishrByProd", required = true)
        protected PARTAQD.ManfactrConcern.FinishrByProd finishrByProd;

        /**
         * Gets the value of the rawMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAQD.ManfactrConcern.RawMaterial }
         *     
         */
        public PARTAQD.ManfactrConcern.RawMaterial getRawMaterial() {
            return rawMaterial;
        }

        /**
         * Sets the value of the rawMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAQD.ManfactrConcern.RawMaterial }
         *     
         */
        public void setRawMaterial(PARTAQD.ManfactrConcern.RawMaterial value) {
            this.rawMaterial = value;
        }

        /**
         * Gets the value of the finishrByProd property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAQD.ManfactrConcern.FinishrByProd }
         *     
         */
        public PARTAQD.ManfactrConcern.FinishrByProd getFinishrByProd() {
            return finishrByProd;
        }

        /**
         * Sets the value of the finishrByProd property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAQD.ManfactrConcern.FinishrByProd }
         *     
         */
        public void setFinishrByProd(PARTAQD.ManfactrConcern.FinishrByProd value) {
            this.finishrByProd = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
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
            "quantitDet"
        })
        public static class FinishrByProd {

            @XmlElement(name = "QuantitDet", required = true)
            protected List<QuantitDet> quantitDet;

            /**
             * Gets the value of the quantitDet property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the quantitDet property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQuantitDet().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QuantitDet }
             * 
             * 
             */
            public List<QuantitDet> getQuantitDet() {
                if (quantitDet == null) {
                    quantitDet = new ArrayList<QuantitDet>();
                }
                return this.quantitDet;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
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
            "quantitDet"
        })
        public static class RawMaterial {

            @XmlElement(name = "QuantitDet", required = true)
            protected List<QuantitDet> quantitDet;

            /**
             * Gets the value of the quantitDet property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the quantitDet property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQuantitDet().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QuantitDet }
             * 
             * 
             */
            public List<QuantitDet> getQuantitDet() {
                if (quantitDet == null) {
                    quantitDet = new ArrayList<QuantitDet>();
                }
                return this.quantitDet;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}QuantitDet" maxOccurs="20"/>
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
        "quantitDet"
    })
    public static class TradingConcern {

        @XmlElement(name = "QuantitDet", required = true)
        protected List<QuantitDet> quantitDet;

        /**
         * Gets the value of the quantitDet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the quantitDet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuantitDet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuantitDet }
         * 
         * 
         */
        public List<QuantitDet> getQuantitDet() {
            if (quantitDet == null) {
                quantitDet = new ArrayList<QuantitDet>();
            }
            return this.quantitDet;
        }

    }

}
