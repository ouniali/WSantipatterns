
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
 *         &lt;element name="TrackAndTraceResult" type="{LinjegodsWebServices}TrackAndTraceResultat" minOccurs="0"/>
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
    "trackAndTraceResult"
})
@XmlRootElement(name = "TrackAndTraceResponse")
public class TrackAndTraceResponse {

    @XmlElement(name = "TrackAndTraceResult")
    protected TrackAndTraceResultat trackAndTraceResult;

    /**
     * Gets the value of the trackAndTraceResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAndTraceResultat }
     *     
     */
    public TrackAndTraceResultat getTrackAndTraceResult() {
        return trackAndTraceResult;
    }

    /**
     * Sets the value of the trackAndTraceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAndTraceResultat }
     *     
     */
    public void setTrackAndTraceResult(TrackAndTraceResultat value) {
        this.trackAndTraceResult = value;
    }

}
