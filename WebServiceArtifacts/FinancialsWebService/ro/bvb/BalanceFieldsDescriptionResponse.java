
package ro.bvb;

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
 *         &lt;element name="BalanceFieldsDescriptionResult" type="{http://www.bvb.ro}ArrayOfBalanceField" minOccurs="0"/>
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
    "balanceFieldsDescriptionResult"
})
@XmlRootElement(name = "BalanceFieldsDescriptionResponse")
public class BalanceFieldsDescriptionResponse {

    @XmlElement(name = "BalanceFieldsDescriptionResult")
    protected ArrayOfBalanceField balanceFieldsDescriptionResult;

    /**
     * Gets the value of the balanceFieldsDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBalanceField }
     *     
     */
    public ArrayOfBalanceField getBalanceFieldsDescriptionResult() {
        return balanceFieldsDescriptionResult;
    }

    /**
     * Sets the value of the balanceFieldsDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBalanceField }
     *     
     */
    public void setBalanceFieldsDescriptionResult(ArrayOfBalanceField value) {
        this.balanceFieldsDescriptionResult = value;
    }

}
