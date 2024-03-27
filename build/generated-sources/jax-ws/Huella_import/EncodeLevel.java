
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncodeLevel.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="EncodeLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEGMENT_ONLY"/&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="WITH_SEQUENCE_CHECK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncodeLevel")
@XmlEnum
public enum EncodeLevel {

    SEGMENT_ONLY,
    DEFAULT,
    WITH_SEQUENCE_CHECK;

    public String value() {
        return name();
    }

    public static EncodeLevel fromValue(String v) {
        return valueOf(v);
    }

}
