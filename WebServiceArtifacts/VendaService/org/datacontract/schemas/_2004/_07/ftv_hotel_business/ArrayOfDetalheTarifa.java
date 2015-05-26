
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDetalheTarifa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDetalheTarifa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetalheTarifa" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}DetalheTarifa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDetalheTarifa", propOrder = {
    "detalheTarifa"
})
public class ArrayOfDetalheTarifa {

    @XmlElement(name = "DetalheTarifa", nillable = true)
    protected List<DetalheTarifa> detalheTarifa;

    /**
     * Gets the value of the detalheTarifa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalheTarifa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalheTarifa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalheTarifa }
     * 
     * 
     */
    public List<DetalheTarifa> getDetalheTarifa() {
        if (detalheTarifa == null) {
            detalheTarifa = new ArrayList<DetalheTarifa>();
        }
        return this.detalheTarifa;
    }

}
