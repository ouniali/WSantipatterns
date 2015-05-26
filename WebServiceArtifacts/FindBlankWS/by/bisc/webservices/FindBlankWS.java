
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
 *         &lt;element name="pTB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pSB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pNB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ptb",
    "psb",
    "pnb"
})
@XmlRootElement(name = "FindBlankWS")
public class FindBlankWS {

    @XmlElement(name = "pTB")
    protected Long ptb;
    @XmlElement(name = "pSB")
    protected String psb;
    @XmlElement(name = "pNB")
    protected String pnb;

    /**
     * Gets the value of the ptb property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPTB() {
        return ptb;
    }

    /**
     * Sets the value of the ptb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPTB(Long value) {
        this.ptb = value;
    }

    /**
     * Gets the value of the psb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSB() {
        return psb;
    }

    /**
     * Sets the value of the psb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSB(String value) {
        this.psb = value;
    }

    /**
     * Gets the value of the pnb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNB() {
        return pnb;
    }

    /**
     * Sets the value of the pnb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNB(String value) {
        this.pnb = value;
    }

}
