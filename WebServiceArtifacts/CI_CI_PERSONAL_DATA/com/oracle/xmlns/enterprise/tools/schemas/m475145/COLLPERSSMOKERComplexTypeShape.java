
package com.oracle.xmlns.enterprise.tools.schemas.m475145;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PERS_SMOKERComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PERS_SMOKERComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_SMOKER_DT" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_SMOKER_DTTypeShape"/>
 *         &lt;element name="PROP_SMOKER" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}PROP_SMOKERTypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PERS_SMOKERComplexTypeShape", propOrder = {
    "keypropsmokerdt",
    "propsmoker"
})
public class COLLPERSSMOKERComplexTypeShape {

    @XmlElement(name = "KEYPROP_SMOKER_DT", required = true)
    protected KEYPROPSMOKERDTTypeShape keypropsmokerdt;
    @XmlElement(name = "PROP_SMOKER", required = true)
    protected PROPSMOKERTypeShape propsmoker;

    /**
     * Gets the value of the keypropsmokerdt property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPSMOKERDTTypeShape }
     *     
     */
    public KEYPROPSMOKERDTTypeShape getKEYPROPSMOKERDT() {
        return keypropsmokerdt;
    }

    /**
     * Sets the value of the keypropsmokerdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPSMOKERDTTypeShape }
     *     
     */
    public void setKEYPROPSMOKERDT(KEYPROPSMOKERDTTypeShape value) {
        this.keypropsmokerdt = value;
    }

    /**
     * Gets the value of the propsmoker property.
     * 
     * @return
     *     possible object is
     *     {@link PROPSMOKERTypeShape }
     *     
     */
    public PROPSMOKERTypeShape getPROPSMOKER() {
        return propsmoker;
    }

    /**
     * Sets the value of the propsmoker property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPSMOKERTypeShape }
     *     
     */
    public void setPROPSMOKER(PROPSMOKERTypeShape value) {
        this.propsmoker = value;
    }

}
