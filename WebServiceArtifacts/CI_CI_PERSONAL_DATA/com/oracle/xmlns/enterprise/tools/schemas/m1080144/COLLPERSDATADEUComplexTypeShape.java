
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_DEUComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_DEUComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_MILITARY_STAT_GER" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MILITARY_STAT_GERTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_EXPCTD_MILITARY_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_EXPCTD_MILITARY_DTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_HR_RESPONSIBLE_ID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_HR_RESPONSIBLE_IDTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_DEUComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propmilitarystatger",
    "propexpctdmilitarydt",
    "prophrresponsibleid"
})
public class COLLPERSDATADEUComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_MILITARY_STAT_GER")
    protected PROPMILITARYSTATGERTypeShape propmilitarystatger;
    @XmlElement(name = "PROP_EXPCTD_MILITARY_DT")
    protected PROPEXPCTDMILITARYDTTypeShape propexpctdmilitarydt;
    @XmlElement(name = "PROP_HR_RESPONSIBLE_ID")
    protected PROPHRRESPONSIBLEIDTypeShape prophrresponsibleid;

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
     * Gets the value of the propmilitarystatger property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARYSTATGERTypeShape }
     *     
     */
    public PROPMILITARYSTATGERTypeShape getPROPMILITARYSTATGER() {
        return propmilitarystatger;
    }

    /**
     * Sets the value of the propmilitarystatger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARYSTATGERTypeShape }
     *     
     */
    public void setPROPMILITARYSTATGER(PROPMILITARYSTATGERTypeShape value) {
        this.propmilitarystatger = value;
    }

    /**
     * Gets the value of the propexpctdmilitarydt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEXPCTDMILITARYDTTypeShape }
     *     
     */
    public PROPEXPCTDMILITARYDTTypeShape getPROPEXPCTDMILITARYDT() {
        return propexpctdmilitarydt;
    }

    /**
     * Sets the value of the propexpctdmilitarydt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEXPCTDMILITARYDTTypeShape }
     *     
     */
    public void setPROPEXPCTDMILITARYDT(PROPEXPCTDMILITARYDTTypeShape value) {
        this.propexpctdmilitarydt = value;
    }

    /**
     * Gets the value of the prophrresponsibleid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHRRESPONSIBLEIDTypeShape }
     *     
     */
    public PROPHRRESPONSIBLEIDTypeShape getPROPHRRESPONSIBLEID() {
        return prophrresponsibleid;
    }

    /**
     * Sets the value of the prophrresponsibleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHRRESPONSIBLEIDTypeShape }
     *     
     */
    public void setPROPHRRESPONSIBLEID(PROPHRRESPONSIBLEIDTypeShape value) {
        this.prophrresponsibleid = value;
    }

}
