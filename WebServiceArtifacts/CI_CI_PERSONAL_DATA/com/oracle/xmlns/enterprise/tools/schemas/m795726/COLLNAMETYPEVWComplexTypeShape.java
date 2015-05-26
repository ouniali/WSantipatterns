
package com.oracle.xmlns.enterprise.tools.schemas.m795726;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_NAME_TYPE_VWComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_NAME_TYPE_VWComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_NAME_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}KEYPROP_NAME_TYPETypeShape"/>
 *         &lt;element name="COLL_NAMES" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M795726.V1}COLL_NAMESComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_NAME_TYPE_VWComplexTypeShape", propOrder = {
    "keypropnametype",
    "collnames"
})
public class COLLNAMETYPEVWComplexTypeShape {

    @XmlElement(name = "KEYPROP_NAME_TYPE", required = true)
    protected KEYPROPNAMETYPETypeShape keypropnametype;
    @XmlElement(name = "COLL_NAMES")
    protected List<COLLNAMESComplexTypeShape> collnames;

    /**
     * Gets the value of the keypropnametype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPNAMETYPETypeShape }
     *     
     */
    public KEYPROPNAMETYPETypeShape getKEYPROPNAMETYPE() {
        return keypropnametype;
    }

    /**
     * Sets the value of the keypropnametype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPNAMETYPETypeShape }
     *     
     */
    public void setKEYPROPNAMETYPE(KEYPROPNAMETYPETypeShape value) {
        this.keypropnametype = value;
    }

    /**
     * Gets the value of the collnames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collnames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLNAMES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLNAMESComplexTypeShape }
     * 
     * 
     */
    public List<COLLNAMESComplexTypeShape> getCOLLNAMES() {
        if (collnames == null) {
            collnames = new ArrayList<COLLNAMESComplexTypeShape>();
        }
        return this.collnames;
    }

}
