
package jp.ac.u_tokyo.h.dis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByomeiSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByomeiSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalResultsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultElements" type="{http://www.dis.h.u-tokyo.ac.jp/webservices/}ArrayOfResultElement" minOccurs="0"/>
 *         &lt;element name="searchQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByomeiSearchResult", propOrder = {
    "searchComments",
    "totalResultsCount",
    "resultElements",
    "searchQuery",
    "startIndex",
    "endIndex",
    "searchTime"
})
public class ByomeiSearchResult {

    protected String searchComments;
    protected int totalResultsCount;
    protected ArrayOfResultElement resultElements;
    protected String searchQuery;
    protected int startIndex;
    protected int endIndex;
    protected float searchTime;

    /**
     * Gets the value of the searchComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchComments() {
        return searchComments;
    }

    /**
     * Sets the value of the searchComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchComments(String value) {
        this.searchComments = value;
    }

    /**
     * Gets the value of the totalResultsCount property.
     * 
     */
    public int getTotalResultsCount() {
        return totalResultsCount;
    }

    /**
     * Sets the value of the totalResultsCount property.
     * 
     */
    public void setTotalResultsCount(int value) {
        this.totalResultsCount = value;
    }

    /**
     * Gets the value of the resultElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultElement }
     *     
     */
    public ArrayOfResultElement getResultElements() {
        return resultElements;
    }

    /**
     * Sets the value of the resultElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultElement }
     *     
     */
    public void setResultElements(ArrayOfResultElement value) {
        this.resultElements = value;
    }

    /**
     * Gets the value of the searchQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Sets the value of the searchQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchQuery(String value) {
        this.searchQuery = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the endIndex property.
     * 
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     * 
     */
    public void setEndIndex(int value) {
        this.endIndex = value;
    }

    /**
     * Gets the value of the searchTime property.
     * 
     */
    public float getSearchTime() {
        return searchTime;
    }

    /**
     * Sets the value of the searchTime property.
     * 
     */
    public void setSearchTime(float value) {
        this.searchTime = value;
    }

}
