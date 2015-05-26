
package org.datacontract.schemas._2004._07.brokerplatform_core_model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipPersoana.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipPersoana">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fizica"/>
 *     &lt;enumeration value="Juridica"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipPersoana", namespace = "http://schemas.datacontract.org/2004/07/BrokerPlatform.Core.Model.Common")
@XmlEnum
public enum TipPersoana {

    @XmlEnumValue("Fizica")
    FIZICA("Fizica"),
    @XmlEnumValue("Juridica")
    JURIDICA("Juridica");
    private final String value;

    TipPersoana(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipPersoana fromValue(String v) {
        for (TipPersoana c: TipPersoana.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
