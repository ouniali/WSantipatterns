
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPA_ExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="RoomTypeCandidates" type="{http://www.opentravel.org/OTA/2003/05}OTA_HotelRatePlanRQRoomTypeCandidatesType" minOccurs="0"/>
 *           &lt;element name="AvailRequest" type="{http://www.opentravel.org/OTA/2003/05}AvailRequestType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="TPAMapping" type="{http://www.opentravel.org/OTA/2003/05}TPAMapping" minOccurs="0"/>
 *           &lt;element name="MarketSegment" type="{http://www.opentravel.org/OTA/2003/05}MarketSegment" minOccurs="0"/>
 *           &lt;element name="SourceOfBusiness" type="{http://www.opentravel.org/OTA/2003/05}SourceOfBusiness" minOccurs="0"/>
 *           &lt;element name="AvailBaseQuantity" type="{http://www.opentravel.org/OTA/2003/05}AvailBaseQuantity" minOccurs="0"/>
 *           &lt;element name="TPAClassifiers" type="{http://www.opentravel.org/OTA/2003/05}TPAClassifiers" minOccurs="0"/>
 *           &lt;element name="TPAChannelType" type="{http://www.opentravel.org/OTA/2003/05}TPAChannelType" minOccurs="0"/>
 *           &lt;element name="HotelReservationsIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationsIDsType" minOccurs="0"/>
 *           &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *           &lt;element name="FixedTaxes" type="{http://www.opentravel.org/OTA/2003/05}FixedTaxes" minOccurs="0"/>
 *           &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsType", propOrder = {
    "roomTypeCandidatesOrAvailRequestOrWarnings",
    "any"
})
public class TPAExtensionsType {

    @XmlElements({
        @XmlElement(name = "RoomTypeCandidates", type = OTAHotelRatePlanRQRoomTypeCandidatesType.class),
        @XmlElement(name = "AvailRequest", type = AvailRequestType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "TPAMapping", type = TPAMapping.class),
        @XmlElement(name = "MarketSegment", type = MarketSegment.class),
        @XmlElement(name = "SourceOfBusiness", type = SourceOfBusiness.class),
        @XmlElement(name = "AvailBaseQuantity", type = AvailBaseQuantity.class),
        @XmlElement(name = "TPAClassifiers", type = TPAClassifiers.class),
        @XmlElement(name = "TPAChannelType", type = TPAChannelType.class),
        @XmlElement(name = "HotelReservationsIDs", type = HotelReservationsIDsType.class),
        @XmlElement(name = "Taxes", type = TaxesType.class),
        @XmlElement(name = "FixedTaxes", type = FixedTaxes.class),
        @XmlElement(name = "GuestCounts", type = GuestCountType.class)
    })
    protected List<Object> roomTypeCandidatesOrAvailRequestOrWarnings;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the roomTypeCandidatesOrAvailRequestOrWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomTypeCandidatesOrAvailRequestOrWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomTypeCandidatesOrAvailRequestOrWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAHotelRatePlanRQRoomTypeCandidatesType }
     * {@link AvailRequestType }
     * {@link WarningsType }
     * {@link TPAMapping }
     * {@link MarketSegment }
     * {@link SourceOfBusiness }
     * {@link AvailBaseQuantity }
     * {@link TPAClassifiers }
     * {@link TPAChannelType }
     * {@link HotelReservationsIDsType }
     * {@link TaxesType }
     * {@link FixedTaxes }
     * {@link GuestCountType }
     * 
     * 
     */
    public List<Object> getRoomTypeCandidatesOrAvailRequestOrWarnings() {
        if (roomTypeCandidatesOrAvailRequestOrWarnings == null) {
            roomTypeCandidatesOrAvailRequestOrWarnings = new ArrayList<Object>();
        }
        return this.roomTypeCandidatesOrAvailRequestOrWarnings;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
