
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AnyVehicle"/>
 *     &lt;enumeration value="Any2-3DoorVehicle"/>
 *     &lt;enumeration value="Any2-3DoorPassengerCar"/>
 *     &lt;enumeration value="Any2-4DoorVehicle"/>
 *     &lt;enumeration value="Any2-4DoorPassengerCar"/>
 *     &lt;enumeration value="Any4-5DoorVehicle"/>
 *     &lt;enumeration value="Any4DoorPassengerCar"/>
 *     &lt;enumeration value="AnyElite"/>
 *     &lt;enumeration value="AnyCoupe-Roadster"/>
 *     &lt;enumeration value="AnySpecial"/>
 *     &lt;enumeration value="AnyPickUp"/>
 *     &lt;enumeration value="AnyWagon"/>
 *     &lt;enumeration value="AnyRecreationalVehicle"/>
 *     &lt;enumeration value="AnySUV"/>
 *     &lt;enumeration value="AnyPassengerVan"/>
 *     &lt;enumeration value="Any6PassengerVanOrSUV"/>
 *     &lt;enumeration value="Any7PassengerVanOrSUV"/>
 *     &lt;enumeration value="Any8PassengerVanOrSUV"/>
 *     &lt;enumeration value="Any4OrAllWheelDrive"/>
 *     &lt;enumeration value="AnyAllTerrainVehicle"/>
 *     &lt;enumeration value="AnyCommercialTruck"/>
 *     &lt;enumeration value="AnyLimousine"/>
 *     &lt;enumeration value="AnySport"/>
 *     &lt;enumeration value="AnyConvertible"/>
 *     &lt;enumeration value="AnySpecialOfferVehicle"/>
 *     &lt;enumeration value="AnyMonospace"/>
 *     &lt;enumeration value="AnyMotorHome"/>
 *     &lt;enumeration value="Any2WheelVehicle"/>
 *     &lt;enumeration value="AnyCrossover"/>
 *     &lt;enumeration value="AllManualTransmissionVehicles"/>
 *     &lt;enumeration value="AllAutomaticTransmissionVehicles"/>
 *     &lt;enumeration value="AllGasolineVehicles"/>
 *     &lt;enumeration value="AllPetrolVehicles"/>
 *     &lt;enumeration value="AllDieselVehicles"/>
 *     &lt;enumeration value="AnyGreenVehicle"/>
 *     &lt;enumeration value="AllHybridVehicles"/>
 *     &lt;enumeration value="AllElectricVehicles"/>
 *     &lt;enumeration value="AllHydrogenVehicles"/>
 *     &lt;enumeration value="AllMultiFuelVehicles"/>
 *     &lt;enumeration value="AllLPGVehicles"/>
 *     &lt;enumeration value="AllEthanolVehicles"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleTypes")
@XmlEnum
public enum TypeVehicleTypes {


    /**
     * Any vehicle - GDS Pseudo Code ACAR 
     * 
     */
    @XmlEnumValue("AnyVehicle")
    ANY_VEHICLE("AnyVehicle"),

    /**
     * Any 2-3 door vehicle - GDS Pseudo Code ALLB 
     * 
     */
    @XmlEnumValue("Any2-3DoorVehicle")
    ANY_2_3_DOOR_VEHICLE("Any2-3DoorVehicle"),

    /**
     * Any 2-3 door passenger cars - GDS Pseudo Code ALBC 
     * 
     */
    @XmlEnumValue("Any2-3DoorPassengerCar")
    ANY_2_3_DOOR_PASSENGER_CAR("Any2-3DoorPassengerCar"),

    /**
     * Any 2-4 door vehicle - GDS Pseudo Code ALLC 
     * 
     */
    @XmlEnumValue("Any2-4DoorVehicle")
    ANY_2_4_DOOR_VEHICLE("Any2-4DoorVehicle"),

    /**
     * Any 2-4 door passenger cars - GDS Pseudo Code ALCC 
     * 
     */
    @XmlEnumValue("Any2-4DoorPassengerCar")
    ANY_2_4_DOOR_PASSENGER_CAR("Any2-4DoorPassengerCar"),

    /**
     * Any 4-5 door vehicle - GDS Pseudo Code ALLD 
     * 
     */
    @XmlEnumValue("Any4-5DoorVehicle")
    ANY_4_5_DOOR_VEHICLE("Any4-5DoorVehicle"),

