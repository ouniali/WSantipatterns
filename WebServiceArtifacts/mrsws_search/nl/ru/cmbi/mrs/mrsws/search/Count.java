
package nl.ru.cmbi.mrs.mrsws.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="db" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="booleanquery" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "db",
    "booleanquery"
})
@XmlRootElement(name = "Count")
public class Count {

    @XmlElement(required = true)
    protected String db;
    @XmlElement(required = true)
    protected String booleanquery;

    /**
     * Gets the value of the db property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDb() {
        return db;
    }

    /**
     * Sets the value of the db property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDb(String value) {
        this.db = value;
    }

    /**
     * Gets the value of the booleanquery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanquery() {
        return booleanquery;
    }

    /**
     * Sets the value of the booleanquery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanquery(String value) {
        this.booleanquery = value;
    }

}
