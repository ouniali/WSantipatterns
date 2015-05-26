
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_DIVERS_RELIGIONComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_DIVERS_RELIGIONComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_REG_REGION" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_REG_REGIONTypeShape"/>
 *         &lt;element name="PROP_RELIGION_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_RELIGION_CDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_BLOOD_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_BLOOD_TYPETypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_DIVERS_RELIGIONComplexTypeShape", propOrder = {
    "keypropregregion",
    "propreligioncd",
    "propbloodtype"
})
public class COLLDIVERSRELIGIONComplexTypeShape {

    @XmlElement(name = "KEYPROP_REG_REGION", required = true)
    protected KEYPROPREGREGIONTypeShape keypropregregion;
    @XmlElement(name = "PROP_RELIGION_CD")
    protected PROPRELIGIONCDTypeShape propreligioncd;
    @XmlElement(name = "PROP_BLOOD_TYPE")
    protected PROPBLOODTYPETypeShape propbloodtype;

    /**
     * Gets the value of the keypropregregion property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPREGREGIONTypeShape }
     *     
     */
    public KEYPROPREGREGIONTypeShape getKEYPROPREGREGION() {
        return keypropregregion;
    }

    /**
     * Sets the value of the keypropregregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPREGREGIONTypeShape }
     *     
     */
    public void setKEYPROPREGREGION(KEYPROPREGREGIONTypeShape value) {
        this.keypropregregion = value;
    }

    /**
     * Gets the value of the propreligioncd property.
     * 
     * @return
     *     possible object is
     *     {@link PROPRELIGIONCDTypeShape }
     *     
     */
    public PROPRELIGIONCDTypeShape getPROPRELIGIONCD() {
        return propreligioncd;
    }

    /**
     * Sets the value of the propreligioncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPRELIGIONCDTypeShape }
     *     
     */
    public void setPROPRELIGIONCD(PROPRELIGIONCDTypeShape value) {
        this.propreligioncd = value;
    }

    /**
     * Gets the value of the propbloodtype property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBLOODTYPETypeShape }
     *     
     */
    public PROPBLOODTYPETypeShape getPROPBLOODTYPE() {
        return propbloodtype;
    }

    /**
     * Sets the value of the propbloodtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBLOODTYPETypeShape }
     *     
     */
    public void setPROPBLOODTYPE(PROPBLOODTYPETypeShape value) {
        this.propbloodtype = value;
    }

}
