
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentOutputChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentOutputChoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="Outputs" type="{http://www.xignite.com/services/}ArrayOfInstrumentTransformationInputOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentOutputChoice", propOrder = {
    "outputs"
})
public class InstrumentOutputChoice
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "Outputs")
    protected ArrayOfInstrumentTransformationInputOutput outputs;

    /**
     * Gets the value of the outputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentTransformationInputOutput }
     *     
     */
    public ArrayOfInstrumentTransformationInputOutput getOutputs() {
        return outputs;
    }

    /**
     * Sets the value of the outputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentTransformationInputOutput }
     *     
     */
    public void setOutputs(ArrayOfInstrumentTransformationInputOutput value) {
        this.outputs = value;
    }

}
