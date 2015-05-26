
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_ESPComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_ESPComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_MILIT_SITUATN_ESP" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_MILIT_SITUATN_ESPTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_SOC_SEC_AFF_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_SOC_SEC_AFF_DTTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_ESPComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propmilitsituatnesp",
    "propsocsecaffdt"
})
public class COLLPERSDATAESPComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_MILIT_SITUATN_ESP")
    protected PROPMILITSITUATNESPTypeShape propmilitsituatnesp;
    @XmlElement(name = "PROP_SOC_SEC_AFF_DT")
    protected PROPSOCSECAFFDTTypeShape propsocsecaffdt;

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
     * Gets the value of the propmilitsituatnesp property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITSITUATNESPTypeShape }
     *     
     */
    public PROPMILITSITUATNESPTypeShape getPROPMILITSITUATNESP() {
        return propmilitsituatnesp;
    }

    /**
     * Sets the value of the propmilitsituatnesp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITSITUATNESPTypeShape }
     *     
     */
    public void setPROPMILITSITUATNESP(PROPMILITSITUATNESPTypeShape value) {
        this.propmilitsituatnesp = value;
    }

    /**
     * Gets the value of the propsocsecaffdt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSOCSECAFFDTTypeShape }
     *     
     */
    public PROPSOCSECAFFDTTypeShape getPROPSOCSECAFFDT() {
        return propsocsecaffdt;
    }

    /**
     * Sets the value of the propsocsecaffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSOCSECAFFDTTypeShape }
     *     
     */
    public void setPROPSOCSECAFFDT(PROPSOCSECAFFDTTypeShape value) {
        this.propsocsecaffdt = value;
    }

}
