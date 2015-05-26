
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.returnchangeoutboundticketsdata.xsd.ChangeOutboundTicketsData;
import com.inforcyl.services.xsd.InputMethods;


/**
 * <p>Java class for ReturnChangeOutboundTicketsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnChangeOutboundTicketsData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}InputMethods">
 *       &lt;sequence>
 *         &lt;element name="changeOutBoundTickets" type="{http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}ChangeOutboundTicketsData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnChangeOutboundTicketsData", propOrder = {
    "changeOutBoundTickets"
})
public class ReturnChangeOutboundTicketsData
    extends InputMethods
{

    @XmlElement(nillable = true)
    protected List<ChangeOutboundTicketsData> changeOutBoundTickets;

    /**
     * Gets the value of the changeOutBoundTickets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeOutBoundTickets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeOutBoundTickets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeOutboundTicketsData }
     * 
     * 
     */
    public List<ChangeOutboundTicketsData> getChangeOutBoundTickets() {
        if (changeOutBoundTickets == null) {
            changeOutBoundTickets = new ArrayList<ChangeOutboundTicketsData>();
        }
        return this.changeOutBoundTickets;
    }

}
