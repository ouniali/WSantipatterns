
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disponibilidadEstanciaV2RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disponibilidadEstanciaV2RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecIni" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecFin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aptDep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aptArr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numNoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codRga" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="atrHot" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pvpDesde" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pvpHasta" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="habitaciones" type="{types.hotel.wst}habitacionesType" maxOccurs="unbounded"/>
 *         &lt;element name="nomHot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refZge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codIdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swiRes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refSer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTof" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codTiv" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refPro" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="grpTpr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disponibilidadEstanciaV2RequestType", propOrder = {
    "idUsuario",
    "fecIni",
    "fecFin",
    "aptDep",
    "aptArr",
    "numNoc",
    "numCat",
    "codRga",
    "atrHot",
    "pvpDesde",
    "pvpHasta",
    "habitaciones",
    "nomHot",
    "refZge",
    "orden",
    "codIdi",
    "swiRes",
    "refSer",
    "codTof",
    "codTiv",
    "refPro",
    "grpTpr"
})
public class DisponibilidadEstanciaV2RequestType {

    @XmlElement(required = true)
    protected String idUsuario;
    @XmlElement(required = true)
    protected String fecIni;
    @XmlElement(required = true)
    protected String fecFin;
    @XmlElement(required = true)
    protected String aptDep;
    @XmlElement(required = true)
    protected String aptArr;
    @XmlElement(required = true)
    protected String numNoc;
    @XmlElement(nillable = true)
    protected List<String> numCat;
    @XmlElement(nillable = true)
    protected List<String> codRga;
    @XmlElement(nillable = true)
    protected List<String> atrHot;
    @XmlElementRef(name = "pvpDesde", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> pvpDesde;
    @XmlElementRef(name = "pvpHasta", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> pvpHasta;
    @XmlElement(required = true)
    protected List<HabitacionesType> habitaciones;
    @XmlElementRef(name = "nomHot", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomHot;
    @XmlElementRef(name = "refZge", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refZge;
    @XmlElementRef(name = "orden", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orden;
    @XmlElementRef(name = "codIdi", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codIdi;
    protected boolean swiRes;
    @XmlElementRef(name = "refSer", namespace = "types.hotel.wst", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> refSer;
    @XmlElement(nillable = true)
    protected List<String> codTof;
    @XmlElement(nillable = true)
    protected List<String> codTiv;
    @XmlElement(nillable = true)
    protected List<Integer> refPro;
    protected String grpTpr;

    /**
     * Gets the value of the idUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the fecIni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecIni() {
        return fecIni;
    }

    /**
     * Sets the value of the fecIni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecIni(String value) {
        this.fecIni = value;
    }

    /**
     * Gets the value of the fecFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecFin() {
        return fecFin;
    }

    /**
     * Sets the value of the fecFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecFin(String value) {
        this.fecFin = value;
    }

    /**
     * Gets the value of the aptDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptDep() {
        return aptDep;
    }

    /**
     * Sets the value of the aptDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptDep(String value) {
        this.aptDep = value;
    }

    /**
     * Gets the value of the aptArr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptArr() {
        return aptArr;
    }

    /**
     * Sets the value of the aptArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptArr(String value) {
        this.aptArr = value;
    }

    /**
     * Gets the value of the numNoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumNoc() {
        return numNoc;
    }

    /**
     * Sets the value of the numNoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumNoc(String value) {
        this.numNoc = value;
    }

    /**
     * Gets the value of the numCat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numCat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumCat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumCat() {
        if (numCat == null) {
            numCat = new ArrayList<String>();
        }
        return this.numCat;
    }

    /**
     * Gets the value of the codRga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codRga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodRga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodRga() {
        if (codRga == null) {
            codRga = new ArrayList<String>();
        }
        return this.codRga;
    }

    /**
     * Gets the value of the atrHot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atrHot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtrHot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAtrHot() {
        if (atrHot == null) {
            atrHot = new ArrayList<String>();
        }
        return this.atrHot;
    }

    /**
     * Gets the value of the pvpDesde property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPvpDesde() {
        return pvpDesde;
    }

    /**
     * Sets the value of the pvpDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPvpDesde(JAXBElement<Float> value) {
        this.pvpDesde = value;
    }

    /**
     * Gets the value of the pvpHasta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPvpHasta() {
        return pvpHasta;
    }

    /**
     * Sets the value of the pvpHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPvpHasta(JAXBElement<Float> value) {
        this.pvpHasta = value;
    }

    /**
     * Gets the value of the habitaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the habitaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHabitaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HabitacionesType }
     * 
     * 
     */
    public List<HabitacionesType> getHabitaciones() {
        if (habitaciones == null) {
            habitaciones = new ArrayList<HabitacionesType>();
        }
        return this.habitaciones;
    }

    /**
     * Gets the value of the nomHot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomHot() {
        return nomHot;
    }

    /**
     * Sets the value of the nomHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomHot(JAXBElement<String> value) {
        this.nomHot = value;
    }

    /**
     * Gets the value of the refZge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefZge() {
        return refZge;
    }

    /**
     * Sets the value of the refZge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefZge(JAXBElement<String> value) {
        this.refZge = value;
    }

    /**
     * Gets the value of the orden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrden() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrden(JAXBElement<String> value) {
        this.orden = value;
    }

    /**
     * Gets the value of the codIdi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodIdi() {
        return codIdi;
    }

    /**
     * Sets the value of the codIdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodIdi(JAXBElement<String> value) {
        this.codIdi = value;
    }

    /**
     * Gets the value of the swiRes property.
     * 
     */
    public boolean isSwiRes() {
        return swiRes;
    }

    /**
     * Sets the value of the swiRes property.
     * 
     */
    public void setSwiRes(boolean value) {
        this.swiRes = value;
    }

    /**
     * Gets the value of the refSer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRefSer() {
        return refSer;
    }

    /**
     * Sets the value of the refSer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRefSer(JAXBElement<Integer> value) {
        this.refSer = value;
    }

    /**
     * Gets the value of the codTof property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codTof property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodTof().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodTof() {
        if (codTof == null) {
            codTof = new ArrayList<String>();
        }
        return this.codTof;
    }

    /**
     * Gets the value of the codTiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codTiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodTiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodTiv() {
        if (codTiv == null) {
            codTiv = new ArrayList<String>();
        }
        return this.codTiv;
    }

    /**
     * Gets the value of the refPro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getRefPro() {
        if (refPro == null) {
            refPro = new ArrayList<Integer>();
        }
        return this.refPro;
    }

    /**
     * Gets the value of the grpTpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpTpr() {
        return grpTpr;
    }

    /**
     * Sets the value of the grpTpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpTpr(String value) {
        this.grpTpr = value;
    }

}
