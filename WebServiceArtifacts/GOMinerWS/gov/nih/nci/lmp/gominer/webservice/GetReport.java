
package gov.nih.nci.lmp.gominer.webservice;

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
 *         &lt;element name="in0" type="{http://webservice.gominer.lmp.nci.nih.gov}ArrayOfString"/>
 *         &lt;element name="in1" type="{http://webservice.gominer.lmp.nci.nih.gov}ArrayOfString"/>
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="in3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="in4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="in5" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="in6" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="in7" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "in0",
    "in1",
    "in2",
    "in3",
    "in4",
    "in5",
    "in6",
    "in7"
})
@XmlRootElement(name = "getReport")
public class GetReport {

    @XmlElement(required = true)
    protected ArrayOfString in0;
    @XmlElement(required = true)
    protected ArrayOfString in1;
    @XmlElement(required = true)
    protected String in2;
    @XmlElement(required = true)
    protected String in3;
    @XmlElement(required = true)
    protected String in4;
    protected boolean in5;
    protected boolean in6;
    protected boolean in7;

    /**
     * Gets the value of the in0 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getIn0() {
        return in0;
    }

    /**
     * Sets the value of the in0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setIn0(ArrayOfString value) {
        this.in0 = value;
    }

    /**
     * Gets the value of the in1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getIn1() {
        return in1;
    }

    /**
     * Sets the value of the in1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setIn1(ArrayOfString value) {
        this.in1 = value;
    }

    /**
     * Gets the value of the in2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn2() {
        return in2;
    }

    /**
     * Sets the value of the in2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn2(String value) {
        this.in2 = value;
    }

    /**
     * Gets the value of the in3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn3() {
        return in3;
    }

    /**
     * Sets the value of the in3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn3(String value) {
        this.in3 = value;
    }

    /**
     * Gets the value of the in4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4() {
        return in4;
    }

    /**
     * Sets the value of the in4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4(String value) {
        this.in4 = value;
    }

    /**
     * Gets the value of the in5 property.
     * 
     */
    public boolean isIn5() {
        return in5;
    }

    /**
     * Sets the value of the in5 property.
     * 
     */
    public void setIn5(boolean value) {
        this.in5 = value;
    }

    /**
     * Gets the value of the in6 property.
     * 
     */
    public boolean isIn6() {
        return in6;
    }

    /**
     * Sets the value of the in6 property.
     * 
     */
    public void setIn6(boolean value) {
        this.in6 = value;
    }

    /**
     * Gets the value of the in7 property.
     * 
     */
    public boolean isIn7() {
        return in7;
    }

    /**
     * Sets the value of the in7 property.
     * 
     */
    public void setIn7(boolean value) {
        this.in7 = value;
    }

}
