
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="TransactionReportedEarly"/>
 *     &lt;enumeration value="NQSOGrant"/>
 *     &lt;enumeration value="NQSODisposition"/>
 *     &lt;enumeration value="NQSOSameDayExercise"/>
 *     &lt;enumeration value="NQSODiscretionaryTransaction"/>
 *     &lt;enumeration value="NQSOExercise"/>
 *     &lt;enumeration value="Conversion"/>
 *     &lt;enumeration value="ExpirationOfShortPosition"/>
 *     &lt;enumeration value="ExpirationOfLongPosition"/>
 *     &lt;enumeration value="ExerciseOutOfTheMoney"/>
 *     &lt;enumeration value="ExerciceInTheMoney"/>
 *     &lt;enumeration value="BonaFideGift"/>
 *     &lt;enumeration value="SmallAcquisition"/>
 *     &lt;enumeration value="AcquisitionOrDispositionByWill"/>
 *     &lt;enumeration value="DepositOrWithDrawalFromTrust"/>
 *     &lt;enumeration value="OtherAcquisitionOrDisposition"/>
 *     &lt;enumeration value="Swap"/>
 *     &lt;enumeration value="DispositionOfTender"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionCodes")
@XmlEnum
public enum TransactionCodes {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("TransactionReportedEarly")
    TRANSACTION_REPORTED_EARLY("TransactionReportedEarly"),
    @XmlEnumValue("NQSOGrant")
    NQSO_GRANT("NQSOGrant"),
    @XmlEnumValue("NQSODisposition")
    NQSO_DISPOSITION("NQSODisposition"),
    @XmlEnumValue("NQSOSameDayExercise")
    NQSO_SAME_DAY_EXERCISE("NQSOSameDayExercise"),
    @XmlEnumValue("NQSODiscretionaryTransaction")
    NQSO_DISCRETIONARY_TRANSACTION("NQSODiscretionaryTransaction"),
    @XmlEnumValue("NQSOExercise")
    NQSO_EXERCISE("NQSOExercise"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("ExpirationOfShortPosition")
    EXPIRATION_OF_SHORT_POSITION("ExpirationOfShortPosition"),
    @XmlEnumValue("ExpirationOfLongPosition")
    EXPIRATION_OF_LONG_POSITION("ExpirationOfLongPosition"),
    @XmlEnumValue("ExerciseOutOfTheMoney")
    EXERCISE_OUT_OF_THE_MONEY("ExerciseOutOfTheMoney"),
    @XmlEnumValue("ExerciceInTheMoney")
    EXERCICE_IN_THE_MONEY("ExerciceInTheMoney"),
    @XmlEnumValue("BonaFideGift")
    BONA_FIDE_GIFT("BonaFideGift"),
    @XmlEnumValue("SmallAcquisition")
    SMALL_ACQUISITION("SmallAcquisition"),
    @XmlEnumValue("AcquisitionOrDispositionByWill")
    ACQUISITION_OR_DISPOSITION_BY_WILL("AcquisitionOrDispositionByWill"),
    @XmlEnumValue("DepositOrWithDrawalFromTrust")
    DEPOSIT_OR_WITH_DRAWAL_FROM_TRUST("DepositOrWithDrawalFromTrust"),
    @XmlEnumValue("OtherAcquisitionOrDisposition")
    OTHER_ACQUISITION_OR_DISPOSITION("OtherAcquisitionOrDisposition"),
    @XmlEnumValue("Swap")
    SWAP("Swap"),
    @XmlEnumValue("DispositionOfTender")
    DISPOSITION_OF_TENDER("DispositionOfTender"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    TransactionCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionCodes fromValue(String v) {
        for (TransactionCodes c: TransactionCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
