
package jp.yahooapis.im.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchKeywordIdeaValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchKeywordIdeaValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://im.yahooapis.jp/V4}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="searchKeywordIdea" type="{http://im.yahooapis.jp/V4}SearchKeywordIdea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchKeywordIdeaValues", propOrder = {
    "searchKeywordIdea"
})
public class SearchKeywordIdeaValues
    extends ReturnValue
{

    protected SearchKeywordIdea searchKeywordIdea;

    /**
     * Gets the value of the searchKeywordIdea property.
     * 
     * @return
     *     possible object is
     *     {@link SearchKeywordIdea }
     *     
     */
    public SearchKeywordIdea getSearchKeywordIdea() {
        return searchKeywordIdea;
    }

    /**
     * Sets the value of the searchKeywordIdea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchKeywordIdea }
     *     
     */
    public void setSearchKeywordIdea(SearchKeywordIdea value) {
        this.searchKeywordIdea = value;
    }

}
