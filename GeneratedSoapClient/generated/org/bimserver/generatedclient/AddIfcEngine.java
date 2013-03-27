
package org.bimserver.generatedclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addIfcEngine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addIfcEngine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ifcEngine" type="{http://shared.bimserver.org/}sIfcEngine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addIfcEngine", propOrder = {
    "ifcEngine"
})
public class AddIfcEngine {

    protected SIfcEngine ifcEngine;

    /**
     * Gets the value of the ifcEngine property.
     * 
     * @return
     *     possible object is
     *     {@link SIfcEngine }
     *     
     */
    public SIfcEngine getIfcEngine() {
        return ifcEngine;
    }

    /**
     * Sets the value of the ifcEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIfcEngine }
     *     
     */
    public void setIfcEngine(SIfcEngine value) {
        this.ifcEngine = value;
    }

}
