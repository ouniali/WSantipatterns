
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazTrvPlanDtlsObjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazTrvPlanDtlsObjUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}BjazTrvPlanDtlsObjBase">
 *       &lt;sequence>
 *         &lt;element name="maxAgeTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minAgeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minDaysFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxDaysTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazTrvPlanDtlsObjUser", propOrder = {
    "maxAgeTo",
    "planname",
    "areaname",
    "minAgeFrom",
    "minDaysFrom",
    "extCol10",
    "maxDaysTo",
    "extCol9",
    "extCol8",
    "extCol7",
    "extCol6",
    "extCol5",
    "extCol4",
    "extCol3",
    "extCol2",
    "extCol1"
})
public class BjazTrvPlanDtlsObjUser
    extends BjazTrvPlanDtlsObjBase
{

    @XmlElement(required = true, nillable = true)
    protected String maxAgeTo;
    @XmlElement(required = true, nillable = true)
    protected String planname;
    @XmlElement(required = true, nillable = true)
    protected String areaname;
    @XmlElement(required = true, nillable = true)
    protected String minAgeFrom;
    @XmlElement(required = true, nillable = true)
    protected String minDaysFrom;
    @XmlElement(required = true, nillable = true)
    protected String extCol10;
    @XmlElement(required = true, nillable = true)
    protected String maxDaysTo;
    @XmlElement(required = true, nillable = true)
    protected String extCol9;
    @XmlElement(required = true, nillable = true)
    protected String extCol8;
    @XmlElement(required = true, nillable = true)
    protected String extCol7;
    @XmlElement(required = true, nillable = true)
    protected String extCol6;
    @XmlElement(required = true, nillable = true)
    protected String extCol5;
    @XmlElement(required = true, nillable = true)
    protected String extCol4;
    @XmlElement(required = true, nillable = true)
    protected String extCol3;
    @XmlElement(required = true, nillable = true)
    protected String extCol2;
    @XmlElement(required = true, nillable = true)
    protected String extCol1;

    /**
     * Gets the value of the maxAgeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAgeTo() {
        return maxAgeTo;
    }

    /**
     * Sets the value of the maxAgeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAgeTo(String value) {
        this.maxAgeTo = value;
    }

    /**
     * Gets the value of the planname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanname() {
        return planname;
    }

    /**
     * Sets the value of the planname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanname(String value) {
        this.planname = value;
    }

    /**
     * Gets the value of the areaname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * Sets the value of the areaname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaname(String value) {
        this.areaname = value;
    }

    /**
     * Gets the value of the minAgeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAgeFrom() {
        return minAgeFrom;
    }

    /**
     * Sets the value of the minAgeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAgeFrom(String value) {
        this.minAgeFrom = value;
    }

    /**
     * Gets the value of the minDaysFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDaysFrom() {
        return minDaysFrom;
    }

    /**
     * Sets the value of the minDaysFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDaysFrom(String value) {
        this.minDaysFrom = value;
    }

    /**
     * Gets the value of the extCol10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol10() {
        return extCol10;
    }

    /**
     * Sets the value of the extCol10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol10(String value) {
        this.extCol10 = value;
    }

    /**
     * Gets the value of the maxDaysTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDaysTo() {
        return maxDaysTo;
    }

    /**
     * Sets the value of the maxDaysTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDaysTo(String value) {
        this.maxDaysTo = value;
    }

    /**
     * Gets the value of the extCol9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol9() {
        return extCol9;
    }

    /**
     * Sets the value of the extCol9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol9(String value) {
        this.extCol9 = value;
    }

    /**
     * Gets the value of the extCol8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol8() {
        return extCol8;
    }

    /**
     * Sets the value of the extCol8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol8(String value) {
        this.extCol8 = value;
    }

    /**
     * Gets the value of the extCol7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol7() {
        return extCol7;
    }

    /**
     * Sets the value of the extCol7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol7(String value) {
        this.extCol7 = value;
    }

    /**
     * Gets the value of the extCol6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol6() {
        return extCol6;
    }

    /**
     * Sets the value of the extCol6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol6(String value) {
        this.extCol6 = value;
    }

    /**
     * Gets the value of the extCol5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol5() {
        return extCol5;
    }

    /**
     * Sets the value of the extCol5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol5(String value) {
        this.extCol5 = value;
    }

    /**
     * Gets the value of the extCol4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol4() {
        return extCol4;
    }

    /**
     * Sets the value of the extCol4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol4(String value) {
        this.extCol4 = value;
    }

    /**
     * Gets the value of the extCol3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol3() {
        return extCol3;
    }

    /**
     * Sets the value of the extCol3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol3(String value) {
        this.extCol3 = value;
    }

    /**
     * Gets the value of the extCol2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol2() {
        return extCol2;
    }

    /**
     * Sets the value of the extCol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol2(String value) {
        this.extCol2 = value;
    }

    /**
     * Gets the value of the extCol1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol1() {
        return extCol1;
    }

    /**
     * Sets the value of the extCol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol1(String value) {
        this.extCol1 = value;
    }

}
