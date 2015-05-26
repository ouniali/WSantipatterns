
package fr.u_strasbg.vizier.xml.votable_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TD" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}TD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TR", propOrder = {
    "td"
})
public class TR {

    @XmlElement(name = "TD")
    protected List<TD> td;

    /**
     * Gets the value of the td property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the td property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TD }
     * 
     * 
     */
    public List<TD> getTD() {
        if (td == null) {
            td = new ArrayList<TD>();
        }
        return this.td;
    }

}
