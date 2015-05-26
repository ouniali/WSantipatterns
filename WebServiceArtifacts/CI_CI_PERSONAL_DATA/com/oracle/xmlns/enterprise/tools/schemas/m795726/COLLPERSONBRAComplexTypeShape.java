
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERSON_BRAComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERSON_BRAComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROP_RG_ISSUEDBY_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_RG_ISSUEDBY_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_RG_ISSUED_DT_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_RG_ISSUED_DT_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_RG_STATE_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_RG_STATE_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CTPS_SERIES_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_CTPS_SERIES_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CTPS_EXP_DT_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_CTPS_EXP_DT_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_CTPS_STATE_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_CTPS_STATE_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_VOTER_ZONE_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_VOTER_ZONE_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_VOTER_SECTION_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_VOTER_SECTION_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_VOTER_CITY_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_VOTER_CITY_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_VOTER_STATE_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_VOTER_STATE_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITAR_SERIES_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_MILITAR_SERIES_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITAR_REGION_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_MILITAR_REGION_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITAR_STATE_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_MILITAR_STATE_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MIL_CERT_TYPE_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_MIL_CERT_TYPE_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MILITAR_CAT_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_MILITAR_CAT_BRATypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_PIS_PASEP_DT_BRA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}PROP_PIS_PASEP_DT_BRATypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERSON_BRAComplexTypeShape", propOrder = {
    "proprgissuedbybra",
    "proprgissueddtbra",
    "proprgstatebra",
    "propctpsseriesbra",
    "propctpsexpdtbra",
    "propctpsstatebra",
    "propvoterzonebra",
    "propvotersectionbra",
    "propvotercitybra",
    "propvoterstatebra",
    "propmilitarseriesbra",
    "propmilitarregionbra",
    "propmilitarstatebra",
    "propmilcerttypebra",
    "propmilitarcatbra",
    "proppispasepdtbra"
})
public class COLLPERSONBRAComplexTypeShape {

    @XmlElement(name = "PROP_RG_ISSUEDBY_BRA")
    protected PROPRGISSUEDBYBRATypeShape proprgissuedbybra;
    @XmlElement(name = "PROP_RG_ISSUED_DT_BRA")
    protected PROPRGISSUEDDTBRATypeShape proprgissueddtbra;
    @XmlElement(name = "PROP_RG_STATE_BRA")
    protected PROPRGSTATEBRATypeShape proprgstatebra;
    @XmlElement(name = "PROP_CTPS_SERIES_BRA")
    protected PROPCTPSSERIESBRATypeShape propctpsseriesbra;
    @XmlElement(name = "PROP_CTPS_EXP_DT_BRA")
    protected PROPCTPSEXPDTBRATypeShape propctpsexpdtbra;
    @XmlElement(name = "PROP_CTPS_STATE_BRA")
    protected PROPCTPSSTATEBRATypeShape propctpsstatebra;
    @XmlElement(name = "PROP_VOTER_ZONE_BRA")
    protected PROPVOTERZONEBRATypeShape propvoterzonebra;
    @XmlElement(name = "PROP_VOTER_SECTION_BRA")
    protected PROPVOTERSECTIONBRATypeShape propvotersectionbra;
    @XmlElement(name = "PROP_VOTER_CITY_BRA")
    protected PROPVOTERCITYBRATypeShape propvotercitybra;
    @XmlElement(name = "PROP_VOTER_STATE_BRA")
    protected PROPVOTERSTATEBRATypeShape propvoterstatebra;
    @XmlElement(name = "PROP_MILITAR_SERIES_BRA")
    protected PROPMILITARSERIESBRATypeShape propmilitarseriesbra;
    @XmlElement(name = "PROP_MILITAR_REGION_BRA")
    protected PROPMILITARREGIONBRATypeShape propmilitarregionbra;
    @XmlElement(name = "PROP_MILITAR_STATE_BRA")
    protected PROPMILITARSTATEBRATypeShape propmilitarstatebra;
    @XmlElement(name = "PROP_MIL_CERT_TYPE_BRA")
    protected PROPMILCERTTYPEBRATypeShape propmilcerttypebra;
    @XmlElement(name = "PROP_MILITAR_CAT_BRA")
    protected PROPMILITARCATBRATypeShape propmilitarcatbra;
    @XmlElement(name = "PROP_PIS_PASEP_DT_BRA")
    protected PROPPISPASEPDTBRATypeShape proppispasepdtbra;

