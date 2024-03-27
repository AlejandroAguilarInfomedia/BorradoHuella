
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PalmPosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PalmPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_PALM"/&gt;
 *     &lt;enumeration value="LOWER_PALM"/&gt;
 *     &lt;enumeration value="WRITER_PALM"/&gt;
 *     &lt;enumeration value="UPPER_PALM"/&gt;
 *     &lt;enumeration value="THENAR_PALM"/&gt;
 *     &lt;enumeration value="HYPOTHENAR_PALM"/&gt;
 *     &lt;enumeration value="INTERDIGITAL_PALM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PalmPosition")
@XmlEnum
public enum PalmPosition {

    NONE_PALM,
    LOWER_PALM,
    WRITER_PALM,
    UPPER_PALM,
    THENAR_PALM,
    HYPOTHENAR_PALM,
    INTERDIGITAL_PALM;

    public String value() {
        return name();
    }

    public static PalmPosition fromValue(String v) {
        return valueOf(v);
    }

}
