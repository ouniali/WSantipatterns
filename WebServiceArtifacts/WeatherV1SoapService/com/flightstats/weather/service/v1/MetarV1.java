
package com.flightstats.weather.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metarV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metarV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weatherStationIcao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tag" type="{http://v1.service.weather.flightstats.com/}tagV1" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="conditions" type="{http://v1.service.weather.flightstats.com/}conditionsV1" minOccurs="0"/>
 *         &lt;element name="temperatureCelsius" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dewPointCelsius" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runwayVisualRanges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="runwayVisualRange" type="{http://v1.service.weather.flightstats.com/}runwayVisualRangeV1" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="obscurations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="obscuration" type="{http://v1.service.weather.flightstats.com/}obscurationV1" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="noSignificantChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metarV1", propOrder = {
    "report",
    "reportTime",
    "reportModifier",
    "weatherStationIcao",
    "tags",
    "conditions",
    "temperatureCelsius",
    "dewPointCelsius",
    "runwayVisualRanges",
    "obscurations",
    "noSignificantChange"
})
public class MetarV1 {

    @XmlElement(required = true)
    protected String report;
    @XmlElement(required = true)
    protected String reportTime;
    protected String reportModifier;
    @XmlElement(required = true)
    protected String weatherStationIcao;
    protected MetarV1 .Tags tags;
    protected ConditionsV1 conditions;
    protected String temperatureCelsius;
    protected String dewPointCelsius;
    protected MetarV1 .RunwayVisualRanges runwayVisualRanges;
    protected MetarV1 .Obscurations obscurations;
    protected boolean noSignificantChange;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the reportTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * Sets the value of the reportTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTime(String value) {
        this.reportTime = value;
    }

    /**
     * Gets the value of the reportModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportModifier() {
        return reportModifier;
    }

    /**
     * Sets the value of the reportModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportModifier(String value) {
        this.reportModifier = value;
    }

    /**
     * Gets the value of the weatherStationIcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherStationIcao() {
        return weatherStationIcao;
    }

    /**
     * Sets the value of the weatherStationIcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherStationIcao(String value) {
        this.weatherStationIcao = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link MetarV1 .Tags }
     *     
     */
    public MetarV1 .Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetarV1 .Tags }
     *     
     */
    public void setTags(MetarV1 .Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsV1 }
     *     
     */
    public ConditionsV1 getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsV1 }
     *     
     */
    public void setConditions(ConditionsV1 value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the temperatureCelsius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureCelsius() {
        return temperatureCelsius;
    }

    /**
     * Sets the value of the temperatureCelsius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureCelsius(String value) {
        this.temperatureCelsius = value;
    }

    /**
     * Gets the value of the dewPointCelsius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDewPointCelsius() {
        return dewPointCelsius;
    }

    /**
     * Sets the value of the dewPointCelsius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDewPointCelsius(String value) {
        this.dewPointCelsius = value;
    }

    /**
     * Gets the value of the runwayVisualRanges property.
     * 
     * @return
     *     possible object is
     *     {@link MetarV1 .RunwayVisualRanges }
     *     
     */
    public MetarV1 .RunwayVisualRanges getRunwayVisualRanges() {
        return runwayVisualRanges;
    }

    /**
     * Sets the value of the runwayVisualRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetarV1 .RunwayVisualRanges }
     *     
     */
    public void setRunwayVisualRanges(MetarV1 .RunwayVisualRanges value) {
        this.runwayVisualRanges = value;
    }

    /**
     * Gets the value of the obscurations property.
     * 
     * @return
     *     possible object is
     *     {@link MetarV1 .Obscurations }
     *     
     */
    public MetarV1 .Obscurations getObscurations() {
        return obscurations;
    }

    /**
     * Sets the value of the obscurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetarV1 .Obscurations }
     *     
     */
    public void setObscurations(MetarV1 .Obscurations value) {
        this.obscurations = value;
    }

    /**
     * Gets the value of the noSignificantChange property.
     * 
     */
    public boolean isNoSignificantChange() {
        return noSignificantChange;
    }

    /**
     * Sets the value of the noSignificantChange property.
     * 
     */
    public void setNoSignificantChange(boolean value) {
        this.noSignificantChange = value;
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
     *         &lt;element name="obscuration" type="{http://v1.service.weather.flightstats.com/}obscurationV1" maxOccurs="unbounded"/>
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
        "obscuration"
    })
    public static class Obscurations {

        @XmlElement(required = true)
        protected List<ObscurationV1> obscuration;

        /**
         * Gets the value of the obscuration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the obscuration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObscuration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObscurationV1 }
         * 
         * 
         */
        public List<ObscurationV1> getObscuration() {
            if (obscuration == null) {
                obscuration = new ArrayList<ObscurationV1>();
            }
            return this.obscuration;
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
     *         &lt;element name="runwayVisualRange" type="{http://v1.service.weather.flightstats.com/}runwayVisualRangeV1" maxOccurs="unbounded"/>
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
        "runwayVisualRange"
    })
    public static class RunwayVisualRanges {

        @XmlElement(required = true)
        protected List<RunwayVisualRangeV1> runwayVisualRange;

        /**
         * Gets the value of the runwayVisualRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runwayVisualRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRunwayVisualRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RunwayVisualRangeV1 }
         * 
         * 
         */
        public List<RunwayVisualRangeV1> getRunwayVisualRange() {
            if (runwayVisualRange == null) {
                runwayVisualRange = new ArrayList<RunwayVisualRangeV1>();
            }
            return this.runwayVisualRange;
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
     *         &lt;element name="tag" type="{http://v1.service.weather.flightstats.com/}tagV1" maxOccurs="unbounded"/>
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
        "tag"
    })
    public static class Tags {

        @XmlElement(required = true)
        protected List<TagV1> tag;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TagV1 }
         * 
         * 
         */
        public List<TagV1> getTag() {
            if (tag == null) {
                tag = new ArrayList<TagV1>();
            }
            return this.tag;
        }

    }

}
