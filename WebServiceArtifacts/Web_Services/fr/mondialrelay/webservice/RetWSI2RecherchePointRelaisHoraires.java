
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI2_RecherchePointRelaisHoraires complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RecherchePointRelaisHoraires">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="ListePR" type="{http://www.mondialrelay.fr/webservice/}ArrayOfRet_WSI2_sub_PointRelaisHoraires" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RecherchePointRelaisHoraires", propOrder = {
    "listePR"
})
public class RetWSI2RecherchePointRelaisHoraires
    extends Ret
{

    @XmlElement(name = "ListePR")
    protected ArrayOfRetWSI2SubPointRelaisHoraires listePR;

    /**
     * Gets the value of the listePR property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetWSI2SubPointRelaisHoraires }
     *     
     */
    public ArrayOfRetWSI2SubPointRelaisHoraires getListePR() {
        return listePR;
    }

    /**
     * Sets the value of the listePR property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetWSI2SubPointRelaisHoraires }
     *     
     */
    public void setListePR(ArrayOfRetWSI2SubPointRelaisHoraires value) {
        this.listePR = value;
    }

}
