
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_DIVERS_ETHNICComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_DIVERS_ETHNICComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_REG_REGION" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_REG_REGIONTypeShape"/>
 *         &lt;element name="KEYPROP_ETHNIC_GRP_CD" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}KEYPROP_ETHNIC_GRP_CDTypeShape"/>
 *         &lt;element name="PROP_PRIMARY_INDICATOR" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_PRIMARY_INDICATORTypeShape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_DIVERS_ETHNICComplexTypeShape", propOrder = {
    "keypropregregion",
    "keypropethnicgrpcd",
    "propprimaryindicator"
})
public class COLLDIVERSETHNICComplexTypeShape {

    @XmlElement(name = "KEYPROP_REG_REGION", required = true)
    protected KEYPROPREGREGIONTypeShape keypropregregion;
    @XmlElement(name = "KEYPROP_ETHNIC_GRP_CD", required = true)
    protected KEYPROPETHNICGRPCDTypeShape keypropethnicgrpcd;
    @XmlElement(name = "PROP_PRIMARY_INDICATOR")
    protected PROPPRIMARYINDICATORTypeShape propprimaryindicator;

    /**
     * Gets the value of the keypropregregion property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPREGREGIONTypeShape }
     *     
     */
    public KEYPROPREGREGIONTypeShape getKEYPROPREGREGION() {
        return keypropregregion;
    }

    /**
     * Sets the value of the keypropregregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPREGREGIONTypeShape }
     *     
     */
    public void setKEYPROPREGREGION(KEYPROPREGREGIONTypeShape value) {
        this.keypropregregion = value;
    }

    /**
     * Gets the value of the keypropethnicgrpcd property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPETHNICGRPCDTypeShape }
     *     
     */
    public KEYPROPETHNICGRPCDTypeShape getKEYPROPETHNICGRPCD() {
        return keypropethnicgrpcd;
    }

    /**
     * Sets the value of the keypropethnicgrpcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPETHNICGRPCDTypeShape }
     *     
     */
    public void setKEYPROPETHNICGRPCD(KEYPROPETHNICGRPCDTypeShape value) {
        this.keypropethnicgrpcd = value;
    }

    /**
     * Gets the value of the propprimaryindicator property.
     * 
     * @return
     *     possible object is
     *     {@link PROPPRIMARYINDICATORTypeShape }
     *     
     */
    public PROPPRIMARYINDICATORTypeShape getPROPPRIMARYINDICATOR() {
        return propprimaryindicator;
    }

    /**
     * Sets the value of the propprimaryindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPPRIMARYINDICATORTypeShape }
     *     
     */
    public void setPROPPRIMARYINDICATOR(PROPPRIMARYINDICATORTypeShape value) {
        this.propprimaryindicator = value;
    }

}
