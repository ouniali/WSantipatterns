
package org.datacontract.schemas._2004._07.ukmwebapicommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UKMResultState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UKMResultState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Successful"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UKMResultState", namespace = "http://schemas.datacontract.org/2004/07/UKMWebAPICommon.WebResponses")
@XmlEnum
public enum UKMResultState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful");
    private final String value;

    UKMResultState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UKMResultState fromValue(String v) {
        for (UKMResultState c: UKMResultState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
