
package wst.hotel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tiposHabitacionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tiposHabitacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numHab" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codGtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscCha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paxMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paxMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chlMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chlMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paxTot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paxTotMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiposHabitacionType", propOrder = {
    "numHab",
    "codGtr",
    "modDet",
    "dscDet",
    "codCha",
    "dscCha",
    "paxMin",
    "paxMax",
    "chlMin",
    "chlMax",
    "paxTot",
    "paxTotMax"
})
public class TiposHabitacionType {

    protected int numHab;
    @XmlElementRef(name = "codGtr", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codGtr;
    @XmlElementRef(name = "modDet", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modDet;
    @XmlElementRef(name = "dscDet", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscDet;
    @XmlElementRef(name = "codCha", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCha;
    @XmlElementRef(name = "dscCha", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscCha;
    @XmlElementRef(name = "paxMin", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paxMin;
    @XmlElementRef(name = "paxMax", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paxMax;
    @XmlElementRef(name = "chlMin", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> chlMin;
    @XmlElementRef(name = "chlMax", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> chlMax;
    @XmlElementRef(name = "paxTot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paxTot;
    @XmlElementRef(name = "paxTotMax", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paxTotMax;

    /**
     * Gets the value of the numHab property.
     * 
     */
    public int getNumHab() {
        return numHab;
    }

    /**
     * Sets the value of the numHab property.
     * 
     */
    public void setNumHab(int value) {
        this.numHab = value;
    }

    /**
     * Gets the value of the codGtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodGtr() {
        return codGtr;
    }

    /**
     * Sets the value of the codGtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodGtr(JAXBElement<String> value) {
        this.codGtr = value;
    }

    /**
     * Gets the value of the modDet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModDet() {
        return modDet;
    }

    /**
     * Sets the value of the modDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModDet(JAXBElement<String> value) {
        this.modDet = value;
    }

    /**
     * Gets the value of the dscDet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscDet() {
        return dscDet;
    }

    /**
     * Sets the value of the dscDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscDet(JAXBElement<String> value) {
        this.dscDet = value;
    }

    /**
     * Gets the value of the codCha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCha() {
        return codCha;
    }

    /**
     * Sets the value of the codCha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCha(JAXBElement<String> value) {
        this.codCha = value;
    }

    /**
     * Gets the value of the dscCha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscCha() {
        return dscCha;
    }

    /**
     * Sets the value of the dscCha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscCha(JAXBElement<String> value) {
        this.dscCha = value;
    }

    /**
     * Gets the value of the paxMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaxMin() {
        return paxMin;
    }

    /**
     * Sets the value of the paxMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaxMin(JAXBElement<Integer> value) {
        this.paxMin = value;
    }

    /**
     * Gets the value of the paxMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaxMax() {
        return paxMax;
    }

    /**
     * Sets the value of the paxMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaxMax(JAXBElement<Integer> value) {
        this.paxMax = value;
    }

    /**
     * Gets the value of the chlMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChlMin() {
        return chlMin;
    }

    /**
     * Sets the value of the chlMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChlMin(JAXBElement<Integer> value) {
        this.chlMin = value;
    }

    /**
     * Gets the value of the chlMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChlMax() {
        return chlMax;
    }

    /**
     * Sets the value of the chlMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChlMax(JAXBElement<Integer> value) {
        this.chlMax = value;
    }

    /**
     * Gets the value of the paxTot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaxTot() {
        return paxTot;
    }

    /**
     * Sets the value of the paxTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaxTot(JAXBElement<Integer> value) {
        this.paxTot = value;
    }

    /**
     * Gets the value of the paxTotMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaxTotMax() {
        return paxTotMax;
    }

    /**
     * Sets the value of the paxTotMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaxTotMax(JAXBElement<Integer> value) {
        this.paxTotMax = value;
    }

}
