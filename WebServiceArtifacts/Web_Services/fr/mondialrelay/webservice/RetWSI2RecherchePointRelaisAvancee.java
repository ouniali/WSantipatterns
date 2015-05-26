
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI2_RecherchePointRelaisAvancee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RecherchePointRelaisAvancee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="ListePR" type="{http://www.mondialrelay.fr/webservice/}ArrayOfRet_WSI2_sub_PointRelaisAvancee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RecherchePointRelaisAvancee", propOrder = {
    "listePR"
})
public class RetWSI2RecherchePointRelaisAvancee
    extends Ret
{

    @XmlElement(name = "ListePR")
    protected ArrayOfRetWSI2SubPointRelaisAvancee listePR;

    /**
     * Gets the value of the listePR property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetWSI2SubPointRelaisAvancee }
     *     
     */
    public ArrayOfRetWSI2SubPointRelaisAvancee getListePR() {
        return listePR;
    }

    /**
     * Sets the value of the listePR property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetWSI2SubPointRelaisAvancee }
     *     
     */
    public void setListePR(ArrayOfRetWSI2SubPointRelaisAvancee value) {
        this.listePR = value;
    }

}
