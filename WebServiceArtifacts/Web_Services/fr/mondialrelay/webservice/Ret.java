
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_", propOrder = {
    "stat"
})
@XmlSeeAlso({
    RetWSI2GetEtiquettes.class,
    RetWSI2CreationExpedition.class,
    RetWSI2TracingColisDetaille.class,
    RetWSI2RecherchePointRelaisAvancee.class,
    RetWSI2CreationEtiquette.class,
    RetWSI2DetailPointRelais.class,
    RetWSI3PointRelaisRecherche.class,
    RetWSI2RechercheCP.class,
    RetWSI2RecherchePointRelais.class,
    RetWSI2RecherchePointRelaisHoraires.class,
    RetWSI2AdressePointRelais.class
})
public class Ret {

    @XmlElement(name = "STAT")
    protected String stat;

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAT() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAT(String value) {
        this.stat = value;
    }

}
