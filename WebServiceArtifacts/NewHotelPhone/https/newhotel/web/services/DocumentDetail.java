
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentDetail.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentDetail">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Payment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentDetail")
@XmlEnum
public enum DocumentDetail {

    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment");
    private final String value;

    DocumentDetail(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentDetail fromValue(String v) {
        for (DocumentDetail c: DocumentDetail.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
