
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tara.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tara">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Afghanistan"/>
 *     &lt;enumeration value="AlandIslands"/>
 *     &lt;enumeration value="Albania"/>
 *     &lt;enumeration value="Algeria"/>
 *     &lt;enumeration value="AmericanSamoa"/>
 *     &lt;enumeration value="Andorra"/>
 *     &lt;enumeration value="Angola"/>
 *     &lt;enumeration value="Anguilla"/>
 *     &lt;enumeration value="Antarctica"/>
 *     &lt;enumeration value="AntiguaAndBarbuda"/>
 *     &lt;enumeration value="Argentina"/>
 *     &lt;enumeration value="Armenia"/>
 *     &lt;enumeration value="Aruba"/>
 *     &lt;enumeration value="Australia"/>
 *     &lt;enumeration value="Austria"/>
 *     &lt;enumeration value="Azerbaijan"/>
 *     &lt;enumeration value="Bahamas"/>
 *     &lt;enumeration value="Bahrain"/>
 *     &lt;enumeration value="Bangladesh"/>
 *     &lt;enumeration value="Barbados"/>
 *     &lt;enumeration value="Belarus"/>
 *     &lt;enumeration value="Belgium"/>
 *     &lt;enumeration value="Belize"/>
 *     &lt;enumeration value="Benin"/>
 *     &lt;enumeration value="Bermuda"/>
 *     &lt;enumeration value="Bhutan"/>
 *     &lt;enumeration value="Bolivia"/>
 *     &lt;enumeration value="BosniaAndHerzegovina"/>
 *     &lt;enumeration value="Botswana"/>
 *     &lt;enumeration value="BouvetIslandBouvetoya"/>
 *     &lt;enumeration value="Brazil"/>
 *     &lt;enumeration value="BritishIndianOceanTerritory"/>
 *     &lt;enumeration value="BritishVirginIslands"/>
 *     &lt;enumeration value="BruneiDarussalam"/>
 *     &lt;enumeration value="Bulgaria"/>
 *     &lt;enumeration value="BurkinaFaso"/>
 *     &lt;enumeration value="Burundi"/>
 *     &lt;enumeration value="Cambodia"/>
 *     &lt;enumeration value="Cameroon"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="CapeVerde"/>
 *     &lt;enumeration value="CaymanIslands"/>
 *     &lt;enumeration value="CentralAfricanRepublic"/>
 *     &lt;enumeration value="Chad"/>
 *     &lt;enumeration value="Chile"/>
 *     &lt;enumeration value="China"/>
 *     &lt;enumeration value="ChristmasIsland"/>
 *     &lt;enumeration value="CocosKeelingIslands"/>
 *     &lt;enumeration value="Colombia"/>
 *     &lt;enumeration value="Comoros"/>
 *     &lt;enumeration value="Congo"/>
 *     &lt;enumeration value="CookIslands"/>
 *     &lt;enumeration value="CostaRica"/>
 *     &lt;enumeration value="CoteDIvoire"/>
 *     &lt;enumeration value="Croatia"/>
 *     &lt;enumeration value="Cuba"/>
 *     &lt;enumeration value="Cyprus"/>
 *     &lt;enumeration value="CzechRepublic"/>
 *     &lt;enumeration value="Denmark"/>
 *     &lt;enumeration value="Djibouti"/>
 *     &lt;enumeration value="Dominica"/>
 *     &lt;enumeration value="DominicanRepublic"/>
 *     &lt;enumeration value="Ecuador"/>
 *     &lt;enumeration value="Egypt"/>
 *     &lt;enumeration value="ElSalvador"/>
 *     &lt;enumeration value="EquatorialGuinea"/>
 *     &lt;enumeration value="Eritrea"/>
 *     &lt;enumeration value="Estonia"/>
 *     &lt;enumeration value="Ethiopia"/>
 *     &lt;enumeration value="FaroeIslands"/>
 *     &lt;enumeration value="FalklandIslandsMalvinas"/>
 *     &lt;enumeration value="Fiji"/>
 *     &lt;enumeration value="Finland"/>
 *     &lt;enumeration value="France"/>
 *     &lt;enumeration value="FrenchGuiana"/>
 *     &lt;enumeration value="FrenchPolynesia"/>
 *     &lt;enumeration value="FrenchSouthernTerritories"/>
 *     &lt;enumeration value="Gabon"/>
 *     &lt;enumeration value="Gambia"/>
 *     &lt;enumeration value="Georgia"/>
 *     &lt;enumeration value="Germany"/>
 *     &lt;enumeration value="Ghana"/>
 *     &lt;enumeration value="Gibraltar"/>
 *     &lt;enumeration value="Greece"/>
 *     &lt;enumeration value="Greenland"/>
 *     &lt;enumeration value="Grenada"/>
 *     &lt;enumeration value="Guadeloupe"/>
 *     &lt;enumeration value="Guam"/>
 *     &lt;enumeration value="Guatemala"/>
 *     &lt;enumeration value="Guernsey"/>
 *     &lt;enumeration value="Guinea"/>
 *     &lt;enumeration value="GuineaBissau"/>
 *     &lt;enumeration value="Guyana"/>
 *     &lt;enumeration value="Haiti"/>
 *     &lt;enumeration value="HeardIslandAndMcDonaldIslands"/>
 *     &lt;enumeration value="HolySeeVaticanCityState"/>
 *     &lt;enumeration value="Honduras"/>
 *     &lt;enumeration value="HongKong"/>
 *     &lt;enumeration value="Hungary"/>
 *     &lt;enumeration value="Iceland"/>
 *     &lt;enumeration value="India"/>
 *     &lt;enumeration value="Indonesia"/>
 *     &lt;enumeration value="Iran"/>
 *     &lt;enumeration value="Iraq"/>
 *     &lt;enumeration value="Ireland"/>
 *     &lt;enumeration value="IsleOfMan"/>
 *     &lt;enumeration value="Israel"/>
 *     &lt;enumeration value="Italy"/>
 *     &lt;enumeration value="Jamaica"/>
 *     &lt;enumeration value="Japan"/>
 *     &lt;enumeration value="Jersey"/>
 *     &lt;enumeration value="Jordan"/>
 *     &lt;enumeration value="Kazakhstan"/>
 *     &lt;enumeration value="Kenya"/>
 *     &lt;enumeration value="Kiribati"/>
 *     &lt;enumeration value="Korea"/>
 *     &lt;enumeration value="Kuwait"/>
 *     &lt;enumeration value="KyrgyzRepublic"/>
 *     &lt;enumeration value="LaoPeoplesDemocraticRepublic"/>
 *     &lt;enumeration value="Latvia"/>
 *     &lt;enumeration value="Lebanon"/>
 *     &lt;enumeration value="Lesotho"/>
 *     &lt;enumeration value="Liberia"/>
 *     &lt;enumeration value="LibyanArabJamahiriya"/>
 *     &lt;enumeration value="Liechtenstein"/>
 *     &lt;enumeration value="Lithuania"/>
 *     &lt;enumeration value="Luxembourg"/>
 *     &lt;enumeration value="Macao"/>
 *     &lt;enumeration value="Macedonia"/>
 *     &lt;enumeration value="Madagascar"/>
 *     &lt;enumeration value="Malawi"/>
 *     &lt;enumeration value="Malaysia"/>
 *     &lt;enumeration value="Maldives"/>
 *     &lt;enumeration value="Mali"/>
 *     &lt;enumeration value="Malta"/>
 *     &lt;enumeration value="MarshallIslands"/>
 *     &lt;enumeration value="Martinique"/>
 *     &lt;enumeration value="Mauritania"/>
 *     &lt;enumeration value="Mauritius"/>
 *     &lt;enumeration value="Mayotte"/>
 *     &lt;enumeration value="Mexico"/>
 *     &lt;enumeration value="Micronesia"/>
 *     &lt;enumeration value="Moldova"/>
 *     &lt;enumeration value="Monaco"/>
 *     &lt;enumeration value="Mongolia"/>
 *     &lt;enumeration value="Montenegro"/>
 *     &lt;enumeration value="Montserrat"/>
 *     &lt;enumeration value="Morocco"/>
 *     &lt;enumeration value="Mozambique"/>
 *     &lt;enumeration value="Myanmar"/>
 *     &lt;enumeration value="Namibia"/>
 *     &lt;enumeration value="Nauru"/>
 *     &lt;enumeration value="Nepal"/>
 *     &lt;enumeration value="NetherlandsAntilles"/>
 *     &lt;enumeration value="Netherlands"/>
 *     &lt;enumeration value="NewCaledonia"/>
 *     &lt;enumeration value="NewZealand"/>
 *     &lt;enumeration value="Nicaragua"/>
 *     &lt;enumeration value="Niger"/>
 *     &lt;enumeration value="Nigeria"/>
 *     &lt;enumeration value="Niue"/>
 *     &lt;enumeration value="NorfolkIsland"/>
 *     &lt;enumeration value="NorthernMarianaIslands"/>
 *     &lt;enumeration value="Norway"/>
 *     &lt;enumeration value="Oman"/>
 *     &lt;enumeration value="Pakistan"/>
 *     &lt;enumeration value="Palau"/>
 *     &lt;enumeration value="PalestinianTerritory"/>
 *     &lt;enumeration value="Panama"/>
 *     &lt;enumeration value="PapuaNewGuinea"/>
 *     &lt;enumeration value="Paraguay"/>
 *     &lt;enumeration value="Peru"/>
 *     &lt;enumeration value="Philippines"/>
 *     &lt;enumeration value="PitcairnIslands"/>
 *     &lt;enumeration value="Poland"/>
 *     &lt;enumeration value="Portugal"/>
 *     &lt;enumeration value="PuertoRico"/>
 *     &lt;enumeration value="Qatar"/>
 *     &lt;enumeration value="Reunion"/>
 *     &lt;enumeration value="Romania"/>
 *     &lt;enumeration value="RussianFederation"/>
 *     &lt;enumeration value="Rwanda"/>
 *     &lt;enumeration value="SaintBarthelemy"/>
 *     &lt;enumeration value="SaintHelena"/>
 *     &lt;enumeration value="SaintKittsAndNevis"/>
 *     &lt;enumeration value="SaintLucia"/>
 *     &lt;enumeration value="SaintMartin"/>
 *     &lt;enumeration value="SaintPierreAndMiquelon"/>
 *     &lt;enumeration value="SaintVincentAndTheGrenadines"/>
 *     &lt;enumeration value="Samoa"/>
 *     &lt;enumeration value="SanMarino"/>
 *     &lt;enumeration value="SaoTomeAndPrincipe"/>
 *     &lt;enumeration value="SaudiArabia"/>
 *     &lt;enumeration value="Senegal"/>
 *     &lt;enumeration value="Serbia"/>
 *     &lt;enumeration value="Seychelles"/>
 *     &lt;enumeration value="SierraLeone"/>
 *     &lt;enumeration value="Singapore"/>
 *     &lt;enumeration value="Slovakia"/>
 *     &lt;enumeration value="Slovenia"/>
 *     &lt;enumeration value="SolomonIslands"/>
 *     &lt;enumeration value="Somalia"/>
 *     &lt;enumeration value="SouthAfrica"/>
 *     &lt;enumeration value="SouthGeorgiaAndTheSouthSandwichIslands"/>
 *     &lt;enumeration value="Spain"/>
 *     &lt;enumeration value="SriLanka"/>
 *     &lt;enumeration value="Sudan"/>
 *     &lt;enumeration value="Suriname"/>
 *     &lt;enumeration value="SvalbardJanMayenIslands"/>
 *     &lt;enumeration value="Swaziland"/>
 *     &lt;enumeration value="Sweden"/>
 *     &lt;enumeration value="Switzerland"/>
 *     &lt;enumeration value="SyrianArabRepublic"/>
 *     &lt;enumeration value="Taiwan"/>
 *     &lt;enumeration value="Tajikistan"/>
 *     &lt;enumeration value="Tanzania"/>
 *     &lt;enumeration value="Thailand"/>
 *     &lt;enumeration value="TimorLeste"/>
 *     &lt;enumeration value="Togo"/>
 *     &lt;enumeration value="Tokelau"/>
 *     &lt;enumeration value="Tonga"/>
 *     &lt;enumeration value="TrinidadAndTobago"/>
 *     &lt;enumeration value="Tunisia"/>
 *     &lt;enumeration value="Turkey"/>
 *     &lt;enumeration value="Turkmenistan"/>
 *     &lt;enumeration value="TurksAndCaicosIslands"/>
 *     &lt;enumeration value="Tuvalu"/>
 *     &lt;enumeration value="Uganda"/>
 *     &lt;enumeration value="Ukraine"/>
 *     &lt;enumeration value="UnitedArabEmirates"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="UnitedStatesOfAmerica"/>
 *     &lt;enumeration value="UnitedStatesMinorOutlyingIslands"/>
 *     &lt;enumeration value="UnitedStatesVirginIslands"/>
 *     &lt;enumeration value="Uruguay"/>
 *     &lt;enumeration value="Uzbekistan"/>
 *     &lt;enumeration value="Vanuatu"/>
 *     &lt;enumeration value="Venezuela"/>
 *     &lt;enumeration value="Vietnam"/>
 *     &lt;enumeration value="WallisAndFutuna"/>
 *     &lt;enumeration value="WesternSahara"/>
 *     &lt;enumeration value="Yemen"/>
 *     &lt;enumeration value="Zambia"/>
 *     &lt;enumeration value="Zimbabwe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tara")
