
package es.juniper.webservice._2007;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="JP_HotelListRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Hotel" type="{http://www.juniper.es/webservice/2007/}JP_HotelListRSHotelType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://www.juniper.es/webservice/2007/}ArrayOfErrorType" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "jpHotelListRS"
})
@XmlRootElement(name = "JP_HotelListServiceResponse")
public class JPHotelListServiceResponse {

    @XmlElement(name = "JP_HotelListRS")
    protected JPHotelListServiceResponse.JPHotelListRS jpHotelListRS;

    /**
     * Gets the value of the jpHotelListRS property.
     * 
     * @return
     *     possible object is
     *     {@link JPHotelListServiceResponse.JPHotelListRS }
     *     
     */
    public JPHotelListServiceResponse.JPHotelListRS getJPHotelListRS() {
        return jpHotelListRS;
    }

    /**
     * Sets the value of the jpHotelListRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPHotelListServiceResponse.JPHotelListRS }
     *     
     */
    public void setJPHotelListRS(JPHotelListServiceResponse.JPHotelListRS value) {
        this.jpHotelListRS = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Hotel" type="{http://www.juniper.es/webservice/2007/}JP_HotelListRSHotelType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://www.juniper.es/webservice/2007/}ArrayOfErrorType" minOccurs="0"/>
     *         &lt;/choice>
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
        "hotelOrErrors"
    })
    public static class JPHotelListRS {

        @XmlElements({
            @XmlElement(name = "Hotel", type = JPHotelListRSHotelType.class),
            @XmlElement(name = "Errors", type = ArrayOfErrorType.class)
        })
        protected List<Object> hotelOrErrors;

        /**
         * Gets the value of the hotelOrErrors property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelOrErrors property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelOrErrors().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JPHotelListRSHotelType }
         * {@link ArrayOfErrorType }
         * 
         * 
         */
        public List<Object> getHotelOrErrors() {
            if (hotelOrErrors == null) {
                hotelOrErrors = new ArrayList<Object>();
            }
            return this.hotelOrErrors;
        }

    }

}
