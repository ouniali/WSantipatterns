
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Movements" type="{https://NewHotel/Web/Services/}ArrayOfMovementResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementCollectionResponse", propOrder = {
    "movements"
})
public class MovementCollectionResponse
    extends BaseResponse
{

    @XmlElement(name = "Movements")
    protected ArrayOfMovementResponse movements;

    /**
     * Gets the value of the movements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMovementResponse }
     *     
     */
    public ArrayOfMovementResponse getMovements() {
        return movements;
    }

    /**
     * Sets the value of the movements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMovementResponse }
     *     
     */
    public void setMovements(ArrayOfMovementResponse value) {
        this.movements = value;
    }

}
