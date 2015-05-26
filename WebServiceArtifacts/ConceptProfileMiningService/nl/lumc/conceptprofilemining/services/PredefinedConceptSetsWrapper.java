
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predefinedConceptSetsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predefinedConceptSetsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConceptSetInfoList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}ConceptSetInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "predefinedConceptSetsWrapper", propOrder = {
    "conceptSetInfoList"
})
public class PredefinedConceptSetsWrapper {

    @XmlElement(name = "ConceptSetInfoList")
    protected PredefinedConceptSetsWrapper.ConceptSetInfoList conceptSetInfoList;

    /**
     * Gets the value of the conceptSetInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedConceptSetsWrapper.ConceptSetInfoList }
     *     
     */
    public PredefinedConceptSetsWrapper.ConceptSetInfoList getConceptSetInfoList() {
        return conceptSetInfoList;
    }

    /**
     * Sets the value of the conceptSetInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedConceptSetsWrapper.ConceptSetInfoList }
     *     
     */
    public void setConceptSetInfoList(PredefinedConceptSetsWrapper.ConceptSetInfoList value) {
        this.conceptSetInfoList = value;
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
     *         &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}ConceptSetInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "conceptSetInfo"
    })
    public static class ConceptSetInfoList {

        @XmlElement(name = "ConceptSetInfo", namespace = "http://services.conceptprofilemining.lumc.nl/")
        protected List<ConceptSetInfo> conceptSetInfo;

        /**
         * Gets the value of the conceptSetInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptSetInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConceptSetInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptSetInfo }
         * 
         * 
         */
        public List<ConceptSetInfo> getConceptSetInfo() {
            if (conceptSetInfo == null) {
                conceptSetInfo = new ArrayList<ConceptSetInfo>();
            }
            return this.conceptSetInfo;
        }

    }

}
