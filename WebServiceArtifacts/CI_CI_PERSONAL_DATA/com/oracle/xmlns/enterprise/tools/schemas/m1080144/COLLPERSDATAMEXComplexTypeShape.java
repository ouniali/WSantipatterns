
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_MEXComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_MEXComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="KEYPROP_AFORE_MEX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}KEYPROP_AFORE_MEXTypeShape"/>
 *         &lt;element name="PROP_MED_REC_CD_MEX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MED_REC_CD_MEXTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_MEXComplexTypeShape", propOrder = {
    "keypropeffdt",
    "keypropaforemex",
    "propmedreccdmex"
})
public class COLLPERSDATAMEXComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "KEYPROP_AFORE_MEX", required = true)
    protected KEYPROPAFOREMEXTypeShape keypropaforemex;
    @XmlElement(name = "PROP_MED_REC_CD_MEX")
    protected PROPMEDRECCDMEXTypeShape propmedreccdmex;

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
     * Gets the value of the keypropaforemex property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPAFOREMEXTypeShape }
     *     
     */
    public KEYPROPAFOREMEXTypeShape getKEYPROPAFOREMEX() {
        return keypropaforemex;
    }

    /**
     * Sets the value of the keypropaforemex property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPAFOREMEXTypeShape }
     *     
     */
    public void setKEYPROPAFOREMEX(KEYPROPAFOREMEXTypeShape value) {
        this.keypropaforemex = value;
    }

    /**
     * Gets the value of the propmedreccdmex property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMEDRECCDMEXTypeShape }
     *     
     */
    public PROPMEDRECCDMEXTypeShape getPROPMEDRECCDMEX() {
        return propmedreccdmex;
    }

    /**
     * Sets the value of the propmedreccdmex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMEDRECCDMEXTypeShape }
     *     
     */
    public void setPROPMEDRECCDMEX(PROPMEDRECCDMEXTypeShape value) {
        this.propmedreccdmex = value;
    }

}
