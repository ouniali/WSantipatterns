
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="modelSearch" type="{http://www.diacomp.org/webservices/}ModelSearch" minOccurs="0"/>
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
    "modelSearch"
})
@XmlRootElement(name = "GetModelsBySearch")
public class GetModelsBySearch {

    protected ModelSearch modelSearch;

    /**
     * Gets the value of the modelSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ModelSearch }
     *     
     */
    public ModelSearch getModelSearch() {
        return modelSearch;
    }

    /**
     * Sets the value of the modelSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelSearch }
     *     
     */
    public void setModelSearch(ModelSearch value) {
        this.modelSearch = value;
    }

}