@XmlEnum
public enum Tara {

    @XmlEnumValue("Afghanistan")
    AFGHANISTAN("Afghanistan"),
    @XmlEnumValue("AlandIslands")
    ALAND_ISLANDS("AlandIslands"),
    @XmlEnumValue("Albania")
    ALBANIA("Albania"),
    @XmlEnumValue("Algeria")
    ALGERIA("Algeria"),
    @XmlEnumValue("AmericanSamoa")
    AMERICAN_SAMOA("AmericanSamoa"),
    @XmlEnumValue("Andorra")
    ANDORRA("Andorra"),
    @XmlEnumValue("Angola")
    ANGOLA("Angola"),
    @XmlEnumValue("Anguilla")
    ANGUILLA("Anguilla"),
    @XmlEnumValue("Antarctica")
    ANTARCTICA("Antarctica"),
    @XmlEnumValue("AntiguaAndBarbuda")
    ANTIGUA_AND_BARBUDA("AntiguaAndBarbuda"),
    @XmlEnumValue("Argentina")
    ARGENTINA("Argentina"),
    @XmlEnumValue("Armenia")
    ARMENIA("Armenia"),
    @XmlEnumValue("Aruba")
    ARUBA("Aruba"),
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),
    @XmlEnumValue("Austria")
    AUSTRIA("Austria"),
    @XmlEnumValue("Azerbaijan")
    AZERBAIJAN("Azerbaijan"),
    @XmlEnumValue("Bahamas")
    BAHAMAS("Bahamas"),
    @XmlEnumValue("Bahrain")
    BAHRAIN("Bahrain"),
    @XmlEnumValue("Bangladesh")
    BANGLADESH("Bangladesh"),
    @XmlEnumValue("Barbados")
    BARBADOS("Barbados"),
    @XmlEnumValue("Belarus")
    BELARUS("Belarus"),
    @XmlEnumValue("Belgium")
    BELGIUM("Belgium"),
    @XmlEnumValue("Belize")
    BELIZE("Belize"),
    @XmlEnumValue("Benin")
    BENIN("Benin"),
    @XmlEnumValue("Bermuda")
    BERMUDA("Bermuda"),
    @XmlEnumValue("Bhutan")
    BHUTAN("Bhutan"),
    @XmlEnumValue("Bolivia")
    BOLIVIA("Bolivia"),
    @XmlEnumValue("BosniaAndHerzegovina")
    BOSNIA_AND_HERZEGOVINA("BosniaAndHerzegovina"),
    @XmlEnumValue("Botswana")
    BOTSWANA("Botswana"),
    @XmlEnumValue("BouvetIslandBouvetoya")
    BOUVET_ISLAND_BOUVETOYA("BouvetIslandBouvetoya"),
    @XmlEnumValue("Brazil")
    BRAZIL("Brazil"),
    @XmlEnumValue("BritishIndianOceanTerritory")
    BRITISH_INDIAN_OCEAN_TERRITORY("BritishIndianOceanTerritory"),
    @XmlEnumValue("BritishVirginIslands")
    BRITISH_VIRGIN_ISLANDS("BritishVirginIslands"),
    @XmlEnumValue("BruneiDarussalam")
    BRUNEI_DARUSSALAM("BruneiDarussalam"),
    @XmlEnumValue("Bulgaria")
    BULGARIA("Bulgaria"),
    @XmlEnumValue("BurkinaFaso")
    BURKINA_FASO("BurkinaFaso"),
    @XmlEnumValue("Burundi")
    BURUNDI("Burundi"),
    @XmlEnumValue("Cambodia")
    CAMBODIA("Cambodia"),
    @XmlEnumValue("Cameroon")
    CAMEROON("Cameroon"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("CapeVerde")
    CAPE_VERDE("CapeVerde"),
    @XmlEnumValue("CaymanIslands")
    CAYMAN_ISLANDS("CaymanIslands"),
    @XmlEnumValue("CentralAfricanRepublic")
    CENTRAL_AFRICAN_REPUBLIC("CentralAfricanRepublic"),
    @XmlEnumValue("Chad")
    CHAD("Chad"),
    @XmlEnumValue("Chile")
    CHILE("Chile"),
    @XmlEnumValue("China")
    CHINA("China"),
    @XmlEnumValue("ChristmasIsland")
    CHRISTMAS_ISLAND("ChristmasIsland"),
    @XmlEnumValue("CocosKeelingIslands")
    COCOS_KEELING_ISLANDS("CocosKeelingIslands"),
    @XmlEnumValue("Colombia")
    COLOMBIA("Colombia"),
    @XmlEnumValue("Comoros")
    COMOROS("Comoros"),
    @XmlEnumValue("Congo")
    CONGO("Congo"),
    @XmlEnumValue("CookIslands")
    COOK_ISLANDS("CookIslands"),
    @XmlEnumValue("CostaRica")
    COSTA_RICA("CostaRica"),
    @XmlEnumValue("CoteDIvoire")
    COTE_D_IVOIRE("CoteDIvoire"),
    @XmlEnumValue("Croatia")
    CROATIA("Croatia"),
    @XmlEnumValue("Cuba")
    CUBA("Cuba"),
    @XmlEnumValue("Cyprus")
    CYPRUS("Cyprus"),
    @XmlEnumValue("CzechRepublic")
    CZECH_REPUBLIC("CzechRepublic"),
    @XmlEnumValue("Denmark")
    DENMARK("Denmark"),
    @XmlEnumValue("Djibouti")
    DJIBOUTI("Djibouti"),
    @XmlEnumValue("Dominica")
    DOMINICA("Dominica"),
    @XmlEnumValue("DominicanRepublic")
    DOMINICAN_REPUBLIC("DominicanRepublic"),
    @XmlEnumValue("Ecuador")
    ECUADOR("Ecuador"),
    @XmlEnumValue("Egypt")
    EGYPT("Egypt"),
    @XmlEnumValue("ElSalvador")
    EL_SALVADOR("ElSalvador"),
    @XmlEnumValue("EquatorialGuinea")
    EQUATORIAL_GUINEA("EquatorialGuinea"),
    @XmlEnumValue("Eritrea")
    ERITREA("Eritrea"),
    @XmlEnumValue("Estonia")
    ESTONIA("Estonia"),
    @XmlEnumValue("Ethiopia")
    ETHIOPIA("Ethiopia"),
    @XmlEnumValue("FaroeIslands")
    FAROE_ISLANDS("FaroeIslands"),
    @XmlEnumValue("FalklandIslandsMalvinas")
    FALKLAND_ISLANDS_MALVINAS("FalklandIslandsMalvinas"),
    @XmlEnumValue("Fiji")
    FIJI("Fiji"),
    @XmlEnumValue("Finland")
    FINLAND("Finland"),
    @XmlEnumValue("France")
    FRANCE("France"),
    @XmlEnumValue("FrenchGuiana")
    FRENCH_GUIANA("FrenchGuiana"),
    @XmlEnumValue("FrenchPolynesia")
    FRENCH_POLYNESIA("FrenchPolynesia"),
    @XmlEnumValue("FrenchSouthernTerritories")
    FRENCH_SOUTHERN_TERRITORIES("FrenchSouthernTerritories"),
    @XmlEnumValue("Gabon")
    GABON("Gabon"),
    @XmlEnumValue("Gambia")
    GAMBIA("Gambia"),
    @XmlEnumValue("Georgia")
    GEORGIA("Georgia"),
    @XmlEnumValue("Germany")
    GERMANY("Germany"),
    @XmlEnumValue("Ghana")
    GHANA("Ghana"),
    @XmlEnumValue("Gibraltar")
    GIBRALTAR("Gibraltar"),
    @XmlEnumValue("Greece")
    GREECE("Greece"),
    @XmlEnumValue("Greenland")
    GREENLAND("Greenland"),
    @XmlEnumValue("Grenada")
    GRENADA("Grenada"),
    @XmlEnumValue("Guadeloupe")
    GUADELOUPE("Guadeloupe"),
    @XmlEnumValue("Guam")
    GUAM("Guam"),
    @XmlEnumValue("Guatemala")
    GUATEMALA("Guatemala"),
    @XmlEnumValue("Guernsey")
    GUERNSEY("Guernsey"),
    @XmlEnumValue("Guinea")
    GUINEA("Guinea"),
    @XmlEnumValue("GuineaBissau")
    GUINEA_BISSAU("GuineaBissau"),
    @XmlEnumValue("Guyana")
    GUYANA("Guyana"),
    @XmlEnumValue("Haiti")
    HAITI("Haiti"),
    @XmlEnumValue("HeardIslandAndMcDonaldIslands")
    HEARD_ISLAND_AND_MC_DONALD_ISLANDS("HeardIslandAndMcDonaldIslands"),
    @XmlEnumValue("HolySeeVaticanCityState")
    HOLY_SEE_VATICAN_CITY_STATE("HolySeeVaticanCityState"),
    @XmlEnumValue("Honduras")
    HONDURAS("Honduras"),
    @XmlEnumValue("HongKong")
    HONG_KONG("HongKong"),
    @XmlEnumValue("Hungary")
    HUNGARY("Hungary"),
    @XmlEnumValue("Iceland")
    ICELAND("Iceland"),
    @XmlEnumValue("India")
    INDIA("India"),
    @XmlEnumValue("Indonesia")
    INDONESIA("Indonesia"),
    @XmlEnumValue("Iran")
    IRAN("Iran"),
    @XmlEnumValue("Iraq")
    IRAQ("Iraq"),
    @XmlEnumValue("Ireland")
    IRELAND("Ireland"),
    @XmlEnumValue("IsleOfMan")
    ISLE_OF_MAN("IsleOfMan"),
    @XmlEnumValue("Israel")
    ISRAEL("Israel"),
    @XmlEnumValue("Italy")
    ITALY("Italy"),
    @XmlEnumValue("Jamaica")
    JAMAICA("Jamaica"),
    @XmlEnumValue("Japan")
    JAPAN("Japan"),
    @XmlEnumValue("Jersey")
    JERSEY("Jersey"),
    @XmlEnumValue("Jordan")
    JORDAN("Jordan"),
    @XmlEnumValue("Kazakhstan")
    KAZAKHSTAN("Kazakhstan"),
    @XmlEnumValue("Kenya")
    KENYA("Kenya"),
    @XmlEnumValue("Kiribati")
    KIRIBATI("Kiribati"),
    @XmlEnumValue("Korea")
    KOREA("Korea"),
    @XmlEnumValue("Kuwait")
    KUWAIT("Kuwait"),
    @XmlEnumValue("KyrgyzRepublic")
    KYRGYZ_REPUBLIC("KyrgyzRepublic"),
    @XmlEnumValue("LaoPeoplesDemocraticRepublic")
    LAO_PEOPLES_DEMOCRATIC_REPUBLIC("LaoPeoplesDemocraticRepublic"),
    @XmlEnumValue("Latvia")
    LATVIA("Latvia"),
    @XmlEnumValue("Lebanon")
    LEBANON("Lebanon"),
    @XmlEnumValue("Lesotho")
    LESOTHO("Lesotho"),
    @XmlEnumValue("Liberia")
    LIBERIA("Liberia"),
    @XmlEnumValue("LibyanArabJamahiriya")
    LIBYAN_ARAB_JAMAHIRIYA("LibyanArabJamahiriya"),
    @XmlEnumValue("Liechtenstein")
    LIECHTENSTEIN("Liechtenstein"),
    @XmlEnumValue("Lithuania")
    LITHUANIA("Lithuania"),
    @XmlEnumValue("Luxembourg")
    LUXEMBOURG("Luxembourg"),
    @XmlEnumValue("Macao")
    MACAO("Macao"),
    @XmlEnumValue("Macedonia")
    MACEDONIA("Macedonia"),
    @XmlEnumValue("Madagascar")
    MADAGASCAR("Madagascar"),
    @XmlEnumValue("Malawi")
    MALAWI("Malawi"),
    @XmlEnumValue("Malaysia")
    MALAYSIA("Malaysia"),
    @XmlEnumValue("Maldives")
    MALDIVES("Maldives"),
    @XmlEnumValue("Mali")
    MALI("Mali"),
    @XmlEnumValue("Malta")
    MALTA("Malta"),
    @XmlEnumValue("MarshallIslands")
    MARSHALL_ISLANDS("MarshallIslands"),
    @XmlEnumValue("Martinique")
    MARTINIQUE("Martinique"),
    @XmlEnumValue("Mauritania")
    MAURITANIA("Mauritania"),
    @XmlEnumValue("Mauritius")
    MAURITIUS("Mauritius"),
    @XmlEnumValue("Mayotte")
    MAYOTTE("Mayotte"),
    @XmlEnumValue("Mexico")
    MEXICO("Mexico"),
    @XmlEnumValue("Micronesia")
    MICRONESIA("Micronesia"),
    @XmlEnumValue("Moldova")
    MOLDOVA("Moldova"),
    @XmlEnumValue("Monaco")
    MONACO("Monaco"),
    @XmlEnumValue("Mongolia")
    MONGOLIA("Mongolia"),
    @XmlEnumValue("Montenegro")
    MONTENEGRO("Montenegro"),
    @XmlEnumValue("Montserrat")
    MONTSERRAT("Montserrat"),
    @XmlEnumValue("Morocco")
    MOROCCO("Morocco"),
    @XmlEnumValue("Mozambique")
    MOZAMBIQUE("Mozambique"),
    @XmlEnumValue("Myanmar")
    MYANMAR("Myanmar"),
    @XmlEnumValue("Namibia")
    NAMIBIA("Namibia"),
    @XmlEnumValue("Nauru")
    NAURU("Nauru"),
    @XmlEnumValue("Nepal")
    NEPAL("Nepal"),
    @XmlEnumValue("NetherlandsAntilles")
    NETHERLANDS_ANTILLES("NetherlandsAntilles"),
    @XmlEnumValue("Netherlands")
    NETHERLANDS("Netherlands"),
    @XmlEnumValue("NewCaledonia")
    NEW_CALEDONIA("NewCaledonia"),
    @XmlEnumValue("NewZealand")
    NEW_ZEALAND("NewZealand"),
    @XmlEnumValue("Nicaragua")
    NICARAGUA("Nicaragua"),
    @XmlEnumValue("Niger")
    NIGER("Niger"),
    @XmlEnumValue("Nigeria")
    NIGERIA("Nigeria"),
    @XmlEnumValue("Niue")
    NIUE("Niue"),
    @XmlEnumValue("NorfolkIsland")
    NORFOLK_ISLAND("NorfolkIsland"),
    @XmlEnumValue("NorthernMarianaIslands")
    NORTHERN_MARIANA_ISLANDS("NorthernMarianaIslands"),
    @XmlEnumValue("Norway")
    NORWAY("Norway"),
    @XmlEnumValue("Oman")
    OMAN("Oman"),
    @XmlEnumValue("Pakistan")
    PAKISTAN("Pakistan"),
    @XmlEnumValue("Palau")
    PALAU("Palau"),
    @XmlEnumValue("PalestinianTerritory")
    PALESTINIAN_TERRITORY("PalestinianTerritory"),
    @XmlEnumValue("Panama")
    PANAMA("Panama"),
    @XmlEnumValue("PapuaNewGuinea")
    PAPUA_NEW_GUINEA("PapuaNewGuinea"),
    @XmlEnumValue("Paraguay")
    PARAGUAY("Paraguay"),
    @XmlEnumValue("Peru")
    PERU("Peru"),
    @XmlEnumValue("Philippines")
    PHILIPPINES("Philippines"),
    @XmlEnumValue("PitcairnIslands")
    PITCAIRN_ISLANDS("PitcairnIslands"),
    @XmlEnumValue("Poland")
    POLAND("Poland"),
    @XmlEnumValue("Portugal")
    PORTUGAL("Portugal"),
    @XmlEnumValue("PuertoRico")
    PUERTO_RICO("PuertoRico"),
    @XmlEnumValue("Qatar")
    QATAR("Qatar"),
    @XmlEnumValue("Reunion")
    REUNION("Reunion"),
    @XmlEnumValue("Romania")
    ROMANIA("Romania"),
    @XmlEnumValue("RussianFederation")
    RUSSIAN_FEDERATION("RussianFederation"),
    @XmlEnumValue("Rwanda")
    RWANDA("Rwanda"),
    @XmlEnumValue("SaintBarthelemy")
    SAINT_BARTHELEMY("SaintBarthelemy"),
    @XmlEnumValue("SaintHelena")
    SAINT_HELENA("SaintHelena"),
    @XmlEnumValue("SaintKittsAndNevis")
    SAINT_KITTS_AND_NEVIS("SaintKittsAndNevis"),
    @XmlEnumValue("SaintLucia")
    SAINT_LUCIA("SaintLucia"),
    @XmlEnumValue("SaintMartin")
    SAINT_MARTIN("SaintMartin"),
    @XmlEnumValue("SaintPierreAndMiquelon")
    SAINT_PIERRE_AND_MIQUELON("SaintPierreAndMiquelon"),
    @XmlEnumValue("SaintVincentAndTheGrenadines")
    SAINT_VINCENT_AND_THE_GRENADINES("SaintVincentAndTheGrenadines"),
    @XmlEnumValue("Samoa")
    SAMOA("Samoa"),
    @XmlEnumValue("SanMarino")
    SAN_MARINO("SanMarino"),
    @XmlEnumValue("SaoTomeAndPrincipe")
    SAO_TOME_AND_PRINCIPE("SaoTomeAndPrincipe"),
    @XmlEnumValue("SaudiArabia")
    SAUDI_ARABIA("SaudiArabia"),
    @XmlEnumValue("Senegal")
    SENEGAL("Senegal"),
    @XmlEnumValue("Serbia")
    SERBIA("Serbia"),
    @XmlEnumValue("Seychelles")
    SEYCHELLES("Seychelles"),
    @XmlEnumValue("SierraLeone")
    SIERRA_LEONE("SierraLeone"),
    @XmlEnumValue("Singapore")
    SINGAPORE("Singapore"),
    @XmlEnumValue("Slovakia")
    SLOVAKIA("Slovakia"),
    @XmlEnumValue("Slovenia")
    SLOVENIA("Slovenia"),
    @XmlEnumValue("SolomonIslands")
    SOLOMON_ISLANDS("SolomonIslands"),
    @XmlEnumValue("Somalia")
    SOMALIA("Somalia"),
    @XmlEnumValue("SouthAfrica")
    SOUTH_AFRICA("SouthAfrica"),
    @XmlEnumValue("SouthGeorgiaAndTheSouthSandwichIslands")
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("SouthGeorgiaAndTheSouthSandwichIslands"),
    @XmlEnumValue("Spain")
    SPAIN("Spain"),
    @XmlEnumValue("SriLanka")
    SRI_LANKA("SriLanka"),
    @XmlEnumValue("Sudan")
    SUDAN("Sudan"),
    @XmlEnumValue("Suriname")
    SURINAME("Suriname"),
    @XmlEnumValue("SvalbardJanMayenIslands")
    SVALBARD_JAN_MAYEN_ISLANDS("SvalbardJanMayenIslands"),
    @XmlEnumValue("Swaziland")
    SWAZILAND("Swaziland"),
    @XmlEnumValue("Sweden")
    SWEDEN("Sweden"),
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),
    @XmlEnumValue("SyrianArabRepublic")
    SYRIAN_ARAB_REPUBLIC("SyrianArabRepublic"),
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),
    @XmlEnumValue("Tajikistan")
    TAJIKISTAN("Tajikistan"),
    @XmlEnumValue("Tanzania")
    TANZANIA("Tanzania"),
    @XmlEnumValue("Thailand")
    THAILAND("Thailand"),
    @XmlEnumValue("TimorLeste")
    TIMOR_LESTE("TimorLeste"),
    @XmlEnumValue("Togo")
    TOGO("Togo"),
    @XmlEnumValue("Tokelau")
    TOKELAU("Tokelau"),
    @XmlEnumValue("Tonga")
    TONGA("Tonga"),
    @XmlEnumValue("TrinidadAndTobago")
    TRINIDAD_AND_TOBAGO("TrinidadAndTobago"),
    @XmlEnumValue("Tunisia")
    TUNISIA("Tunisia"),
    @XmlEnumValue("Turkey")
    TURKEY("Turkey"),
    @XmlEnumValue("Turkmenistan")
    TURKMENISTAN("Turkmenistan"),
    @XmlEnumValue("TurksAndCaicosIslands")
    TURKS_AND_CAICOS_ISLANDS("TurksAndCaicosIslands"),
    @XmlEnumValue("Tuvalu")
    TUVALU("Tuvalu"),
    @XmlEnumValue("Uganda")
    UGANDA("Uganda"),
    @XmlEnumValue("Ukraine")
    UKRAINE("Ukraine"),
    @XmlEnumValue("UnitedArabEmirates")
    UNITED_ARAB_EMIRATES("UnitedArabEmirates"),
    UK("UK"),
    @XmlEnumValue("UnitedStatesOfAmerica")
    UNITED_STATES_OF_AMERICA("UnitedStatesOfAmerica"),
    @XmlEnumValue("UnitedStatesMinorOutlyingIslands")
    UNITED_STATES_MINOR_OUTLYING_ISLANDS("UnitedStatesMinorOutlyingIslands"),
    @XmlEnumValue("UnitedStatesVirginIslands")
    UNITED_STATES_VIRGIN_ISLANDS("UnitedStatesVirginIslands"),
    @XmlEnumValue("Uruguay")
    URUGUAY("Uruguay"),
    @XmlEnumValue("Uzbekistan")
    UZBEKISTAN("Uzbekistan"),
    @XmlEnumValue("Vanuatu")
    VANUATU("Vanuatu"),
    @XmlEnumValue("Venezuela")
    VENEZUELA("Venezuela"),
    @XmlEnumValue("Vietnam")
    VIETNAM("Vietnam"),
    @XmlEnumValue("WallisAndFutuna")
    WALLIS_AND_FUTUNA("WallisAndFutuna"),
    @XmlEnumValue("WesternSahara")
    WESTERN_SAHARA("WesternSahara"),
    @XmlEnumValue("Yemen")
    YEMEN("Yemen"),
    @XmlEnumValue("Zambia")
    ZAMBIA("Zambia"),
    @XmlEnumValue("Zimbabwe")
    ZIMBABWE("Zimbabwe");
    private final String value;

    Tara(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tara fromValue(String v) {
        for (Tara c: Tara.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
