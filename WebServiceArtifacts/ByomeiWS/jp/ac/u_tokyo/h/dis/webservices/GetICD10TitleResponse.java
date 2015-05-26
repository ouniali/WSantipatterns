
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
 *         &lt;element name="GetICD10TitleResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getICD10TitleResult"
})
@XmlRootElement(name = "GetICD10TitleResponse")
public class GetICD10TitleResponse {

    @XmlElement(name = "GetICD10TitleResult")
    protected String getICD10TitleResult;

    /**
     * Gets the value of the getICD10TitleResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetICD10TitleResult() {
        return getICD10TitleResult;
    }

    /**
     * Sets the value of the getICD10TitleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetICD10TitleResult(String value) {
        this.getICD10TitleResult = value;
    }

}
