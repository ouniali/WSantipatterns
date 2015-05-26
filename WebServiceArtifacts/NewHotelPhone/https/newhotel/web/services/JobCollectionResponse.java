
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Jobs" type="{https://NewHotel/Web/Services/}ArrayOfJobResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobCollectionResponse", propOrder = {
    "jobs"
})
public class JobCollectionResponse
    extends BaseResponse
{

    @XmlElement(name = "Jobs")
    protected ArrayOfJobResponse jobs;

    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobResponse }
     *     
     */
    public ArrayOfJobResponse getJobs() {
        return jobs;
    }

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobResponse }
     *     
     */
    public void setJobs(ArrayOfJobResponse value) {
        this.jobs = value;
    }

}
