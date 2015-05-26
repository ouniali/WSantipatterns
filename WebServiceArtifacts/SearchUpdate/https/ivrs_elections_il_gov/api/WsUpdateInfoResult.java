
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsUpdateInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsUpdateInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LocalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReceiptDatetime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsUpdateInfoResult")
public class WsUpdateInfoResult {

    @XmlAttribute(name = "LocalID")
    protected String localID;
    @XmlAttribute(name = "StateID")
    protected String stateID;
    @XmlAttribute(name = "StateStatus")
    protected String stateStatus;
    @XmlAttribute(name = "ReceiptDatetime")
    protected String receiptDatetime;

    /**
     * Gets the value of the localID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalID(String value) {
        this.localID = value;
    }

    /**
     * Gets the value of the stateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateID(String value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the stateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateStatus() {
        return stateStatus;
    }

    /**
     * Sets the value of the stateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateStatus(String value) {
        this.stateStatus = value;
    }

    /**
     * Gets the value of the receiptDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptDatetime() {
        return receiptDatetime;
    }

    /**
     * Sets the value of the receiptDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptDatetime(String value) {
        this.receiptDatetime = value;
    }

}
