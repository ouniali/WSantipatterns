
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BINARY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BINARY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STREAM" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}STREAM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BINARY", propOrder = {
    "stream"
})
public class BINARY {

    @XmlElement(name = "STREAM")
    protected STREAM stream;

    /**
     * Gets the value of the stream property.
     * 
     * @return
     *     possible object is
     *     {@link STREAM }
     *     
     */
    public STREAM getSTREAM() {
        return stream;
    }

    /**
     * Sets the value of the stream property.
     * 
     * @param value
     *     allowed object is
     *     {@link STREAM }
     *     
     */
    public void setSTREAM(STREAM value) {
        this.stream = value;
    }

}
