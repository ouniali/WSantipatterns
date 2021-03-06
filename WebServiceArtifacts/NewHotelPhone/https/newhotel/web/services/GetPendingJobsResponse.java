
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
 *         &lt;element name="GetPendingJobsResult" type="{https://NewHotel/Web/Services/}JobCollectionResponse" minOccurs="0"/>
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
    "getPendingJobsResult"
})
@XmlRootElement(name = "GetPendingJobsResponse")
public class GetPendingJobsResponse {

    @XmlElement(name = "GetPendingJobsResult")
    protected JobCollectionResponse getPendingJobsResult;

    /**
     * Gets the value of the getPendingJobsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JobCollectionResponse }
     *     
     */
    public JobCollectionResponse getGetPendingJobsResult() {
        return getPendingJobsResult;
    }

    /**
     * Sets the value of the getPendingJobsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCollectionResponse }
     *     
     */
    public void setGetPendingJobsResult(JobCollectionResponse value) {
        this.getPendingJobsResult = value;
    }

}
