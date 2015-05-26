
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherAsequenceSformat1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TdotmatcherAsequenceSformat1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="gcg"/>
 *     &lt;enumeration value="gcg8"/>
 *     &lt;enumeration value="embl"/>
 *     &lt;enumeration value="swiss"/>
 *     &lt;enumeration value="fasta"/>
 *     &lt;enumeration value="ncbi"/>
 *     &lt;enumeration value="genbank"/>
 *     &lt;enumeration value="nbrf"/>
 *     &lt;enumeration value="pir"/>
 *     &lt;enumeration value="codata"/>
 *     &lt;enumeration value="strider"/>
 *     &lt;enumeration value="clustal"/>
 *     &lt;enumeration value="phylip"/>
 *     &lt;enumeration value="acedb"/>
 *     &lt;enumeration value="msf"/>
 *     &lt;enumeration value="jackknifer"/>
 *     &lt;enumeration value="jackknifernon"/>
 *     &lt;enumeration value="nexus"/>
 *     &lt;enumeration value="nexusnon"/>
 *     &lt;enumeration value="treecon"/>
 *     &lt;enumeration value="mega"/>
 *     &lt;enumeration value="meganon"/>
 *     &lt;enumeration value="ig"/>
 *     &lt;enumeration value="staden"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="raw"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TdotmatcherAsequenceSformat1")
@XmlEnum
public enum TdotmatcherAsequenceSformat1 {

    @XmlEnumValue("gcg")
    GCG("gcg"),
    @XmlEnumValue("gcg8")
    GCG_8("gcg8"),
    @XmlEnumValue("embl")
    EMBL("embl"),
    @XmlEnumValue("swiss")
    SWISS("swiss"),
    @XmlEnumValue("fasta")
    FASTA("fasta"),
    @XmlEnumValue("ncbi")
    NCBI("ncbi"),
    @XmlEnumValue("genbank")
    GENBANK("genbank"),
    @XmlEnumValue("nbrf")
    NBRF("nbrf"),
    @XmlEnumValue("pir")
    PIR("pir"),
    @XmlEnumValue("codata")
    CODATA("codata"),
    @XmlEnumValue("strider")
    STRIDER("strider"),
    @XmlEnumValue("clustal")
    CLUSTAL("clustal"),
    @XmlEnumValue("phylip")
    PHYLIP("phylip"),
    @XmlEnumValue("acedb")
    ACEDB("acedb"),
    @XmlEnumValue("msf")
    MSF("msf"),
    @XmlEnumValue("jackknifer")
    JACKKNIFER("jackknifer"),
    @XmlEnumValue("jackknifernon")
    JACKKNIFERNON("jackknifernon"),
    @XmlEnumValue("nexus")
    NEXUS("nexus"),
    @XmlEnumValue("nexusnon")
    NEXUSNON("nexusnon"),
    @XmlEnumValue("treecon")
    TREECON("treecon"),
    @XmlEnumValue("mega")
    MEGA("mega"),
    @XmlEnumValue("meganon")
    MEGANON("meganon"),
    @XmlEnumValue("ig")
    IG("ig"),
    @XmlEnumValue("staden")
    STADEN("staden"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("raw")
    RAW("raw");
    private final String value;

    TdotmatcherAsequenceSformat1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdotmatcherAsequenceSformat1 fromValue(String v) {
        for (TdotmatcherAsequenceSformat1 c: TdotmatcherAsequenceSformat1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
