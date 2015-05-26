
package in.gov.incometaxindiaefiling.ditws.addclientdetails.v_1_0;

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
 *         &lt;element name="LoginInfo" type="{http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0}LoginInfoType"/>
 *         &lt;element name="addClient" type="{http://incometaxindiaefiling.gov.in/ditws/addClientDetails/v_1_0}addClientType"/>
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
    "addClient"
})
@XmlRootElement(name = "addClientDetails")
public class AddClientDetails {

    @XmlElement(name = "LoginInfo", required = true)
    protected LoginInfoType loginInfo;
    @XmlElement(required = true)
    protected AddClientType addClient;

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
     * Gets the value of the addClient property.
     * 
     * @return
     *     possible object is
     *     {@link AddClientType }
     *     
     */
    public AddClientType getAddClient() {
        return addClient;
    }

    /**
     * Sets the value of the addClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddClientType }
     *     
     */
    public void setAddClient(AddClientType value) {
        this.addClient = value;
    }

}
