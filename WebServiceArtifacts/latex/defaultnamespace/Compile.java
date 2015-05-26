
package defaultnamespace;

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
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dpi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="utf8" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ochem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="embeddedData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "source",
    "device",
    "deviceInfo",
    "dpi",
    "utf8",
    "ochem",
    "embeddedData"
})
@XmlRootElement(name = "compile")
public class Compile {

    @XmlElement(required = true, nillable = true)
    protected String source;
    @XmlElement(required = true, nillable = true)
    protected String device;
    @XmlElement(required = true, nillable = true)
    protected String deviceInfo;
    protected int dpi;
    protected boolean utf8;
    protected boolean ochem;
    protected boolean embeddedData;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInfo(String value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the dpi property.
     * 
     */
    public int getDpi() {
        return dpi;
    }

    /**
     * Sets the value of the dpi property.
     * 
     */
    public void setDpi(int value) {
        this.dpi = value;
    }

    /**
     * Gets the value of the utf8 property.
     * 
     */
    public boolean isUtf8() {
        return utf8;
    }

    /**
     * Sets the value of the utf8 property.
     * 
     */
    public void setUtf8(boolean value) {
        this.utf8 = value;
    }

    /**
     * Gets the value of the ochem property.
     * 
     */
    public boolean isOchem() {
        return ochem;
    }

    /**
     * Sets the value of the ochem property.
     * 
     */
    public void setOchem(boolean value) {
        this.ochem = value;
    }

    /**
     * Gets the value of the embeddedData property.
     * 
     */
    public boolean isEmbeddedData() {
        return embeddedData;
    }

    /**
     * Sets the value of the embeddedData property.
     * 
     */
    public void setEmbeddedData(boolean value) {
        this.embeddedData = value;
    }

}
