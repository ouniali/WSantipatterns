
package domaination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="versions" type="{Domaination}versionsType"/>
 *         &lt;element name="iterations" type="{Domaination}iterationsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultsResponseType", propOrder = {
    "resultUrl",
    "ticket",
    "versions",
    "iterations"
})
public class ResultsResponseType {

    @XmlElement(name = "result_url", required = true)
    protected String resultUrl;
    @XmlElement(required = true)
    protected String ticket;
    @XmlElement(required = true)
    protected VersionsType versions;
    @XmlElement(required = true)
    protected IterationsType iterations;

    /**
     * Gets the value of the resultUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultUrl() {
        return resultUrl;
    }

    /**
     * Sets the value of the resultUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultUrl(String value) {
        this.resultUrl = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the versions property.
     * 
     * @return
     *     possible object is
     *     {@link VersionsType }
     *     
     */
    public VersionsType getVersions() {
        return versions;
    }

    /**
     * Sets the value of the versions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionsType }
     *     
     */
    public void setVersions(VersionsType value) {
        this.versions = value;
    }

    /**
     * Gets the value of the iterations property.
     * 
     * @return
     *     possible object is
     *     {@link IterationsType }
     *     
     */
    public IterationsType getIterations() {
        return iterations;
    }

    /**
     * Sets the value of the iterations property.
     * 
     * @param value
     *     allowed object is
     *     {@link IterationsType }
     *     
     */
    public void setIterations(IterationsType value) {
        this.iterations = value;
    }

}
