
package ca.ubc.cstudies.netpub.dotnet.webservices.weatherservice;

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
 *         &lt;element name="WeatherResult" type="{http://netpub.cstudies.ubc.ca/dotnet/webservices/WeatherService}WeatherObject" minOccurs="0"/>
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
    "weatherResult"
})
@XmlRootElement(name = "WeatherResponse")
public class WeatherResponse {

    @XmlElement(name = "WeatherResult")
    protected WeatherObject weatherResult;

    /**
     * Gets the value of the weatherResult property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherObject }
     *     
     */
    public WeatherObject getWeatherResult() {
        return weatherResult;
    }

    /**
     * Sets the value of the weatherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherObject }
     *     
     */
    public void setWeatherResult(WeatherObject value) {
        this.weatherResult = value;
    }

}
