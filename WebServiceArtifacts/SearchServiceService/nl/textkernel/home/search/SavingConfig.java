
package nl.textkernel.home.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savingConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savingConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disableProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableQueries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="projectLinkPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectLinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableAssessments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dontKnowEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sharingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="taggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sharingRequestidentitiesURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savingConfig", propOrder = {
    "disableProjects",
    "disableQueries",
    "disableResults",
    "projectLinkPrefix",
    "projectLinkTarget",
    "enableAssessments",
    "dontKnowEnabled",
    "sharingEnabled",
    "taggingEnabled",
    "sharingRequestidentitiesURL"
})
public class SavingConfig {

    protected boolean disableProjects;
    protected boolean disableQueries;
    protected boolean disableResults;
    protected String projectLinkPrefix;
    protected String projectLinkTarget;
    protected boolean enableAssessments;
    protected boolean dontKnowEnabled;
    protected boolean sharingEnabled;
    protected boolean taggingEnabled;
    protected String sharingRequestidentitiesURL;

    /**
     * Gets the value of the disableProjects property.
     * 
     */
    public boolean isDisableProjects() {
        return disableProjects;
    }

    /**
     * Sets the value of the disableProjects property.
     * 
     */
    public void setDisableProjects(boolean value) {
        this.disableProjects = value;
    }

    /**
     * Gets the value of the disableQueries property.
     * 
     */
    public boolean isDisableQueries() {
        return disableQueries;
    }

    /**
     * Sets the value of the disableQueries property.
     * 
     */
    public void setDisableQueries(boolean value) {
        this.disableQueries = value;
    }

    /**
     * Gets the value of the disableResults property.
     * 
     */
    public boolean isDisableResults() {
        return disableResults;
    }

    /**
     * Sets the value of the disableResults property.
     * 
     */
    public void setDisableResults(boolean value) {
        this.disableResults = value;
    }

    /**
     * Gets the value of the projectLinkPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectLinkPrefix() {
        return projectLinkPrefix;
    }

    /**
     * Sets the value of the projectLinkPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectLinkPrefix(String value) {
        this.projectLinkPrefix = value;
    }

    /**
     * Gets the value of the projectLinkTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectLinkTarget() {
        return projectLinkTarget;
    }

    /**
     * Sets the value of the projectLinkTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectLinkTarget(String value) {
        this.projectLinkTarget = value;
    }

    /**
     * Gets the value of the enableAssessments property.
     * 
     */
    public boolean isEnableAssessments() {
        return enableAssessments;
    }

    /**
     * Sets the value of the enableAssessments property.
     * 
     */
    public void setEnableAssessments(boolean value) {
        this.enableAssessments = value;
    }

    /**
     * Gets the value of the dontKnowEnabled property.
     * 
     */
    public boolean isDontKnowEnabled() {
        return dontKnowEnabled;
    }

    /**
     * Sets the value of the dontKnowEnabled property.
     * 
     */
    public void setDontKnowEnabled(boolean value) {
        this.dontKnowEnabled = value;
    }

    /**
     * Gets the value of the sharingEnabled property.
     * 
     */
    public boolean isSharingEnabled() {
        return sharingEnabled;
    }

    /**
     * Sets the value of the sharingEnabled property.
     * 
     */
    public void setSharingEnabled(boolean value) {
        this.sharingEnabled = value;
    }

    /**
     * Gets the value of the taggingEnabled property.
     * 
     */
    public boolean isTaggingEnabled() {
        return taggingEnabled;
    }

    /**
     * Sets the value of the taggingEnabled property.
     * 
     */
    public void setTaggingEnabled(boolean value) {
        this.taggingEnabled = value;
    }

    /**
     * Gets the value of the sharingRequestidentitiesURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharingRequestidentitiesURL() {
        return sharingRequestidentitiesURL;
    }

    /**
     * Sets the value of the sharingRequestidentitiesURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharingRequestidentitiesURL(String value) {
        this.sharingRequestidentitiesURL = value;
    }

}
