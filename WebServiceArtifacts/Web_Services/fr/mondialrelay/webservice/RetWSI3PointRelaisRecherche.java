
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI3_PointRelais_Recherche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI3_PointRelais_Recherche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="PointsRelais" type="{http://www.mondialrelay.fr/webservice/}ArrayOfPointRelais_Details" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI3_PointRelais_Recherche", propOrder = {
    "pointsRelais"
})
public class RetWSI3PointRelaisRecherche
    extends Ret
{

    @XmlElement(name = "PointsRelais")
    protected ArrayOfPointRelaisDetails pointsRelais;

    /**
     * Gets the value of the pointsRelais property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPointRelaisDetails }
     *     
     */
    public ArrayOfPointRelaisDetails getPointsRelais() {
        return pointsRelais;
    }

    /**
     * Sets the value of the pointsRelais property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPointRelaisDetails }
     *     
     */
    public void setPointsRelais(ArrayOfPointRelaisDetails value) {
        this.pointsRelais = value;
    }

}
