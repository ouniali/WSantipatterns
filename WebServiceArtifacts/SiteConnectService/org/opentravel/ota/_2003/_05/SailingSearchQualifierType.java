
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SailingSearchQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SailingSearchQualifierType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SearchQualifierType">
 *       &lt;sequence>
 *         &lt;element name="Port" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PortInfoGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingSearchQualifierType", propOrder = {
    "port"
})
public class SailingSearchQualifierType
    extends SearchQualifierType
{

    @XmlElement(name = "Port")
    protected SailingSearchQualifierType.Port port;

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link SailingSearchQualifierType.Port }
     *     
     */
    public SailingSearchQualifierType.Port getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingSearchQualifierType.Port }
     *     
     */
    public void setPort(SailingSearchQualifierType.Port value) {
        this.port = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PortInfoGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Port {

        @XmlAttribute(name = "PortCode")
        protected String portCode;
        @XmlAttribute(name = "PortName")
        protected String portName;
        @XmlAttribute(name = "PortCountryCode")
        protected String portCountryCode;
        @XmlAttribute(name = "DockIndicator")
        protected Boolean dockIndicator;
        @XmlAttribute(name = "ShorexIndicator")
        protected Boolean shorexIndicator;
        @XmlAttribute(name = "EmbarkIndicator")
        protected Boolean embarkIndicator;
        @XmlAttribute(name = "DisembarkIndicator")
        protected Boolean disembarkIndicator;

        /**
         * Gets the value of the portCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortCode() {
            return portCode;
        }

        /**
         * Sets the value of the portCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortCode(String value) {
            this.portCode = value;
        }

        /**
         * Gets the value of the portName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortName() {
            return portName;
        }

        /**
         * Sets the value of the portName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortName(String value) {
            this.portName = value;
        }

        /**
         * Gets the value of the portCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortCountryCode() {
            return portCountryCode;
        }

        /**
         * Sets the value of the portCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortCountryCode(String value) {
            this.portCountryCode = value;
        }

        /**
         * Gets the value of the dockIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDockIndicator() {
            return dockIndicator;
        }

        /**
         * Sets the value of the dockIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDockIndicator(Boolean value) {
            this.dockIndicator = value;
        }

        /**
         * Gets the value of the shorexIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShorexIndicator() {
            return shorexIndicator;
        }

        /**
         * Sets the value of the shorexIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShorexIndicator(Boolean value) {
            this.shorexIndicator = value;
        }

        /**
         * Gets the value of the embarkIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEmbarkIndicator() {
            return embarkIndicator;
        }

        /**
         * Sets the value of the embarkIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEmbarkIndicator(Boolean value) {
            this.embarkIndicator = value;
        }

        /**
         * Gets the value of the disembarkIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDisembarkIndicator() {
            return disembarkIndicator;
        }

        /**
         * Sets the value of the disembarkIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDisembarkIndicator(Boolean value) {
            this.disembarkIndicator = value;
        }

    }

}
