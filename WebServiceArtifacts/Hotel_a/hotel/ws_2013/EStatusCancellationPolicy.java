
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eStatusCancellationPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eStatusCancellationPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllRoomsFound"/>
 *     &lt;enumeration value="NoRoomsAvailable"/>
 *     &lt;enumeration value="HotelNotFound"/>
 *     &lt;enumeration value="TimeOut"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eStatusCancellationPolicy")
@XmlEnum
public enum EStatusCancellationPolicy {

    @XmlEnumValue("AllRoomsFound")
    ALL_ROOMS_FOUND("AllRoomsFound"),
    @XmlEnumValue("NoRoomsAvailable")
    NO_ROOMS_AVAILABLE("NoRoomsAvailable"),
    @XmlEnumValue("HotelNotFound")
    HOTEL_NOT_FOUND("HotelNotFound"),
    @XmlEnumValue("TimeOut")
    TIME_OUT("TimeOut");
    private final String value;

    EStatusCancellationPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EStatusCancellationPolicy fromValue(String v) {
        for (EStatusCancellationPolicy c: EStatusCancellationPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
