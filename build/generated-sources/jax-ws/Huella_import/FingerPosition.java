
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FingerPosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FingerPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_FINGER"/&gt;
 *     &lt;enumeration value="THUMB_FINGER"/&gt;
 *     &lt;enumeration value="INDEX_FINGER"/&gt;
 *     &lt;enumeration value="MIDDLE_FINGER"/&gt;
 *     &lt;enumeration value="RING_FINGER"/&gt;
 *     &lt;enumeration value="LITTLE_FINGER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FingerPosition")
@XmlEnum
public enum FingerPosition {

    NONE_FINGER,
    THUMB_FINGER,
    INDEX_FINGER,
    MIDDLE_FINGER,
    RING_FINGER,
    LITTLE_FINGER;

    public String value() {
        return name();
    }

    public static FingerPosition fromValue(String v) {
        return valueOf(v);
    }

}
