
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPublicWebServiceEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPublicWebServiceEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPublicWebServiceEvent")
@XmlSeeAlso({
    IssuerTransformation.class,
    InstrumentTransformation.class,
    Dividend.class,
    IssuerAttributeChange.class,
    Payment.class,
    Split.class,
    SecurityAttributeChange.class,
    InstrumentAttributeChange.class
})
public abstract class AbstractPublicWebServiceEvent
    extends AbstractPublicWebServiceObj
{


}
