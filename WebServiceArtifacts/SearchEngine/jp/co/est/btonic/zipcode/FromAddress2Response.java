
package jp.co.est.btonic.zipcode;

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
 *         &lt;element name="FromAddress2Result" type="{http://btonic.est.co.jp/zipcode/}FindList" minOccurs="0"/>
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
    "fromAddress2Result"
})
@XmlRootElement(name = "FromAddress2Response")
public class FromAddress2Response {

    @XmlElement(name = "FromAddress2Result")
    protected FindList fromAddress2Result;

    /**
     * Gets the value of the fromAddress2Result property.
     * 
     * @return
     *     possible object is
     *     {@link FindList }
     *     
     */
    public FindList getFromAddress2Result() {
        return fromAddress2Result;
    }

    /**
     * Sets the value of the fromAddress2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindList }
     *     
     */
    public void setFromAddress2Result(FindList value) {
        this.fromAddress2Result = value;
    }

}
