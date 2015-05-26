
package com.travelport.schema.air_v18_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AccountCode;
import com.travelport.schema.common_v15_0.PointOfSale;


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
 *         &lt;element name="PermittedAccountCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredAccountCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedAccountCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedPointOfSales" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PointOfSale" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedPointOfSales" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PointOfSale" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="TripType" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeTripType" />
 *       &lt;attribute name="Diversification" type="{http://www.travelport.com/schema/air_v18_0}typeDiversity" />
 *       &lt;attribute name="Tag">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedAccountCodes",
    "preferredAccountCodes",
    "prohibitedAccountCodes",
    "permittedPointOfSales",
    "prohibitedPointOfSales"
})
@XmlRootElement(name = "SolutionGroup")
public class SolutionGroup {

    @XmlElement(name = "PermittedAccountCodes")
    protected SolutionGroup.PermittedAccountCodes permittedAccountCodes;
    @XmlElement(name = "PreferredAccountCodes")
    protected SolutionGroup.PreferredAccountCodes preferredAccountCodes;
    @XmlElement(name = "ProhibitedAccountCodes")
    protected SolutionGroup.ProhibitedAccountCodes prohibitedAccountCodes;
    @XmlElement(name = "PermittedPointOfSales")
    protected SolutionGroup.PermittedPointOfSales permittedPointOfSales;
    @XmlElement(name = "ProhibitedPointOfSales")
    protected SolutionGroup.ProhibitedPointOfSales prohibitedPointOfSales;
    @XmlAttribute(name = "Count")
    protected BigInteger count;
    @XmlAttribute(name = "TripType", required = true)
    protected TypeTripType tripType;
    @XmlAttribute(name = "Diversification")
    protected TypeDiversity diversification;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Primary")
    protected Boolean primary;

    /**
     * Gets the value of the permittedAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.PermittedAccountCodes }
     *     
     */
    public SolutionGroup.PermittedAccountCodes getPermittedAccountCodes() {
        return permittedAccountCodes;
    }

    /**
     * Sets the value of the permittedAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.PermittedAccountCodes }
     *     
     */
    public void setPermittedAccountCodes(SolutionGroup.PermittedAccountCodes value) {
        this.permittedAccountCodes = value;
    }

    /**
     * Gets the value of the preferredAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.PreferredAccountCodes }
     *     
     */
    public SolutionGroup.PreferredAccountCodes getPreferredAccountCodes() {
        return preferredAccountCodes;
    }

    /**
     * Sets the value of the preferredAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.PreferredAccountCodes }
     *     
     */
    public void setPreferredAccountCodes(SolutionGroup.PreferredAccountCodes value) {
        this.preferredAccountCodes = value;
    }

    /**
     * Gets the value of the prohibitedAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.ProhibitedAccountCodes }
     *     
     */
    public SolutionGroup.ProhibitedAccountCodes getProhibitedAccountCodes() {
        return prohibitedAccountCodes;
    }

    /**
     * Sets the value of the prohibitedAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.ProhibitedAccountCodes }
     *     
     */
    public void setProhibitedAccountCodes(SolutionGroup.ProhibitedAccountCodes value) {
        this.prohibitedAccountCodes = value;
    }

    /**
     * Gets the value of the permittedPointOfSales property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.PermittedPointOfSales }
     *     
     */
    public SolutionGroup.PermittedPointOfSales getPermittedPointOfSales() {
        return permittedPointOfSales;
    }

    /**
     * Sets the value of the permittedPointOfSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.PermittedPointOfSales }
     *     
     */
    public void setPermittedPointOfSales(SolutionGroup.PermittedPointOfSales value) {
        this.permittedPointOfSales = value;
    }

    /**
     * Gets the value of the prohibitedPointOfSales property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionGroup.ProhibitedPointOfSales }
     *     
     */
    public SolutionGroup.ProhibitedPointOfSales getProhibitedPointOfSales() {
        return prohibitedPointOfSales;
    }

    /**
     * Sets the value of the prohibitedPointOfSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionGroup.ProhibitedPointOfSales }
     *     
     */
    public void setProhibitedPointOfSales(SolutionGroup.ProhibitedPointOfSales value) {
        this.prohibitedPointOfSales = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTripType }
     *     
     */
    public TypeTripType getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTripType }
     *     
     */
    public void setTripType(TypeTripType value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the diversification property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDiversity }
     *     
     */
    public TypeDiversity getDiversification() {
        return diversification;
    }

    /**
     * Sets the value of the diversification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDiversity }
     *     
     */
    public void setDiversification(TypeDiversity value) {
        this.diversification = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrimary() {
        if (primary == null) {
            return false;
        } else {
            return primary;
        }
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
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
        "accountCode"
    })
    public static class PermittedAccountCodes {

        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * Gets the value of the accountCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountCode }
         * 
         * 
         */
        public List<AccountCode> getAccountCode() {
            if (accountCode == null) {
                accountCode = new ArrayList<AccountCode>();
            }
            return this.accountCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PointOfSale" maxOccurs="unbounded"/>
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
        "pointOfSale"
    })
    public static class PermittedPointOfSales {

        @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
        protected List<PointOfSale> pointOfSale;

        /**
         * Gets the value of the pointOfSale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointOfSale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PointOfSale }
         * 
         * 
         */
        public List<PointOfSale> getPointOfSale() {
            if (pointOfSale == null) {
                pointOfSale = new ArrayList<PointOfSale>();
            }
            return this.pointOfSale;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
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
        "accountCode"
    })
    public static class PreferredAccountCodes {

        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * Gets the value of the accountCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountCode }
         * 
         * 
         */
        public List<AccountCode> getAccountCode() {
            if (accountCode == null) {
                accountCode = new ArrayList<AccountCode>();
            }
            return this.accountCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
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
        "accountCode"
    })
    public static class ProhibitedAccountCodes {

        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * Gets the value of the accountCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountCode }
         * 
         * 
         */
        public List<AccountCode> getAccountCode() {
            if (accountCode == null) {
                accountCode = new ArrayList<AccountCode>();
            }
            return this.accountCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PointOfSale" maxOccurs="unbounded"/>
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
        "pointOfSale"
    })
    public static class ProhibitedPointOfSales {

        @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
        protected List<PointOfSale> pointOfSale;

        /**
         * Gets the value of the pointOfSale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointOfSale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PointOfSale }
         * 
         * 
         */
        public List<PointOfSale> getPointOfSale() {
            if (pointOfSale == null) {
                pointOfSale = new ArrayList<PointOfSale>();
            }
            return this.pointOfSale;
        }

    }

}
