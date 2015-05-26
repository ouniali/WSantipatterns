
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultBase_b complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultBase_b">
 *   &lt;complexContent>
 *     &lt;extension base="{WS_2013.Hotel}SearchResultBase">
 *       &lt;sequence>
 *         &lt;element name="Hotels" type="{WS_2013.Hotel}ArrayOfHotelResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultBase_b", propOrder = {
    "hotels"
})
@XmlSeeAlso({
    SearchResult.class
})
public abstract class SearchResultBaseB
    extends SearchResultBase
{

    @XmlElement(name = "Hotels")
    protected ArrayOfHotelResult hotels;

    /**
     * Gets the value of the hotels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelResult }
     *     
     */
    public ArrayOfHotelResult getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelResult }
     *     
     */
    public void setHotels(ArrayOfHotelResult value) {
        this.hotels = value;
    }

}
