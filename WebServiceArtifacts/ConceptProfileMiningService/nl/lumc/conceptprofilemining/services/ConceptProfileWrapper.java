
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptProfileWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptProfileWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConceptVector" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ConceptIdAndValue" type="{http://services.conceptprofilemining.lumc.nl/}stringDoubleTuple" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptProfileWrapper", propOrder = {
    "conceptId",
    "name",
    "definition",
    "conceptVector"
})
public class ConceptProfileWrapper {

    protected String conceptId;
    protected String name;
    protected String definition;
    @XmlElement(name = "ConceptVector")
    protected ConceptProfileWrapper.ConceptVector conceptVector;

    /**
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptId(String value) {
        this.conceptId = value;
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
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the conceptVector property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptProfileWrapper.ConceptVector }
     *     
     */
    public ConceptProfileWrapper.ConceptVector getConceptVector() {
        return conceptVector;
    }

    /**
     * Sets the value of the conceptVector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptProfileWrapper.ConceptVector }
     *     
     */
    public void setConceptVector(ConceptProfileWrapper.ConceptVector value) {
        this.conceptVector = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ConceptIdAndValue" type="{http://services.conceptprofilemining.lumc.nl/}stringDoubleTuple" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conceptIdAndValue"
    })
    public static class ConceptVector {

        @XmlElement(name = "ConceptIdAndValue")
        protected List<StringDoubleTuple> conceptIdAndValue;

        /**
         * Gets the value of the conceptIdAndValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptIdAndValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptIdAndValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringDoubleTuple }
         * 
         * 
         */
        public List<StringDoubleTuple> getConceptIdAndValue() {
            if (conceptIdAndValue == null) {
                conceptIdAndValue = new ArrayList<StringDoubleTuple>();
            }
            return this.conceptIdAndValue;
        }

    }

}
