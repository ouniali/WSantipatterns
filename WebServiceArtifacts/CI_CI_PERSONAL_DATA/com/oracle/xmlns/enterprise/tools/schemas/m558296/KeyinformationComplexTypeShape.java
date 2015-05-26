
package com.oracle.xmlns.enterprise.tools.schemas.m558296;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keyinformationComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="keyinformationComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EMPLID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M558296.V1}KEYPROP_EMPLIDTypeShape"/>
 *         &lt;element name="PROP_NAME" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M558296.V1}PROP_NAMETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_LAST_NAME_SRCH" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M558296.V1}PROP_LAST_NAME_SRCHTypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_NAME_AC" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M558296.V1}PROP_NAME_ACTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keyinformationComplexTypeShape", propOrder = {
    "keypropemplid",
    "propname",
    "proplastnamesrch",
    "propnameac"
})
public class KeyinformationComplexTypeShape {

    @XmlElement(name = "KEYPROP_EMPLID", required = true)
    protected KEYPROPEMPLIDTypeShape keypropemplid;
    @XmlElement(name = "PROP_NAME")
    protected PROPNAMETypeShape propname;
    @XmlElement(name = "PROP_LAST_NAME_SRCH")
    protected PROPLASTNAMESRCHTypeShape proplastnamesrch;
    @XmlElement(name = "PROP_NAME_AC")
    protected PROPNAMEACTypeShape propnameac;

    /**
     * Gets the value of the keypropemplid property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPEMPLIDTypeShape }
     *     
     */
    public KEYPROPEMPLIDTypeShape getKEYPROPEMPLID() {
        return keypropemplid;
    }

    /**
     * Sets the value of the keypropemplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPEMPLIDTypeShape }
     *     
     */
    public void setKEYPROPEMPLID(KEYPROPEMPLIDTypeShape value) {
        this.keypropemplid = value;
    }

    /**
     * Gets the value of the propname property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMETypeShape }
     *     
     */
    public PROPNAMETypeShape getPROPNAME() {
        return propname;
    }

    /**
     * Sets the value of the propname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMETypeShape }
     *     
     */
    public void setPROPNAME(PROPNAMETypeShape value) {
        this.propname = value;
    }

    /**
     * Gets the value of the proplastnamesrch property.
     * 
     * @return
     *     possible object is
     *     {@link PROPLASTNAMESRCHTypeShape }
     *     
     */
    public PROPLASTNAMESRCHTypeShape getPROPLASTNAMESRCH() {
        return proplastnamesrch;
    }

    /**
     * Sets the value of the proplastnamesrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPLASTNAMESRCHTypeShape }
     *     
     */
    public void setPROPLASTNAMESRCH(PROPLASTNAMESRCHTypeShape value) {
        this.proplastnamesrch = value;
    }

    /**
     * Gets the value of the propnameac property.
     * 
     * @return
     *     possible object is
     *     {@link PROPNAMEACTypeShape }
     *     
     */
    public PROPNAMEACTypeShape getPROPNAMEAC() {
        return propnameac;
    }

    /**
     * Sets the value of the propnameac property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPNAMEACTypeShape }
     *     
     */
    public void setPROPNAMEAC(PROPNAMEACTypeShape value) {
        this.propnameac = value;
    }

}
