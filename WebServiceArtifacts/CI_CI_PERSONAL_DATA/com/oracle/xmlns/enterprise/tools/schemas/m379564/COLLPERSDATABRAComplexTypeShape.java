
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_BRAComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_BRAComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_REG_REGION" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_REG_REGIONTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ETHNIC_GRP_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ETHNIC_GRP_CDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NATIONALITY_CD_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_NATIONALITY_CD_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_EDUCATION_LVL_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_EDUCATION_LVL_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_SETID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_SETIDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_BLOOD_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_BLOOD_TYPETypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_BRAComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propregregion",
    "propethnicgrpcd",
    "propnationalitycdbra",
    "propeducationlvlbra",
    "propsetid",
    "propbloodtype"
})
public class COLLPERSDATABRAComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_REG_REGION")
    protected PROPREGREGIONTypeShape propregregion;
    @XmlElement(name = "PROP_ETHNIC_GRP_CD")
    protected PROPETHNICGRPCDTypeShape propethnicgrpcd;
    @XmlElement(name = "PROP_NATIONALITY_CD_BRA")
    protected PROPNATIONALITYCDBRATypeShape propnationalitycdbra;
    @XmlElement(name = "PROP_EDUCATION_LVL_BRA")
    protected PROPEDUCATIONLVLBRATypeShape propeducationlvlbra;
    @XmlElement(name = "PROP_SETID")
    protected PROPSETIDTypeShape propsetid;
    @XmlElement(name = "PROP_BLOOD_TYPE", required = true)
    protected PROPBLOODTYPETypeShape propbloodtype;

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
     * Gets the value of the propregregion property.
     * 
     * @return
     *     possible object is
     *     {@link PROPREGREGIONTypeShape }
     *     
     */
    public PROPREGREGIONTypeShape getPROPREGREGION() {
        return propregregion;
    }

    /**
     * Sets the value of the propregregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPREGREGIONTypeShape }
     *     
     */
    public void setPROPREGREGION(PROPREGREGIONTypeShape value) {
        this.propregregion = value;
    }

    /**
     * Gets the value of the propethnicgrpcd property.
     * 
     * @return
     *     possible object is
     *     {@link PROPETHNICGRPCDTypeShape }
     *     
     */
    public PROPETHNICGRPCDTypeShape getPROPETHNICGRPCD() {
        return propethnicgrpcd;
    }

    /**
     * Sets the value of the propethnicgrpcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPETHNICGRPCDTypeShape }
     *     
     */
    public void setPROPETHNICGRPCD(PROPETHNICGRPCDTypeShape value) {
        this.propethnicgrpcd = value;
    }

    /**
     * Gets the value of the propnationalitycdbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNATIONALITYCDBRATypeShape }
     *     
     */
    public PROPNATIONALITYCDBRATypeShape getPROPNATIONALITYCDBRA() {
        return propnationalitycdbra;
    }

    /**
     * Sets the value of the propnationalitycdbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNATIONALITYCDBRATypeShape }
     *     
     */
    public void setPROPNATIONALITYCDBRA(PROPNATIONALITYCDBRATypeShape value) {
        this.propnationalitycdbra = value;
    }

    /**
     * Gets the value of the propeducationlvlbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEDUCATIONLVLBRATypeShape }
     *     
     */
    public PROPEDUCATIONLVLBRATypeShape getPROPEDUCATIONLVLBRA() {
        return propeducationlvlbra;
    }

    /**
     * Sets the value of the propeducationlvlbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEDUCATIONLVLBRATypeShape }
     *     
     */
    public void setPROPEDUCATIONLVLBRA(PROPEDUCATIONLVLBRATypeShape value) {
        this.propeducationlvlbra = value;
    }

    /**
     * Gets the value of the propsetid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSETIDTypeShape }
     *     
     */
    public PROPSETIDTypeShape getPROPSETID() {
        return propsetid;
    }

    /**
     * Sets the value of the propsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSETIDTypeShape }
     *     
     */
    public void setPROPSETID(PROPSETIDTypeShape value) {
        this.propsetid = value;
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
