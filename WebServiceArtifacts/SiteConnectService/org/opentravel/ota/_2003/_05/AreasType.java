
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AreaID_Group"/>
 *                 &lt;attribute name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="StateProvCode" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
 *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
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
@XmlType(name = "AreasType", propOrder = {
    "area"
})
public class AreasType {

    @XmlElement(name = "Area", required = true)
    protected List<AreasType.Area> area;

    /**
     * Gets the value of the area property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreasType.Area }
     * 
     * 
     */
    public List<AreasType.Area> getArea() {
        if (area == null) {
            area = new ArrayList<AreasType.Area>();
        }
        return this.area;
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
     *         &lt;element name="AreaDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AreaID_Group"/>
     *       &lt;attribute name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="StateProvCode" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
     *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "areaDescription"
    })
    public static class Area {

        @XmlElement(name = "AreaDescription")
        protected ParagraphType areaDescription;
        @XmlAttribute(name = "CityCode")
        protected String cityCode;
        @XmlAttribute(name = "StateProvCode")
        protected String stateProvCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "AreaID")
        protected String areaID;

        /**
         * Gets the value of the areaDescription property.
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getAreaDescription() {
            return areaDescription;
        }

        /**
         * Sets the value of the areaDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setAreaDescription(ParagraphType value) {
            this.areaDescription = value;
        }

        /**
         * Gets the value of the cityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityCode() {
            return cityCode;
        }

        /**
         * Sets the value of the cityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityCode(String value) {
            this.cityCode = value;
        }

        /**
         * Gets the value of the stateProvCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProvCode() {
            return stateProvCode;
        }

        /**
         * Sets the value of the stateProvCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProvCode(String value) {
            this.stateProvCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the areaID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * Sets the value of the areaID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaID(String value) {
            this.areaID = value;
        }

    }

}
