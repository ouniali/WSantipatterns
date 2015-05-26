
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalHotelAvailabilityRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalHotelAvailabilityRS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractRS">
 *       &lt;sequence>
 *         &lt;element name="availableEstablishments" type="{http://caval.travel/20091127/hotelBooking}availableEstablishment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fromRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="statsKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalHotelAvailabilityRS", propOrder = {
    "availableEstablishments",
    "totalRows",
    "fromRow",
    "numRows",
    "statsKey"
})
public class CavalHotelAvailabilityRS
    extends AbstractRS
{

    @XmlElement(nillable = true)
    protected List<AvailableEstablishment> availableEstablishments;
    protected Integer totalRows;
    protected Integer fromRow;
    protected Integer numRows;
    protected String statsKey;

    /**
     * Gets the value of the availableEstablishments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableEstablishments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableEstablishments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableEstablishment }
     * 
     * 
     */
    public List<AvailableEstablishment> getAvailableEstablishments() {
        if (availableEstablishments == null) {
            availableEstablishments = new ArrayList<AvailableEstablishment>();
        }
        return this.availableEstablishments;
    }

    /**
     * Gets the value of the totalRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRows() {
        return totalRows;
    }

    /**
     * Sets the value of the totalRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRows(Integer value) {
        this.totalRows = value;
    }

    /**
     * Gets the value of the fromRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromRow() {
        return fromRow;
    }

    /**
     * Sets the value of the fromRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromRow(Integer value) {
        this.fromRow = value;
    }

    /**
     * Gets the value of the numRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRows() {
        return numRows;
    }

    /**
     * Sets the value of the numRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRows(Integer value) {
        this.numRows = value;
    }

    /**
     * Gets the value of the statsKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsKey() {
        return statsKey;
    }

    /**
     * Sets the value of the statsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsKey(String value) {
        this.statsKey = value;
    }

}
