
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="FE"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="WH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalIndicatorType")
@XmlEnum
public enum GlobalIndicatorType {

    AP,
    AT,
    CT,
    DO,
    EH,
    FE,
    PA,
    PN,
    PO,
    RU,
    RW,
    SA,
    TS,
    WH;

    public String value() {
        return name();
    }

    public static GlobalIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
