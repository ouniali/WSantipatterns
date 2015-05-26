
package domaination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for versionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="versionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domaination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="db" type="{Domaination}db"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "versionsType", propOrder = {
    "domaination",
    "db"
})
public class VersionsType {

    @XmlElement(required = true)
    protected String domaination;
    @XmlElement(required = true)
    protected Db db;

    /**
     * Gets the value of the domaination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomaination() {
        return domaination;
    }

    /**
     * Sets the value of the domaination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomaination(String value) {
        this.domaination = value;
    }

    /**
     * Gets the value of the db property.
     * 
     * @return
     *     possible object is
     *     {@link Db }
     *     
     */
    public Db getDb() {
        return db;
    }

    /**
     * Sets the value of the db property.
     * 
     * @param value
     *     allowed object is
     *     {@link Db }
     *     
     */
    public void setDb(Db value) {
        this.db = value;
    }

}
