
package kr.co.rts;

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
 *         &lt;element name="HotelInformationRTSWS" type="{http://www.rts.co.kr/}ArrayOfST_GetHotelInformationRTSWS" minOccurs="0"/>
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
    "hotelInformationRTSWS"
})
@XmlRootElement(name = "GetHotelInformation")
public class GetHotelInformation {

    @XmlElement(name = "HotelInformationRTSWS")
    protected ArrayOfSTGetHotelInformationRTSWS hotelInformationRTSWS;

    /**
     * Gets the value of the hotelInformationRTSWS property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSTGetHotelInformationRTSWS }
     *     
     */
    public ArrayOfSTGetHotelInformationRTSWS getHotelInformationRTSWS() {
        return hotelInformationRTSWS;
    }

    /**
     * Sets the value of the hotelInformationRTSWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSTGetHotelInformationRTSWS }
     *     
     */
    public void setHotelInformationRTSWS(ArrayOfSTGetHotelInformationRTSWS value) {
        this.hotelInformationRTSWS = value;
    }

}
