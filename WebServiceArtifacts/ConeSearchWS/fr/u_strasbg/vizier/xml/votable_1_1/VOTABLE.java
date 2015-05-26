
package fr.u_strasbg.vizier.xml.votable_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for VOTABLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VOTABLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPTION" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}anyTEXT" minOccurs="0"/>
 *         &lt;element name="DEFINITIONS" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}ArrayOfChoice1" minOccurs="0"/>
 *         &lt;element name="INFO" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}INFO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RESOURCE" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}RESOURCE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}VOTABLEVersion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VOTABLE", propOrder = {
    "description",
    "definitions",
    "info",
    "resource"
})
public class VOTABLE {

    @XmlElement(name = "DESCRIPTION")
    protected AnyTEXT description;
    @XmlElement(name = "DEFINITIONS")
    protected ArrayOfChoice1 definitions;
    @XmlElement(name = "INFO")
    protected List<INFO> info;
    @XmlElement(name = "RESOURCE")
    protected List<RESOURCE> resource;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link AnyTEXT }
     *     
     */
    public AnyTEXT getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyTEXT }
     *     
     */
    public void setDESCRIPTION(AnyTEXT value) {
        this.description = value;
    }

    /**
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public ArrayOfChoice1 getDEFINITIONS() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public void setDEFINITIONS(ArrayOfChoice1 value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INFO }
     * 
     * 
     */
    public List<INFO> getINFO() {
        if (info == null) {
            info = new ArrayList<INFO>();
        }
        return this.info;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRESOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESOURCE }
     * 
     * 
     */
    public List<RESOURCE> getRESOURCE() {
        if (resource == null) {
            resource = new ArrayList<RESOURCE>();
        }
        return this.resource;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
