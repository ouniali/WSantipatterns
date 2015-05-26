
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for availRQOccupation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availRQOccupation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adultsPerRoom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="childrenPerRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="childAges" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availRQOccupation", propOrder = {
    "numberOfRooms",
    "adultsPerRoom",
    "childrenPerRoom",
    "childAges"
})
public class AvailRQOccupation {

    protected int numberOfRooms;
    protected int adultsPerRoom;
    protected Integer childrenPerRoom;
    @XmlElement(nillable = true)
    protected List<Integer> childAges;

    /**
     * Gets the value of the numberOfRooms property.
     * 
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     */
    public void setNumberOfRooms(int value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the adultsPerRoom property.
     * 
     */
    public int getAdultsPerRoom() {
        return adultsPerRoom;
    }

    /**
     * Sets the value of the adultsPerRoom property.
     * 
     */
    public void setAdultsPerRoom(int value) {
        this.adultsPerRoom = value;
    }

    /**
     * Gets the value of the childrenPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenPerRoom() {
        return childrenPerRoom;
    }

    /**
     * Sets the value of the childrenPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenPerRoom(Integer value) {
        this.childrenPerRoom = value;
    }

    /**
     * Gets the value of the childAges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childAges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildAges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getChildAges() {
        if (childAges == null) {
            childAges = new ArrayList<Integer>();
        }
        return this.childAges;
    }

}
