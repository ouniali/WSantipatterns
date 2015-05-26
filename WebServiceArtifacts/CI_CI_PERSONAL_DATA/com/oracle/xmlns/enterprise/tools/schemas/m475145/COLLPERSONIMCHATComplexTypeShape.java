
package com.oracle.xmlns.enterprise.tools.schemas.m475145;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERSON_IMCHATComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERSON_IMCHATComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_MCF_IM_PROTOCOL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_MCF_IM_PROTOCOLTypeShape"/>
 *         &lt;element name="KEYPROP_MCFIMDOMAIN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_MCFIMDOMAINTypeShape"/>
 *         &lt;element name="PROP_MCF_IMUSERID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_MCF_IMUSERIDTypeShape"/>
 *         &lt;element name="PROP_PREF_CHATID_FLAG" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_PREF_CHATID_FLAGTypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERSON_IMCHATComplexTypeShape", propOrder = {
    "keypropmcfimprotocol",
    "keypropmcfimdomain",
    "propmcfimuserid",
    "propprefchatidflag"
})
public class COLLPERSONIMCHATComplexTypeShape {

    @XmlElement(name = "KEYPROP_MCF_IM_PROTOCOL", required = true)
    protected KEYPROPMCFIMPROTOCOLTypeShape keypropmcfimprotocol;
    @XmlElement(name = "KEYPROP_MCFIMDOMAIN", required = true)
    protected KEYPROPMCFIMDOMAINTypeShape keypropmcfimdomain;
    @XmlElement(name = "PROP_MCF_IMUSERID", required = true)
    protected PROPMCFIMUSERIDTypeShape propmcfimuserid;
    @XmlElement(name = "PROP_PREF_CHATID_FLAG", required = true)
    protected PROPPREFCHATIDFLAGTypeShape propprefchatidflag;

    /**
     * Gets the value of the keypropmcfimprotocol property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPMCFIMPROTOCOLTypeShape }
     *     
     */
    public KEYPROPMCFIMPROTOCOLTypeShape getKEYPROPMCFIMPROTOCOL() {
        return keypropmcfimprotocol;
    }

    /**
     * Sets the value of the keypropmcfimprotocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPMCFIMPROTOCOLTypeShape }
     *     
     */
    public void setKEYPROPMCFIMPROTOCOL(KEYPROPMCFIMPROTOCOLTypeShape value) {
        this.keypropmcfimprotocol = value;
    }

    /**
     * Gets the value of the keypropmcfimdomain property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPMCFIMDOMAINTypeShape }
     *     
     */
    public KEYPROPMCFIMDOMAINTypeShape getKEYPROPMCFIMDOMAIN() {
        return keypropmcfimdomain;
    }

    /**
     * Sets the value of the keypropmcfimdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPMCFIMDOMAINTypeShape }
     *     
     */
    public void setKEYPROPMCFIMDOMAIN(KEYPROPMCFIMDOMAINTypeShape value) {
        this.keypropmcfimdomain = value;
    }

    /**
     * Gets the value of the propmcfimuserid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMCFIMUSERIDTypeShape }
     *     
     */
    public PROPMCFIMUSERIDTypeShape getPROPMCFIMUSERID() {
        return propmcfimuserid;
    }

    /**
     * Sets the value of the propmcfimuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMCFIMUSERIDTypeShape }
     *     
     */
    public void setPROPMCFIMUSERID(PROPMCFIMUSERIDTypeShape value) {
        this.propmcfimuserid = value;
    }

    /**
     * Gets the value of the propprefchatidflag property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPREFCHATIDFLAGTypeShape }
     *     
     */
    public PROPPREFCHATIDFLAGTypeShape getPROPPREFCHATIDFLAG() {
        return propprefchatidflag;
    }

    /**
     * Sets the value of the propprefchatidflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPREFCHATIDFLAGTypeShape }
     *     
     */
    public void setPROPPREFCHATIDFLAG(PROPPREFCHATIDFLAGTypeShape value) {
        this.propprefchatidflag = value;
    }

}
