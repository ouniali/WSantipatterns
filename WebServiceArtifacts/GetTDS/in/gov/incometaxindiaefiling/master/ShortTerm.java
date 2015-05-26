
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
 *         &lt;element name="ShortTermUs111A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShortTermOther">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalShortTerm">
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
    "shortTermUs111A",
    "shortTermOther",
    "totalShortTerm"
})
@XmlRootElement(name = "ShortTerm")
public class ShortTerm {

    @XmlElement(name = "ShortTermUs111A", defaultValue = "0")
    protected long shortTermUs111A;
    @XmlElement(name = "ShortTermOther", defaultValue = "0")
    protected long shortTermOther;
    @XmlElement(name = "TotalShortTerm", defaultValue = "0")
    protected long totalShortTerm;

    /**
     * Gets the value of the shortTermUs111A property.
     * 
     */
    public long getShortTermUs111A() {
        return shortTermUs111A;
    }

    /**
     * Sets the value of the shortTermUs111A property.
     * 
     */
    public void setShortTermUs111A(long value) {
        this.shortTermUs111A = value;
    }

    /**
     * Gets the value of the shortTermOther property.
     * 
     */
    public long getShortTermOther() {
        return shortTermOther;
    }

    /**
     * Sets the value of the shortTermOther property.
     * 
     */
    public void setShortTermOther(long value) {
        this.shortTermOther = value;
    }

    /**
     * Gets the value of the totalShortTerm property.
     * 
     */
    public long getTotalShortTerm() {
        return totalShortTerm;
    }

    /**
     * Sets the value of the totalShortTerm property.
     * 
     */
    public void setTotalShortTerm(long value) {
        this.totalShortTerm = value;
    }

}
