
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findSupportingDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findSupportingDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutoffValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conceptCUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedConceptCUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSupportingDocuments", propOrder = {
    "cutoffValue",
    "conceptCUI",
    "associatedConceptCUI"
})
public class FindSupportingDocuments {

    protected int cutoffValue;
    protected String conceptCUI;
    protected String associatedConceptCUI;

    /**
     * Gets the value of the cutoffValue property.
     * 
     */
    public int getCutoffValue() {
        return cutoffValue;
    }

    /**
     * Sets the value of the cutoffValue property.
     * 
     */
    public void setCutoffValue(int value) {
        this.cutoffValue = value;
    }

    /**
     * Gets the value of the conceptCUI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptCUI() {
        return conceptCUI;
    }

    /**
     * Sets the value of the conceptCUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptCUI(String value) {
        this.conceptCUI = value;
    }

    /**
     * Gets the value of the associatedConceptCUI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedConceptCUI() {
        return associatedConceptCUI;
    }

    /**
     * Sets the value of the associatedConceptCUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedConceptCUI(String value) {
        this.associatedConceptCUI = value;
    }

}
