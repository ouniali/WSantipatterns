
package hotel.ws_2013;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.cangooroo.SearchFilterInformationResponse;


/**
 * <p>Java class for SearchResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompleteSearchToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalTime" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SearchCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumberOfTotalResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfResultsAfterFilter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfResultsOnThisResp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchFilterInformation" type="{Cangooroo.WS_2013.Hotel}SearchFilterInformationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultBase", propOrder = {
    "token",
    "completeSearchToken",
    "totalTime",
    "searchCompleted",
    "numberOfTotalResults",
    "numberOfResultsAfterFilter",
    "numberOfResultsOnThisResp",
    "searchFilterInformation"
})
@XmlSeeAlso({
    SearchResultBaseB.class
})
public abstract class SearchResultBase {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "CompleteSearchToken")
    protected String completeSearchToken;
    @XmlElement(name = "TotalTime", required = true)
    protected BigDecimal totalTime;
    @XmlElement(name = "SearchCompleted")
    protected boolean searchCompleted;
    @XmlElement(name = "NumberOfTotalResults")
    protected int numberOfTotalResults;
    @XmlElement(name = "NumberOfResultsAfterFilter")
    protected int numberOfResultsAfterFilter;
    @XmlElement(name = "NumberOfResultsOnThisResp")
    protected int numberOfResultsOnThisResp;
    @XmlElement(name = "SearchFilterInformation")
    protected SearchFilterInformationResponse searchFilterInformation;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the completeSearchToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteSearchToken() {
        return completeSearchToken;
    }

    /**
     * Sets the value of the completeSearchToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteSearchToken(String value) {
        this.completeSearchToken = value;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTime(BigDecimal value) {
        this.totalTime = value;
    }

    /**
     * Gets the value of the searchCompleted property.
     * 
     */
    public boolean isSearchCompleted() {
        return searchCompleted;
    }

    /**
     * Sets the value of the searchCompleted property.
     * 
     */
    public void setSearchCompleted(boolean value) {
        this.searchCompleted = value;
    }

    /**
     * Gets the value of the numberOfTotalResults property.
     * 
     */
    public int getNumberOfTotalResults() {
        return numberOfTotalResults;
    }

    /**
     * Sets the value of the numberOfTotalResults property.
     * 
     */
    public void setNumberOfTotalResults(int value) {
        this.numberOfTotalResults = value;
    }

    /**
     * Gets the value of the numberOfResultsAfterFilter property.
     * 
     */
    public int getNumberOfResultsAfterFilter() {
        return numberOfResultsAfterFilter;
    }

    /**
     * Sets the value of the numberOfResultsAfterFilter property.
     * 
     */
    public void setNumberOfResultsAfterFilter(int value) {
        this.numberOfResultsAfterFilter = value;
    }

    /**
     * Gets the value of the numberOfResultsOnThisResp property.
     * 
     */
    public int getNumberOfResultsOnThisResp() {
        return numberOfResultsOnThisResp;
    }

    /**
     * Sets the value of the numberOfResultsOnThisResp property.
     * 
     */
    public void setNumberOfResultsOnThisResp(int value) {
        this.numberOfResultsOnThisResp = value;
    }

    /**
     * Gets the value of the searchFilterInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFilterInformationResponse }
     *     
     */
    public SearchFilterInformationResponse getSearchFilterInformation() {
        return searchFilterInformation;
    }

    /**
     * Sets the value of the searchFilterInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFilterInformationResponse }
     *     
     */
    public void setSearchFilterInformation(SearchFilterInformationResponse value) {
        this.searchFilterInformation = value;
    }

}
