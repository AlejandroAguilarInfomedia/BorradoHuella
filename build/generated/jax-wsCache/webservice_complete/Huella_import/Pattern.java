
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pattern.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Pattern"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="RIGHT_LOOP"/&gt;
 *     &lt;enumeration value="LEFT_LOOP"/&gt;
 *     &lt;enumeration value="WHORL"/&gt;
 *     &lt;enumeration value="ARCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Pattern")
@XmlEnum
public enum Pattern {

    UNKNOWN,
    RIGHT_LOOP,
    LEFT_LOOP,
    WHORL,
    ARCH;

    public String value() {
        return name();
    }

    public static Pattern fromValue(String v) {
        return valueOf(v);
    }

}
