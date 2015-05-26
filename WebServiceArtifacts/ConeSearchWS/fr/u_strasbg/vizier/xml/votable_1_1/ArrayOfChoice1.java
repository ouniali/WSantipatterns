
package fr.u_strasbg.vizier.xml.votable_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PARAM" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}PARAM" minOccurs="0"/>
 *         &lt;element name="COOSYS" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}COOSYS" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice1", propOrder = {
    "paramOrCOOSYS"
})
public class ArrayOfChoice1 {

    @XmlElements({
        @XmlElement(name = "PARAM", type = PARAM.class),
        @XmlElement(name = "COOSYS", type = COOSYS.class)
    })
    protected List<Object> paramOrCOOSYS;

    /**
     * Gets the value of the paramOrCOOSYS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramOrCOOSYS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARAMOrCOOSYS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAM }
     * {@link COOSYS }
     * 
     * 
     */
    public List<Object> getPARAMOrCOOSYS() {
        if (paramOrCOOSYS == null) {
            paramOrCOOSYS = new ArrayList<Object>();
        }
        return this.paramOrCOOSYS;
    }

}
