
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
 *         &lt;element name="query" type="{http://mrs.cmbi.ru.nl/mrsws/search}BooleanQuery"/>
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
    "query",
    "resultoffset",
    "maxresultcount"
})
@XmlRootElement(name = "FindBoolean")
public class FindBoolean {

    @XmlElement(required = true)
    protected String db;
    @XmlElement(required = true)
    protected BooleanQuery query;
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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanQuery }
     *     
     */
    public BooleanQuery getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanQuery }
     *     
     */
    public void setQuery(BooleanQuery value) {
        this.query = value;
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
