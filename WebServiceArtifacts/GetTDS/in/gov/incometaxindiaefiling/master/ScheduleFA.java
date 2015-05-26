
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DetailsForiegnBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DetailsFinancialInterest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DetailsImmovableProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DetailsOthAssets" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DetailsOfAccntsHvngSigningAuth" maxOccurs="unbounded" minOccurs="0"/>
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
    "detailsForiegnBank",
    "detailsFinancialInterest",
    "detailsImmovableProperty",
    "detailsOthAssets",
    "detailsOfAccntsHvngSigningAuth"
})
@XmlRootElement(name = "ScheduleFA")
public class ScheduleFA {

    @XmlElement(name = "DetailsForiegnBank")
    protected List<DetailsForiegnBank> detailsForiegnBank;
    @XmlElement(name = "DetailsFinancialInterest")
    protected List<DetailsFinancialInterest> detailsFinancialInterest;
    @XmlElement(name = "DetailsImmovableProperty")
    protected List<DetailsImmovableProperty> detailsImmovableProperty;
    @XmlElement(name = "DetailsOthAssets")
    protected List<DetailsOthAssets> detailsOthAssets;
    @XmlElement(name = "DetailsOfAccntsHvngSigningAuth")
    protected List<DetailsOfAccntsHvngSigningAuth> detailsOfAccntsHvngSigningAuth;

    /**
     * Gets the value of the detailsForiegnBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsForiegnBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsForiegnBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsForiegnBank }
     * 
     * 
     */
    public List<DetailsForiegnBank> getDetailsForiegnBank() {
        if (detailsForiegnBank == null) {
            detailsForiegnBank = new ArrayList<DetailsForiegnBank>();
        }
        return this.detailsForiegnBank;
    }

    /**
     * Gets the value of the detailsFinancialInterest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsFinancialInterest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsFinancialInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsFinancialInterest }
     * 
     * 
     */
    public List<DetailsFinancialInterest> getDetailsFinancialInterest() {
        if (detailsFinancialInterest == null) {
            detailsFinancialInterest = new ArrayList<DetailsFinancialInterest>();
        }
        return this.detailsFinancialInterest;
    }

    /**
     * Gets the value of the detailsImmovableProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsImmovableProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsImmovableProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsImmovableProperty }
     * 
     * 
     */
    public List<DetailsImmovableProperty> getDetailsImmovableProperty() {
        if (detailsImmovableProperty == null) {
            detailsImmovableProperty = new ArrayList<DetailsImmovableProperty>();
        }
        return this.detailsImmovableProperty;
    }

    /**
     * Gets the value of the detailsOthAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsOthAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsOthAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsOthAssets }
     * 
     * 
     */
    public List<DetailsOthAssets> getDetailsOthAssets() {
        if (detailsOthAssets == null) {
            detailsOthAssets = new ArrayList<DetailsOthAssets>();
        }
        return this.detailsOthAssets;
    }

    /**
     * Gets the value of the detailsOfAccntsHvngSigningAuth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsOfAccntsHvngSigningAuth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsOfAccntsHvngSigningAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsOfAccntsHvngSigningAuth }
     * 
     * 
     */
    public List<DetailsOfAccntsHvngSigningAuth> getDetailsOfAccntsHvngSigningAuth() {
        if (detailsOfAccntsHvngSigningAuth == null) {
            detailsOfAccntsHvngSigningAuth = new ArrayList<DetailsOfAccntsHvngSigningAuth>();
        }
        return this.detailsOfAccntsHvngSigningAuth;
    }

}
