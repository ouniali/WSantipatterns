
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractAuthenticatedAgencyRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractAuthenticatedAgencyRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractAuthenticatedRQ">
 *       &lt;sequence>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractAuthenticatedAgencyRQ", propOrder = {
    "agentId",
    "language"
})
@XmlSeeAlso({
    CavalHotelAvailabilityRQ.class,
    CavalGetEstablishmentDataSheetsRQ.class,
    CavalGetOffersListRQ.class,
    CavalHotelBookingNotificationRQ.class,
    CavalHotelBookingValuationRQ.class,
    CavalGetListOfBoardTypesRQ.class
})
public abstract class AbstractAuthenticatedAgencyRQ
    extends AbstractAuthenticatedRQ
{

    @XmlElement(required = true)
    protected String agentId;
    @XmlElement(required = true)
    protected String language;

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
