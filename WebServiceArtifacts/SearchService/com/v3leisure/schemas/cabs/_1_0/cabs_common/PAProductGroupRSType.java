
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PA_ProductGroupRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PA_ProductGroupRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Products" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPA_ProductRSType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="adults" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="children" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="concessions" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PA_ProductGroupRSType", propOrder = {
    "products"
})
public class PAProductGroupRSType {

    @XmlElement(name = "Products")
    protected ArrayOfPAProductRSType products;
    @XmlAttribute(name = "adults", required = true)
    protected int adults;
    @XmlAttribute(name = "children", required = true)
    protected int children;
    @XmlAttribute(name = "concessions", required = true)
    protected int concessions;

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPAProductRSType }
     *     
     */
    public ArrayOfPAProductRSType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPAProductRSType }
     *     
     */
    public void setProducts(ArrayOfPAProductRSType value) {
        this.products = value;
    }

    /**
     * Gets the value of the adults property.
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * Gets the value of the children property.
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * Gets the value of the concessions property.
     * 
     */
    public int getConcessions() {
        return concessions;
    }

    /**
     * Sets the value of the concessions property.
     * 
     */
    public void setConcessions(int value) {
        this.concessions = value;
    }

}
