
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeQueueModifyAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeQueueModifyAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="Requeue"/>
 *     &lt;enumeration value="Move"/>
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Unlock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeQueueModifyAction")
@XmlEnum
public enum TypeQueueModifyAction {

    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Requeue")
    REQUEUE("Requeue"),
    @XmlEnumValue("Move")
    MOVE("Move"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Unlock")
    UNLOCK("Unlock");
    private final String value;

    TypeQueueModifyAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeQueueModifyAction fromValue(String v) {
        for (TypeQueueModifyAction c: TypeQueueModifyAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
