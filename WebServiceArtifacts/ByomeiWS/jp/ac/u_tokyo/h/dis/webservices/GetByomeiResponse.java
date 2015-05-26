
package jp.ac.u_tokyo.h.dis.webservices;

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
 *         &lt;element name="GetByomeiResult" type="{http://www.dis.h.u-tokyo.ac.jp/webservices/}resultElement" minOccurs="0"/>
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
    "getByomeiResult"
})
@XmlRootElement(name = "GetByomeiResponse")
public class GetByomeiResponse {

    @XmlElement(name = "GetByomeiResult")
    protected ResultElement getByomeiResult;

    /**
     * Gets the value of the getByomeiResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultElement }
     *     
     */
    public ResultElement getGetByomeiResult() {
        return getByomeiResult;
    }

    /**
     * Sets the value of the getByomeiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultElement }
     *     
     */
    public void setGetByomeiResult(ResultElement value) {
        this.getByomeiResult = value;
    }

}
