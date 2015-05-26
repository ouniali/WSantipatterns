
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of Profile objects or Unique IDs of Profiles.
 * 
 * <p>Java class for HotelSearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.whl.travel/soap}ItemSearchCriterionType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchCriterionType")
@XmlSeeAlso({
    travel.whl.api.soap.HotelSearchCriteriaType.Criterion.class
})
public class HotelSearchCriterionType
    extends ItemSearchCriterionType
{


}
