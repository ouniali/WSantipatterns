
package in.gov.incometaxindiaefiling.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeprBlockTot5Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot10Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot100Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotBuildng">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deprBlockTot5Percent",
    "deprBlockTot10Percent",
    "deprBlockTot100Percent",
    "totBuildng"
})
@XmlRootElement(name = "BuildingSummaryCG")
public class BuildingSummaryCG {

    @XmlElement(name = "DeprBlockTot5Percent", defaultValue = "0")
    protected long deprBlockTot5Percent;
    @XmlElement(name = "DeprBlockTot10Percent", defaultValue = "0")
    protected long deprBlockTot10Percent;
    @XmlElement(name = "DeprBlockTot100Percent", defaultValue = "0")
    protected long deprBlockTot100Percent;
    @XmlElement(name = "TotBuildng", defaultValue = "0")
    protected long totBuildng;

    /**
     * Gets the value of the deprBlockTot5Percent property.
     * 
     */
    public long getDeprBlockTot5Percent() {
        return deprBlockTot5Percent;
    }

    /**
     * Sets the value of the deprBlockTot5Percent property.
     * 
     */
    public void setDeprBlockTot5Percent(long value) {
        this.deprBlockTot5Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot10Percent property.
     * 
     */
    public long getDeprBlockTot10Percent() {
        return deprBlockTot10Percent;
    }

    /**
     * Sets the value of the deprBlockTot10Percent property.
     * 
     */
    public void setDeprBlockTot10Percent(long value) {
        this.deprBlockTot10Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot100Percent property.
     * 
     */
    public long getDeprBlockTot100Percent() {
        return deprBlockTot100Percent;
    }

    /**
     * Sets the value of the deprBlockTot100Percent property.
     * 
     */
    public void setDeprBlockTot100Percent(long value) {
        this.deprBlockTot100Percent = value;
    }

    /**
     * Gets the value of the totBuildng property.
     * 
     */
    public long getTotBuildng() {
        return totBuildng;
    }

    /**
     * Sets the value of the totBuildng property.
     * 
     */
    public void setTotBuildng(long value) {
        this.totBuildng = value;
    }

}
