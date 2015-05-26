
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

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
 *         &lt;element name="LoginInfo" type="{http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0}LoginInfoType"/>
 *         &lt;element name="ClientInfo" type="{http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0}ClientInfoType"/>
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
    "loginInfo",
    "clientInfo"
})
@XmlRootElement(name = "getTDSDetails")
public class GetTDSDetails {

    @XmlElement(name = "LoginInfo", required = true)
    protected LoginInfoType loginInfo;
    @XmlElement(name = "ClientInfo", required = true)
    protected ClientInfoType clientInfo;

    /**
     * Gets the value of the loginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoginInfoType }
     *     
     */
    public LoginInfoType getLoginInfo() {
        return loginInfo;
    }

    /**
     * Sets the value of the loginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginInfoType }
     *     
     */
    public void setLoginInfo(LoginInfoType value) {
        this.loginInfo = value;
    }

    /**
     * Gets the value of the clientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfoType }
     *     
     */
    public ClientInfoType getClientInfo() {
        return clientInfo;
    }

    /**
     * Sets the value of the clientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfoType }
     *     
     */
    public void setClientInfo(ClientInfoType value) {
        this.clientInfo = value;
    }

}
