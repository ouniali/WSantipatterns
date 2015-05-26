
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPredefinedConceptSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPredefinedConceptSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptSetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPredefinedConceptSet", propOrder = {
    "conceptSetID"
})
public class GetPredefinedConceptSet {

    protected int conceptSetID;

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

}
