
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedDatabank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultoffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxresultcount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "id",
    "linkedDatabank",
    "resultoffset",
    "maxresultcount"
})
@XmlRootElement(name = "GetLinked")
public class GetLinked {

    @XmlElement(required = true)
    protected String db;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String linkedDatabank;
    protected Integer resultoffset;
    protected Integer maxresultcount;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the linkedDatabank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedDatabank() {
        return linkedDatabank;
    }

    /**
     * Sets the value of the linkedDatabank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedDatabank(String value) {
        this.linkedDatabank = value;
    }

    /**
     * Gets the value of the resultoffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultoffset() {
        return resultoffset;
    }

    /**
     * Sets the value of the resultoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultoffset(Integer value) {
        this.resultoffset = value;
    }

    /**
     * Gets the value of the maxresultcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxresultcount() {
        return maxresultcount;
    }

    /**
     * Sets the value of the maxresultcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxresultcount(Integer value) {
        this.maxresultcount = value;
    }

}
