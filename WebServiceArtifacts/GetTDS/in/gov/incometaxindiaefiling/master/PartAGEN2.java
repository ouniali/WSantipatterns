
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AuditInfo"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}NatOfBus"/>
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
    "auditInfo",
    "natOfBus"
})
@XmlRootElement(name = "PartA_GEN2")
public class PartAGEN2 {

    @XmlElement(name = "AuditInfo", required = true)
    protected AuditInfo auditInfo;
    @XmlElement(name = "NatOfBus", required = true)
    protected NatOfBus natOfBus;

    /**
     * Gets the value of the auditInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuditInfo }
     *     
     */
    public AuditInfo getAuditInfo() {
        return auditInfo;
    }

    /**
     * Sets the value of the auditInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditInfo }
     *     
     */
    public void setAuditInfo(AuditInfo value) {
        this.auditInfo = value;
    }

    /**
     * Gets the value of the natOfBus property.
     * 
     * @return
     *     possible object is
     *     {@link NatOfBus }
     *     
     */
    public NatOfBus getNatOfBus() {
        return natOfBus;
    }

    /**
     * Sets the value of the natOfBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatOfBus }
     *     
     */
    public void setNatOfBus(NatOfBus value) {
        this.natOfBus = value;
    }

}
