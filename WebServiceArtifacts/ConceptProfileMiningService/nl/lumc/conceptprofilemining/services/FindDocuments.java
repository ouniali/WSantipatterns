
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutoffValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conceptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findDocuments", propOrder = {
    "cutoffValue",
    "conceptID"
})
public class FindDocuments {

    protected int cutoffValue;
    protected String conceptID;

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
     * Gets the value of the conceptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptID() {
        return conceptID;
    }

    /**
     * Sets the value of the conceptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptID(String value) {
        this.conceptID = value;
    }

}
