
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptContributionsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptContributionsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConceptContributionTable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conceptContributions" type="{http://services.conceptprofilemining.lumc.nl/}conceptContribution" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "conceptContributionsWrapper", propOrder = {
    "conceptContributionTable"
})
public class ConceptContributionsWrapper {

    @XmlElement(name = "ConceptContributionTable")
    protected ConceptContributionsWrapper.ConceptContributionTable conceptContributionTable;

    /**
     * Gets the value of the conceptContributionTable property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptContributionsWrapper.ConceptContributionTable }
     *     
     */
    public ConceptContributionsWrapper.ConceptContributionTable getConceptContributionTable() {
        return conceptContributionTable;
    }

    /**
     * Sets the value of the conceptContributionTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptContributionsWrapper.ConceptContributionTable }
     *     
     */
    public void setConceptContributionTable(ConceptContributionsWrapper.ConceptContributionTable value) {
        this.conceptContributionTable = value;
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
     *         &lt;element name="conceptContributions" type="{http://services.conceptprofilemining.lumc.nl/}conceptContribution" maxOccurs="unbounded" minOccurs="0"/>
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
        "conceptContributions"
    })
    public static class ConceptContributionTable {

        @XmlElement(nillable = true)
        protected List<ConceptContribution> conceptContributions;

        /**
         * Gets the value of the conceptContributions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptContributions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptContributions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptContribution }
         * 
         * 
         */
        public List<ConceptContribution> getConceptContributions() {
            if (conceptContributions == null) {
                conceptContributions = new ArrayList<ConceptContribution>();
            }
            return this.conceptContributions;
        }

    }

}
