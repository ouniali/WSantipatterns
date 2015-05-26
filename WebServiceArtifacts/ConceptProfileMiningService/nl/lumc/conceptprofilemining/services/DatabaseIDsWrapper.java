
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for databaseIDsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="databaseIDsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="databaseIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="databaseId" type="{http://services.conceptprofilemining.lumc.nl/}databaseIDWrapper" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "databaseIDsWrapper", propOrder = {
    "databaseIdList"
})
public class DatabaseIDsWrapper {

    protected DatabaseIDsWrapper.DatabaseIdList databaseIdList;

    /**
     * Gets the value of the databaseIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseIDsWrapper.DatabaseIdList }
     *     
     */
    public DatabaseIDsWrapper.DatabaseIdList getDatabaseIdList() {
        return databaseIdList;
    }

    /**
     * Sets the value of the databaseIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseIDsWrapper.DatabaseIdList }
     *     
     */
    public void setDatabaseIdList(DatabaseIDsWrapper.DatabaseIdList value) {
        this.databaseIdList = value;
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
     *         &lt;element name="databaseId" type="{http://services.conceptprofilemining.lumc.nl/}databaseIDWrapper" maxOccurs="unbounded" minOccurs="0"/>
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
        "databaseId"
    })
    public static class DatabaseIdList {

        protected List<DatabaseIDWrapper> databaseId;

        /**
         * Gets the value of the databaseId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the databaseId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatabaseId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatabaseIDWrapper }
         * 
         * 
         */
        public List<DatabaseIDWrapper> getDatabaseId() {
            if (databaseId == null) {
                databaseId = new ArrayList<DatabaseIDWrapper>();
            }
            return this.databaseId;
        }

    }

}
