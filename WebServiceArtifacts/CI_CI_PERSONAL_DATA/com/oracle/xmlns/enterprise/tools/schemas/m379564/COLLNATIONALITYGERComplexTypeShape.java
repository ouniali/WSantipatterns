
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_NATIONALITY_GERComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_NATIONALITY_GERComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_NATIONALITY_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_NATIONALITY_DTTypeShape"/>
 *         &lt;element name="KEYPROP_NATION_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_NATION_CDTypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_NATIONALITY_GERComplexTypeShape", propOrder = {
    "keypropnationalitydt",
    "keypropnationcd"
})
public class COLLNATIONALITYGERComplexTypeShape {

    @XmlElement(name = "KEYPROP_NATIONALITY_DT", required = true)
    protected KEYPROPNATIONALITYDTTypeShape keypropnationalitydt;
    @XmlElement(name = "KEYPROP_NATION_CD", required = true)
    protected KEYPROPNATIONCDTypeShape keypropnationcd;

    /**
     * Gets the value of the keypropnationalitydt property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPNATIONALITYDTTypeShape }
     *     
     */
    public KEYPROPNATIONALITYDTTypeShape getKEYPROPNATIONALITYDT() {
        return keypropnationalitydt;
    }

    /**
     * Sets the value of the keypropnationalitydt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPNATIONALITYDTTypeShape }
     *     
     */
    public void setKEYPROPNATIONALITYDT(KEYPROPNATIONALITYDTTypeShape value) {
        this.keypropnationalitydt = value;
    }

    /**
     * Gets the value of the keypropnationcd property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPNATIONCDTypeShape }
     *     
     */
    public KEYPROPNATIONCDTypeShape getKEYPROPNATIONCD() {
        return keypropnationcd;
    }

    /**
     * Sets the value of the keypropnationcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPNATIONCDTypeShape }
     *     
     */
    public void setKEYPROPNATIONCD(KEYPROPNATIONCDTypeShape value) {
        this.keypropnationcd = value;
    }

}
