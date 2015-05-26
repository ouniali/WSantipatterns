
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptRows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conceptEntry" type="{http://services.conceptprofilemining.lumc.nl/}conceptWrapper" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "conceptTable", propOrder = {
    "conceptRows"
})
public class ConceptTable {

    protected ConceptTable.ConceptRows conceptRows;

    /**
     * Gets the value of the conceptRows property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptTable.ConceptRows }
     *     
     */
    public ConceptTable.ConceptRows getConceptRows() {
        return conceptRows;
    }

    /**
     * Sets the value of the conceptRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptTable.ConceptRows }
     *     
     */
    public void setConceptRows(ConceptTable.ConceptRows value) {
        this.conceptRows = value;
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
     *         &lt;element name="conceptEntry" type="{http://services.conceptprofilemining.lumc.nl/}conceptWrapper" maxOccurs="unbounded" minOccurs="0"/>
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
        "conceptEntry"
    })
    public static class ConceptRows {

        protected List<ConceptWrapper> conceptEntry;

        /**
         * Gets the value of the conceptEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptWrapper }
         * 
         * 
         */
        public List<ConceptWrapper> getConceptEntry() {
            if (conceptEntry == null) {
                conceptEntry = new ArrayList<ConceptWrapper>();
            }
            return this.conceptEntry;
        }

    }

}
