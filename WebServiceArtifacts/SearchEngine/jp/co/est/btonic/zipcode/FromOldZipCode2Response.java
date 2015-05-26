
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
 *         &lt;element name="FromOldZipCode2Result" type="{http://btonic.est.co.jp/zipcode/}FindList" minOccurs="0"/>
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
    "fromOldZipCode2Result"
})
@XmlRootElement(name = "FromOldZipCode2Response")
public class FromOldZipCode2Response {

    @XmlElement(name = "FromOldZipCode2Result")
    protected FindList fromOldZipCode2Result;

    /**
     * Gets the value of the fromOldZipCode2Result property.
     * 
     * @return
     *     possible object is
     *     {@link FindList }
     *     
     */
    public FindList getFromOldZipCode2Result() {
        return fromOldZipCode2Result;
    }

    /**
     * Sets the value of the fromOldZipCode2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindList }
     *     
     */
    public void setFromOldZipCode2Result(FindList value) {
        this.fromOldZipCode2Result = value;
    }

}
