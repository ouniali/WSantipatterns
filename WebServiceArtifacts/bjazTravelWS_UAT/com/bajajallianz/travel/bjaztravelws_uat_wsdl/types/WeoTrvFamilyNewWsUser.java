
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvFamilyNewWsUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvFamilyNewWsUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTrvFamilyNewWsBase">
 *       &lt;sequence>
 *         &lt;element name="pvassignee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvpartnerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvrelation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvpassportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvsex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvdob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvFamilyNewWsUser", propOrder = {
    "pvassignee",
    "seqNo",
    "pvpartnerId",
    "pvrelation",
    "pvname",
    "pvpassportNo",
    "pvage",
    "pvsex",
    "pvdob"
})
public class WeoTrvFamilyNewWsUser
    extends WeoTrvFamilyNewWsBase
{

    @XmlElement(required = true, nillable = true)
    protected String pvassignee;
    @XmlElement(required = true, nillable = true)
    protected String seqNo;
    @XmlElement(required = true, nillable = true)
    protected String pvpartnerId;
    @XmlElement(required = true, nillable = true)
    protected String pvrelation;
    @XmlElement(required = true, nillable = true)
    protected String pvname;
    @XmlElement(required = true, nillable = true)
    protected String pvpassportNo;
    @XmlElement(required = true, nillable = true)
    protected String pvage;
    @XmlElement(required = true, nillable = true)
    protected String pvsex;
    @XmlElement(required = true, nillable = true)
    protected String pvdob;

    /**
     * Gets the value of the pvassignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvassignee() {
        return pvassignee;
    }

    /**
     * Sets the value of the pvassignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvassignee(String value) {
        this.pvassignee = value;
    }

    /**
     * Gets the value of the seqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * Sets the value of the seqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNo(String value) {
        this.seqNo = value;
    }

    /**
     * Gets the value of the pvpartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvpartnerId() {
        return pvpartnerId;
    }

    /**
     * Sets the value of the pvpartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvpartnerId(String value) {
        this.pvpartnerId = value;
    }

    /**
     * Gets the value of the pvrelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvrelation() {
        return pvrelation;
    }

    /**
     * Sets the value of the pvrelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvrelation(String value) {
        this.pvrelation = value;
    }

    /**
     * Gets the value of the pvname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvname() {
        return pvname;
    }

    /**
     * Sets the value of the pvname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvname(String value) {
        this.pvname = value;
    }

    /**
     * Gets the value of the pvpassportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvpassportNo() {
        return pvpassportNo;
    }

    /**
     * Sets the value of the pvpassportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvpassportNo(String value) {
        this.pvpassportNo = value;
    }

    /**
     * Gets the value of the pvage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvage() {
        return pvage;
    }

    /**
     * Sets the value of the pvage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvage(String value) {
        this.pvage = value;
    }

    /**
     * Gets the value of the pvsex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvsex() {
        return pvsex;
    }

    /**
     * Sets the value of the pvsex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvsex(String value) {
        this.pvsex = value;
    }

    /**
     * Gets the value of the pvdob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvdob() {
        return pvdob;
    }

    /**
     * Sets the value of the pvdob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvdob(String value) {
        this.pvdob = value;
    }

}
