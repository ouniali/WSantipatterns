
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findCoOccurringDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCoOccurringDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutoffValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conceptID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conceptID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCoOccurringDocuments", propOrder = {
    "cutoffValue",
    "conceptID1",
    "conceptID2"
})
public class FindCoOccurringDocuments {

    protected int cutoffValue;
    protected String conceptID1;
    protected String conceptID2;

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
     * Gets the value of the conceptID1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptID1() {
        return conceptID1;
    }

    /**
     * Sets the value of the conceptID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptID1(String value) {
        this.conceptID1 = value;
    }

    /**
     * Gets the value of the conceptID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptID2() {
        return conceptID2;
    }

    /**
     * Sets the value of the conceptID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptID2(String value) {
        this.conceptID2 = value;
    }

}
