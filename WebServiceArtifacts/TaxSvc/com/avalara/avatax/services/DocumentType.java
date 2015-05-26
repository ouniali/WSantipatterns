
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SalesOrder"/>
 *     &lt;enumeration value="SalesInvoice"/>
 *     &lt;enumeration value="PurchaseOrder"/>
 *     &lt;enumeration value="PurchaseInvoice"/>
 *     &lt;enumeration value="ReturnOrder"/>
 *     &lt;enumeration value="ReturnInvoice"/>
 *     &lt;enumeration value="InventoryTransferOrder"/>
 *     &lt;enumeration value="InventoryTransferInvoice"/>
 *     &lt;enumeration value="ReverseChargeOrder"/>
 *     &lt;enumeration value="ReverseChargeInvoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType")
@XmlEnum
public enum DocumentType {

    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("SalesInvoice")
    SALES_INVOICE("SalesInvoice"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("PurchaseInvoice")
    PURCHASE_INVOICE("PurchaseInvoice"),
    @XmlEnumValue("ReturnOrder")
    RETURN_ORDER("ReturnOrder"),
    @XmlEnumValue("ReturnInvoice")
    RETURN_INVOICE("ReturnInvoice"),
    @XmlEnumValue("InventoryTransferOrder")
    INVENTORY_TRANSFER_ORDER("InventoryTransferOrder"),
    @XmlEnumValue("InventoryTransferInvoice")
    INVENTORY_TRANSFER_INVOICE("InventoryTransferInvoice"),
    @XmlEnumValue("ReverseChargeOrder")
    REVERSE_CHARGE_ORDER("ReverseChargeOrder"),
    @XmlEnumValue("ReverseChargeInvoice")
    REVERSE_CHARGE_INVOICE("ReverseChargeInvoice");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
