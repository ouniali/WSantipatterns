
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}OtherAsset"/>
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
    "otherAsset"
})
@XmlRootElement(name = "OtherAssetCapG")
public class OtherAssetCapG {

    @XmlElement(name = "OtherAsset", required = true)
    protected OtherAsset otherAsset;

    /**
     * Gets the value of the otherAsset property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAsset }
     *     
     */
    public OtherAsset getOtherAsset() {
        return otherAsset;
    }

    /**
     * Sets the value of the otherAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAsset }
     *     
     */
    public void setOtherAsset(OtherAsset value) {
        this.otherAsset = value;
    }

}
