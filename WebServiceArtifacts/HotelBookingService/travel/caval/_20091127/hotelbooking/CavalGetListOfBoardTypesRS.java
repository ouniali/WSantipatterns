
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalGetListOfBoardTypesRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalGetListOfBoardTypesRS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractRS">
 *       &lt;sequence>
 *         &lt;element name="boardTypes" type="{http://caval.travel/20091127/hotelBooking}boardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalGetListOfBoardTypesRS", propOrder = {
    "boardTypes"
})
public class CavalGetListOfBoardTypesRS
    extends AbstractRS
{

    @XmlElement(nillable = true)
    protected List<BoardType> boardTypes;

    /**
     * Gets the value of the boardTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardType }
     * 
     * 
     */
    public List<BoardType> getBoardTypes() {
        if (boardTypes == null) {
            boardTypes = new ArrayList<BoardType>();
        }
        return this.boardTypes;
    }

}
