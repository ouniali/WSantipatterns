
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for similarityScoreLists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="similarityScoreLists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreList" type="{http://services.conceptprofilemining.lumc.nl/}scoreListImpl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "similarityScoreLists", propOrder = {
    "scoreList"
})
public class SimilarityScoreLists {

    @XmlElement(name = "ScoreList")
    protected List<ScoreListImpl> scoreList;

    /**
     * Gets the value of the scoreList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreListImpl }
     * 
     * 
     */
    public List<ScoreListImpl> getScoreList() {
        if (scoreList == null) {
            scoreList = new ArrayList<ScoreListImpl>();
        }
        return this.scoreList;
    }

}
