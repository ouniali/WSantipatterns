
package com.oracle.xmlns.enterprise.tools.schemas.m475145;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_DATA_JPNComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_DATA_JPNComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_EFFDT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_EFFDTTypeShape"/>
 *         &lt;element name="PROP_HONSEKI_JPN" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_HONSEKI_JPNTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_DATA_JPNComplexTypeShape", propOrder = {
    "keypropeffdt",
    "prophonsekijpn"
})
public class COLLPERSDATAJPNComplexTypeShape {

    @XmlElement(name = "KEYPROP_EFFDT", required = true)
    protected KEYPROPEFFDTTypeShape keypropeffdt;
    @XmlElement(name = "PROP_HONSEKI_JPN")
    protected PROPHONSEKIJPNTypeShape prophonsekijpn;

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
     * Gets the value of the prophonsekijpn property.
     * 
     * @return
     *     possible object is
     *     {@link PROPHONSEKIJPNTypeShape }
     *     
     */
    public PROPHONSEKIJPNTypeShape getPROPHONSEKIJPN() {
        return prophonsekijpn;
    }

    /**
     * Sets the value of the prophonsekijpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPHONSEKIJPNTypeShape }
     *     
     */
    public void setPROPHONSEKIJPN(PROPHONSEKIJPNTypeShape value) {
        this.prophonsekijpn = value;
    }

}
