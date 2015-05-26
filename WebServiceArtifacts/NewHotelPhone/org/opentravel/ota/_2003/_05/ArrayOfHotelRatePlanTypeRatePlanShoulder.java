
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


/**
 * <p>Java class for ArrayOfHotelRatePlanTypeRatePlanShoulder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeRatePlanShoulder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanShoulder" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ShoulderRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="PreShoulderStartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PostShoulderEndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfHotelRatePlanTypeRatePlanShoulder", propOrder = {
    "ratePlanShoulder"
})
public class ArrayOfHotelRatePlanTypeRatePlanShoulder {

    @XmlElement(name = "RatePlanShoulder")
    protected List<ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder> ratePlanShoulder;

    /**
     * Gets the value of the ratePlanShoulder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanShoulder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanShoulder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder }
     * 
     * 
     */
    public List<ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder> getRatePlanShoulder() {
        if (ratePlanShoulder == null) {
            ratePlanShoulder = new ArrayList<ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder>();
        }
        return this.ratePlanShoulder;
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
     *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ShoulderRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="PreShoulderStartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PostShoulderEndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sellableProducts"
    })
    public static class RatePlanShoulder {

        @XmlElement(name = "SellableProducts")
        protected ArrayOfSellableProductsTypeSellableProduct sellableProducts;
        @XmlAttribute(name = "ShoulderRPH")
        protected String shoulderRPH;
        @XmlAttribute(name = "PreShoulderSellLimit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger preShoulderSellLimit;
        @XmlAttribute(name = "PostShoulderSellLimit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger postShoulderSellLimit;
        @XmlAttribute(name = "PreShoulderStartDate")
        protected String preShoulderStartDate;
        @XmlAttribute(name = "PostShoulderEndDate")
        protected String postShoulderEndDate;

        /**
         * Gets the value of the sellableProducts property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct }
         *     
         */
        public ArrayOfSellableProductsTypeSellableProduct getSellableProducts() {
            return sellableProducts;
        }

        /**
         * Sets the value of the sellableProducts property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct }
         *     
         */
        public void setSellableProducts(ArrayOfSellableProductsTypeSellableProduct value) {
            this.sellableProducts = value;
        }

        /**
         * Gets the value of the shoulderRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShoulderRPH() {
            return shoulderRPH;
        }

        /**
         * Sets the value of the shoulderRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShoulderRPH(String value) {
            this.shoulderRPH = value;
        }

        /**
         * Gets the value of the preShoulderSellLimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPreShoulderSellLimit() {
            return preShoulderSellLimit;
        }

        /**
         * Sets the value of the preShoulderSellLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPreShoulderSellLimit(BigInteger value) {
            this.preShoulderSellLimit = value;
        }

        /**
         * Gets the value of the postShoulderSellLimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPostShoulderSellLimit() {
            return postShoulderSellLimit;
        }

        /**
         * Sets the value of the postShoulderSellLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPostShoulderSellLimit(BigInteger value) {
            this.postShoulderSellLimit = value;
        }

        /**
         * Gets the value of the preShoulderStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreShoulderStartDate() {
            return preShoulderStartDate;
        }

        /**
         * Sets the value of the preShoulderStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreShoulderStartDate(String value) {
            this.preShoulderStartDate = value;
        }

        /**
         * Gets the value of the postShoulderEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostShoulderEndDate() {
            return postShoulderEndDate;
        }

        /**
         * Sets the value of the postShoulderEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostShoulderEndDate(String value) {
            this.postShoulderEndDate = value;
        }

    }

}
