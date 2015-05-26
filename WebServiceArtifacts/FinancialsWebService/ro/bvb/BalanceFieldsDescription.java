
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="BalanceType" type="{http://www.bvb.ro}BalanceTypeEnum"/>
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
    "balanceType"
})
@XmlRootElement(name = "BalanceFieldsDescription")
public class BalanceFieldsDescription {

    @XmlElement(name = "BalanceType", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceTypeEnum balanceType;

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTypeEnum }
     *     
     */
    public BalanceTypeEnum getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTypeEnum }
     *     
     */
    public void setBalanceType(BalanceTypeEnum value) {
        this.balanceType = value;
    }

}
