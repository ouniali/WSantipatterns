
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherMatrixfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdotmatcherMatrixfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matrixfile_direct_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matrixfile_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdotmatcherMatrixfile", propOrder = {
    "matrixfileDirectData",
    "matrixfileUrl"
})
public class TdotmatcherMatrixfile {

    @XmlElement(name = "matrixfile_direct_data")
    protected String matrixfileDirectData;
    @XmlElement(name = "matrixfile_url")
    protected String matrixfileUrl;

    /**
     * Gets the value of the matrixfileDirectData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixfileDirectData() {
        return matrixfileDirectData;
    }

    /**
     * Sets the value of the matrixfileDirectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixfileDirectData(String value) {
        this.matrixfileDirectData = value;
    }

    /**
     * Gets the value of the matrixfileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixfileUrl() {
        return matrixfileUrl;
    }

    /**
     * Sets the value of the matrixfileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixfileUrl(String value) {
        this.matrixfileUrl = value;
    }

}
