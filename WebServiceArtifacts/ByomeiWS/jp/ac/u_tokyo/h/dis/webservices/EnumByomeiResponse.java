
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
 *         &lt;element name="EnumByomeiResult" type="{http://www.dis.h.u-tokyo.ac.jp/webservices/}ArrayOfResultElement" minOccurs="0"/>
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
    "enumByomeiResult"
})
@XmlRootElement(name = "EnumByomeiResponse")
public class EnumByomeiResponse {

    @XmlElement(name = "EnumByomeiResult")
    protected ArrayOfResultElement enumByomeiResult;

    /**
     * Gets the value of the enumByomeiResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultElement }
     *     
     */
    public ArrayOfResultElement getEnumByomeiResult() {
        return enumByomeiResult;
    }

    /**
     * Sets the value of the enumByomeiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultElement }
     *     
     */
    public void setEnumByomeiResult(ArrayOfResultElement value) {
        this.enumByomeiResult = value;
    }

}
