
package com.v3leisure.schemas.cabs._1_0.cabs_providersearch_rq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.COResponsePagingRQType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.PSQueryRQType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.PSResponseInclusionsRQType;


/**
 * <p>Java class for CABS_ProviderSearch_RQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABS_ProviderSearch_RQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Paging" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_ResponsePagingRQType" minOccurs="0"/>
 *           &lt;element name="Query" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_QueryRQType" minOccurs="0"/>
 *           &lt;element name="Channels" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderSearch_RQ.xsd}ArrayOfCO_DistributionChannelRQType" minOccurs="0"/>
 *           &lt;element name="Response" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionsRQType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABS_ProviderSearch_RQ", propOrder = {
    "pagingOrQueryOrChannels"
})
public class CABSProviderSearchRQ {

    @XmlElements({
        @XmlElement(name = "Paging", type = COResponsePagingRQType.class),
        @XmlElement(name = "Query", type = PSQueryRQType.class),
        @XmlElement(name = "Channels", type = ArrayOfCODistributionChannelRQType.class),
        @XmlElement(name = "Response", type = PSResponseInclusionsRQType.class)
    })
    protected List<Object> pagingOrQueryOrChannels;

    /**
     * Gets the value of the pagingOrQueryOrChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagingOrQueryOrChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagingOrQueryOrChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COResponsePagingRQType }
     * {@link PSQueryRQType }
     * {@link ArrayOfCODistributionChannelRQType }
     * {@link PSResponseInclusionsRQType }
     * 
     * 
     */
    public List<Object> getPagingOrQueryOrChannels() {
        if (pagingOrQueryOrChannels == null) {
            pagingOrQueryOrChannels = new ArrayList<Object>();
        }
        return this.pagingOrQueryOrChannels;
    }

}
