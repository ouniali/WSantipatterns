
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
 *         &lt;element name="EuroVersionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EuroClientInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "euroVersionNum",
    "euroClientInfo"
})
@XmlRootElement(name = "GetEuroRelNotesNew")
public class GetEuroRelNotesNew {

    @XmlElement(name = "EuroVersionNum")
    protected String euroVersionNum;
    @XmlElement(name = "EuroClientInfo")
    protected String euroClientInfo;

    /**
     * Gets the value of the euroVersionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuroVersionNum() {
        return euroVersionNum;
    }

    /**
     * Sets the value of the euroVersionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuroVersionNum(String value) {
        this.euroVersionNum = value;
    }

    /**
     * Gets the value of the euroClientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuroClientInfo() {
        return euroClientInfo;
    }

    /**
     * Sets the value of the euroClientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuroClientInfo(String value) {
        this.euroClientInfo = value;
    }

}
