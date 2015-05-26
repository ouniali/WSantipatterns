
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="PostFailed"/>
 *     &lt;enumeration value="DocDeleted"/>
 *     &lt;enumeration value="DocVoided"/>
 *     &lt;enumeration value="AdjustmentCancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelCode")
@XmlEnum
public enum CancelCode {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("PostFailed")
    POST_FAILED("PostFailed"),
    @XmlEnumValue("DocDeleted")
    DOC_DELETED("DocDeleted"),
    @XmlEnumValue("DocVoided")
    DOC_VOIDED("DocVoided"),
    @XmlEnumValue("AdjustmentCancelled")
    ADJUSTMENT_CANCELLED("AdjustmentCancelled");
    private final String value;

    CancelCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelCode fromValue(String v) {
        for (CancelCode c: CancelCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
