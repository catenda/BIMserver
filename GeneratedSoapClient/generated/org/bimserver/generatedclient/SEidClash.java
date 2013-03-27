
package org.bimserver.generatedclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sEidClash complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sEidClash">
 *   &lt;complexContent>
 *     &lt;extension base="{http://shared.bimserver.org/}sClash">
 *       &lt;sequence>
 *         &lt;element name="eid1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="eid2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sEidClash", propOrder = {
    "eid1",
    "eid2"
})
public class SEidClash
    extends SClash
{

    protected Long eid1;
    protected Long eid2;

    /**
     * Gets the value of the eid1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEid1() {
        return eid1;
    }

    /**
     * Sets the value of the eid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEid1(Long value) {
        this.eid1 = value;
    }

    /**
     * Gets the value of the eid2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEid2() {
        return eid2;
    }

    /**
     * Sets the value of the eid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEid2(Long value) {
        this.eid2 = value;
    }

}