    /**
     * Any 4 door passenger cars - GDS Pseudo Code ALDC 
     * 
     */
    @XmlEnumValue("Any4DoorPassengerCar")
    ANY_4_DOOR_PASSENGER_CAR("Any4DoorPassengerCar"),

    /**
     * Any elite - GDS Pseudo Code AELT 
     * 
     */
    @XmlEnumValue("AnyElite")
    ANY_ELITE("AnyElite"),

    /**
     * Any Coupe and/or Roadster - GDS Pseudo Code ACPR 
     * 
     */
    @XmlEnumValue("AnyCoupe-Roadster")
    ANY_COUPE_ROADSTER("AnyCoupe-Roadster"),

    /**
     * Any Special - GDS Pseudo Code ASPC 
     * 
     */
    @XmlEnumValue("AnySpecial")
    ANY_SPECIAL("AnySpecial"),

    /**
     * Any PickUp - GDS Pseudo Code APUP 
     * 
     */
    @XmlEnumValue("AnyPickUp")
    ANY_PICK_UP("AnyPickUp"),

    /**
     * Any Wagon - GDS Pseudo Code AWGN 
     * 
     */
    @XmlEnumValue("AnyWagon")
    ANY_WAGON("AnyWagon"),

    /**
     * Any Recreational Vehicle - GDS Pseudo Code AREC 
     * 
     */
    @XmlEnumValue("AnyRecreationalVehicle")
    ANY_RECREATIONAL_VEHICLE("AnyRecreationalVehicle"),

    /**
     * Any SUV - GDS Pseudo Code ASUV 
     * 
     */
    @XmlEnumValue("AnySUV")
    ANY_SUV("AnySUV"),

    /**
     *  Any Passenger Van - GDS Pseudo Code AVAN
     * 
     */
    @XmlEnumValue("AnyPassengerVan")
    ANY_PASSENGER_VAN("AnyPassengerVan"),

    /**
     *  Any 6 Passenger Van or SUV - GDS Pseudo Code ASIX
     * 
     */
    @XmlEnumValue("Any6PassengerVanOrSUV")
    ANY_6_PASSENGER_VAN_OR_SUV("Any6PassengerVanOrSUV"),

    /**
     *  Any 7 Passenger Van or SUV - GDS Pseudo Code ASEV
     * 
     */
    @XmlEnumValue("Any7PassengerVanOrSUV")
    ANY_7_PASSENGER_VAN_OR_SUV("Any7PassengerVanOrSUV"),

    /**
     *  Any 8 Passenger Van or SUV - GDS Pseudo Code AEIG
     * 
     */
    @XmlEnumValue("Any8PassengerVanOrSUV")
    ANY_8_PASSENGER_VAN_OR_SUV("Any8PassengerVanOrSUV"),

    /**
     *  Any 4 or all wheel drive- GDS Pseudo Code AFWD
     * 
     */
    @XmlEnumValue("Any4OrAllWheelDrive")
    ANY_4_OR_ALL_WHEEL_DRIVE("Any4OrAllWheelDrive"),

    /**
     *  Any all Terrain Vehicle- GDS Pseudo Code ATRV
     * 
     */
    @XmlEnumValue("AnyAllTerrainVehicle")
    ANY_ALL_TERRAIN_VEHICLE("AnyAllTerrainVehicle"),

    /**
     *  Any commercial truck- GDS Pseudo Code ACGO
     * 
     */
    @XmlEnumValue("AnyCommercialTruck")
    ANY_COMMERCIAL_TRUCK("AnyCommercialTruck"),

    /**
     *  Any Limousine- GDS Pseudo Code ALMO
     * 
     */
    @XmlEnumValue("AnyLimousine")
    ANY_LIMOUSINE("AnyLimousine"),

    /**
     *  Any Sport- GDS Pseudo Code ASPT
     * 
     */
    @XmlEnumValue("AnySport")
    ANY_SPORT("AnySport"),

    /**
     *  Any Convertible- GDS Pseudo Code ACNV
     * 
     */
    @XmlEnumValue("AnyConvertible")
    ANY_CONVERTIBLE("AnyConvertible"),

