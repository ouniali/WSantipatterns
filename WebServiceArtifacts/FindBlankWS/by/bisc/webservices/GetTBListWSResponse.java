
package by.bisc.webservices;

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
 *         &lt;element name="GetTBListWSResult" type="{http://www.bisc.by/webservices}WSTBList" minOccurs="0"/>
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
    "getTBListWSResult"
})
@XmlRootElement(name = "GetTBListWSResponse")
public class GetTBListWSResponse {

    @XmlElement(name = "GetTBListWSResult")
    protected WSTBList getTBListWSResult;

    /**
     * Gets the value of the getTBListWSResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSTBList }
     *     
     */
    public WSTBList getGetTBListWSResult() {
        return getTBListWSResult;
    }

    /**
     * Sets the value of the getTBListWSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTBList }
     *     
     */
    public void setGetTBListWSResult(WSTBList value) {
        this.getTBListWSResult = value;
    }

}
