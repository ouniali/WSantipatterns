
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPublicWebServiceObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPublicWebServiceObj">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="DataProvider" type="{http://www.xignite.com/services/}DataProviders"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPublicWebServiceObj", propOrder = {
    "dataProvider"
})
@XmlSeeAlso({
    PossibleValues.class,
    DistributionSet.class,
    DistributionDividend.class,
    SplitHistory.class,
    SplitTotal.class,
    DividendHistory.class,
    InstrumentTransformationInputOutput.class,
    CorporateAction.class,
    DistributionPayment.class,
    PaymentHistory.class,
    InstrumentOutputChoice.class,
    AbstractPublicWebServiceEvent.class,
    InterestPaymentFixing.class
})
public abstract class AbstractPublicWebServiceObj
    extends Common
{

    @XmlElement(name = "DataProvider", required = true)
    @XmlSchemaType(name = "string")
    protected DataProviders dataProvider;

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link DataProviders }
     *     
     */
    public DataProviders getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProviders }
     *     
     */
    public void setDataProvider(DataProviders value) {
        this.dataProvider = value;
    }

}
