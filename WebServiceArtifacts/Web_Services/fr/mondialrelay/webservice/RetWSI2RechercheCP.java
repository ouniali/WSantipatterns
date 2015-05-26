
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI2_RechercheCP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RechercheCP">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="Liste" type="{http://www.mondialrelay.fr/webservice/}ArrayOfCommune" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RechercheCP", propOrder = {
    "liste"
})
public class RetWSI2RechercheCP
    extends Ret
{

    @XmlElement(name = "Liste")
    protected ArrayOfCommune liste;

    /**
     * Gets the value of the liste property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommune }
     *     
     */
    public ArrayOfCommune getListe() {
        return liste;
    }

    /**
     * Sets the value of the liste property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommune }
     *     
     */
    public void setListe(ArrayOfCommune value) {
        this.liste = value;
    }

}
