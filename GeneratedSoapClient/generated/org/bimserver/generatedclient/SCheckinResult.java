
package org.bimserver.generatedclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sCheckinResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sCheckinResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="revisionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://shared.bimserver.org/}sCheckinStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sCheckinResult", propOrder = {
    "lastError",
    "oid",
    "progress",
    "projectId",
    "revisionId",
    "status"
})
public class SCheckinResult {

    protected String lastError;
    protected long oid;
    protected Integer progress;
    protected long projectId;
    protected long revisionId;
    protected SCheckinStatus status;

    /**
     * Gets the value of the lastError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastError() {
        return lastError;
    }

    /**
     * Sets the value of the lastError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastError(String value) {
        this.lastError = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     */
    public long getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     */
    public void setOid(long value) {
        this.oid = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgress(Integer value) {
        this.progress = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the revisionId property.
     * 
     */
    public long getRevisionId() {
        return revisionId;
    }

    /**
     * Sets the value of the revisionId property.
     * 
     */
    public void setRevisionId(long value) {
        this.revisionId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SCheckinStatus }
     *     
     */
    public SCheckinStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCheckinStatus }
     *     
     */
    public void setStatus(SCheckinStatus value) {
        this.status = value;
    }

}
