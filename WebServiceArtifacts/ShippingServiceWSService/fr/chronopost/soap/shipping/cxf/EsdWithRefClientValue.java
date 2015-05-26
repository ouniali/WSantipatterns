
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esdWithRefClientValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esdWithRefClientValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cxf.shipping.soap.chronopost.fr/}esdValue">
 *       &lt;sequence>
 *         &lt;element name="ltAImprimerParChronopost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nombreDePassageMaximum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refEsdClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esdWithRefClientValue", propOrder = {
    "ltAImprimerParChronopost",
    "nombreDePassageMaximum",
    "refEsdClient"
})
public class EsdWithRefClientValue
    extends EsdValue
{

    protected boolean ltAImprimerParChronopost;
    protected int nombreDePassageMaximum;
    protected String refEsdClient;

    /**
     * Gets the value of the ltAImprimerParChronopost property.
     * 
     */
    public boolean isLtAImprimerParChronopost() {
        return ltAImprimerParChronopost;
    }

    /**
     * Sets the value of the ltAImprimerParChronopost property.
     * 
     */
    public void setLtAImprimerParChronopost(boolean value) {
        this.ltAImprimerParChronopost = value;
    }

    /**
     * Gets the value of the nombreDePassageMaximum property.
     * 
     */
    public int getNombreDePassageMaximum() {
        return nombreDePassageMaximum;
    }

    /**
     * Sets the value of the nombreDePassageMaximum property.
     * 
     */
    public void setNombreDePassageMaximum(int value) {
        this.nombreDePassageMaximum = value;
    }

    /**
     * Gets the value of the refEsdClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefEsdClient() {
        return refEsdClient;
    }

    /**
     * Sets the value of the refEsdClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefEsdClient(String value) {
        this.refEsdClient = value;
    }

}
