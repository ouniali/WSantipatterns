
package fr.u_strasbg.vizier.xml.votable_1_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for RESOURCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESOURCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPTION" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}anyTEXT" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="COOSYS" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}COOSYS" minOccurs="0"/>
 *           &lt;element name="INFO" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}INFO" minOccurs="0"/>
 *           &lt;element name="PARAM" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}PARAM" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="LINK" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}LINK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TABLE" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}TABLE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RESOURCE" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}RESOURCE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="type" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}RESOURCEType" default="results" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESOURCE", propOrder = {
    "description",
    "coosysOrINFOOrPARAM",
    "link",
    "table",
    "resource",
    "any"
})
public class RESOURCE {

    @XmlElement(name = "DESCRIPTION")
    protected AnyTEXT description;
    @XmlElements({
        @XmlElement(name = "COOSYS", type = COOSYS.class),
        @XmlElement(name = "INFO", type = INFO.class),
        @XmlElement(name = "PARAM", type = PARAM.class)
    })
    protected List<Object> coosysOrINFOOrPARAM;
    @XmlElement(name = "LINK")
    protected List<LINK> link;
    @XmlElement(name = "TABLE")
    protected List<TABLE> table;
    @XmlElement(name = "RESOURCE")
    protected List<RESOURCE> resource;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "type")
    protected RESOURCEType type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the coosysOrINFOOrPARAM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coosysOrINFOOrPARAM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOOSYSOrINFOOrPARAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COOSYS }
     * {@link INFO }
     * {@link PARAM }
     * 
     * 
     */
    public List<Object> getCOOSYSOrINFOOrPARAM() {
        if (coosysOrINFOOrPARAM == null) {
            coosysOrINFOOrPARAM = new ArrayList<Object>();
        }
        return this.coosysOrINFOOrPARAM;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLINK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINK }
     * 
     * 
     */
    public List<LINK> getLINK() {
        if (link == null) {
            link = new ArrayList<LINK>();
        }
        return this.link;
    }

    /**
     * Gets the value of the table property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the table property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTABLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TABLE }
     * 
     * 
     */
    public List<TABLE> getTABLE() {
        if (table == null) {
            table = new ArrayList<TABLE>();
        }
        return this.table;
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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RESOURCEType }
     *     
     */
    public RESOURCEType getType() {
        if (type == null) {
            return RESOURCEType.RESULTS;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCEType }
     *     
     */
    public void setType(RESOURCEType value) {
        this.type = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
