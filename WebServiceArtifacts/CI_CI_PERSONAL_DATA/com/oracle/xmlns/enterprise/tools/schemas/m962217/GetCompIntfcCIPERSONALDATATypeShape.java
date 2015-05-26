
package com.oracle.xmlns.enterprise.tools.schemas.m962217;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Get__CompIntfc__CI_PERSONAL_DATATypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get__CompIntfc__CI_PERSONAL_DATATypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EMPLID" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M962217.V1}KEYPROP_EMPLIDTypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get__CompIntfc__CI_PERSONAL_DATATypeShape", propOrder = {
    "keypropemplid"
})
public class GetCompIntfcCIPERSONALDATATypeShape {

    @XmlElement(name = "KEYPROP_EMPLID", required = true)
    protected KEYPROPEMPLIDTypeShape keypropemplid;

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

}
