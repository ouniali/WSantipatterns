
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherResultGraphics_container complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdotmatcherResultGraphics_container">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Graphics" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Graphics_in_Postscript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Graphics_in_PNG" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdotmatcherResultGraphics_container", propOrder = {
    "graphics",
    "graphicsInPostscript",
    "graphicsInPNG"
})
public class TdotmatcherResultGraphicsContainer {

    @XmlElement(name = "Graphics")
    protected byte[] graphics;
    @XmlElement(name = "Graphics_in_Postscript")
    protected String graphicsInPostscript;
    @XmlElement(name = "Graphics_in_PNG")
    protected List<byte[]> graphicsInPNG;

    /**
     * Gets the value of the graphics property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGraphics() {
        return graphics;
    }

    /**
     * Sets the value of the graphics property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGraphics(byte[] value) {
        this.graphics = value;
    }

    /**
     * Gets the value of the graphicsInPostscript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsInPostscript() {
        return graphicsInPostscript;
    }

    /**
     * Sets the value of the graphicsInPostscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsInPostscript(String value) {
        this.graphicsInPostscript = value;
    }

    /**
     * Gets the value of the graphicsInPNG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsInPNG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsInPNG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getGraphicsInPNG() {
        if (graphicsInPNG == null) {
            graphicsInPNG = new ArrayList<byte[]>();
        }
        return this.graphicsInPNG;
    }

}
