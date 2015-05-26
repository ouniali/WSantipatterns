
package edu.jhu.pha.skyservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.u_strasbg.vizier.xml.votable_1_1.VOTABLE;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}ConeSearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coneSearchResult"
})
@XmlRootElement(name = "ConeSearchResponse")
public class ConeSearchResponse {

    @XmlElement(name = "ConeSearchResult", namespace = "http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd")
    protected VOTABLE coneSearchResult;

    /**
     * Gets the value of the coneSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link VOTABLE }
     *     
     */
    public VOTABLE getConeSearchResult() {
        return coneSearchResult;
    }

    /**
     * Sets the value of the coneSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOTABLE }
     *     
     */
    public void setConeSearchResult(VOTABLE value) {
        this.coneSearchResult = value;
    }

}
