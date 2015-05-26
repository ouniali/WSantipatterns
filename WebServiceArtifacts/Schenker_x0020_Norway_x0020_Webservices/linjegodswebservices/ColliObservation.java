
package linjegodswebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ColliObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColliObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kollinr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obstypekode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obsdato" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="obssted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TilleggsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColliObservation", propOrder = {
    "kollinr",
    "obstype",
    "obstypekode",
    "obsdato",
    "obssted",
    "tilleggsInfo"
})
public class ColliObservation {

    protected String kollinr;
    protected String obstype;
    protected String obstypekode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar obsdato;
    protected String obssted;
    @XmlElement(name = "TilleggsInfo")
    protected String tilleggsInfo;

    /**
     * Gets the value of the kollinr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKollinr() {
        return kollinr;
    }

    /**
     * Sets the value of the kollinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKollinr(String value) {
        this.kollinr = value;
    }

    /**
     * Gets the value of the obstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObstype() {
        return obstype;
    }

    /**
     * Sets the value of the obstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObstype(String value) {
        this.obstype = value;
    }

    /**
     * Gets the value of the obstypekode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObstypekode() {
        return obstypekode;
    }

    /**
     * Sets the value of the obstypekode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObstypekode(String value) {
        this.obstypekode = value;
    }

    /**
     * Gets the value of the obsdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObsdato() {
        return obsdato;
    }

    /**
     * Sets the value of the obsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObsdato(XMLGregorianCalendar value) {
        this.obsdato = value;
    }

    /**
     * Gets the value of the obssted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObssted() {
        return obssted;
    }

    /**
     * Sets the value of the obssted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObssted(String value) {
        this.obssted = value;
    }

    /**
     * Gets the value of the tilleggsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilleggsInfo() {
        return tilleggsInfo;
    }

    /**
     * Sets the value of the tilleggsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilleggsInfo(String value) {
        this.tilleggsInfo = value;
    }

}
