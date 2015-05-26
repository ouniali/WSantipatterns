
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimilarConceptProfiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimilarConceptProfiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutoffValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matchConceptProfileList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryConceptProfileList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimilarConceptProfiles", propOrder = {
    "cutoffValue",
    "matchConceptProfileList",
    "queryConceptProfileList"
})
public class GetSimilarConceptProfiles {

    protected int cutoffValue;
    protected String matchConceptProfileList;
    protected String queryConceptProfileList;

    /**
     * Gets the value of the cutoffValue property.
     * 
     */
    public int getCutoffValue() {
        return cutoffValue;
    }

    /**
     * Sets the value of the cutoffValue property.
     * 
     */
    public void setCutoffValue(int value) {
        this.cutoffValue = value;
    }

    /**
     * Gets the value of the matchConceptProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchConceptProfileList() {
        return matchConceptProfileList;
    }

    /**
     * Sets the value of the matchConceptProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchConceptProfileList(String value) {
        this.matchConceptProfileList = value;
    }

    /**
     * Gets the value of the queryConceptProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryConceptProfileList() {
        return queryConceptProfileList;
    }

    /**
     * Sets the value of the queryConceptProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryConceptProfileList(String value) {
        this.queryConceptProfileList = value;
    }

}
