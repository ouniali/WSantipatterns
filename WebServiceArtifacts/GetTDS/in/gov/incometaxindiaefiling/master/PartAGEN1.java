
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}PersonalInfo"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}FilingStatus"/>
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
    "personalInfo",
    "filingStatus"
})
@XmlRootElement(name = "PartA_GEN1")
public class PartAGEN1 {

    @XmlElement(name = "PersonalInfo", required = true)
    protected PersonalInfo personalInfo;
    @XmlElement(name = "FilingStatus", required = true)
    protected FilingStatus filingStatus;

    /**
     * Gets the value of the personalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfo }
     *     
     */
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Sets the value of the personalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfo }
     *     
     */
    public void setPersonalInfo(PersonalInfo value) {
        this.personalInfo = value;
    }

    /**
     * Gets the value of the filingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FilingStatus }
     *     
     */
    public FilingStatus getFilingStatus() {
        return filingStatus;
    }

    /**
     * Sets the value of the filingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingStatus }
     *     
     */
    public void setFilingStatus(FilingStatus value) {
        this.filingStatus = value;
    }

}
