
package com.oracle.xmlns.enterprise.tools.schemas.m475145;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_CHEComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_CHEComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_GUARDIAN_CHE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_GUARDIAN_CHETypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_CHEComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propguardianche"
})
public class COLLPERSDATACHEComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_GUARDIAN_CHE")
    protected PROPGUARDIANCHETypeShape propguardianche;

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
     * Gets the value of the propguardianche property.
     * 
     * @return
     *     possible object is
     *     {@link PROPGUARDIANCHETypeShape }
     *     
     */
    public PROPGUARDIANCHETypeShape getPROPGUARDIANCHE() {
        return propguardianche;
    }

    /**
     * Sets the value of the propguardianche property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPGUARDIANCHETypeShape }
     *     
     */
    public void setPROPGUARDIANCHE(PROPGUARDIANCHETypeShape value) {
        this.propguardianche = value;
    }

}
