
package com.oracle.xmlns.enterprise.tools.schemas.m379564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PLACE_ORIG_CHEComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PLACE_ORIG_CHEComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROP_ORIGIN_CHE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_ORIGIN_CHETypeShape" minOccurs="0"/>
 *         &lt;element name="PROP_MAIN_ORIG_CHE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M379564.V1}PROP_MAIN_ORIG_CHETypeShape"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_PLACE_ORIG_CHEComplexTypeShape", propOrder = {
    "proporiginche",
    "propmainorigche"
})
public class COLLPLACEORIGCHEComplexTypeShape {

    @XmlElement(name = "PROP_ORIGIN_CHE")
    protected PROPORIGINCHETypeShape proporiginche;
    @XmlElement(name = "PROP_MAIN_ORIG_CHE", required = true)
    protected PROPMAINORIGCHETypeShape propmainorigche;

    /**
     * Gets the value of the proporiginche property.
     * 
     * @return
     *     possible object is
     *     {@link PROPORIGINCHETypeShape }
     *     
     */
    public PROPORIGINCHETypeShape getPROPORIGINCHE() {
        return proporiginche;
    }

    /**
     * Sets the value of the proporiginche property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPORIGINCHETypeShape }
     *     
     */
    public void setPROPORIGINCHE(PROPORIGINCHETypeShape value) {
        this.proporiginche = value;
    }

    /**
     * Gets the value of the propmainorigche property.
     * 
     * @return
     *     possible object is
     *     {@link PROPMAINORIGCHETypeShape }
     *     
     */
    public PROPMAINORIGCHETypeShape getPROPMAINORIGCHE() {
        return propmainorigche;
    }

    /**
     * Sets the value of the propmainorigche property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPMAINORIGCHETypeShape }
     *     
     */
    public void setPROPMAINORIGCHE(PROPMAINORIGCHETypeShape value) {
        this.propmainorigche = value;
    }

}
