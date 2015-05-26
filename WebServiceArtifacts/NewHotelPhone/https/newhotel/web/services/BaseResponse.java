
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errors" type="{https://NewHotel/Web/Services/}ArrayOfErrorResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponse", propOrder = {
    "requestID",
    "errors"
})
@XmlSeeAlso({
    NomenclatureResponse.class,
    MessageNewGesCollectionResponse.class,
    ExtensionSyncResponse.class,
    JobCollectionResponse.class,
    BillPayTVResponse.class,
    BaseStringResponse.class,
    WakeUpCollectionResponse.class,
    MovementCollectionResponse.class,
    WakeUpResponse.class,
    TransferCCResponse.class,
    KioskBaseResponse.class
})
public class BaseResponse {

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "Errors")
    protected ArrayOfErrorResponse errors;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorResponse }
     *     
     */
    public ArrayOfErrorResponse getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorResponse }
     *     
     */
    public void setErrors(ArrayOfErrorResponse value) {
        this.errors = value;
    }

}
