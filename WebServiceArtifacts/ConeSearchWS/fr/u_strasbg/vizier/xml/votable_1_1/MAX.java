
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MAX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAX">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inclusive" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}yesno" default="yes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAX")
public class MAX {

    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "inclusive")
    protected Yesno inclusive;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the inclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Yesno }
     *     
     */
    public Yesno getInclusive() {
        if (inclusive == null) {
            return Yesno.YES;
        } else {
            return inclusive;
        }
    }

    /**
     * Sets the value of the inclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Yesno }
     *     
     */
    public void setInclusive(Yesno value) {
        this.inclusive = value;
    }

}
