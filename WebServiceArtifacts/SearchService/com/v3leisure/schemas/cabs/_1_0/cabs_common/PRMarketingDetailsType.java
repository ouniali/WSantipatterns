
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PR_MarketingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_MarketingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCategory" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IdValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TargetMarket" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IdValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RatingScheme" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_RatingSchemeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_MarketingDetailsType", propOrder = {
    "industryCategory",
    "targetMarket",
    "ratingScheme"
})
public class PRMarketingDetailsType {

    @XmlElement(name = "IndustryCategory")
    protected List<COIdValueType> industryCategory;
    @XmlElement(name = "TargetMarket")
    protected List<COIdValueType> targetMarket;
    @XmlElement(name = "RatingScheme")
    protected List<PRRatingSchemeType> ratingScheme;

    /**
     * Gets the value of the industryCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COIdValueType }
     * 
     * 
     */
    public List<COIdValueType> getIndustryCategory() {
        if (industryCategory == null) {
            industryCategory = new ArrayList<COIdValueType>();
        }
        return this.industryCategory;
    }

    /**
     * Gets the value of the targetMarket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COIdValueType }
     * 
     * 
     */
    public List<COIdValueType> getTargetMarket() {
        if (targetMarket == null) {
            targetMarket = new ArrayList<COIdValueType>();
        }
        return this.targetMarket;
    }

    /**
     * Gets the value of the ratingScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRRatingSchemeType }
     * 
     * 
     */
    public List<PRRatingSchemeType> getRatingScheme() {
        if (ratingScheme == null) {
            ratingScheme = new ArrayList<PRRatingSchemeType>();
        }
        return this.ratingScheme;
    }

}
