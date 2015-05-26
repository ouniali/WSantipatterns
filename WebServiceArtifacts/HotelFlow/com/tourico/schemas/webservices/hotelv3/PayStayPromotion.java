
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayStayPromotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayStayPromotion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Promotion">
 *       &lt;attribute name="pay" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="stay" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayStayPromotion")
public class PayStayPromotion
    extends Promotion
{

    @XmlAttribute(name = "pay", required = true)
    protected int pay;
    @XmlAttribute(name = "stay", required = true)
    protected int stay;

    /**
     * Gets the value of the pay property.
     * 
     */
    public int getPay() {
        return pay;
    }

    /**
     * Sets the value of the pay property.
     * 
     */
    public void setPay(int value) {
        this.pay = value;
    }

    /**
     * Gets the value of the stay property.
     * 
     */
    public int getStay() {
        return stay;
    }

    /**
     * Sets the value of the stay property.
     * 
     */
    public void setStay(int value) {
        this.stay = value;
    }

}
