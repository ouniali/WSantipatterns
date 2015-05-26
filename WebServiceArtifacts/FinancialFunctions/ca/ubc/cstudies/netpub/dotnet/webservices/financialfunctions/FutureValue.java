
package ca.ubc.cstudies.netpub.dotnet.webservices.financialfunctions;

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
 *         &lt;element name="InterestPerPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PresentValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "interestPerPeriod",
    "numberOfPeriods",
    "presentValue"
})
@XmlRootElement(name = "FutureValue")
public class FutureValue {

    @XmlElement(name = "InterestPerPeriod")
    protected double interestPerPeriod;
    @XmlElement(name = "NumberOfPeriods")
    protected int numberOfPeriods;
    @XmlElement(name = "PresentValue")
    protected double presentValue;

    /**
     * Gets the value of the interestPerPeriod property.
     * 
     */
    public double getInterestPerPeriod() {
        return interestPerPeriod;
    }

    /**
     * Sets the value of the interestPerPeriod property.
     * 
     */
    public void setInterestPerPeriod(double value) {
        this.interestPerPeriod = value;
    }

    /**
     * Gets the value of the numberOfPeriods property.
     * 
     */
    public int getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Sets the value of the numberOfPeriods property.
     * 
     */
    public void setNumberOfPeriods(int value) {
        this.numberOfPeriods = value;
    }

    /**
     * Gets the value of the presentValue property.
     * 
     */
    public double getPresentValue() {
        return presentValue;
    }

    /**
     * Sets the value of the presentValue property.
     * 
     */
    public void setPresentValue(double value) {
        this.presentValue = value;
    }

}
