
package ro.bvb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSymbolBalanceTypeIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSymbolBalanceTypeIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SymbolBalanceTypeIdentification" type="{http://www.bvb.ro}SymbolBalanceTypeIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSymbolBalanceTypeIdentification", propOrder = {
    "symbolBalanceTypeIdentification"
})
public class ArrayOfSymbolBalanceTypeIdentification {

    @XmlElement(name = "SymbolBalanceTypeIdentification", nillable = true)
    protected List<SymbolBalanceTypeIdentification> symbolBalanceTypeIdentification;

    /**
     * Gets the value of the symbolBalanceTypeIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbolBalanceTypeIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbolBalanceTypeIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymbolBalanceTypeIdentification }
     * 
     * 
     */
    public List<SymbolBalanceTypeIdentification> getSymbolBalanceTypeIdentification() {
        if (symbolBalanceTypeIdentification == null) {
            symbolBalanceTypeIdentification = new ArrayList<SymbolBalanceTypeIdentification>();
        }
        return this.symbolBalanceTypeIdentification;
    }

}
