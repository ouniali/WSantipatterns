
package com.unisys.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDailyForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDailyForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DailyForecast" type="{http://www.unisys.com/WebServices/}DailyForecast" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDailyForecast", propOrder = {
    "dailyForecast"
})
public class ArrayOfDailyForecast {

    @XmlElement(name = "DailyForecast", nillable = true)
    protected List<DailyForecast> dailyForecast;

    /**
     * Gets the value of the dailyForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailyForecast }
     * 
     * 
     */
    public List<DailyForecast> getDailyForecast() {
        if (dailyForecast == null) {
            dailyForecast = new ArrayList<DailyForecast>();
        }
        return this.dailyForecast;
    }

}
