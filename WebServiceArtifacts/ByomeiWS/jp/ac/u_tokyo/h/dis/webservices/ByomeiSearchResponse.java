
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
 *         &lt;element name="ByomeiSearchResult" type="{http://www.dis.h.u-tokyo.ac.jp/webservices/}ByomeiSearchResult" minOccurs="0"/>
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
    "byomeiSearchResult"
})
@XmlRootElement(name = "ByomeiSearchResponse")
public class ByomeiSearchResponse {

    @XmlElement(name = "ByomeiSearchResult")
    protected ByomeiSearchResult byomeiSearchResult;

    /**
     * Gets the value of the byomeiSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ByomeiSearchResult }
     *     
     */
    public ByomeiSearchResult getByomeiSearchResult() {
        return byomeiSearchResult;
    }

    /**
     * Sets the value of the byomeiSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByomeiSearchResult }
     *     
     */
    public void setByomeiSearchResult(ByomeiSearchResult value) {
        this.byomeiSearchResult = value;
    }

}
