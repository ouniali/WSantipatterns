
package travel.goglobal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MakeRequestCompressedResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "makeRequestCompressedResult"
})
@XmlRootElement(name = "MakeRequestCompressedResponse")
public class MakeRequestCompressedResponse {

    @XmlElement(name = "MakeRequestCompressedResult")
    protected byte[] makeRequestCompressedResult;

    /**
     * Gets the value of the makeRequestCompressedResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMakeRequestCompressedResult() {
        return makeRequestCompressedResult;
    }

    /**
     * Sets the value of the makeRequestCompressedResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMakeRequestCompressedResult(byte[] value) {
        this.makeRequestCompressedResult = value;
    }

}
