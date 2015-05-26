
package com.oracle.xmlns.enterprise.tools.schemas.m475145;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_USAComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_USAComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_US_WORK_ELIGIBILTY" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_US_WORK_ELIGIBILTYTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITARY_STATUS" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_MILITARY_STATUSTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CITIZEN_PROOF1" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_CITIZEN_PROOF1TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CITIZEN_PROOF2" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_CITIZEN_PROOF2TypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MEDICARE_ENTLD_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_MEDICARE_ENTLD_DTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PRIORVAL_MED_ENTDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_PRIORVAL_MED_ENTDTTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_USAComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propusworkeligibilty",
    "propmilitarystatus",
    "propcitizenproof1",
    "propcitizenproof2",
    "propmedicareentlddt",
    "proppriorvalmedentdt"
})
public class COLLPERSDATAUSAComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_US_WORK_ELIGIBILTY")
    protected PROPUSWORKELIGIBILTYTypeShape propusworkeligibilty;
    @XmlElement(name = "PROP_MILITARY_STATUS")
    protected PROPMILITARYSTATUSTypeShape propmilitarystatus;
    @XmlElement(name = "PROP_CITIZEN_PROOF1")
    protected PROPCITIZENPROOF1TypeShape propcitizenproof1;
    @XmlElement(name = "PROP_CITIZEN_PROOF2")
    protected PROPCITIZENPROOF2TypeShape propcitizenproof2;
    @XmlElement(name = "PROP_MEDICARE_ENTLD_DT")
    protected PROPMEDICAREENTLDDTTypeShape propmedicareentlddt;
    @XmlElement(name = "PROP_PRIORVAL_MED_ENTDT")
    protected PROPPRIORVALMEDENTDTTypeShape proppriorvalmedentdt;

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
     * Gets the value of the propusworkeligibilty property.
     * 
     * @return
     *     possible object is
     *     {@link PROPUSWORKELIGIBILTYTypeShape }
     *     
     */
    public PROPUSWORKELIGIBILTYTypeShape getPROPUSWORKELIGIBILTY() {
        return propusworkeligibilty;
    }

    /**
     * Sets the value of the propusworkeligibilty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPUSWORKELIGIBILTYTypeShape }
     *     
     */
    public void setPROPUSWORKELIGIBILTY(PROPUSWORKELIGIBILTYTypeShape value) {
        this.propusworkeligibilty = value;
    }

    /**
     * Gets the value of the propmilitarystatus property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARYSTATUSTypeShape }
     *     
     */
    public PROPMILITARYSTATUSTypeShape getPROPMILITARYSTATUS() {
        return propmilitarystatus;
    }

    /**
     * Sets the value of the propmilitarystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARYSTATUSTypeShape }
     *     
     */
    public void setPROPMILITARYSTATUS(PROPMILITARYSTATUSTypeShape value) {
        this.propmilitarystatus = value;
    }

    /**
     * Gets the value of the propcitizenproof1 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCITIZENPROOF1TypeShape }
     *     
     */
    public PROPCITIZENPROOF1TypeShape getPROPCITIZENPROOF1() {
        return propcitizenproof1;
    }

    /**
     * Sets the value of the propcitizenproof1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCITIZENPROOF1TypeShape }
     *     
     */
    public void setPROPCITIZENPROOF1(PROPCITIZENPROOF1TypeShape value) {
        this.propcitizenproof1 = value;
    }

    /**
     * Gets the value of the propcitizenproof2 property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCITIZENPROOF2TypeShape }
     *     
     */
    public PROPCITIZENPROOF2TypeShape getPROPCITIZENPROOF2() {
        return propcitizenproof2;
    }

    /**
     * Sets the value of the propcitizenproof2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCITIZENPROOF2TypeShape }
     *     
     */
    public void setPROPCITIZENPROOF2(PROPCITIZENPROOF2TypeShape value) {
        this.propcitizenproof2 = value;
    }

    /**
     * Gets the value of the propmedicareentlddt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMEDICAREENTLDDTTypeShape }
     *     
     */
    public PROPMEDICAREENTLDDTTypeShape getPROPMEDICAREENTLDDT() {
        return propmedicareentlddt;
    }

    /**
     * Sets the value of the propmedicareentlddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMEDICAREENTLDDTTypeShape }
     *     
     */
    public void setPROPMEDICAREENTLDDT(PROPMEDICAREENTLDDTTypeShape value) {
        this.propmedicareentlddt = value;
    }

    /**
     * Gets the value of the proppriorvalmedentdt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPRIORVALMEDENTDTTypeShape }
     *     
     */
    public PROPPRIORVALMEDENTDTTypeShape getPROPPRIORVALMEDENTDT() {
        return proppriorvalmedentdt;
    }

    /**
     * Sets the value of the proppriorvalmedentdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPRIORVALMEDENTDTTypeShape }
     *     
     */
    public void setPROPPRIORVALMEDENTDT(PROPPRIORVALMEDENTDTTypeShape value) {
        this.proppriorvalmedentdt = value;
    }

}
