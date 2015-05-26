
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AwaitingCommitteeResponse"/>
 *     &lt;enumeration value="ApprovedByCommittee"/>
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="InPress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicationStatus")
@XmlEnum
public enum PublicationStatus {

    @XmlEnumValue("AwaitingCommitteeResponse")
    AWAITING_COMMITTEE_RESPONSE("AwaitingCommitteeResponse"),
    @XmlEnumValue("ApprovedByCommittee")
    APPROVED_BY_COMMITTEE("ApprovedByCommittee"),
    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("InPress")
    IN_PRESS("InPress");
    private final String value;

    PublicationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicationStatus fromValue(String v) {
        for (PublicationStatus c: PublicationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
