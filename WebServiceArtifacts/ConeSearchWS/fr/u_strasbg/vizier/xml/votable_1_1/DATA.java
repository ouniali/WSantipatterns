
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TABLEDATA" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}TABLEDATA" minOccurs="0"/>
 *           &lt;element name="FITS" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}FITS" minOccurs="0"/>
 *           &lt;element name="BINARY" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}BINARY" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATA", propOrder = {
    "tabledata",
    "fits",
    "binary"
})
public class DATA {

    @XmlElement(name = "TABLEDATA")
    protected TABLEDATA tabledata;
    @XmlElement(name = "FITS")
    protected FITS fits;
    @XmlElement(name = "BINARY")
    protected BINARY binary;

    /**
     * Gets the value of the tabledata property.
     * 
     * @return
     *     possible object is
     *     {@link TABLEDATA }
     *     
     */
    public TABLEDATA getTABLEDATA() {
        return tabledata;
    }

    /**
     * Sets the value of the tabledata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TABLEDATA }
     *     
     */
    public void setTABLEDATA(TABLEDATA value) {
        this.tabledata = value;
    }

    /**
     * Gets the value of the fits property.
     * 
     * @return
     *     possible object is
     *     {@link FITS }
     *     
     */
    public FITS getFITS() {
        return fits;
    }

    /**
     * Sets the value of the fits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FITS }
     *     
     */
    public void setFITS(FITS value) {
        this.fits = value;
    }

    /**
     * Gets the value of the binary property.
     * 
     * @return
     *     possible object is
     *     {@link BINARY }
     *     
     */
    public BINARY getBINARY() {
        return binary;
    }

    /**
     * Sets the value of the binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BINARY }
     *     
     */
    public void setBINARY(BINARY value) {
        this.binary = value;
    }

}
