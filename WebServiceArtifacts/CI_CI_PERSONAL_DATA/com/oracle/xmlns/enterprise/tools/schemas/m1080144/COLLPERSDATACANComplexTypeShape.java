
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_CANComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_CANComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_BILINGUALISM_CODE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_BILINGUALISM_CODETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_HEALTH_CARE_NBR" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_HEALTH_CARE_NBRTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_HEALTH_CARE_STATE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_HEALTH_CARE_STATETypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_CANComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propbilingualismcode",
    "prophealthcarenbr",
    "prophealthcarestate"
})
public class COLLPERSDATACANComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_BILINGUALISM_CODE")
    protected PROPBILINGUALISMCODETypeShape propbilingualismcode;
    @XmlElement(name = "PROP_HEALTH_CARE_NBR")
    protected PROPHEALTHCARENBRTypeShape prophealthcarenbr;
    @XmlElement(name = "PROP_HEALTH_CARE_STATE")
    protected PROPHEALTHCARESTATETypeShape prophealthcarestate;

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
     * Gets the value of the propbilingualismcode property.
     * 
     * @return
     *     possible object is
     *     {@link PROPBILINGUALISMCODETypeShape }
     *     
     */
    public PROPBILINGUALISMCODETypeShape getPROPBILINGUALISMCODE() {
        return propbilingualismcode;
    }

    /**
     * Sets the value of the propbilingualismcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPBILINGUALISMCODETypeShape }
     *     
     */
    public void setPROPBILINGUALISMCODE(PROPBILINGUALISMCODETypeShape value) {
        this.propbilingualismcode = value;
    }

    /**
     * Gets the value of the prophealthcarenbr property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHEALTHCARENBRTypeShape }
     *     
     */
    public PROPHEALTHCARENBRTypeShape getPROPHEALTHCARENBR() {
        return prophealthcarenbr;
    }

    /**
     * Sets the value of the prophealthcarenbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHEALTHCARENBRTypeShape }
     *     
     */
    public void setPROPHEALTHCARENBR(PROPHEALTHCARENBRTypeShape value) {
        this.prophealthcarenbr = value;
    }

    /**
     * Gets the value of the prophealthcarestate property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHEALTHCARESTATETypeShape }
     *     
     */
    public PROPHEALTHCARESTATETypeShape getPROPHEALTHCARESTATE() {
        return prophealthcarestate;
    }

    /**
     * Sets the value of the prophealthcarestate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHEALTHCARESTATETypeShape }
     *     
     */
    public void setPROPHEALTHCARESTATE(PROPHEALTHCARESTATETypeShape value) {
        this.prophealthcarestate = value;
    }

}
