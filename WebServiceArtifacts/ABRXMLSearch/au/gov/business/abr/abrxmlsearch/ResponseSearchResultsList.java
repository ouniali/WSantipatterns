
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseSearchResultsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseSearchResultsList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBody">
 *       &lt;sequence>
 *         &lt;element name="numberOfRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exceedsMaximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchResultsRecord" type="{http://abr.business.gov.au/ABRXMLSearch/}SearchResultsRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseSearchResultsList", propOrder = {
    "numberOfRecords",
    "exceedsMaximum",
    "searchResultsRecord"
})
public class ResponseSearchResultsList
    extends ResponseBody
{

    protected int numberOfRecords;
    protected String exceedsMaximum;
    protected List<SearchResultsRecord> searchResultsRecord;

    /**
     * Gets the value of the numberOfRecords property.
     * 
     */
    public int getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     * 
     */
    public void setNumberOfRecords(int value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the exceedsMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceedsMaximum() {
        return exceedsMaximum;
    }

    /**
     * Sets the value of the exceedsMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceedsMaximum(String value) {
        this.exceedsMaximum = value;
    }

    /**
     * Gets the value of the searchResultsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultsRecord }
     * 
     * 
     */
    public List<SearchResultsRecord> getSearchResultsRecord() {
        if (searchResultsRecord == null) {
            searchResultsRecord = new ArrayList<SearchResultsRecord>();
        }
        return this.searchResultsRecord;
    }

}
