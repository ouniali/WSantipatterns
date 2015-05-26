
package ro.platforma_broker.ws.travel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProdusTravel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProdusTravel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdusTravel" type="{http://www.platforma-broker.ro/ws/travel/types/}ProdusTravel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProdusTravel", propOrder = {
    "produsTravel"
})
public class ArrayOfProdusTravel {

    @XmlElement(name = "ProdusTravel")
    @XmlSchemaType(name = "string")
    protected List<ProdusTravel> produsTravel;

    /**
     * Gets the value of the produsTravel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produsTravel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdusTravel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdusTravel }
     * 
     * 
     */
    public List<ProdusTravel> getProdusTravel() {
        if (produsTravel == null) {
            produsTravel = new ArrayList<ProdusTravel>();
        }
        return this.produsTravel;
    }

}
