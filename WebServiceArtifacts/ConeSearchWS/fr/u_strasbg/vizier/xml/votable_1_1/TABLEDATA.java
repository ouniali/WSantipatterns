
package fr.u_strasbg.vizier.xml.votable_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TABLEDATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TABLEDATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TR" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}TR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TABLEDATA", propOrder = {
    "tr"
})
public class TABLEDATA {

    @XmlElement(name = "TR")
    protected List<TR> tr;

    /**
     * Gets the value of the tr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TR }
     * 
     * 
     */
    public List<TR> getTR() {
        if (tr == null) {
            tr = new ArrayList<TR>();
        }
        return this.tr;
    }

}
