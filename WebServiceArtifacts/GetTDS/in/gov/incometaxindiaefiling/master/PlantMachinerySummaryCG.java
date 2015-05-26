
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
 *         &lt;element name="DeprBlockTot15Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot30Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot40Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot50Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot60Percent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeprBlockTot80Percent">
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
 *         &lt;element name="TotPlntMach">
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
    "deprBlockTot15Percent",
    "deprBlockTot30Percent",
    "deprBlockTot40Percent",
    "deprBlockTot50Percent",
    "deprBlockTot60Percent",
    "deprBlockTot80Percent",
    "deprBlockTot100Percent",
    "totPlntMach"
})
@XmlRootElement(name = "PlantMachinerySummaryCG")
public class PlantMachinerySummaryCG {

    @XmlElement(name = "DeprBlockTot15Percent", defaultValue = "0")
    protected long deprBlockTot15Percent;
    @XmlElement(name = "DeprBlockTot30Percent", defaultValue = "0")
    protected long deprBlockTot30Percent;
    @XmlElement(name = "DeprBlockTot40Percent", defaultValue = "0")
    protected long deprBlockTot40Percent;
    @XmlElement(name = "DeprBlockTot50Percent", defaultValue = "0")
    protected long deprBlockTot50Percent;
    @XmlElement(name = "DeprBlockTot60Percent", defaultValue = "0")
    protected long deprBlockTot60Percent;
    @XmlElement(name = "DeprBlockTot80Percent", defaultValue = "0")
    protected long deprBlockTot80Percent;
    @XmlElement(name = "DeprBlockTot100Percent", defaultValue = "0")
    protected long deprBlockTot100Percent;
    @XmlElement(name = "TotPlntMach", defaultValue = "0")
    protected long totPlntMach;

    /**
     * Gets the value of the deprBlockTot15Percent property.
     * 
     */
    public long getDeprBlockTot15Percent() {
        return deprBlockTot15Percent;
    }

    /**
     * Sets the value of the deprBlockTot15Percent property.
     * 
     */
    public void setDeprBlockTot15Percent(long value) {
        this.deprBlockTot15Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot30Percent property.
     * 
     */
    public long getDeprBlockTot30Percent() {
        return deprBlockTot30Percent;
    }

    /**
     * Sets the value of the deprBlockTot30Percent property.
     * 
     */
    public void setDeprBlockTot30Percent(long value) {
        this.deprBlockTot30Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot40Percent property.
     * 
     */
    public long getDeprBlockTot40Percent() {
        return deprBlockTot40Percent;
    }

    /**
     * Sets the value of the deprBlockTot40Percent property.
     * 
     */
    public void setDeprBlockTot40Percent(long value) {
        this.deprBlockTot40Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot50Percent property.
     * 
     */
    public long getDeprBlockTot50Percent() {
        return deprBlockTot50Percent;
    }

    /**
     * Sets the value of the deprBlockTot50Percent property.
     * 
     */
    public void setDeprBlockTot50Percent(long value) {
        this.deprBlockTot50Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot60Percent property.
     * 
     */
    public long getDeprBlockTot60Percent() {
        return deprBlockTot60Percent;
    }

    /**
     * Sets the value of the deprBlockTot60Percent property.
     * 
     */
    public void setDeprBlockTot60Percent(long value) {
        this.deprBlockTot60Percent = value;
    }

    /**
     * Gets the value of the deprBlockTot80Percent property.
     * 
     */
    public long getDeprBlockTot80Percent() {
        return deprBlockTot80Percent;
    }

    /**
     * Sets the value of the deprBlockTot80Percent property.
     * 
     */
    public void setDeprBlockTot80Percent(long value) {
        this.deprBlockTot80Percent = value;
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
     * Gets the value of the totPlntMach property.
     * 
     */
    public long getTotPlntMach() {
        return totPlntMach;
    }

    /**
     * Sets the value of the totPlntMach property.
     * 
     */
    public void setTotPlntMach(long value) {
        this.totPlntMach = value;
    }

}
