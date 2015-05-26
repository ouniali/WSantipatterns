
package au.gov.superfundlookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundNamesPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundNamesPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://superfundlookup.gov.au}NameSearch" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://superfundlookup.gov.au}FundNamesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundNamesPayload", propOrder = {
    "request",
    "response"
})
public class FundNamesPayload {

    @XmlElement(name = "Request")
    protected NameSearch request;
    @XmlElement(name = "Response")
    protected FundNamesResponse response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link NameSearch }
     *     
     */
    public NameSearch getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSearch }
     *     
     */
    public void setRequest(NameSearch value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link FundNamesResponse }
     *     
     */
    public FundNamesResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundNamesResponse }
     *     
     */
    public void setResponse(FundNamesResponse value) {
        this.response = value;
    }

}