    /**
     * Gets the value of the proprgissuedbybra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPRGISSUEDBYBRATypeShape }
     *     
     */
    public PROPRGISSUEDBYBRATypeShape getPROPRGISSUEDBYBRA() {
        return proprgissuedbybra;
    }

    /**
     * Sets the value of the proprgissuedbybra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPRGISSUEDBYBRATypeShape }
     *     
     */
    public void setPROPRGISSUEDBYBRA(PROPRGISSUEDBYBRATypeShape value) {
        this.proprgissuedbybra = value;
    }

    /**
     * Gets the value of the proprgissueddtbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPRGISSUEDDTBRATypeShape }
     *     
     */
    public PROPRGISSUEDDTBRATypeShape getPROPRGISSUEDDTBRA() {
        return proprgissueddtbra;
    }

    /**
     * Sets the value of the proprgissueddtbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPRGISSUEDDTBRATypeShape }
     *     
     */
    public void setPROPRGISSUEDDTBRA(PROPRGISSUEDDTBRATypeShape value) {
        this.proprgissueddtbra = value;
    }

    /**
     * Gets the value of the proprgstatebra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPRGSTATEBRATypeShape }
     *     
     */
    public PROPRGSTATEBRATypeShape getPROPRGSTATEBRA() {
        return proprgstatebra;
    }

    /**
     * Sets the value of the proprgstatebra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPRGSTATEBRATypeShape }
     *     
     */
    public void setPROPRGSTATEBRA(PROPRGSTATEBRATypeShape value) {
        this.proprgstatebra = value;
    }

    /**
     * Gets the value of the propctpsseriesbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCTPSSERIESBRATypeShape }
     *     
     */
    public PROPCTPSSERIESBRATypeShape getPROPCTPSSERIESBRA() {
        return propctpsseriesbra;
    }

    /**
     * Sets the value of the propctpsseriesbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCTPSSERIESBRATypeShape }
     *     
     */
    public void setPROPCTPSSERIESBRA(PROPCTPSSERIESBRATypeShape value) {
        this.propctpsseriesbra = value;
    }

    /**
     * Gets the value of the propctpsexpdtbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCTPSEXPDTBRATypeShape }
     *     
     */
    public PROPCTPSEXPDTBRATypeShape getPROPCTPSEXPDTBRA() {
        return propctpsexpdtbra;
    }

    /**
     * Sets the value of the propctpsexpdtbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCTPSEXPDTBRATypeShape }
     *     
     */
    public void setPROPCTPSEXPDTBRA(PROPCTPSEXPDTBRATypeShape value) {
        this.propctpsexpdtbra = value;
    }

    /**
     * Gets the value of the propctpsstatebra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPCTPSSTATEBRATypeShape }
     *     
     */
    public PROPCTPSSTATEBRATypeShape getPROPCTPSSTATEBRA() {
        return propctpsstatebra;
    }

    /**
     * Sets the value of the propctpsstatebra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPCTPSSTATEBRATypeShape }
     *     
     */
    public void setPROPCTPSSTATEBRA(PROPCTPSSTATEBRATypeShape value) {
        this.propctpsstatebra = value;
    }

    /**
     * Gets the value of the propvoterzonebra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPVOTERZONEBRATypeShape }
     *     
     */
    public PROPVOTERZONEBRATypeShape getPROPVOTERZONEBRA() {
        return propvoterzonebra;
    }

    /**
     * Sets the value of the propvoterzonebra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPVOTERZONEBRATypeShape }
     *     
     */
    public void setPROPVOTERZONEBRA(PROPVOTERZONEBRATypeShape value) {
        this.propvoterzonebra = value;
    }

    /**
     * Gets the value of the propvotersectionbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPVOTERSECTIONBRATypeShape }
     *     
     */
    public PROPVOTERSECTIONBRATypeShape getPROPVOTERSECTIONBRA() {
        return propvotersectionbra;
    }

