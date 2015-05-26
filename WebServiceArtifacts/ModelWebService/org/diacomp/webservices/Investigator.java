
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Investigator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Investigator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}Member">
 *       &lt;sequence>
 *         &lt;element name="PrincipalInvestigatorID" type="{http://www.diacomp.org/webservices/}ID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Investigator", propOrder = {
    "principalInvestigatorID"
})
public class Investigator
    extends Member
{

    @XmlElement(name = "PrincipalInvestigatorID", required = true)
    protected ID principalInvestigatorID;

    /**
     * Gets the value of the principalInvestigatorID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getPrincipalInvestigatorID() {
        return principalInvestigatorID;
    }

    /**
     * Sets the value of the principalInvestigatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setPrincipalInvestigatorID(ID value) {
        this.principalInvestigatorID = value;
    }

}
