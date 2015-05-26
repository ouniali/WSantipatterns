
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
 *         &lt;element name="ViewTraceResult" type="{http://www.xignite.com/services/}Trace" minOccurs="0"/>
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
    "viewTraceResult"
})
@XmlRootElement(name = "ViewTraceResponse")
public class ViewTraceResponse {

    @XmlElement(name = "ViewTraceResult")
    protected Trace viewTraceResult;

    /**
     * Gets the value of the viewTraceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Trace }
     *     
     */
    public Trace getViewTraceResult() {
        return viewTraceResult;
    }

    /**
     * Sets the value of the viewTraceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trace }
     *     
     */
    public void setViewTraceResult(Trace value) {
        this.viewTraceResult = value;
    }

}
