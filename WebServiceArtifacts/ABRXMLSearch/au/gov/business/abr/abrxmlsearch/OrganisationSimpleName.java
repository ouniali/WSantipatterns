
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationSimpleName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationSimpleName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}Organisation">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isCurrentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationSimpleName", propOrder = {
    "score",
    "isCurrentIndicator"
})
public class OrganisationSimpleName
    extends Organisation
{

    protected int score;
    protected String isCurrentIndicator;

    /**
     * Gets the value of the score property.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

    /**
     * Gets the value of the isCurrentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCurrentIndicator() {
        return isCurrentIndicator;
    }

    /**
     * Sets the value of the isCurrentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCurrentIndicator(String value) {
        this.isCurrentIndicator = value;
    }

}
