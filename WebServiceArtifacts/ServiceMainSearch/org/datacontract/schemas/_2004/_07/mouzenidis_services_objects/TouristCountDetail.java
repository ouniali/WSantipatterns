
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouristCountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouristCountDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="MaxAdult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxChild" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouristCountDetail", propOrder = {
    "maxAdult",
    "maxChild"
})
public class TouristCountDetail
    extends DictionaryBase
{

    @XmlElement(name = "MaxAdult")
    protected Integer maxAdult;
    @XmlElement(name = "MaxChild")
    protected Integer maxChild;

    /**
     * Gets the value of the maxAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdult() {
        return maxAdult;
    }

    /**
     * Sets the value of the maxAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdult(Integer value) {
        this.maxAdult = value;
    }

    /**
     * Gets the value of the maxChild property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChild() {
        return maxChild;
    }

    /**
     * Sets the value of the maxChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChild(Integer value) {
        this.maxChild = value;
    }

}
