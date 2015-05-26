
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseABNList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseABNList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBody">
 *       &lt;sequence>
 *         &lt;element name="numberOfRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="abn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseABNList", propOrder = {
    "numberOfRecords",
    "abn"
})
public class ResponseABNList
    extends ResponseBody
{

    protected int numberOfRecords;
    protected List<String> abn;

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
     * Gets the value of the abn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAbn() {
        if (abn == null) {
            abn = new ArrayList<String>();
        }
        return this.abn;
    }

}
