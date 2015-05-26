
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DepreciationDetail"/>
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
    "depreciationDetail"
})
@XmlRootElement(name = "Rate40")
public class Rate40 {

    @XmlElement(name = "DepreciationDetail", required = true)
    protected DepreciationDetail depreciationDetail;

    /**
     * Gets the value of the depreciationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DepreciationDetail }
     *     
     */
    public DepreciationDetail getDepreciationDetail() {
        return depreciationDetail;
    }

    /**
     * Sets the value of the depreciationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepreciationDetail }
     *     
     */
    public void setDepreciationDetail(DepreciationDetail value) {
        this.depreciationDetail = value;
    }

}
