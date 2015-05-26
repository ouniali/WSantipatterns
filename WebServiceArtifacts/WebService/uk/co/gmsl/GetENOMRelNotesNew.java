
package uk.co.gmsl;

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
 *         &lt;element name="ENOMVersionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENOMClientInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "enomVersionNum",
    "enomClientInfo"
})
@XmlRootElement(name = "GetENOMRelNotesNew")
public class GetENOMRelNotesNew {

    @XmlElement(name = "ENOMVersionNum")
    protected String enomVersionNum;
    @XmlElement(name = "ENOMClientInfo")
    protected String enomClientInfo;

    /**
     * Gets the value of the enomVersionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENOMVersionNum() {
        return enomVersionNum;
    }

    /**
     * Sets the value of the enomVersionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENOMVersionNum(String value) {
        this.enomVersionNum = value;
    }

    /**
     * Gets the value of the enomClientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENOMClientInfo() {
        return enomClientInfo;
    }

    /**
     * Sets the value of the enomClientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENOMClientInfo(String value) {
        this.enomClientInfo = value;
    }

}
