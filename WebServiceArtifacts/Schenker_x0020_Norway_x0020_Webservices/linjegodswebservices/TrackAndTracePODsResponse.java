
package linjegodswebservices;

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
 *         &lt;element name="TrackAndTracePODsResult" type="{LinjegodsWebServices}TrackAndTracePODsResultat" minOccurs="0"/>
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
    "trackAndTracePODsResult"
})
@XmlRootElement(name = "TrackAndTracePODsResponse")
public class TrackAndTracePODsResponse {

    @XmlElement(name = "TrackAndTracePODsResult")
    protected TrackAndTracePODsResultat trackAndTracePODsResult;

    /**
     * Gets the value of the trackAndTracePODsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAndTracePODsResultat }
     *     
     */
    public TrackAndTracePODsResultat getTrackAndTracePODsResult() {
        return trackAndTracePODsResult;
    }

    /**
     * Sets the value of the trackAndTracePODsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAndTracePODsResultat }
     *     
     */
    public void setTrackAndTracePODsResult(TrackAndTracePODsResultat value) {
        this.trackAndTracePODsResult = value;
    }

}
