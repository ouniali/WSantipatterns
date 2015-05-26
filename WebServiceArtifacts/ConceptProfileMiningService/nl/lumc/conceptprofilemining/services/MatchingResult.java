
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchConceptProfileList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MatchConceptProfile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SimilarityScoreLists" type="{http://services.conceptprofilemining.lumc.nl/}similarityScoreLists" minOccurs="0"/>
 *         &lt;element name="SummedSimilarityScoreList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SummedSimilarityScore" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchingResult", propOrder = {
    "matchConceptProfileList",
    "similarityScoreLists",
    "summedSimilarityScoreList"
})
public class MatchingResult {

    @XmlElement(name = "MatchConceptProfileList")
    protected MatchingResult.MatchConceptProfileList matchConceptProfileList;
    @XmlElement(name = "SimilarityScoreLists")
    protected SimilarityScoreLists similarityScoreLists;
    @XmlElement(name = "SummedSimilarityScoreList")
    protected MatchingResult.SummedSimilarityScoreList summedSimilarityScoreList;

    /**
     * Gets the value of the matchConceptProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingResult.MatchConceptProfileList }
     *     
     */
    public MatchingResult.MatchConceptProfileList getMatchConceptProfileList() {
        return matchConceptProfileList;
    }

    /**
     * Sets the value of the matchConceptProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingResult.MatchConceptProfileList }
     *     
     */
    public void setMatchConceptProfileList(MatchingResult.MatchConceptProfileList value) {
        this.matchConceptProfileList = value;
    }

    /**
     * Gets the value of the similarityScoreLists property.
     * 
     * @return
     *     possible object is
     *     {@link SimilarityScoreLists }
     *     
     */
    public SimilarityScoreLists getSimilarityScoreLists() {
        return similarityScoreLists;
    }

    /**
     * Sets the value of the similarityScoreLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarityScoreLists }
     *     
     */
    public void setSimilarityScoreLists(SimilarityScoreLists value) {
        this.similarityScoreLists = value;
    }

    /**
     * Gets the value of the summedSimilarityScoreList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingResult.SummedSimilarityScoreList }
     *     
     */
    public MatchingResult.SummedSimilarityScoreList getSummedSimilarityScoreList() {
        return summedSimilarityScoreList;
    }

    /**
     * Sets the value of the summedSimilarityScoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingResult.SummedSimilarityScoreList }
     *     
     */
    public void setSummedSimilarityScoreList(MatchingResult.SummedSimilarityScoreList value) {
        this.summedSimilarityScoreList = value;
    }


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
     *         &lt;element name="MatchConceptProfile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "matchConceptProfile"
    })
    public static class MatchConceptProfileList {

        @XmlElement(name = "MatchConceptProfile")
        protected List<String> matchConceptProfile;

        /**
         * Gets the value of the matchConceptProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matchConceptProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatchConceptProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMatchConceptProfile() {
            if (matchConceptProfile == null) {
                matchConceptProfile = new ArrayList<String>();
            }
            return this.matchConceptProfile;
        }

    }


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
     *         &lt;element name="SummedSimilarityScore" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
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
        "summedSimilarityScore"
    })
    public static class SummedSimilarityScoreList {

        @XmlElement(name = "SummedSimilarityScore", type = Double.class)
        protected List<Double> summedSimilarityScore;

        /**
         * Gets the value of the summedSimilarityScore property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the summedSimilarityScore property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSummedSimilarityScore().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getSummedSimilarityScore() {
            if (summedSimilarityScore == null) {
                summedSimilarityScore = new ArrayList<Double>();
            }
            return this.summedSimilarityScore;
        }

    }

}
