
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for WeatherInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Precipitation" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AveragePrecipitation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="UnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Temperature" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AverageHighTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AverageLowTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TempUnit">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Celsius"/>
 *                       &lt;enumeration value="Fahrenheit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Period" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherInfoType", propOrder = {
    "precipitation",
    "temperature"
})
public class WeatherInfoType {

    @XmlElement(name = "Precipitation")
    protected List<WeatherInfoType.Precipitation> precipitation;
    @XmlElement(name = "Temperature")
    protected List<WeatherInfoType.Temperature> temperature;
    @XmlAttribute(name = "Period")
    protected String period;

    /**
     * Gets the value of the precipitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherInfoType.Precipitation }
     * 
     * 
     */
    public List<WeatherInfoType.Precipitation> getPrecipitation() {
        if (precipitation == null) {
            precipitation = new ArrayList<WeatherInfoType.Precipitation>();
        }
        return this.precipitation;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherInfoType.Temperature }
     * 
     * 
     */
    public List<WeatherInfoType.Temperature> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<WeatherInfoType.Temperature>();
        }
        return this.temperature;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
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
     *       &lt;attribute name="AveragePrecipitation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="UnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Precipitation {

        @XmlAttribute(name = "AveragePrecipitation")
        protected BigDecimal averagePrecipitation;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;

        /**
         * Gets the value of the averagePrecipitation property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAveragePrecipitation() {
            return averagePrecipitation;
        }

        /**
         * Sets the value of the averagePrecipitation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAveragePrecipitation(BigDecimal value) {
            this.averagePrecipitation = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
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
     *       &lt;attribute name="AverageHighTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AverageLowTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TempUnit">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Celsius"/>
     *             &lt;enumeration value="Fahrenheit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Temperature {

        @XmlAttribute(name = "AverageHighTemp")
        protected BigInteger averageHighTemp;
        @XmlAttribute(name = "AverageLowTemp")
        protected BigInteger averageLowTemp;
        @XmlAttribute(name = "TempUnit")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String tempUnit;

        /**
         * Gets the value of the averageHighTemp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAverageHighTemp() {
            return averageHighTemp;
        }

        /**
         * Sets the value of the averageHighTemp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAverageHighTemp(BigInteger value) {
            this.averageHighTemp = value;
        }

        /**
         * Gets the value of the averageLowTemp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAverageLowTemp() {
            return averageLowTemp;
        }

        /**
         * Sets the value of the averageLowTemp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAverageLowTemp(BigInteger value) {
            this.averageLowTemp = value;
        }

        /**
         * Gets the value of the tempUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempUnit() {
            return tempUnit;
        }

        /**
         * Sets the value of the tempUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempUnit(String value) {
            this.tempUnit = value;
        }

    }

}
