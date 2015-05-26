
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_FRAComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_FRAComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_ENTRY_DT_FRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_ENTRY_DT_FRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILIT_SITUATN_FRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_MILIT_SITUATN_FRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CPAMID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_CPAMIDTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_FRAComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propentrydtfra",
    "propmilitsituatnfra",
    "propcpamid"
})
public class COLLPERSDATAFRAComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_ENTRY_DT_FRA")
    protected PROPENTRYDTFRATypeShape propentrydtfra;
    @XmlElement(name = "PROP_MILIT_SITUATN_FRA")
    protected PROPMILITSITUATNFRATypeShape propmilitsituatnfra;
    @XmlElement(name = "PROP_CPAMID")
    protected PROPCPAMIDTypeShape propcpamid;

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
     * Gets the value of the propentrydtfra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPENTRYDTFRATypeShape }
     *     
     */
    public PROPENTRYDTFRATypeShape getPROPENTRYDTFRA() {
        return propentrydtfra;
    }

    /**
     * Sets the value of the propentrydtfra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPENTRYDTFRATypeShape }
     *     
     */
    public void setPROPENTRYDTFRA(PROPENTRYDTFRATypeShape value) {
        this.propentrydtfra = value;
    }

    /**
     * Gets the value of the propmilitsituatnfra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITSITUATNFRATypeShape }
     *     
     */
    public PROPMILITSITUATNFRATypeShape getPROPMILITSITUATNFRA() {
        return propmilitsituatnfra;
    }

    /**
     * Sets the value of the propmilitsituatnfra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITSITUATNFRATypeShape }
     *     
     */
    public void setPROPMILITSITUATNFRA(PROPMILITSITUATNFRATypeShape value) {
        this.propmilitsituatnfra = value;
    }

    /**
     * Gets the value of the propcpamid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCPAMIDTypeShape }
     *     
     */
    public PROPCPAMIDTypeShape getPROPCPAMID() {
        return propcpamid;
    }

    /**
     * Sets the value of the propcpamid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCPAMIDTypeShape }
     *     
     */
    public void setPROPCPAMID(PROPCPAMIDTypeShape value) {
        this.propcpamid = value;
    }

}
