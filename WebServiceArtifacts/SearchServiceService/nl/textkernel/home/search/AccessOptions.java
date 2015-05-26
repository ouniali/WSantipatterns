
package nl.textkernel.home.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalTokens" type="{http://home.textkernel.nl/search}StringMap" minOccurs="0"/>
 *         &lt;element name="searcherAccess" type="{http://home.textkernel.nl/search}CredentialsMap" minOccurs="0"/>
 *         &lt;element name="reportingAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assessmentAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessOptions", propOrder = {
    "externalTokens",
    "searcherAccess",
    "reportingAccess",
    "assessmentAccess"
})
public class AccessOptions {

    @XmlElementRef(name = "externalTokens", type = JAXBElement.class, required = false)
    protected JAXBElement<StringMap> externalTokens;
    @XmlElementRef(name = "searcherAccess", type = JAXBElement.class, required = false)
    protected JAXBElement<CredentialsMap> searcherAccess;
    protected boolean reportingAccess;
    protected boolean assessmentAccess;

    /**
     * Gets the value of the externalTokens property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringMap }{@code >}
     *     
     */
    public JAXBElement<StringMap> getExternalTokens() {
        return externalTokens;
    }

    /**
     * Sets the value of the externalTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringMap }{@code >}
     *     
     */
    public void setExternalTokens(JAXBElement<StringMap> value) {
        this.externalTokens = value;
    }

    /**
     * Gets the value of the searcherAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CredentialsMap }{@code >}
     *     
     */
    public JAXBElement<CredentialsMap> getSearcherAccess() {
        return searcherAccess;
    }

    /**
     * Sets the value of the searcherAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CredentialsMap }{@code >}
     *     
     */
    public void setSearcherAccess(JAXBElement<CredentialsMap> value) {
        this.searcherAccess = value;
    }

    /**
     * Gets the value of the reportingAccess property.
     * 
     */
    public boolean isReportingAccess() {
        return reportingAccess;
    }

    /**
     * Sets the value of the reportingAccess property.
     * 
     */
    public void setReportingAccess(boolean value) {
        this.reportingAccess = value;
    }

    /**
     * Gets the value of the assessmentAccess property.
     * 
     */
    public boolean isAssessmentAccess() {
        return assessmentAccess;
    }

    /**
     * Sets the value of the assessmentAccess property.
     * 
     */
    public void setAssessmentAccess(boolean value) {
        this.assessmentAccess = value;
    }

}
