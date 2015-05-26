
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskFindReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskFindReservationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Arguments" type="{https://NewHotel/Web/Services/}ArrayOfKioskFilterArgument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskFindReservationRequest", propOrder = {
    "arguments"
})
public class KioskFindReservationRequest
    extends KioskBaseRequest
{

    @XmlElement(name = "Arguments")
    protected ArrayOfKioskFilterArgument arguments;

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskFilterArgument }
     *     
     */
    public ArrayOfKioskFilterArgument getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskFilterArgument }
     *     
     */
    public void setArguments(ArrayOfKioskFilterArgument value) {
        this.arguments = value;
    }

}
