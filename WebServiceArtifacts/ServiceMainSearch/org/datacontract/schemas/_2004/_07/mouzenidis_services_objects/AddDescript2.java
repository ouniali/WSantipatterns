
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDescript2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDescript2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="SvKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDescript2", propOrder = {
    "svKey"
})
public class AddDescript2
    extends DictionaryBase
{

    @XmlElement(name = "SvKey")
    protected Integer svKey;

    /**
     * Gets the value of the svKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSvKey() {
        return svKey;
    }

    /**
     * Sets the value of the svKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSvKey(Integer value) {
        this.svKey = value;
    }

}
