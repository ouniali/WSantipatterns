
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementCompletionCollectionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementCompletionCollectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Completions" type="{https://NewHotel/Web/Services/}ArrayOfMovementCompletionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementCompletionCollectionRequest", propOrder = {
    "completions"
})
public class MovementCompletionCollectionRequest
    extends BaseRequest
{

    @XmlElement(name = "Completions")
    protected ArrayOfMovementCompletionRequest completions;

    /**
     * Gets the value of the completions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMovementCompletionRequest }
     *     
     */
    public ArrayOfMovementCompletionRequest getCompletions() {
        return completions;
    }

    /**
     * Sets the value of the completions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMovementCompletionRequest }
     *     
     */
    public void setCompletions(ArrayOfMovementCompletionRequest value) {
        this.completions = value;
    }

}
