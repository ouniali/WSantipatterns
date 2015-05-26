
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseRsp;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirRefundBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TCRRefundBundle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airRefundBundle",
    "tcrRefundBundle"
})
@XmlRootElement(name = "AirRefundQuoteRsp")
public class AirRefundQuoteRsp
    extends BaseRsp
{

    @XmlElement(name = "AirRefundBundle")
    protected List<AirRefundBundle> airRefundBundle;
    @XmlElement(name = "TCRRefundBundle")
    protected List<TCRRefundBundle> tcrRefundBundle;

    /**
     * Gets the value of the airRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRefundBundle }
     * 
     * 
     */
    public List<AirRefundBundle> getAirRefundBundle() {
        if (airRefundBundle == null) {
            airRefundBundle = new ArrayList<AirRefundBundle>();
        }
        return this.airRefundBundle;
    }

    /**
     * Gets the value of the tcrRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRRefundBundle }
     * 
     * 
     */
    public List<TCRRefundBundle> getTCRRefundBundle() {
        if (tcrRefundBundle == null) {
            tcrRefundBundle = new ArrayList<TCRRefundBundle>();
        }
        return this.tcrRefundBundle;
    }

}
