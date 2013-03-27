
package org.bimserver.generatedclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sCheckinStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sCheckinStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CH_NONE"/>
 *     &lt;enumeration value="CH_STARTED"/>
 *     &lt;enumeration value="CH_FINISHED"/>
 *     &lt;enumeration value="CH_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sCheckinStatus")
@XmlEnum
public enum SCheckinStatus {

    CH_NONE,
    CH_STARTED,
    CH_FINISHED,
    CH_ERROR;

    public String value() {
        return name();
    }

    public static SCheckinStatus fromValue(String v) {
        return valueOf(v);
    }

}
