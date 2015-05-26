
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricedItinerariesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItinerariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricedItinerary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
 *                 &lt;attribute name="OriginDestinationRefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *               &lt;/extension>
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
@XmlType(name = "PricedItinerariesType", propOrder = {
    "pricedItinerary"
})
public class PricedItinerariesType {

    @XmlElement(name = "PricedItinerary", required = true)
    protected List<PricedItinerariesType.PricedItinerary> pricedItinerary;

    /**
     * Gets the value of the pricedItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItinerariesType.PricedItinerary }
     * 
     * 
     */
    public List<PricedItinerariesType.PricedItinerary> getPricedItinerary() {
        if (pricedItinerary == null) {
            pricedItinerary = new ArrayList<PricedItinerariesType.PricedItinerary>();
        }
        return this.pricedItinerary;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
     *       &lt;attribute name="OriginDestinationRefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PricedItinerary
        extends PricedItineraryType
    {

        @XmlAttribute(name = "OriginDestinationRefNumber")
        protected Integer originDestinationRefNumber;

        /**
         * Gets the value of the originDestinationRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOriginDestinationRefNumber() {
            return originDestinationRefNumber;
        }

        /**
         * Sets the value of the originDestinationRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOriginDestinationRefNumber(Integer value) {
            this.originDestinationRefNumber = value;
        }

    }

}
