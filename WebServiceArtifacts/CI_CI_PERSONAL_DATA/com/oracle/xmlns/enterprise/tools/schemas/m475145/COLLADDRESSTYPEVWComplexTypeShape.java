
package com.oracle.xmlns.enterprise.tools.schemas.m475145;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_ADDRESS_TYPE_VWComplexTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_ADDRESS_TYPE_VWComplexTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYPROP_ADDRESS_TYPE" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}KEYPROP_ADDRESS_TYPETypeShape"/>
 *         &lt;element name="COLL_ADDRESSES" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M475145.V1}COLL_ADDRESSESComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_ADDRESS_TYPE_VWComplexTypeShape", propOrder = {
    "keypropaddresstype",
    "colladdresses"
})
public class COLLADDRESSTYPEVWComplexTypeShape {

    @XmlElement(name = "KEYPROP_ADDRESS_TYPE", required = true)
    protected KEYPROPADDRESSTYPETypeShape keypropaddresstype;
    @XmlElement(name = "COLL_ADDRESSES")
    protected List<COLLADDRESSESComplexTypeShape> colladdresses;

    /**
     * Gets the value of the keypropaddresstype property.
     * 
     * @return
     *     possible object is
     *     {@link KEYPROPADDRESSTYPETypeShape }
     *     
     */
    public KEYPROPADDRESSTYPETypeShape getKEYPROPADDRESSTYPE() {
        return keypropaddresstype;
    }

    /**
     * Sets the value of the keypropaddresstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYPROPADDRESSTYPETypeShape }
     *     
     */
    public void setKEYPROPADDRESSTYPE(KEYPROPADDRESSTYPETypeShape value) {
        this.keypropaddresstype = value;
    }

    /**
     * Gets the value of the colladdresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colladdresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLLADDRESSES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLLADDRESSESComplexTypeShape }
     * 
     * 
     */
    public List<COLLADDRESSESComplexTypeShape> getCOLLADDRESSES() {
        if (colladdresses == null) {
            colladdresses = new ArrayList<COLLADDRESSESComplexTypeShape>();
        }
        return this.colladdresses;
    }

}
