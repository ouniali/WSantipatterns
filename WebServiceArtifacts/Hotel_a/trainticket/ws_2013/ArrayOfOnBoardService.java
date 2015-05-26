
package trainticket.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOnBoardService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOnBoardService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnBoardService" type="{WS_2013.TrainTicket}OnBoardService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOnBoardService", propOrder = {
    "onBoardService"
})
public class ArrayOfOnBoardService {

    @XmlElement(name = "OnBoardService", nillable = true)
    protected List<OnBoardService> onBoardService;

    /**
     * Gets the value of the onBoardService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onBoardService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnBoardService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnBoardService }
     * 
     * 
     */
    public List<OnBoardService> getOnBoardService() {
        if (onBoardService == null) {
            onBoardService = new ArrayList<OnBoardService>();
        }
        return this.onBoardService;
    }

}
