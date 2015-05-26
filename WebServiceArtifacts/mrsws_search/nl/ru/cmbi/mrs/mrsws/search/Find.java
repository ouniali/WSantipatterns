
package nl.ru.cmbi.mrs.mrsws.search;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="queryterms" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alltermsrequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="booleanfilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queryterms",
    "alltermsrequired",
    "booleanfilter",
    "resultoffset",
    "maxresultcount"
})
@XmlRootElement(name = "Find")
public class Find {

    @XmlElement(required = true)
    protected String db;
    protected List<String> queryterms;
    protected Boolean alltermsrequired;
    protected String booleanfilter;
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
     * Gets the value of the queryterms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryterms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryterms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueryterms() {
        if (queryterms == null) {
            queryterms = new ArrayList<String>();
        }
        return this.queryterms;
    }

    /**
     * Gets the value of the alltermsrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlltermsrequired() {
        return alltermsrequired;
    }

    /**
     * Sets the value of the alltermsrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlltermsrequired(Boolean value) {
        this.alltermsrequired = value;
    }

    /**
     * Gets the value of the booleanfilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanfilter() {
        return booleanfilter;
    }

    /**
     * Sets the value of the booleanfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanfilter(String value) {
        this.booleanfilter = value;
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