    /**
     *  Any Special Offer Vehicle- GDS Pseudo Code AOFR
     * 
     */
    @XmlEnumValue("AnySpecialOfferVehicle")
    ANY_SPECIAL_OFFER_VEHICLE("AnySpecialOfferVehicle"),

    /**
     *  Any Monospace- GDS Pseudo Code AMNO
     * 
     */
    @XmlEnumValue("AnyMonospace")
    ANY_MONOSPACE("AnyMonospace"),

    /**
     *  Any Motor Home- GDS Pseudo Code AMTO
     * 
     */
    @XmlEnumValue("AnyMotorHome")
    ANY_MOTOR_HOME("AnyMotorHome"),

    /**
     *  Any 2-Wheel Vehicle- GDS Pseudo Code AMCY
     * 
     */
    @XmlEnumValue("Any2WheelVehicle")
    ANY_2_WHEEL_VEHICLE("Any2WheelVehicle"),

    /**
     *  Any Crossover- GDS Pseudo Code ACRS
     * 
     */
    @XmlEnumValue("AnyCrossover")
    ANY_CROSSOVER("AnyCrossover"),

    /**
     *  All Manual Transmission Vehicles- GDS Pseudo Code AMAN
     * 
     */
    @XmlEnumValue("AllManualTransmissionVehicles")
    ALL_MANUAL_TRANSMISSION_VEHICLES("AllManualTransmissionVehicles"),

    /**
     *  All Automatic Transmission Vehicles- GDS Pseudo Code AUTO
     * 
     */
    @XmlEnumValue("AllAutomaticTransmissionVehicles")
    ALL_AUTOMATIC_TRANSMISSION_VEHICLES("AllAutomaticTransmissionVehicles"),

    /**
     *  All Gasoline Powered Vehicles- GDS Pseudo Code AGAS
     * 
     */
    @XmlEnumValue("AllGasolineVehicles")
    ALL_GASOLINE_VEHICLES("AllGasolineVehicles"),

    /**
     *  All Petrol Powered Vehicles- GDS Pseudo Code APET
     * 
     */
    @XmlEnumValue("AllPetrolVehicles")
    ALL_PETROL_VEHICLES("AllPetrolVehicles"),

    /**
     *  All Diesel Powered Vehicles- GDS Pseudo Code ADSL
     * 
     */
    @XmlEnumValue("AllDieselVehicles")
    ALL_DIESEL_VEHICLES("AllDieselVehicles"),

    /**
     *  Any Green vehicle (hybrid, electric, LPG, hydrogen, multi-fuel)- GDS Pseudo Code AGRN
     * 
     */
    @XmlEnumValue("AnyGreenVehicle")
    ANY_GREEN_VEHICLE("AnyGreenVehicle"),

    /**
     *  All Hybrid Vehicles- GDS Pseudo Code AHYB
     * 
     */
    @XmlEnumValue("AllHybridVehicles")
    ALL_HYBRID_VEHICLES("AllHybridVehicles"),

    /**
     * All Electric powered vehicles- GDS Pseudo Code AELC
     * 
     */
    @XmlEnumValue("AllElectricVehicles")
    ALL_ELECTRIC_VEHICLES("AllElectricVehicles"),

    /**
     * All Hydrogen powered vehicles- GDS Pseudo Code AHYD
     * 
     */
    @XmlEnumValue("AllHydrogenVehicles")
    ALL_HYDROGEN_VEHICLES("AllHydrogenVehicles"),

    /**
     * All Multi-Fuel powered vehicles- GDS Pseudo Code AMFP
     * 
     */
    @XmlEnumValue("AllMultiFuelVehicles")
    ALL_MULTI_FUEL_VEHICLES("AllMultiFuelVehicles"),

    /**
     * All LPG/Compressed Gas powered vehicles- GDS Pseudo Code ACPG
     * 
     */
    @XmlEnumValue("AllLPGVehicles")
    ALL_LPG_VEHICLES("AllLPGVehicles"),

    /**
     * All Ethanol powered vehicles   - GDS Pseudo Code AETH
     * 
     */
    @XmlEnumValue("AllEthanolVehicles")
    ALL_ETHANOL_VEHICLES("AllEthanolVehicles");
    private final String value;

    TypeVehicleTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleTypes fromValue(String v) {
        for (TypeVehicleTypes c: TypeVehicleTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
