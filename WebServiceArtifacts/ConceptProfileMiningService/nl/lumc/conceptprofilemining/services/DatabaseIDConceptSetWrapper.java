
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for databaseIDConceptSetWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="databaseIDConceptSetWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseIDConceptSetList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DatabaseIDConceptSetTuple" type="{http://services.conceptprofilemining.lumc.nl/}databaseIDConceptSetTuple" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "databaseIDConceptSetWrapper", propOrder = {
    "databaseIDConceptSetList"
})
public class DatabaseIDConceptSetWrapper {

    @XmlElement(name = "DatabaseIDConceptSetList")
    protected DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList databaseIDConceptSetList;

    /**
     * Gets the value of the databaseIDConceptSetList property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList }
     *     
     */
    public DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList getDatabaseIDConceptSetList() {
        return databaseIDConceptSetList;
    }

    /**
     * Sets the value of the databaseIDConceptSetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList }
     *     
     */
    public void setDatabaseIDConceptSetList(DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList value) {
        this.databaseIDConceptSetList = value;
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
     *         &lt;element name="DatabaseIDConceptSetTuple" type="{http://services.conceptprofilemining.lumc.nl/}databaseIDConceptSetTuple" maxOccurs="unbounded" minOccurs="0"/>
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
        "databaseIDConceptSetTuple"
    })
    public static class DatabaseIDConceptSetList {

        @XmlElement(name = "DatabaseIDConceptSetTuple")
        protected List<DatabaseIDConceptSetTuple> databaseIDConceptSetTuple;

        /**
         * Gets the value of the databaseIDConceptSetTuple property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the databaseIDConceptSetTuple property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatabaseIDConceptSetTuple().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatabaseIDConceptSetTuple }
         * 
         * 
         */
        public List<DatabaseIDConceptSetTuple> getDatabaseIDConceptSetTuple() {
            if (databaseIDConceptSetTuple == null) {
                databaseIDConceptSetTuple = new ArrayList<DatabaseIDConceptSetTuple>();
            }
            return this.databaseIDConceptSetTuple;
        }

    }

}
