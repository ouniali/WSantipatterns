
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filterAgainstPredefinedConceptSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filterAgainstPredefinedConceptSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptSetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conceptIDList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filterAgainstPredefinedConceptSet", propOrder = {
    "conceptSetID",
    "conceptIDList"
})
public class FilterAgainstPredefinedConceptSet {

    protected int conceptSetID;
    protected String conceptIDList;

    /**
     * Gets the value of the conceptSetID property.
     * 
     */
    public int getConceptSetID() {
        return conceptSetID;
    }

    /**
     * Sets the value of the conceptSetID property.
     * 
     */
    public void setConceptSetID(int value) {
        this.conceptSetID = value;
    }

    /**
     * Gets the value of the conceptIDList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptIDList() {
        return conceptIDList;
    }

    /**
     * Sets the value of the conceptIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptIDList(String value) {
        this.conceptIDList = value;
    }

}
