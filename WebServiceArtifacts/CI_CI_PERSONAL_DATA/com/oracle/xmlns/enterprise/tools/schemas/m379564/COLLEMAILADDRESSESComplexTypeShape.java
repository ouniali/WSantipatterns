
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_EMAIL_ADDRESSESComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_EMAIL_ADDRESSESComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_E_ADDR_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_E_ADDR_TYPETypeShape"/>
 *         &lt;element name="PROP_EMAIL_ADDR" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_EMAIL_ADDRTypeShape"/>
 *         &lt;element name="PROP_PREF_EMAIL_FLAG" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PREF_EMAIL_FLAGTypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_EMAIL_ADDRESSESComplexTypeShape", propOrder = {
    "keypropeaddrtype",
    "propemailaddr",
    "propprefemailflag"
})
public class COLLEMAILADDRESSESComplexTypeShape {

    @XmlElement(name = "KEYPROP_E_ADDR_TYPE", required = true)
    protected KEYPROPEADDRTYPETypeShape keypropeaddrtype;
    @XmlElement(name = "PROP_EMAIL_ADDR", required = true)
    protected PROPEMAILADDRTypeShape propemailaddr;
    @XmlElement(name = "PROP_PREF_EMAIL_FLAG", required = true)
    protected PROPPREFEMAILFLAGTypeShape propprefemailflag;

    /**
     * Gets the value of the keypropeaddrtype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPEADDRTYPETypeShape }
     *     
     */
    public KEYPROPEADDRTYPETypeShape getKEYPROPEADDRTYPE() {
        return keypropeaddrtype;
    }

    /**
     * Sets the value of the keypropeaddrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPEADDRTYPETypeShape }
     *     
     */
    public void setKEYPROPEADDRTYPE(KEYPROPEADDRTYPETypeShape value) {
        this.keypropeaddrtype = value;
    }

    /**
     * Gets the value of the propemailaddr property.
     * 
     * @return
     *     possible object is
     *     {@link PROPEMAILADDRTypeShape }
     *     
     */
    public PROPEMAILADDRTypeShape getPROPEMAILADDR() {
        return propemailaddr;
    }

    /**
     * Sets the value of the propemailaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPEMAILADDRTypeShape }
     *     
     */
    public void setPROPEMAILADDR(PROPEMAILADDRTypeShape value) {
        this.propemailaddr = value;
    }

    /**
     * Gets the value of the propprefemailflag property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPREFEMAILFLAGTypeShape }
     *     
     */
    public PROPPREFEMAILFLAGTypeShape getPROPPREFEMAILFLAG() {
        return propprefemailflag;
    }

    /**
     * Sets the value of the propprefemailflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPREFEMAILFLAGTypeShape }
     *     
     */
    public void setPROPPREFEMAILFLAG(PROPPREFEMAILFLAGTypeShape value) {
        this.propprefemailflag = value;
    }

}
