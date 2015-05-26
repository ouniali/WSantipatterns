
package stadiswebservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carDataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stadiswebservice/}answer">
 *       &lt;sequence>
 *         &lt;element name="carData" type="{http://stadiswebservice/}carInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cityList" type="{http://stadiswebservice/}locationAdress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carDataResponse", propOrder = {
    "carData",
    "cityList"
})
public class CarDataResponse
    extends Answer
{

    @XmlElement(nillable = true)
    protected List<CarInformation> carData;
    @XmlElement(nillable = true)
    protected List<LocationAdress> cityList;

    /**
     * Gets the value of the carData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarInformation }
     * 
     * 
     */
    public List<CarInformation> getCarData() {
        if (carData == null) {
            carData = new ArrayList<CarInformation>();
        }
        return this.carData;
    }

    /**
     * Gets the value of the cityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationAdress }
     * 
     * 
     */
    public List<LocationAdress> getCityList() {
        if (cityList == null) {
            cityList = new ArrayList<LocationAdress>();
        }
        return this.cityList;
    }

}
