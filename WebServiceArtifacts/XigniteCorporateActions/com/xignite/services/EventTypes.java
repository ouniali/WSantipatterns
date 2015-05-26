
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Acquisition"/>
 *     &lt;enumeration value="Defunct"/>
 *     &lt;enumeration value="Delist"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Merger"/>
 *     &lt;enumeration value="PendingDelisting"/>
 *     &lt;enumeration value="Relisted"/>
 *     &lt;enumeration value="SpinOff"/>
 *     &lt;enumeration value="Assimilation"/>
 *     &lt;enumeration value="Reorganization"/>
 *     &lt;enumeration value="Consolidation"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="ImprovedOffer"/>
 *     &lt;enumeration value="RepurchaseOffer"/>
 *     &lt;enumeration value="NominalAdjustment"/>
 *     &lt;enumeration value="DebtorChange"/>
 *     &lt;enumeration value="BasicDataChange"/>
 *     &lt;enumeration value="Split"/>
 *     &lt;enumeration value="Dividend"/>
 *     &lt;enumeration value="Payment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventTypes")
@XmlEnum
public enum EventTypes {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Acquisition")
    ACQUISITION("Acquisition"),
    @XmlEnumValue("Defunct")
    DEFUNCT("Defunct"),
    @XmlEnumValue("Delist")
    DELIST("Delist"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Merger")
    MERGER("Merger"),
    @XmlEnumValue("PendingDelisting")
    PENDING_DELISTING("PendingDelisting"),
    @XmlEnumValue("Relisted")
    RELISTED("Relisted"),
    @XmlEnumValue("SpinOff")
    SPIN_OFF("SpinOff"),
    @XmlEnumValue("Assimilation")
    ASSIMILATION("Assimilation"),
    @XmlEnumValue("Reorganization")
    REORGANIZATION("Reorganization"),
    @XmlEnumValue("Consolidation")
    CONSOLIDATION("Consolidation"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("ImprovedOffer")
    IMPROVED_OFFER("ImprovedOffer"),
    @XmlEnumValue("RepurchaseOffer")
    REPURCHASE_OFFER("RepurchaseOffer"),
    @XmlEnumValue("NominalAdjustment")
    NOMINAL_ADJUSTMENT("NominalAdjustment"),
    @XmlEnumValue("DebtorChange")
    DEBTOR_CHANGE("DebtorChange"),
    @XmlEnumValue("BasicDataChange")
    BASIC_DATA_CHANGE("BasicDataChange"),
    @XmlEnumValue("Split")
    SPLIT("Split"),
    @XmlEnumValue("Dividend")
    DIVIDEND("Dividend"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment");
    private final String value;

    EventTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventTypes fromValue(String v) {
        for (EventTypes c: EventTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
