
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPassageiroDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPassageiroDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassageiroDocumento" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}PassageiroDocumento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPassageiroDocumento", propOrder = {
    "passageiroDocumento"
})
public class ArrayOfPassageiroDocumento {

    @XmlElement(name = "PassageiroDocumento", nillable = true)
    protected List<PassageiroDocumento> passageiroDocumento;

    /**
     * Gets the value of the passageiroDocumento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passageiroDocumento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassageiroDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassageiroDocumento }
     * 
     * 
     */
    public List<PassageiroDocumento> getPassageiroDocumento() {
        if (passageiroDocumento == null) {
            passageiroDocumento = new ArrayList<PassageiroDocumento>();
        }
        return this.passageiroDocumento;
    }

}
