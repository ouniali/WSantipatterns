
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageNewGesCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageNewGesCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="MessageColletion" type="{https://NewHotel/Web/Services/}ArrayOfMessageNewGesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageNewGesCollectionResponse", propOrder = {
    "messageColletion"
})
public class MessageNewGesCollectionResponse
    extends BaseResponse
{

    @XmlElement(name = "MessageColletion")
    protected ArrayOfMessageNewGesResponse messageColletion;

    /**
     * Gets the value of the messageColletion property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageNewGesResponse }
     *     
     */
    public ArrayOfMessageNewGesResponse getMessageColletion() {
        return messageColletion;
    }

    /**
     * Sets the value of the messageColletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageNewGesResponse }
     *     
     */
    public void setMessageColletion(ArrayOfMessageNewGesResponse value) {
        this.messageColletion = value;
    }

}
