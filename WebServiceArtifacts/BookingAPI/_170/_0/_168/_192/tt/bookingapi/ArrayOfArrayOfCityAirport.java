
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfCityAirport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfCityAirport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfCityAirport" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfCityAirport" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfCityAirport", propOrder = {
    "arrayOfCityAirport"
})
public class ArrayOfArrayOfCityAirport {

    @XmlElement(name = "ArrayOfCityAirport", nillable = true)
    protected List<ArrayOfCityAirport> arrayOfCityAirport;

    /**
     * Gets the value of the arrayOfCityAirport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfCityAirport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfCityAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCityAirport }
     * 
     * 
     */
    public List<ArrayOfCityAirport> getArrayOfCityAirport() {
        if (arrayOfCityAirport == null) {
            arrayOfCityAirport = new ArrayList<ArrayOfCityAirport>();
        }
        return this.arrayOfCityAirport;
    }

}
