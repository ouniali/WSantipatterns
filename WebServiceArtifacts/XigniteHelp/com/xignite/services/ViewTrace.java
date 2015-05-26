
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Tracer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tracer"
})
@XmlRootElement(name = "ViewTrace")
public class ViewTrace {

    @XmlElement(name = "Tracer")
    protected String tracer;

    /**
     * Gets the value of the tracer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTracer() {
        return tracer;
    }

    /**
     * Sets the value of the tracer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTracer(String value) {
        this.tracer = value;
    }

}
