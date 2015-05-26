
package linjegodswebservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Shipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountOfPods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AmountOfKollies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShipmentMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fraktbrevnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendersRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendKundenv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProduktKD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProduktKDTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IlevStedNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostStednv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InnlevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UtlevDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UtlevKl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UlevSignNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vekt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Volum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Kolli" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MottKundenv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UlevAdrNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UlevAdrNv2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtlevStedNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtlevStedNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiroKidTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GarOppfyltJn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountOfKolliesDelivered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NetFreight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CollectionSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Documents" type="{LinjegodsWebServices}Documents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shipment", propOrder = {
    "amountOfPods",
    "amountOfKollies",
    "shipmentMessage",
    "fraktbrevnr",
    "sendersRef",
    "sendKundenv",
    "produktKD",
    "produktKDTxt",
    "ilevStedNr",
    "postStednv",
    "innlevDt",
    "utlevDt",
    "utlevKl",
    "ulevSignNv",
    "vekt",
    "volum",
    "kolli",
    "mottKundenv",
    "ulevAdrNv",
    "ulevAdrNv2",
    "utlevStedNr",
    "utlevStedNv",
    "giroKidTx",
    "garOppfyltJn",
    "amountOfKolliesDelivered",
    "netFreight",
    "collectionSurcharge",
    "documents"
})
public class Shipment {

