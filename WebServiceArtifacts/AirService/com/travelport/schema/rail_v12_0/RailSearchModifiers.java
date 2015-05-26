
package com.travelport.schema.rail_v12_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeCabinClass;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferredSuppliers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailSupplier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxChanges" default="2">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Direction" type="{http://www.travelport.com/schema/rail_v12_0}typeRailDirection" />
 *       &lt;attribute name="Class" type="{http://www.travelport.com/schema/common_v15_0}typeCabinClass" />
 *       &lt;attribute name="MaxSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" default="300" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preferredSuppliers"
})
@XmlRootElement(name = "RailSearchModifiers")
public class RailSearchModifiers {

    @XmlElement(name = "PreferredSuppliers")
    protected RailSearchModifiers.PreferredSuppliers preferredSuppliers;
    @XmlAttribute(name = "MaxChanges")
    protected Integer maxChanges;
    @XmlAttribute(name = "Direction")
    protected TypeRailDirection direction;
    @XmlAttribute(name = "Class")
    protected TypeCabinClass clazz;
    @XmlAttribute(name = "MaxSolutions")
    protected BigInteger maxSolutions;

    /**
     * Gets the value of the preferredSuppliers property.
     * 
     * @return
     *     possible object is
     *     {@link RailSearchModifiers.PreferredSuppliers }
     *     
     */
    public RailSearchModifiers.PreferredSuppliers getPreferredSuppliers() {
        return preferredSuppliers;
    }

    /**
     * Sets the value of the preferredSuppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSearchModifiers.PreferredSuppliers }
     *     
     */
    public void setPreferredSuppliers(RailSearchModifiers.PreferredSuppliers value) {
        this.preferredSuppliers = value;
    }

    /**
     * Gets the value of the maxChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxChanges() {
        if (maxChanges == null) {
            return  2;
        } else {
            return maxChanges;
        }
    }

    /**
     * Sets the value of the maxChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChanges(Integer value) {
        this.maxChanges = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRailDirection }
     *     
     */
    public TypeRailDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRailDirection }
     *     
     */
    public void setDirection(TypeRailDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCabinClass }
     *     
     */
    public TypeCabinClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCabinClass }
     *     
     */
    public void setClazz(TypeCabinClass value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the maxSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSolutions() {
        if (maxSolutions == null) {
            return new BigInteger("300");
        } else {
            return maxSolutions;
        }
    }

    /**
     * Sets the value of the maxSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSolutions(BigInteger value) {
        this.maxSolutions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailSupplier" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "railSupplier"
    })
    public static class PreferredSuppliers {

        @XmlElement(name = "RailSupplier", required = true)
        protected List<RailSupplier> railSupplier;

        /**
         * Gets the value of the railSupplier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the railSupplier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRailSupplier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RailSupplier }
         * 
         * 
         */
        public List<RailSupplier> getRailSupplier() {
            if (railSupplier == null) {
                railSupplier = new ArrayList<RailSupplier>();
            }
            return this.railSupplier;
        }

    }

}
