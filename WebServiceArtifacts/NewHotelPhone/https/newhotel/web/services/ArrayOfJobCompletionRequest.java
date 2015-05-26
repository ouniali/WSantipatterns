
package https.newhotel.web.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobCompletionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobCompletionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobCompletionRequest" type="{https://NewHotel/Web/Services/}JobCompletionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobCompletionRequest", propOrder = {
    "jobCompletionRequest"
})
public class ArrayOfJobCompletionRequest {

    @XmlElement(name = "JobCompletionRequest", nillable = true)
    protected List<JobCompletionRequest> jobCompletionRequest;

    /**
     * Gets the value of the jobCompletionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCompletionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCompletionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobCompletionRequest }
     * 
     * 
     */
    public List<JobCompletionRequest> getJobCompletionRequest() {
        if (jobCompletionRequest == null) {
            jobCompletionRequest = new ArrayList<JobCompletionRequest>();
        }
        return this.jobCompletionRequest;
    }

}
