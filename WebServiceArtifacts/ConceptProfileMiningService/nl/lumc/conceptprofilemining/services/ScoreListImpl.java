
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scoreListImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scoreListImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryScoreTupleList" type="{http://services.conceptprofilemining.lumc.nl/}stringDoubleTuple" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conceptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scoreListImpl", propOrder = {
    "queryScoreTupleList",
    "conceptId",
    "sum"
})
public class ScoreListImpl {

    @XmlElement(name = "QueryScoreTupleList")
    protected List<StringDoubleTuple> queryScoreTupleList;
    protected String conceptId;
    protected double sum;

    /**
     * Gets the value of the queryScoreTupleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryScoreTupleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryScoreTupleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDoubleTuple }
     * 
     * 
     */
    public List<StringDoubleTuple> getQueryScoreTupleList() {
        if (queryScoreTupleList == null) {
            queryScoreTupleList = new ArrayList<StringDoubleTuple>();
        }
        return this.queryScoreTupleList;
    }

    /**
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptId(String value) {
        this.conceptId = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     */
    public double getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     */
    public void setSum(double value) {
        this.sum = value;
    }

}
