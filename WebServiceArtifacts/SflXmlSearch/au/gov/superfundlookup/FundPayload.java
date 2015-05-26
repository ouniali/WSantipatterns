
package au.gov.superfundlookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://superfundlookup.gov.au}IdentifierSearch" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://superfundlookup.gov.au}FundResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundPayload", propOrder = {
    "request",
    "response"
})
public class FundPayload {

    @XmlElement(name = "Request")
    protected IdentifierSearch request;
    @XmlElement(name = "Response")
    protected FundResponse response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierSearch }
     *     
     */
    public IdentifierSearch getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierSearch }
     *     
     */
    public void setRequest(IdentifierSearch value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link FundResponse }
     *     
     */
    public FundResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundResponse }
     *     
     */
    public void setResponse(FundResponse value) {
        this.response = value;
    }

}
