
package com.exactor.ns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="ZAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeType")
@XmlEnum
public enum CurrencyCodeType {

    AED,
    AMD,
    ARS,
    AUD,
    AZN,
    BAM,
    BDT,
    BGN,
    BHD,
    BND,
    BOB,
    BRL,
    BWP,
    CAD,
    CHF,
    CLP,
    CNY,
    COP,
    CRC,
    CZK,
    DKK,
    DZD,
    EEK,
    EGP,
    ETB,
    EUR,
    GBP,
    GEL,
    GTQ,
    HKD,
    HRK,
    HUF,
    IDR,
    ILS,
    INR,
    IQD,
    JPY,
    KPW,
    KWD,
    KZT,
    LTL,
    LVL,
    MAD,
    MXN,
    MYR,
    NGN,
    NOK,
    NZD,
    OMR,
    PAB,
    PEN,
    PHP,
    PKR,
    PLN,
    QAR,
    RON,
    RSD,
    RUB,
    SAR,
    SEK,
    SGD,
    SVC,
    THB,
    TND,
    TRY,
    TWD,
    UAH,
    USD,
    UYU,
    UZS,
    VEF,
    VND,
    ZAR;

    public String value() {
        return name();
    }

    public static CurrencyCodeType fromValue(String v) {
        return valueOf(v);
    }

}
