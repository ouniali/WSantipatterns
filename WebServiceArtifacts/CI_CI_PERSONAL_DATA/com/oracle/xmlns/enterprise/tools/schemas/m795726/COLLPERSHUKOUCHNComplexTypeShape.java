
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_HUKOU_CHNComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_HUKOU_CHNComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_HUKOU_TYPE_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_HUKOU_TYPE_CHNTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CONTRIB_AREA_CHN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_CONTRIB_AREA_CHNTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_HUKOU_CHNComplexTypeShape", propOrder = {
    "keypropeffdt",
    "prophukoutypechn",
    "propcontribareachn"
})
public class COLLPERSHUKOUCHNComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_HUKOU_TYPE_CHN")
    protected PROPHUKOUTYPECHNTypeShape prophukoutypechn;
    @XmlElement(name = "PROP_CONTRIB_AREA_CHN")
    protected PROPCONTRIBAREACHNTypeShape propcontribareachn;

    /**
     * Gets the value of the keypropeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPEFFDTTypeShape }
     *     
     */
    public KEYPROPEFFDTTypeShape getKEYPROPEFFDT() {
        return keypropeffdt;
    }

    /**
     * Sets the value of the keypropeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPEFFDTTypeShape }
     *     
     */
    public void setKEYPROPEFFDT(KEYPROPEFFDTTypeShape value) {
        this.keypropeffdt = value;
    }

    /**
     * Gets the value of the prophukoutypechn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHUKOUTYPECHNTypeShape }
     *     
     */
    public PROPHUKOUTYPECHNTypeShape getPROPHUKOUTYPECHN() {
        return prophukoutypechn;
    }

    /**
     * Sets the value of the prophukoutypechn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHUKOUTYPECHNTypeShape }
     *     
     */
    public void setPROPHUKOUTYPECHN(PROPHUKOUTYPECHNTypeShape value) {
        this.prophukoutypechn = value;
    }

    /**
     * Gets the value of the propcontribareachn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCONTRIBAREACHNTypeShape }
     *     
     */
    public PROPCONTRIBAREACHNTypeShape getPROPCONTRIBAREACHN() {
        return propcontribareachn;
    }

    /**
     * Sets the value of the propcontribareachn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCONTRIBAREACHNTypeShape }
     *     
     */
    public void setPROPCONTRIBAREACHN(PROPCONTRIBAREACHNTypeShape value) {
        this.propcontribareachn = value;
    }

}
