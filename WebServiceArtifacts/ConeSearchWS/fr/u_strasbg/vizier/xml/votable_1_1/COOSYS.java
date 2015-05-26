
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for COOSYS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COOSYS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="equinox" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="epoch" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="system" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}COOSYSSystem" default="eq_FK5" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COOSYS", propOrder = {
    "content"
})
public class COOSYS {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "equinox")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String equinox;
    @XmlAttribute(name = "epoch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String epoch;
    @XmlAttribute(name = "system")
    protected COOSYSSystem system;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the equinox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquinox() {
        return equinox;
    }

    /**
     * Sets the value of the equinox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquinox(String value) {
        this.equinox = value;
    }

    /**
     * Gets the value of the epoch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpoch() {
        return epoch;
    }

    /**
     * Sets the value of the epoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpoch(String value) {
        this.epoch = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link COOSYSSystem }
     *     
     */
    public COOSYSSystem getSystem() {
        if (system == null) {
            return COOSYSSystem.EQ_FK_5;
        } else {
            return system;
        }
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link COOSYSSystem }
     *     
     */
    public void setSystem(COOSYSSystem value) {
        this.system = value;
    }

}
