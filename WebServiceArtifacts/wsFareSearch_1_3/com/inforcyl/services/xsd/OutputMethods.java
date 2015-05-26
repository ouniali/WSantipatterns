
package com.inforcyl.services.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.travellerdata.xsd.Details;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.faredata.xsd.TravellerData;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.xsd.FareData;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.BookingCharge;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.CardTypeCharge;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Distribution;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.InsuranceData;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Insurances;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Payment;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Types;
import com.inforcyl.services.v_1_3.faresearch.output.xsd.FareSearchOutput;


/**
 * <p>Java class for OutputMethods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputMethods">
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
@XmlType(name = "OutputMethods")
@XmlSeeAlso({
    TravellerData.class,
    FareData.class,
    FareSearchOutput.class,
    Types.class,
    Payment.class,
    InsuranceData.class,
    Insurances.class,
    BookingCharge.class,
    CardTypeCharge.class,
    Distribution.class,
    Details.class
})
public class OutputMethods {


}
