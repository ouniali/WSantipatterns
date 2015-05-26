
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalGetOffersListRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalGetOffersListRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractAuthenticatedAgencyRQ">
 *       &lt;sequence>
 *         &lt;element name="changesFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stateIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cityIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hotelIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalGetOffersListRQ", propOrder = {
    "changesFromDate",
    "countryIds",
    "stateIds",
    "cityIds",
    "hotelIds"
})
public class CavalGetOffersListRQ
    extends AbstractAuthenticatedAgencyRQ
{

    protected String changesFromDate;
    protected List<String> countryIds;
    protected List<String> stateIds;
    protected List<String> cityIds;
    protected List<String> hotelIds;

    /**
     * Gets the value of the changesFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesFromDate() {
        return changesFromDate;
    }

    /**
     * Sets the value of the changesFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesFromDate(String value) {
        this.changesFromDate = value;
    }

    /**
     * Gets the value of the countryIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryIds() {
        if (countryIds == null) {
            countryIds = new ArrayList<String>();
        }
        return this.countryIds;
    }

    /**
     * Gets the value of the stateIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStateIds() {
        if (stateIds == null) {
            stateIds = new ArrayList<String>();
        }
        return this.stateIds;
    }

    /**
     * Gets the value of the cityIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityIds() {
        if (cityIds == null) {
            cityIds = new ArrayList<String>();
        }
        return this.cityIds;
    }

    /**
     * Gets the value of the hotelIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHotelIds() {
        if (hotelIds == null) {
            hotelIds = new ArrayList<String>();
        }
        return this.hotelIds;
    }

}
