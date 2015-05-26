
package com.flightstats.weather.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionsV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conditionsV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wind" type="{http://v1.service.weather.flightstats.com/}windV1" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://v1.service.weather.flightstats.com/}visibilityV1" minOccurs="0"/>
 *         &lt;element name="weatherConditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="weatherCondition" type="{http://v1.service.weather.flightstats.com/}weatherConditionV1" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="skyConditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skyCondition" type="{http://v1.service.weather.flightstats.com/}skyConditionV1" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pressureInchesHg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conditionsV1", propOrder = {
    "wind",
    "visibility",
    "weatherConditions",
    "skyConditions",
    "pressureInchesHg"
})
public class ConditionsV1 {

    protected WindV1 wind;
    protected VisibilityV1 visibility;
    protected ConditionsV1 .WeatherConditions weatherConditions;
    protected ConditionsV1 .SkyConditions skyConditions;
    protected String pressureInchesHg;

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link WindV1 }
     *     
     */
    public WindV1 getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindV1 }
     *     
     */
    public void setWind(WindV1 value) {
        this.wind = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link VisibilityV1 }
     *     
     */
    public VisibilityV1 getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisibilityV1 }
     *     
     */
    public void setVisibility(VisibilityV1 value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the weatherConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsV1 .WeatherConditions }
     *     
     */
    public ConditionsV1 .WeatherConditions getWeatherConditions() {
        return weatherConditions;
    }

    /**
     * Sets the value of the weatherConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsV1 .WeatherConditions }
     *     
     */
    public void setWeatherConditions(ConditionsV1 .WeatherConditions value) {
        this.weatherConditions = value;
    }

    /**
     * Gets the value of the skyConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsV1 .SkyConditions }
     *     
     */
    public ConditionsV1 .SkyConditions getSkyConditions() {
        return skyConditions;
    }

    /**
     * Sets the value of the skyConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsV1 .SkyConditions }
     *     
     */
    public void setSkyConditions(ConditionsV1 .SkyConditions value) {
        this.skyConditions = value;
    }

    /**
     * Gets the value of the pressureInchesHg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressureInchesHg() {
        return pressureInchesHg;
    }

    /**
     * Sets the value of the pressureInchesHg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressureInchesHg(String value) {
        this.pressureInchesHg = value;
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
     *         &lt;element name="skyCondition" type="{http://v1.service.weather.flightstats.com/}skyConditionV1" maxOccurs="unbounded"/>
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
        "skyCondition"
    })
    public static class SkyConditions {

        @XmlElement(required = true)
        protected List<SkyConditionV1> skyCondition;

        /**
         * Gets the value of the skyCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the skyCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSkyCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SkyConditionV1 }
         * 
         * 
         */
        public List<SkyConditionV1> getSkyCondition() {
            if (skyCondition == null) {
                skyCondition = new ArrayList<SkyConditionV1>();
            }
            return this.skyCondition;
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
     *         &lt;element name="weatherCondition" type="{http://v1.service.weather.flightstats.com/}weatherConditionV1" maxOccurs="unbounded"/>
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
        "weatherCondition"
    })
    public static class WeatherConditions {

        @XmlElement(required = true)
        protected List<WeatherConditionV1> weatherCondition;

        /**
         * Gets the value of the weatherCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weatherCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeatherCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WeatherConditionV1 }
         * 
         * 
         */
        public List<WeatherConditionV1> getWeatherCondition() {
            if (weatherCondition == null) {
                weatherCondition = new ArrayList<WeatherConditionV1>();
            }
            return this.weatherCondition;
        }

    }

}
