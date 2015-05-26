
package https.ws_esortcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BranchDetailsResult" type="{https://ws.esortcode.com}BranchDetail" minOccurs="0"/>
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
    "branchDetailsResult"
})
@XmlRootElement(name = "BranchDetailsResponse")
public class BranchDetailsResponse {

    @XmlElement(name = "BranchDetailsResult")
    protected BranchDetail branchDetailsResult;

    /**
     * Gets the value of the branchDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link BranchDetail }
     *     
     */
    public BranchDetail getBranchDetailsResult() {
        return branchDetailsResult;
    }

    /**
     * Sets the value of the branchDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchDetail }
     *     
     */
    public void setBranchDetailsResult(BranchDetail value) {
        this.branchDetailsResult = value;
    }

}
