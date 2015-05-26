
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDAProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDAProductInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.digikey.com/SearchWS}ProductInfoOfEDAPricing">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDAProductInfo")
@XmlSeeAlso({
    EDAProductInfoInt.class,
    EDAProductInfoUnspsc.class
})
public class EDAProductInfo
    extends ProductInfoOfEDAPricing
{


}
