
package com.oracle.xmlns.enterprise.tools.schemas.m1080144;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_EFFDTComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_EFFDTComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_MAR_STATUS" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MAR_STATUSTypeShape"/>
 *         &lt;element name="PROP_MAR_STATUS_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_MAR_STATUS_DTTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_SEX" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_SEXTypeShape"/>
 *         &lt;element name="PROP_HIGHEST_EDUC_LVL" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_HIGHEST_EDUC_LVLTypeShape"/>
 *         &lt;element name="PROP_FT_STUDENT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_FT_STUDENTTypeShape"/>
 *         &lt;element name="PROP_LANG_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_LANG_CDTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_ALTER_EMPLID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}PROP_ALTER_EMPLIDTypeShape" minOccurs="0"/>
 *         &lt;element name="COLL_PERS_DATA_USF" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M1080144.V1}COLL_PERS_DATA_USFComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_EFFDTComplexTypeShape", propOrder = {
    "keypropeffdt",
    "propmarstatus",
    "propmarstatusdt",
    "propsex",
    "prophighesteduclvl",
    "propftstudent",
    "proplangcd",
    "propalteremplid",
    "collpersdatausf"
})
public class COLLPERSDATAEFFDTComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_MAR_STATUS", required = true)
    protected PROPMARSTATUSTypeShape propmarstatus;
    @XmlElement(name = "PROP_MAR_STATUS_DT")
    protected PROPMARSTATUSDTTypeShape propmarstatusdt;
    @XmlElement(name = "PROP_SEX", required = true)
    protected PROPSEXTypeShape propsex;
    @XmlElement(name = "PROP_HIGHEST_EDUC_LVL", required = true)
    protected PROPHIGHESTEDUCLVLTypeShape prophighesteduclvl;
    @XmlElement(name = "PROP_FT_STUDENT", required = true)
    protected PROPFTSTUDENTTypeShape propftstudent;
    @XmlElement(name = "PROP_LANG_CD")
    protected PROPLANGCDTypeShape proplangcd;
    @XmlElement(name = "PROP_ALTER_EMPLID")
    protected PROPALTEREMPLIDTypeShape propalteremplid;
    @XmlElement(name = "COLL_PERS_DATA_USF")
    protected List<COLLPERSDATAUSFComplexTypeShape> collpersdatausf;

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
     * Gets the value of the propmarstatus property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMARSTATUSTypeShape }
     *     
     */
    public PROPMARSTATUSTypeShape getPROPMARSTATUS() {
        return propmarstatus;
    }

    /**
     * Sets the value of the propmarstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMARSTATUSTypeShape }
     *     
     */
    public void setPROPMARSTATUS(PROPMARSTATUSTypeShape value) {
        this.propmarstatus = value;
    }

    /**
     * Gets the value of the propmarstatusdt property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMARSTATUSDTTypeShape }
     *     
     */
    public PROPMARSTATUSDTTypeShape getPROPMARSTATUSDT() {
        return propmarstatusdt;
    }

    /**
     * Sets the value of the propmarstatusdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMARSTATUSDTTypeShape }
     *     
     */
    public void setPROPMARSTATUSDT(PROPMARSTATUSDTTypeShape value) {
        this.propmarstatusdt = value;
    }

    /**
     * Gets the value of the propsex property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSEXTypeShape }
     *     
     */
    public PROPSEXTypeShape getPROPSEX() {
        return propsex;
    }

    /**
     * Sets the value of the propsex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSEXTypeShape }
     *     
     */
    public void setPROPSEX(PROPSEXTypeShape value) {
        this.propsex = value;
    }

    /**
     * Gets the value of the prophighesteduclvl property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHIGHESTEDUCLVLTypeShape }
     *     
     */
    public PROPHIGHESTEDUCLVLTypeShape getPROPHIGHESTEDUCLVL() {
        return prophighesteduclvl;
    }

    /**
     * Sets the value of the prophighesteduclvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHIGHESTEDUCLVLTypeShape }
     *     
     */
    public void setPROPHIGHESTEDUCLVL(PROPHIGHESTEDUCLVLTypeShape value) {
        this.prophighesteduclvl = value;
    }

    /**
     * Gets the value of the propftstudent property.
     * 
     * @return
     *     possible object is
     *     {@link PROPFTSTUDENTTypeShape }
     *     
     */
    public PROPFTSTUDENTTypeShape getPROPFTSTUDENT() {
        return propftstudent;
    }

    /**
     * Sets the value of the propftstudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPFTSTUDENTTypeShape }
     *     
     */
    public void setPROPFTSTUDENT(PROPFTSTUDENTTypeShape value) {
        this.propftstudent = value;
    }

    /**
     * Gets the value of the proplangcd property.
     * 
     * @return
     *     possible object is
     *     {@link PROPLANGCDTypeShape }
     *     
     */
    public PROPLANGCDTypeShape getPROPLANGCD() {
        return proplangcd;
    }

    /**
     * Sets the value of the proplangcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPLANGCDTypeShape }
     *     
     */
    public void setPROPLANGCD(PROPLANGCDTypeShape value) {
        this.proplangcd = value;
    }

    /**
     * Gets the value of the propalteremplid property.
     * 
     * @return
     *     possible object is
     *     {@link PROPALTEREMPLIDTypeShape }
     *     
     */
    public PROPALTEREMPLIDTypeShape getPROPALTEREMPLID() {
        return propalteremplid;
    }

    /**
     * Sets the value of the propalteremplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPALTEREMPLIDTypeShape }
     *     
     */
    public void setPROPALTEREMPLID(PROPALTEREMPLIDTypeShape value) {
        this.propalteremplid = value;
    }

    /**
     * Gets the value of the collpersdatausf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collpersdatausf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLPERSDATAUSF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLPERSDATAUSFComplexTypeShape }
     * 
     * 
     */
    public List<COLLPERSDATAUSFComplexTypeShape> getCOLLPERSDATAUSF() {
        if (collpersdatausf == null) {
            collpersdatausf = new ArrayList<COLLPERSDATAUSFComplexTypeShape>();
        }
        return this.collpersdatausf;
    }

}
