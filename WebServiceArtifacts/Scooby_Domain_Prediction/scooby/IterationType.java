
package scooby;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for iterationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iterationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="num" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pred" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iterationType", propOrder = {
    "value"
})
public class IterationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "num", required = true)
    protected int num;
    @XmlAttribute(name = "score", required = true)
    protected float score;
    @XmlAttribute(name = "pred", required = true)
    protected int pred;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the num property.
     * 
     */
    public int getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     */
    public void setNum(int value) {
        this.num = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public float getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(float value) {
        this.score = value;
    }

    /**
     * Gets the value of the pred property.
     * 
     */
    public int getPred() {
        return pred;
    }

    /**
     * Sets the value of the pred property.
     * 
     */
    public void setPred(int value) {
        this.pred = value;
    }

}
