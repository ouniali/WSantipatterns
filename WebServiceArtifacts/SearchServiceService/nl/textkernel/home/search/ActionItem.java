
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideOnSearchResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hideOnSavedResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hideOnCompareView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectionParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ajaxMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="window" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noSelectionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowNoSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="actionLinks" type="{http://home.textkernel.nl/search}actionLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionItem", propOrder = {
    "requiredParameter",
    "name",
    "label",
    "hideOnSearchResults",
    "hideOnSavedResults",
    "hideOnCompareView",
    "url",
    "function",
    "selectionParameter",
    "method",
    "ajaxMethod",
    "window",
    "successMessage",
    "errorMessage",
    "noSelectionMessage",
    "extraParameters",
    "prefix",
    "includeFields",
    "includeState",
    "allowNoSelection",
    "actionLinks"
})
@XmlSeeAlso({
    ActionLink.class
})
public class ActionItem {

    protected String requiredParameter;
    protected String name;
    protected String label;
    protected Boolean hideOnSearchResults;
    protected Boolean hideOnSavedResults;
    protected Boolean hideOnCompareView;
    protected String url;
    protected String function;
    protected String selectionParameter;
    protected String method;
    protected String ajaxMethod;
    protected String window;
    protected String successMessage;
    protected String errorMessage;
    protected String noSelectionMessage;
    protected String extraParameters;
    protected String prefix;
    protected String includeFields;
    protected Boolean includeState;
    protected Boolean allowNoSelection;
    @XmlElement(nillable = true)
    protected List<ActionLink> actionLinks;

    /**
     * Gets the value of the requiredParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredParameter() {
        return requiredParameter;
    }

    /**
     * Sets the value of the requiredParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredParameter(String value) {
        this.requiredParameter = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the hideOnSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideOnSearchResults() {
        return hideOnSearchResults;
    }

    /**
     * Sets the value of the hideOnSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideOnSearchResults(Boolean value) {
        this.hideOnSearchResults = value;
    }

    /**
     * Gets the value of the hideOnSavedResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideOnSavedResults() {
        return hideOnSavedResults;
    }

    /**
     * Sets the value of the hideOnSavedResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideOnSavedResults(Boolean value) {
        this.hideOnSavedResults = value;
    }

    /**
     * Gets the value of the hideOnCompareView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideOnCompareView() {
        return hideOnCompareView;
    }

    /**
     * Sets the value of the hideOnCompareView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideOnCompareView(Boolean value) {
        this.hideOnCompareView = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the selectionParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionParameter() {
        return selectionParameter;
    }

    /**
     * Sets the value of the selectionParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionParameter(String value) {
        this.selectionParameter = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the ajaxMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAjaxMethod() {
        return ajaxMethod;
    }

    /**
     * Sets the value of the ajaxMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAjaxMethod(String value) {
        this.ajaxMethod = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindow(String value) {
        this.window = value;
    }

    /**
     * Gets the value of the successMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessMessage() {
        return successMessage;
    }

    /**
     * Sets the value of the successMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessMessage(String value) {
        this.successMessage = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the noSelectionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSelectionMessage() {
        return noSelectionMessage;
    }

    /**
     * Sets the value of the noSelectionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSelectionMessage(String value) {
        this.noSelectionMessage = value;
    }

    /**
     * Gets the value of the extraParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraParameters() {
        return extraParameters;
    }

    /**
     * Sets the value of the extraParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraParameters(String value) {
        this.extraParameters = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the includeFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFields() {
        return includeFields;
    }

    /**
     * Sets the value of the includeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFields(String value) {
        this.includeFields = value;
    }

    /**
     * Gets the value of the includeState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeState() {
        return includeState;
    }

    /**
     * Sets the value of the includeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeState(Boolean value) {
        this.includeState = value;
    }

    /**
     * Gets the value of the allowNoSelection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNoSelection() {
        return allowNoSelection;
    }

    /**
     * Sets the value of the allowNoSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNoSelection(Boolean value) {
        this.allowNoSelection = value;
    }

    /**
     * Gets the value of the actionLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionLink }
     * 
     * 
     */
    public List<ActionLink> getActionLinks() {
        if (actionLinks == null) {
            actionLinks = new ArrayList<ActionLink>();
        }
        return this.actionLinks;
    }

}
