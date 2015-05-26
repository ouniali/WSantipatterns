
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for habitacionesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="habitacionesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numAdl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numNin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numInf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edaNin" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "habitacionesType", propOrder = {
    "numAdl",
    "numNin",
    "numInf",
    "edaNin"
})
public class HabitacionesType {

    protected int numAdl;
    protected int numNin;
    protected int numInf;
    @XmlElement(nillable = true)
    protected List<Integer> edaNin;

    /**
     * Gets the value of the numAdl property.
     * 
     */
    public int getNumAdl() {
        return numAdl;
    }

    /**
     * Sets the value of the numAdl property.
     * 
     */
    public void setNumAdl(int value) {
        this.numAdl = value;
    }

    /**
     * Gets the value of the numNin property.
     * 
     */
    public int getNumNin() {
        return numNin;
    }

    /**
     * Sets the value of the numNin property.
     * 
     */
    public void setNumNin(int value) {
        this.numNin = value;
    }

    /**
     * Gets the value of the numInf property.
     * 
     */
    public int getNumInf() {
        return numInf;
    }

    /**
     * Sets the value of the numInf property.
     * 
     */
    public void setNumInf(int value) {
        this.numInf = value;
    }

    /**
     * Gets the value of the edaNin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edaNin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdaNin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEdaNin() {
        if (edaNin == null) {
            edaNin = new ArrayList<Integer>();
        }
        return this.edaNin;
    }

}
