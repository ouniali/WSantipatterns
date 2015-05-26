
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TicketInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}MCOInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TCRInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "ticketInfo",
    "mcoInfo",
    "tcrInfo"
})
@XmlRootElement(name = "DocumentInfo")
public class DocumentInfo {

    @XmlElement(name = "TicketInfo")
    protected List<TicketInfo> ticketInfo;
    @XmlElement(name = "MCOInfo")
    protected List<MCOInfo> mcoInfo;
    @XmlElement(name = "TCRInfo")
    protected List<TCRInfo> tcrInfo;

    /**
     * Gets the value of the ticketInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketInfo }
     * 
     * 
     */
    public List<TicketInfo> getTicketInfo() {
        if (ticketInfo == null) {
            ticketInfo = new ArrayList<TicketInfo>();
        }
        return this.ticketInfo;
    }

    /**
     * Gets the value of the mcoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCOInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCOInfo }
     * 
     * 
     */
    public List<MCOInfo> getMCOInfo() {
        if (mcoInfo == null) {
            mcoInfo = new ArrayList<MCOInfo>();
        }
        return this.mcoInfo;
    }

    /**
     * Gets the value of the tcrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRInfo }
     * 
     * 
     */
    public List<TCRInfo> getTCRInfo() {
        if (tcrInfo == null) {
            tcrInfo = new ArrayList<TCRInfo>();
        }
        return this.tcrInfo;
    }

}
