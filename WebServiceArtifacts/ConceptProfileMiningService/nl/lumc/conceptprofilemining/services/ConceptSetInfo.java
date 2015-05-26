
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptSetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptSetInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conceptsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptSetInfo", propOrder = {
    "name",
    "id",
    "parent",
    "conceptsCount"
})
public class ConceptSetInfo {

    protected String name;
    protected int id;
    protected int parent;
    protected int conceptsCount;

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
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     */
    public int getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     */
    public void setParent(int value) {
        this.parent = value;
    }

    /**
     * Gets the value of the conceptsCount property.
     * 
     */
    public int getConceptsCount() {
        return conceptsCount;
    }

    /**
     * Sets the value of the conceptsCount property.
     * 
     */
    public void setConceptsCount(int value) {
        this.conceptsCount = value;
    }

}
