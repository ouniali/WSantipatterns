
package linjegodswebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackAndTracePODsResultat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackAndTracePODsResultat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountOfPODs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PODs" type="{LinjegodsWebServices}ArrayOfPOD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackAndTracePODsResultat", propOrder = {
    "responseCode",
    "responseMessage",
    "amountOfPODs",
    "poDs"
})
public class TrackAndTracePODsResultat {

    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    @XmlElement(name = "AmountOfPODs")
    protected int amountOfPODs;
    @XmlElement(name = "PODs")
    protected ArrayOfPOD poDs;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the amountOfPODs property.
     * 
     */
    public int getAmountOfPODs() {
        return amountOfPODs;
    }

    /**
     * Sets the value of the amountOfPODs property.
     * 
     */
    public void setAmountOfPODs(int value) {
        this.amountOfPODs = value;
    }

    /**
     * Gets the value of the poDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOD }
     *     
     */
    public ArrayOfPOD getPODs() {
        return poDs;
    }

    /**
     * Sets the value of the poDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOD }
     *     
     */
    public void setPODs(ArrayOfPOD value) {
        this.poDs = value;
    }

}