    @XmlElement(name = "AmountOfPods")
    protected int amountOfPods;
    @XmlElement(name = "AmountOfKollies")
    protected int amountOfKollies;
    @XmlElement(name = "ShipmentMessage")
    protected String shipmentMessage;
    @XmlElement(name = "Fraktbrevnr")
    protected String fraktbrevnr;
    @XmlElement(name = "SendersRef")
    protected String sendersRef;
    @XmlElement(name = "SendKundenv")
    protected String sendKundenv;
    @XmlElement(name = "ProduktKD")
    protected String produktKD;
    @XmlElement(name = "ProduktKDTxt")
    protected String produktKDTxt;
    @XmlElement(name = "IlevStedNr")
    protected String ilevStedNr;
    @XmlElement(name = "PostStednv")
    protected String postStednv;
    @XmlElement(name = "InnlevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar innlevDt;
    @XmlElement(name = "UtlevDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utlevDt;
    @XmlElement(name = "UtlevKl")
    protected String utlevKl;
    @XmlElement(name = "UlevSignNv")
    protected String ulevSignNv;
    @XmlElement(name = "Vekt")
    protected int vekt;
    @XmlElement(name = "Volum")
    protected int volum;
    @XmlElement(name = "Kolli")
    protected int kolli;
    @XmlElement(name = "MottKundenv")
    protected String mottKundenv;
    @XmlElement(name = "UlevAdrNv")
    protected String ulevAdrNv;
    @XmlElement(name = "UlevAdrNv2")
    protected String ulevAdrNv2;
    @XmlElement(name = "UtlevStedNr")
    protected String utlevStedNr;
    @XmlElement(name = "UtlevStedNv")
    protected String utlevStedNv;
    @XmlElement(name = "GiroKidTx")
    protected String giroKidTx;
    @XmlElement(name = "GarOppfyltJn")
    protected String garOppfyltJn;
    @XmlElement(name = "AmountOfKolliesDelivered")
    protected int amountOfKolliesDelivered;
    @XmlElement(name = "NetFreight", required = true, nillable = true)
    protected BigDecimal netFreight;
    @XmlElement(name = "CollectionSurcharge", required = true, nillable = true)
    protected BigDecimal collectionSurcharge;
    @XmlElement(name = "Documents")
    protected Documents documents;

    /**
     * Gets the value of the amountOfPods property.
     * 
     */
    public int getAmountOfPods() {
        return amountOfPods;
    }

    /**
     * Sets the value of the amountOfPods property.
     * 
     */
    public void setAmountOfPods(int value) {
        this.amountOfPods = value;
    }

    /**
     * Gets the value of the amountOfKollies property.
     * 
     */
    public int getAmountOfKollies() {
        return amountOfKollies;
    }

    /**
     * Sets the value of the amountOfKollies property.
     * 
     */
    public void setAmountOfKollies(int value) {
        this.amountOfKollies = value;
    }

    /**
     * Gets the value of the shipmentMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMessage() {
        return shipmentMessage;
    }

    /**
     * Sets the value of the shipmentMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMessage(String value) {
        this.shipmentMessage = value;
    }

    /**
     * Gets the value of the fraktbrevnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraktbrevnr() {
        return fraktbrevnr;
    }

    /**
     * Sets the value of the fraktbrevnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraktbrevnr(String value) {
        this.fraktbrevnr = value;
    }

    /**
     * Gets the value of the sendersRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendersRef() {
        return sendersRef;
    }

    /**
     * Sets the value of the sendersRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendersRef(String value) {
        this.sendersRef = value;
    }

    /**
     * Gets the value of the sendKundenv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendKundenv() {
        return sendKundenv;
    }

    /**
     * Sets the value of the sendKundenv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendKundenv(String value) {
        this.sendKundenv = value;
    }

    /**
     * Gets the value of the produktKD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduktKD() {
        return produktKD;
    }

    /**
     * Sets the value of the produktKD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduktKD(String value) {
        this.produktKD = value;
    }

    /**
     * Gets the value of the produktKDTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduktKDTxt() {
        return produktKDTxt;
    }

    /**
     * Sets the value of the produktKDTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduktKDTxt(String value) {
        this.produktKDTxt = value;
    }

    /**
     * Gets the value of the ilevStedNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlevStedNr() {
        return ilevStedNr;
    }

    /**
     * Sets the value of the ilevStedNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlevStedNr(String value) {
        this.ilevStedNr = value;
    }

    /**
     * Gets the value of the postStednv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostStednv() {
        return postStednv;
    }

    /**
     * Sets the value of the postStednv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostStednv(String value) {
        this.postStednv = value;
    }

    /**
     * Gets the value of the innlevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInnlevDt() {
        return innlevDt;
    }

    /**
     * Sets the value of the innlevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInnlevDt(XMLGregorianCalendar value) {
        this.innlevDt = value;
    }

    /**
     * Gets the value of the utlevDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtlevDt() {
        return utlevDt;
    }

    /**
     * Sets the value of the utlevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtlevDt(XMLGregorianCalendar value) {
        this.utlevDt = value;
    }

    /**
     * Gets the value of the utlevKl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtlevKl() {
        return utlevKl;
    }

    /**
     * Sets the value of the utlevKl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtlevKl(String value) {
        this.utlevKl = value;
    }

    /**
     * Gets the value of the ulevSignNv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlevSignNv() {
        return ulevSignNv;
    }

    /**
     * Sets the value of the ulevSignNv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlevSignNv(String value) {
        this.ulevSignNv = value;
    }

    /**
     * Gets the value of the vekt property.
     * 
     */
    public int getVekt() {
        return vekt;
    }

    /**
     * Sets the value of the vekt property.
     * 
     */
    public void setVekt(int value) {
        this.vekt = value;
    }

    /**
     * Gets the value of the volum property.
     * 
     */
    public int getVolum() {
        return volum;
    }

    /**
     * Sets the value of the volum property.
     * 
     */
    public void setVolum(int value) {
        this.volum = value;
    }

    /**
     * Gets the value of the kolli property.
     * 
     */
    public int getKolli() {
        return kolli;
    }

    /**
     * Sets the value of the kolli property.
     * 
     */
    public void setKolli(int value) {
        this.kolli = value;
    }

    /**
     * Gets the value of the mottKundenv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMottKundenv() {
        return mottKundenv;
    }

    /**
     * Sets the value of the mottKundenv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMottKundenv(String value) {
        this.mottKundenv = value;
    }

    /**
     * Gets the value of the ulevAdrNv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlevAdrNv() {
        return ulevAdrNv;
    }

    /**
     * Sets the value of the ulevAdrNv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlevAdrNv(String value) {
        this.ulevAdrNv = value;
    }

    /**
     * Gets the value of the ulevAdrNv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlevAdrNv2() {
        return ulevAdrNv2;
    }

    /**
     * Sets the value of the ulevAdrNv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlevAdrNv2(String value) {
        this.ulevAdrNv2 = value;
    }

    /**
     * Gets the value of the utlevStedNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtlevStedNr() {
        return utlevStedNr;
    }

    /**
     * Sets the value of the utlevStedNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtlevStedNr(String value) {
        this.utlevStedNr = value;
    }

    /**
     * Gets the value of the utlevStedNv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtlevStedNv() {
        return utlevStedNv;
    }

    /**
     * Sets the value of the utlevStedNv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtlevStedNv(String value) {
        this.utlevStedNv = value;
    }

    /**
     * Gets the value of the giroKidTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiroKidTx() {
        return giroKidTx;
    }

    /**
     * Sets the value of the giroKidTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiroKidTx(String value) {
        this.giroKidTx = value;
    }

    /**
     * Gets the value of the garOppfyltJn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarOppfyltJn() {
        return garOppfyltJn;
    }

    /**
     * Sets the value of the garOppfyltJn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarOppfyltJn(String value) {
        this.garOppfyltJn = value;
    }

    /**
     * Gets the value of the amountOfKolliesDelivered property.
     * 
     */
    public int getAmountOfKolliesDelivered() {
        return amountOfKolliesDelivered;
    }

    /**
     * Sets the value of the amountOfKolliesDelivered property.
     * 
     */
    public void setAmountOfKolliesDelivered(int value) {
        this.amountOfKolliesDelivered = value;
    }

    /**
     * Gets the value of the netFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetFreight() {
        return netFreight;
    }

    /**
     * Sets the value of the netFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetFreight(BigDecimal value) {
        this.netFreight = value;
    }

    /**
     * Gets the value of the collectionSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectionSurcharge() {
        return collectionSurcharge;
    }

    /**
     * Sets the value of the collectionSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectionSurcharge(BigDecimal value) {
        this.collectionSurcharge = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link Documents }
     *     
     */
    public Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documents }
     *     
     */
    public void setDocuments(Documents value) {
        this.documents = value;
    }

}
