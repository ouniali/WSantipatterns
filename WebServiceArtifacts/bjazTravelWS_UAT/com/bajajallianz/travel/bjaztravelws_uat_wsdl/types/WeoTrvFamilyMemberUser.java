
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvFamilyMemberUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvFamilyMemberUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTrvFamilyMemberBase">
 *       &lt;sequence>
 *         &lt;element name="passignee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pgender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prelation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ppassport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvFamilyMemberUser", propOrder = {
    "passignee",
    "pdob",
    "pname",
    "pgender",
    "prelation",
    "ppassport"
})
public class WeoTrvFamilyMemberUser
    extends WeoTrvFamilyMemberBase
{

    @XmlElement(required = true, nillable = true)
    protected String passignee;
    @XmlElement(required = true, nillable = true)
    protected String pdob;
    @XmlElement(required = true, nillable = true)
    protected String pname;
    @XmlElement(required = true, nillable = true)
    protected String pgender;
    @XmlElement(required = true, nillable = true)
    protected String prelation;
    @XmlElement(required = true, nillable = true)
    protected String ppassport;

    /**
     * Gets the value of the passignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassignee() {
        return passignee;
    }

    /**
     * Sets the value of the passignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassignee(String value) {
        this.passignee = value;
    }

    /**
     * Gets the value of the pdob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdob() {
        return pdob;
    }

    /**
     * Sets the value of the pdob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdob(String value) {
        this.pdob = value;
    }

    /**
     * Gets the value of the pname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPname() {
        return pname;
    }

    /**
     * Sets the value of the pname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPname(String value) {
        this.pname = value;
    }

    /**
     * Gets the value of the pgender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgender() {
        return pgender;
    }

    /**
     * Sets the value of the pgender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgender(String value) {
        this.pgender = value;
    }

    /**
     * Gets the value of the prelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrelation() {
        return prelation;
    }

    /**
     * Sets the value of the prelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrelation(String value) {
        this.prelation = value;
    }

    /**
     * Gets the value of the ppassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpassport() {
        return ppassport;
    }

    /**
     * Sets the value of the ppassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpassport(String value) {
        this.ppassport = value;
    }

}
