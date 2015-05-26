
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}Object">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDObject")
@XmlSeeAlso({
    Publication.class,
    Experiment.class,
    Journal.class,
    Document.class,
    Strain.class,
    DataUnit.class,
    Protocol.class,
    Species.class
})
public abstract class IDObject
    extends Object
{


}