    /**
     * Sets the value of the propvotersectionbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPVOTERSECTIONBRATypeShape }
     *     
     */
    public void setPROPVOTERSECTIONBRA(PROPVOTERSECTIONBRATypeShape value) {
        this.propvotersectionbra = value;
    }

    /**
     * Gets the value of the propvotercitybra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPVOTERCITYBRATypeShape }
     *     
     */
    public PROPVOTERCITYBRATypeShape getPROPVOTERCITYBRA() {
        return propvotercitybra;
    }

    /**
     * Sets the value of the propvotercitybra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPVOTERCITYBRATypeShape }
     *     
     */
    public void setPROPVOTERCITYBRA(PROPVOTERCITYBRATypeShape value) {
        this.propvotercitybra = value;
    }

    /**
     * Gets the value of the propvoterstatebra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPVOTERSTATEBRATypeShape }
     *     
     */
    public PROPVOTERSTATEBRATypeShape getPROPVOTERSTATEBRA() {
        return propvoterstatebra;
    }

    /**
     * Sets the value of the propvoterstatebra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPVOTERSTATEBRATypeShape }
     *     
     */
    public void setPROPVOTERSTATEBRA(PROPVOTERSTATEBRATypeShape value) {
        this.propvoterstatebra = value;
    }

    /**
     * Gets the value of the propmilitarseriesbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARSERIESBRATypeShape }
     *     
     */
    public PROPMILITARSERIESBRATypeShape getPROPMILITARSERIESBRA() {
        return propmilitarseriesbra;
    }

    /**
     * Sets the value of the propmilitarseriesbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARSERIESBRATypeShape }
     *     
     */
    public void setPROPMILITARSERIESBRA(PROPMILITARSERIESBRATypeShape value) {
        this.propmilitarseriesbra = value;
    }

    /**
     * Gets the value of the propmilitarregionbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARREGIONBRATypeShape }
     *     
     */
    public PROPMILITARREGIONBRATypeShape getPROPMILITARREGIONBRA() {
        return propmilitarregionbra;
    }

    /**
     * Sets the value of the propmilitarregionbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARREGIONBRATypeShape }
     *     
     */
    public void setPROPMILITARREGIONBRA(PROPMILITARREGIONBRATypeShape value) {
        this.propmilitarregionbra = value;
    }

    /**
     * Gets the value of the propmilitarstatebra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARSTATEBRATypeShape }
     *     
     */
    public PROPMILITARSTATEBRATypeShape getPROPMILITARSTATEBRA() {
        return propmilitarstatebra;
    }

    /**
     * Sets the value of the propmilitarstatebra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARSTATEBRATypeShape }
     *     
     */
    public void setPROPMILITARSTATEBRA(PROPMILITARSTATEBRATypeShape value) {
        this.propmilitarstatebra = value;
    }

    /**
     * Gets the value of the propmilcerttypebra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILCERTTYPEBRATypeShape }
     *     
     */
    public PROPMILCERTTYPEBRATypeShape getPROPMILCERTTYPEBRA() {
        return propmilcerttypebra;
    }

    /**
     * Sets the value of the propmilcerttypebra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILCERTTYPEBRATypeShape }
     *     
     */
    public void setPROPMILCERTTYPEBRA(PROPMILCERTTYPEBRATypeShape value) {
        this.propmilcerttypebra = value;
    }

    /**
     * Gets the value of the propmilitarcatbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMILITARCATBRATypeShape }
     *     
     */
    public PROPMILITARCATBRATypeShape getPROPMILITARCATBRA() {
        return propmilitarcatbra;
    }

    /**
     * Sets the value of the propmilitarcatbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMILITARCATBRATypeShape }
     *     
     */
    public void setPROPMILITARCATBRA(PROPMILITARCATBRATypeShape value) {
        this.propmilitarcatbra = value;
    }

    /**
     * Gets the value of the proppispasepdtbra property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPISPASEPDTBRATypeShape }
     *     
     */
    public PROPPISPASEPDTBRATypeShape getPROPPISPASEPDTBRA() {
        return proppispasepdtbra;
    }

    /**
     * Sets the value of the proppispasepdtbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPISPASEPDTBRATypeShape }
     *     
     */
    public void setPROPPISPASEPDTBRA(PROPPISPASEPDTBRATypeShape value) {
        this.proppispasepdtbra = value;
    }

}
