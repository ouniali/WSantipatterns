
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequestFilterStateCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequestFilterStateCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRequestFilterStateCode", propOrder = {
    "qld",
    "nt",
    "sa",
    "wa",
    "vic",
    "act",
    "tas",
    "nsw"
})
public class ExternalRequestFilterStateCode {

    @XmlElement(name = "QLD")
    protected String qld;
    @XmlElement(name = "NT")
    protected String nt;
    @XmlElement(name = "SA")
    protected String sa;
    @XmlElement(name = "WA")
    protected String wa;
    @XmlElement(name = "VIC")
    protected String vic;
    @XmlElement(name = "ACT")
    protected String act;
    @XmlElement(name = "TAS")
    protected String tas;
    @XmlElement(name = "NSW")
    protected String nsw;

    /**
     * Gets the value of the qld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQLD() {
        return qld;
    }

    /**
     * Sets the value of the qld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQLD(String value) {
        this.qld = value;
    }

    /**
     * Gets the value of the nt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNT() {
        return nt;
    }

    /**
     * Sets the value of the nt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNT(String value) {
        this.nt = value;
    }

    /**
     * Gets the value of the sa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA() {
        return sa;
    }

    /**
     * Sets the value of the sa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA(String value) {
        this.sa = value;
    }

    /**
     * Gets the value of the wa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWA() {
        return wa;
    }

    /**
     * Sets the value of the wa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWA(String value) {
        this.wa = value;
    }

    /**
     * Gets the value of the vic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIC() {
        return vic;
    }

    /**
     * Sets the value of the vic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIC(String value) {
        this.vic = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACT() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACT(String value) {
        this.act = value;
    }

    /**
     * Gets the value of the tas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAS() {
        return tas;
    }

    /**
     * Sets the value of the tas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAS(String value) {
        this.tas = value;
    }

    /**
     * Gets the value of the nsw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSW() {
        return nsw;
    }

    /**
     * Sets the value of the nsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSW(String value) {
        this.nsw = value;
    }

}
