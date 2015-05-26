
package org.cuahsi.his._1_0.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.cuahsi.waterml._1.TimeSeriesResponseType;


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
 *         &lt;element ref="{http://www.cuahsi.org/waterML/1.0/}timeSeriesResponse" minOccurs="0"/>
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
    "timeSeriesResponse"
})
@XmlRootElement(name = "GetValuesObjectResponse")
public class GetValuesObjectResponse {

    @XmlElement(namespace = "http://www.cuahsi.org/waterML/1.0/")
    protected TimeSeriesResponseType timeSeriesResponse;

    /**
     * Gets the value of the timeSeriesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesResponseType }
     *     
     */
    public TimeSeriesResponseType getTimeSeriesResponse() {
        return timeSeriesResponse;
    }

    /**
     * Sets the value of the timeSeriesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesResponseType }
     *     
     */
    public void setTimeSeriesResponse(TimeSeriesResponseType value) {
        this.timeSeriesResponse = value;
    }

}
