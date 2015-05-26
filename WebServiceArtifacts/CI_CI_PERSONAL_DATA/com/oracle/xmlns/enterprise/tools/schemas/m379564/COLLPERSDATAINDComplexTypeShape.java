
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_INDComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_INDComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_GPIN_CASTE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_GPIN_CASTETypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_INDComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propgpincaste"
})
public class COLLPERSDATAINDComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_GPIN_CASTE")
    protected PROPGPINCASTETypeShape propgpincaste;

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
     * Gets the value of the propgpincaste property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGPINCASTETypeShape }
     *     
     */
    public PROPGPINCASTETypeShape getPROPGPINCASTE() {
        return propgpincaste;
    }

    /**
     * Sets the value of the propgpincaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGPINCASTETypeShape }
     *     
     */
    public void setPROPGPINCASTE(PROPGPINCASTETypeShape value) {
        this.propgpincaste = value;
    }

}
