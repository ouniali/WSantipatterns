
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MethodDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MethodLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="methodID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodType", propOrder = {
    "methodDescription",
    "methodLink"
})
public class MethodType {

    @XmlElement(name = "MethodDescription")
    protected String methodDescription;
    @XmlElement(name = "MethodLink")
    protected String methodLink;
    @XmlAttribute(name = "methodID")
    protected Integer methodID;

    /**
     * Gets the value of the methodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodDescription() {
        return methodDescription;
    }

    /**
     * Sets the value of the methodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodDescription(String value) {
        this.methodDescription = value;
    }

    /**
     * Gets the value of the methodLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodLink() {
        return methodLink;
    }

    /**
     * Sets the value of the methodLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodLink(String value) {
        this.methodLink = value;
    }

    /**
     * Gets the value of the methodID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMethodID() {
        return methodID;
    }

    /**
     * Sets the value of the methodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMethodID(Integer value) {
        this.methodID = value;
    }

}
