
package https.newhotel.web.services;

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
 *         &lt;element name="ExportHotelStatisticsResult" type="{https://NewHotel/Web/Services/}BaseStringResponse" minOccurs="0"/>
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
    "exportHotelStatisticsResult"
})
@XmlRootElement(name = "ExportHotelStatisticsResponse")
public class ExportHotelStatisticsResponse {

    @XmlElement(name = "ExportHotelStatisticsResult")
    protected BaseStringResponse exportHotelStatisticsResult;

    /**
     * Gets the value of the exportHotelStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseStringResponse }
     *     
     */
    public BaseStringResponse getExportHotelStatisticsResult() {
        return exportHotelStatisticsResult;
    }

    /**
     * Sets the value of the exportHotelStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseStringResponse }
     *     
     */
    public void setExportHotelStatisticsResult(BaseStringResponse value) {
        this.exportHotelStatisticsResult = value;
    }

}
