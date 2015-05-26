
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NomenclatureID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NomenclatureID">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hotels"/>
 *     &lt;enumeration value="RoomTypes"/>
 *     &lt;enumeration value="MarketOrigins"/>
 *     &lt;enumeration value="MarketSegments"/>
 *     &lt;enumeration value="TaxSchemas"/>
 *     &lt;enumeration value="GuestTypes"/>
 *     &lt;enumeration value="PensionBoards"/>
 *     &lt;enumeration value="Entities"/>
 *     &lt;enumeration value="Countries"/>
 *     &lt;enumeration value="Departments"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="ServicesByDepartment"/>
 *     &lt;enumeration value="Currencies"/>
 *     &lt;enumeration value="WithdrawTypes"/>
 *     &lt;enumeration value="CreditCardTypes"/>
 *     &lt;enumeration value="ResourceCharacteristicTypes"/>
 *     &lt;enumeration value="Contracts"/>
 *     &lt;enumeration value="WarrantyTypes"/>
 *     &lt;enumeration value="Titles"/>
 *     &lt;enumeration value="MaleTitles"/>
 *     &lt;enumeration value="FemaleTitles"/>
 *     &lt;enumeration value="PriceRate"/>
 *     &lt;enumeration value="ClientTypes"/>
 *     &lt;enumeration value="Users"/>
 *     &lt;enumeration value="CancellationReasons"/>
 *     &lt;enumeration value="ExternalAccounts"/>
 *     &lt;enumeration value="Allotments"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Distributor"/>
 *     &lt;enumeration value="PointOfSales"/>
 *     &lt;enumeration value="Groups"/>
 *     &lt;enumeration value="Families"/>
 *     &lt;enumeration value="SubFamilies"/>
 *     &lt;enumeration value="InternalConsumptions"/>
 *     &lt;enumeration value="PointOfSalesProducts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NomenclatureID")
@XmlEnum
public enum NomenclatureID {

    @XmlEnumValue("Hotels")
    HOTELS("Hotels"),
    @XmlEnumValue("RoomTypes")
    ROOM_TYPES("RoomTypes"),
    @XmlEnumValue("MarketOrigins")
    MARKET_ORIGINS("MarketOrigins"),
    @XmlEnumValue("MarketSegments")
    MARKET_SEGMENTS("MarketSegments"),
    @XmlEnumValue("TaxSchemas")
    TAX_SCHEMAS("TaxSchemas"),
    @XmlEnumValue("GuestTypes")
    GUEST_TYPES("GuestTypes"),
    @XmlEnumValue("PensionBoards")
    PENSION_BOARDS("PensionBoards"),
    @XmlEnumValue("Entities")
    ENTITIES("Entities"),
    @XmlEnumValue("Countries")
    COUNTRIES("Countries"),
    @XmlEnumValue("Departments")
    DEPARTMENTS("Departments"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("ServicesByDepartment")
    SERVICES_BY_DEPARTMENT("ServicesByDepartment"),
    @XmlEnumValue("Currencies")
    CURRENCIES("Currencies"),
    @XmlEnumValue("WithdrawTypes")
    WITHDRAW_TYPES("WithdrawTypes"),
    @XmlEnumValue("CreditCardTypes")
    CREDIT_CARD_TYPES("CreditCardTypes"),
    @XmlEnumValue("ResourceCharacteristicTypes")
    RESOURCE_CHARACTERISTIC_TYPES("ResourceCharacteristicTypes"),
    @XmlEnumValue("Contracts")
    CONTRACTS("Contracts"),
    @XmlEnumValue("WarrantyTypes")
    WARRANTY_TYPES("WarrantyTypes"),
    @XmlEnumValue("Titles")
    TITLES("Titles"),
    @XmlEnumValue("MaleTitles")
    MALE_TITLES("MaleTitles"),
    @XmlEnumValue("FemaleTitles")
    FEMALE_TITLES("FemaleTitles"),
    @XmlEnumValue("PriceRate")
    PRICE_RATE("PriceRate"),
    @XmlEnumValue("ClientTypes")
    CLIENT_TYPES("ClientTypes"),
    @XmlEnumValue("Users")
    USERS("Users"),
    @XmlEnumValue("CancellationReasons")
    CANCELLATION_REASONS("CancellationReasons"),
    @XmlEnumValue("ExternalAccounts")
    EXTERNAL_ACCOUNTS("ExternalAccounts"),
    @XmlEnumValue("Allotments")
    ALLOTMENTS("Allotments"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Distributor")
    DISTRIBUTOR("Distributor"),
    @XmlEnumValue("PointOfSales")
    POINT_OF_SALES("PointOfSales"),
    @XmlEnumValue("Groups")
    GROUPS("Groups"),
    @XmlEnumValue("Families")
    FAMILIES("Families"),
    @XmlEnumValue("SubFamilies")
    SUB_FAMILIES("SubFamilies"),
    @XmlEnumValue("InternalConsumptions")
    INTERNAL_CONSUMPTIONS("InternalConsumptions"),
    @XmlEnumValue("PointOfSalesProducts")
    POINT_OF_SALES_PRODUCTS("PointOfSalesProducts");
    private final String value;

    NomenclatureID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NomenclatureID fromValue(String v) {
        for (NomenclatureID c: NomenclatureID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
