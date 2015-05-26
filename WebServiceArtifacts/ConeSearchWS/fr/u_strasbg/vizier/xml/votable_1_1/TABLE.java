
package fr.u_strasbg.vizier.xml.votable_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TABLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TABLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPTION" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}anyTEXT" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="PARAM" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}PARAM" minOccurs="0"/>
 *           &lt;element name="FIELD" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}FIELD" minOccurs="0"/>
 *           &lt;element name="GROUP" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}GROUP" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="LINK" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}LINK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}DATA" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TABLE", propOrder = {
    "description",
    "paramOrFIELDOrGROUP",
    "link",
    "data"
})
public class TABLE {

    @XmlElement(name = "DESCRIPTION")
    protected AnyTEXT description;
    @XmlElements({
        @XmlElement(name = "PARAM", type = PARAM.class),
        @XmlElement(name = "FIELD", type = FIELD.class),
        @XmlElement(name = "GROUP", type = GROUP.class)
    })
    protected List<Object> paramOrFIELDOrGROUP;
    @XmlElement(name = "LINK")
    protected List<LINK> link;
    @XmlElement(name = "DATA")
    protected DATA data;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlAttribute(name = "ref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;

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
     * Gets the value of the paramOrFIELDOrGROUP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramOrFIELDOrGROUP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARAMOrFIELDOrGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAM }
     * {@link FIELD }
     * {@link GROUP }
     * 
     * 
     */
    public List<Object> getPARAMOrFIELDOrGROUP() {
        if (paramOrFIELDOrGROUP == null) {
            paramOrFIELDOrGROUP = new ArrayList<Object>();
        }
        return this.paramOrFIELDOrGROUP;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DATA }
     *     
     */
    public DATA getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATA }
     *     
     */
    public void setDATA(DATA value) {
        this.data = value;
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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

}
