
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_ITAComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_ITAComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_MILITARY_STAT_ITA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MILITARY_STAT_ITATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITARY_TYPE_ITA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MILITARY_TYPE_ITATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITARY_RANK_ITA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MILITARY_RANK_ITATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITARY_END_ITA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MILITARY_END_ITATypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_ITAComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propmilitarystatita",
    "propmilitarytypeita",
    "propmilitaryrankita",
    "propmilitaryendita"
})
public class COLLPERSDATAITAComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_MILITARY_STAT_ITA")
    protected PROPMILITARYSTATITATypeShape propmilitarystatita;
    @XmlElement(name = "PROP_MILITARY_TYPE_ITA")
    protected PROPMILITARYTYPEITATypeShape propmilitarytypeita;
    @XmlElement(name = "PROP_MILITARY_RANK_ITA")
    protected PROPMILITARYRANKITATypeShape propmilitaryrankita;
    @XmlElement(name = "PROP_MILITARY_END_ITA")
    protected PROPMILITARYENDITATypeShape propmilitaryendita;

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
     * Gets the value of the propmilitarystatita property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARYSTATITATypeShape }
     *     
     */
    public PROPMILITARYSTATITATypeShape getPROPMILITARYSTATITA() {
        return propmilitarystatita;
    }

    /**
     * Sets the value of the propmilitarystatita property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARYSTATITATypeShape }
     *     
     */
    public void setPROPMILITARYSTATITA(PROPMILITARYSTATITATypeShape value) {
        this.propmilitarystatita = value;
    }

    /**
     * Gets the value of the propmilitarytypeita property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARYTYPEITATypeShape }
     *     
     */
    public PROPMILITARYTYPEITATypeShape getPROPMILITARYTYPEITA() {
        return propmilitarytypeita;
    }

    /**
     * Sets the value of the propmilitarytypeita property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARYTYPEITATypeShape }
     *     
     */
    public void setPROPMILITARYTYPEITA(PROPMILITARYTYPEITATypeShape value) {
        this.propmilitarytypeita = value;
    }

    /**
     * Gets the value of the propmilitaryrankita property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARYRANKITATypeShape }
     *     
     */
    public PROPMILITARYRANKITATypeShape getPROPMILITARYRANKITA() {
        return propmilitaryrankita;
    }

    /**
     * Sets the value of the propmilitaryrankita property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARYRANKITATypeShape }
     *     
     */
    public void setPROPMILITARYRANKITA(PROPMILITARYRANKITATypeShape value) {
        this.propmilitaryrankita = value;
    }

    /**
     * Gets the value of the propmilitaryendita property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARYENDITATypeShape }
     *     
     */
    public PROPMILITARYENDITATypeShape getPROPMILITARYENDITA() {
        return propmilitaryendita;
    }

    /**
     * Sets the value of the propmilitaryendita property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARYENDITATypeShape }
     *     
     */
    public void setPROPMILITARYENDITA(PROPMILITARYENDITATypeShape value) {
        this.propmilitaryendita = value;
    }

}
