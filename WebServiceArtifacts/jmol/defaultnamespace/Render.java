
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
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scaling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rotatex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rotatey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rotatez" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commands" type="{http://DefaultNamespace}ArrayOfString"/>
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
    "data",
    "width",
    "height",
    "scaling",
    "rotatex",
    "rotatey",
    "rotatez",
    "bgcolor",
    "commands",
    "embeddedData"
})
@XmlRootElement(name = "render")
public class Render {

    @XmlElement(required = true, nillable = true)
    protected String data;
    protected int width;
    protected int height;
    protected int scaling;
    protected int rotatex;
    protected int rotatey;
    protected int rotatez;
    @XmlElement(required = true, nillable = true)
    protected String bgcolor;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString commands;
    protected boolean embeddedData;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the scaling property.
     * 
     */
    public int getScaling() {
        return scaling;
    }

    /**
     * Sets the value of the scaling property.
     * 
     */
    public void setScaling(int value) {
        this.scaling = value;
    }

    /**
     * Gets the value of the rotatex property.
     * 
     */
    public int getRotatex() {
        return rotatex;
    }

    /**
     * Sets the value of the rotatex property.
     * 
     */
    public void setRotatex(int value) {
        this.rotatex = value;
    }

    /**
     * Gets the value of the rotatey property.
     * 
     */
    public int getRotatey() {
        return rotatey;
    }

    /**
     * Sets the value of the rotatey property.
     * 
     */
    public void setRotatey(int value) {
        this.rotatey = value;
    }

    /**
     * Gets the value of the rotatez property.
     * 
     */
    public int getRotatez() {
        return rotatez;
    }

    /**
     * Sets the value of the rotatez property.
     * 
     */
    public void setRotatez(int value) {
        this.rotatez = value;
    }

    /**
     * Gets the value of the bgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the value of the bgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgcolor(String value) {
        this.bgcolor = value;
    }

    /**
     * Gets the value of the commands property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCommands() {
        return commands;
    }

    /**
     * Sets the value of the commands property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCommands(ArrayOfString value) {
        this.commands = value;
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
