
package by.bisc.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAnswer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsFound" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Rel" type="{http://www.bisc.by/webservices}ArrayOfWSRelWSRel" minOccurs="0"/>
 *         &lt;element name="Pas" type="{http://www.bisc.by/webservices}ArrayOfWSPasWSPas" minOccurs="0"/>
 *         &lt;element name="Sp" type="{http://www.bisc.by/webservices}ArrayOfWSSpWSSp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAnswer", propOrder = {
    "isFound",
    "rel",
    "pas",
    "sp"
})
public class WSAnswer {

    @XmlElement(name = "IsFound")
    protected Long isFound;
    @XmlElement(name = "Rel")
    protected ArrayOfWSRelWSRel rel;
    @XmlElement(name = "Pas")
    protected ArrayOfWSPasWSPas pas;
    @XmlElement(name = "Sp")
    protected ArrayOfWSSpWSSp sp;

    /**
     * Gets the value of the isFound property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsFound() {
        return isFound;
    }

    /**
     * Sets the value of the isFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsFound(Long value) {
        this.isFound = value;
    }

    /**
     * Gets the value of the rel property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSRelWSRel }
     *     
     */
    public ArrayOfWSRelWSRel getRel() {
        return rel;
    }

    /**
     * Sets the value of the rel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSRelWSRel }
     *     
     */
    public void setRel(ArrayOfWSRelWSRel value) {
        this.rel = value;
    }

    /**
     * Gets the value of the pas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPasWSPas }
     *     
     */
    public ArrayOfWSPasWSPas getPas() {
        return pas;
    }

    /**
     * Sets the value of the pas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPasWSPas }
     *     
     */
    public void setPas(ArrayOfWSPasWSPas value) {
        this.pas = value;
    }

    /**
     * Gets the value of the sp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSpWSSp }
     *     
     */
    public ArrayOfWSSpWSSp getSp() {
        return sp;
    }

    /**
     * Sets the value of the sp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSpWSSp }
     *     
     */
    public void setSp(ArrayOfWSSpWSSp value) {
        this.sp = value;
    }

}
