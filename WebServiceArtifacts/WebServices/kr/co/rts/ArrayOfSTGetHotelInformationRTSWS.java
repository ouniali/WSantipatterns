
package kr.co.rts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfST_GetHotelInformationRTSWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfST_GetHotelInformationRTSWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ST_GetHotelInformationRTSWS" type="{http://www.rts.co.kr/}ST_GetHotelInformationRTSWS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfST_GetHotelInformationRTSWS", propOrder = {
    "stGetHotelInformationRTSWS"
})
public class ArrayOfSTGetHotelInformationRTSWS {

    @XmlElement(name = "ST_GetHotelInformationRTSWS")
    protected List<STGetHotelInformationRTSWS> stGetHotelInformationRTSWS;

    /**
     * Gets the value of the stGetHotelInformationRTSWS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stGetHotelInformationRTSWS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTGetHotelInformationRTSWS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STGetHotelInformationRTSWS }
     * 
     * 
     */
    public List<STGetHotelInformationRTSWS> getSTGetHotelInformationRTSWS() {
        if (stGetHotelInformationRTSWS == null) {
            stGetHotelInformationRTSWS = new ArrayList<STGetHotelInformationRTSWS>();
        }
        return this.stGetHotelInformationRTSWS;
    }

}
