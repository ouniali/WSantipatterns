
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
 *         &lt;element name="FromZipCode2Result" type="{http://btonic.est.co.jp/zipcode/}FindList" minOccurs="0"/>
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
    "fromZipCode2Result"
})
@XmlRootElement(name = "FromZipCode2Response")
public class FromZipCode2Response {

    @XmlElement(name = "FromZipCode2Result")
    protected FindList fromZipCode2Result;

    /**
     * Gets the value of the fromZipCode2Result property.
     * 
     * @return
     *     possible object is
     *     {@link FindList }
     *     
     */
    public FindList getFromZipCode2Result() {
        return fromZipCode2Result;
    }

    /**
     * Sets the value of the fromZipCode2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindList }
     *     
     */
    public void setFromZipCode2Result(FindList value) {
        this.fromZipCode2Result = value;
    }

}
