
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI2_RecherchePointRelais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_RecherchePointRelais">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="PR01" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR02" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR03" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR04" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR05" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR06" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR07" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR08" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR09" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *         &lt;element name="PR10" type="{http://www.mondialrelay.fr/webservice/}ret_WSI2_sub_PointRelais" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_RecherchePointRelais", propOrder = {
    "pr01",
    "pr02",
    "pr03",
    "pr04",
    "pr05",
    "pr06",
    "pr07",
    "pr08",
    "pr09",
    "pr10"
})
public class RetWSI2RecherchePointRelais
    extends Ret
{

    @XmlElement(name = "PR01")
    protected RetWSI2SubPointRelais pr01;
    @XmlElement(name = "PR02")
    protected RetWSI2SubPointRelais pr02;
    @XmlElement(name = "PR03")
    protected RetWSI2SubPointRelais pr03;
    @XmlElement(name = "PR04")
    protected RetWSI2SubPointRelais pr04;
    @XmlElement(name = "PR05")
    protected RetWSI2SubPointRelais pr05;
    @XmlElement(name = "PR06")
    protected RetWSI2SubPointRelais pr06;
    @XmlElement(name = "PR07")
    protected RetWSI2SubPointRelais pr07;
    @XmlElement(name = "PR08")
    protected RetWSI2SubPointRelais pr08;
    @XmlElement(name = "PR09")
    protected RetWSI2SubPointRelais pr09;
    @XmlElement(name = "PR10")
    protected RetWSI2SubPointRelais pr10;

    /**
     * Gets the value of the pr01 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR01() {
        return pr01;
    }

    /**
     * Sets the value of the pr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR01(RetWSI2SubPointRelais value) {
        this.pr01 = value;
    }

    /**
     * Gets the value of the pr02 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR02() {
        return pr02;
    }

    /**
     * Sets the value of the pr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR02(RetWSI2SubPointRelais value) {
        this.pr02 = value;
    }

    /**
     * Gets the value of the pr03 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR03() {
        return pr03;
    }

    /**
     * Sets the value of the pr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR03(RetWSI2SubPointRelais value) {
        this.pr03 = value;
    }

    /**
     * Gets the value of the pr04 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR04() {
        return pr04;
    }

    /**
     * Sets the value of the pr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR04(RetWSI2SubPointRelais value) {
        this.pr04 = value;
    }

    /**
     * Gets the value of the pr05 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR05() {
        return pr05;
    }

    /**
     * Sets the value of the pr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR05(RetWSI2SubPointRelais value) {
        this.pr05 = value;
    }

    /**
     * Gets the value of the pr06 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR06() {
        return pr06;
    }

    /**
     * Sets the value of the pr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR06(RetWSI2SubPointRelais value) {
        this.pr06 = value;
    }

    /**
     * Gets the value of the pr07 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR07() {
        return pr07;
    }

    /**
     * Sets the value of the pr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR07(RetWSI2SubPointRelais value) {
        this.pr07 = value;
    }

    /**
     * Gets the value of the pr08 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR08() {
        return pr08;
    }

    /**
     * Sets the value of the pr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR08(RetWSI2SubPointRelais value) {
        this.pr08 = value;
    }

    /**
     * Gets the value of the pr09 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR09() {
        return pr09;
    }

    /**
     * Sets the value of the pr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR09(RetWSI2SubPointRelais value) {
        this.pr09 = value;
    }

    /**
     * Gets the value of the pr10 property.
     * 
     * @return
     *     possible object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public RetWSI2SubPointRelais getPR10() {
        return pr10;
    }

    /**
     * Sets the value of the pr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetWSI2SubPointRelais }
     *     
     */
    public void setPR10(RetWSI2SubPointRelais value) {
        this.pr10 = value;
    }

}
