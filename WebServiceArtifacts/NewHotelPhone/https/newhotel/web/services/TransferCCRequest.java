
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferCCRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCCRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="TransferCCData" type="{https://NewHotel/Web/Services/}TransferCCDataRequest" minOccurs="0"/>
 *         &lt;element name="DevolutionDetails" type="{https://NewHotel/Web/Services/}DevolutionDetailsRequest" minOccurs="0"/>
 *         &lt;element name="ReplieDetails" type="{https://NewHotel/Web/Services/}ReplieDetailsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferCCRequest", propOrder = {
    "transferCCData",
    "devolutionDetails",
    "replieDetails"
})
public class TransferCCRequest
    extends BaseRequest
{

    @XmlElement(name = "TransferCCData")
    protected TransferCCDataRequest transferCCData;
    @XmlElement(name = "DevolutionDetails")
    protected DevolutionDetailsRequest devolutionDetails;
    @XmlElement(name = "ReplieDetails")
    protected ReplieDetailsRequest replieDetails;

    /**
     * Gets the value of the transferCCData property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCCDataRequest }
     *     
     */
    public TransferCCDataRequest getTransferCCData() {
        return transferCCData;
    }

    /**
     * Sets the value of the transferCCData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCCDataRequest }
     *     
     */
    public void setTransferCCData(TransferCCDataRequest value) {
        this.transferCCData = value;
    }

    /**
     * Gets the value of the devolutionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DevolutionDetailsRequest }
     *     
     */
    public DevolutionDetailsRequest getDevolutionDetails() {
        return devolutionDetails;
    }

    /**
     * Sets the value of the devolutionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevolutionDetailsRequest }
     *     
     */
    public void setDevolutionDetails(DevolutionDetailsRequest value) {
        this.devolutionDetails = value;
    }

    /**
     * Gets the value of the replieDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReplieDetailsRequest }
     *     
     */
    public ReplieDetailsRequest getReplieDetails() {
        return replieDetails;
    }

    /**
     * Sets the value of the replieDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplieDetailsRequest }
     *     
     */
    public void setReplieDetails(ReplieDetailsRequest value) {
        this.replieDetails = value;
    }

}
