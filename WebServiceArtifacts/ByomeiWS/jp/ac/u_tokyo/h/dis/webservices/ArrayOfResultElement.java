
package jp.ac.u_tokyo.h.dis.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResultElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResultElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultElement" type="{http://www.dis.h.u-tokyo.ac.jp/webservices/}resultElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResultElement", propOrder = {
    "resultElement"
})
public class ArrayOfResultElement {

    @XmlElement(nillable = true)
    protected List<ResultElement> resultElement;

    /**
     * Gets the value of the resultElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultElement }
     * 
     * 
     */
    public List<ResultElement> getResultElement() {
        if (resultElement == null) {
            resultElement = new ArrayList<ResultElement>();
        }
        return this.resultElement;
    }

}
