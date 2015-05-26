
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for databaseIDConceptSetTuple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="databaseIDConceptSetTuple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}DatabaseID" minOccurs="0"/>
 *         &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}ConceptSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "databaseIDConceptSetTuple", propOrder = {
    "databaseID",
    "conceptSet"
})
public class DatabaseIDConceptSetTuple {

    @XmlElement(name = "DatabaseID", namespace = "http://services.conceptprofilemining.lumc.nl/")
    protected DatabaseIDWrapper databaseID;
    @XmlElement(name = "ConceptSet", namespace = "http://services.conceptprofilemining.lumc.nl/")
    protected ConceptSetWrapper conceptSet;

    /**
     * Gets the value of the databaseID property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseIDWrapper }
     *     
     */
    public DatabaseIDWrapper getDatabaseID() {
        return databaseID;
    }

    /**
     * Sets the value of the databaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseIDWrapper }
     *     
     */
    public void setDatabaseID(DatabaseIDWrapper value) {
        this.databaseID = value;
    }

    /**
     * Gets the value of the conceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptSetWrapper }
     *     
     */
    public ConceptSetWrapper getConceptSet() {
        return conceptSet;
    }

    /**
     * Sets the value of the conceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptSetWrapper }
     *     
     */
    public void setConceptSet(ConceptSetWrapper value) {
        this.conceptSet = value;
    }

}
