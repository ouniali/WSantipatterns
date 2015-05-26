
package org.mondor;

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
 *         &lt;element name="UpgradeAccessCodeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "upgradeAccessCodeResult"
})
@XmlRootElement(name = "UpgradeAccessCodeResponse")
public class UpgradeAccessCodeResponse {

    @XmlElement(name = "UpgradeAccessCodeResult")
    protected boolean upgradeAccessCodeResult;

    /**
     * Gets the value of the upgradeAccessCodeResult property.
     * 
     */
    public boolean isUpgradeAccessCodeResult() {
        return upgradeAccessCodeResult;
    }

    /**
     * Sets the value of the upgradeAccessCodeResult property.
     * 
     */
    public void setUpgradeAccessCodeResult(boolean value) {
        this.upgradeAccessCodeResult = value;
    }

}
