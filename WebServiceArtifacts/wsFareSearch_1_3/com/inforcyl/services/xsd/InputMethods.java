
package com.inforcyl.services.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.travellerdata.xsd.Discounts;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.xsd.TravellerData;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.returnchangeoutboundticketsdata.xsd.ChangeOutboundTicketsData;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.AmendmentOutwardData;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.FareData;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.Passengers;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.Payment;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.Restriction;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.ReturnChangeOutboundTicketsData;
import com.inforcyl.services.v_1_3.faresearch.input.xsd.FareSearchInput;


/**
 * <p>Java class for InputMethods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputMethods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputMethods")
@XmlSeeAlso({
    ChangeOutboundTicketsData.class,
    FareSearchInput.class,
    Restriction.class,
    Payment.class,
    Passengers.class,
    AmendmentOutwardData.class,
    FareData.class,
    ReturnChangeOutboundTicketsData.class,
    TravellerData.class,
    Discounts.class
})
public class InputMethods {


}
