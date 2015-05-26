
package org.cuahsi.his._1_0.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.cuahsi.waterml._1.VariablesResponseType;


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
 *         &lt;element ref="{http://www.cuahsi.org/waterML/1.0/}variablesResponse" minOccurs="0"/>
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
    "variablesResponse"
})
@XmlRootElement(name = "GetVariableInfoObjectResponse")
public class GetVariableInfoObjectResponse {

    @XmlElement(namespace = "http://www.cuahsi.org/waterML/1.0/")
    protected VariablesResponseType variablesResponse;

    /**
     * Gets the value of the variablesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VariablesResponseType }
     *     
     */
    public VariablesResponseType getVariablesResponse() {
        return variablesResponse;
    }

    /**
     * Sets the value of the variablesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariablesResponseType }
     *     
     */
    public void setVariablesResponse(VariablesResponseType value) {
        this.variablesResponse = value;
    }

}
