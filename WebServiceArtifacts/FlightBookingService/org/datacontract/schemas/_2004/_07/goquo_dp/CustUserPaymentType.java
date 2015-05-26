
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustUserPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustUserPaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PTB"/>
 *     &lt;enumeration value="BTP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustUserPaymentType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils")
@XmlEnum
public enum CustUserPaymentType {

    PTB,
    BTP;

    public String value() {
        return name();
    }

    public static CustUserPaymentType fromValue(String v) {
        return valueOf(v);
    }

}
