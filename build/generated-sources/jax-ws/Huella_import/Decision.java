
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Decision.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Decision"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HIT"/&gt;
 *     &lt;enumeration value="NO_HIT"/&gt;
 *     &lt;enumeration value="POSSIBLE_HIT"/&gt;
 *     &lt;enumeration value="NO_DECISION"/&gt;
 *     &lt;enumeration value="KEY_NOT_FOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Decision")
@XmlEnum
public enum Decision {

    HIT,
    NO_HIT,
    POSSIBLE_HIT,
    NO_DECISION,
    KEY_NOT_FOUND;

    public String value() {
        return name();
    }

    public static Decision fromValue(String v) {
        return valueOf(v);
    }

}
