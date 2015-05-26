
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageDetailsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *       &lt;attribute name="CoverageTextType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CoverageTextType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageDetailsType")
public class CoverageDetailsType
    extends FormattedTextTextType
{

    @XmlAttribute(name = "CoverageTextType", required = true)
    protected CoverageTextType coverageTextType;

    /**
     * Gets the value of the coverageTextType property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageTextType }
     *     
     */
    public CoverageTextType getCoverageTextType() {
        return coverageTextType;
    }

    /**
     * Sets the value of the coverageTextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageTextType }
     *     
     */
    public void setCoverageTextType(CoverageTextType value) {
        this.coverageTextType = value;
    }

}
