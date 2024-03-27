
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ErrorCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="GENERAL_FAILURE"/&gt;
 *     &lt;enumeration value="DUPLICATE_KEY"/&gt;
 *     &lt;enumeration value="KEY_NOT_FOUND"/&gt;
 *     &lt;enumeration value="INVALID_INPUT"/&gt;
 *     &lt;enumeration value="LIMITS_EXCEEDED"/&gt;
 *     &lt;enumeration value="RECODING_NEEDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    SUCCESS,
    GENERAL_FAILURE,
    DUPLICATE_KEY,
    KEY_NOT_FOUND,
    INVALID_INPUT,
    LIMITS_EXCEEDED,
    RECODING_NEEDED;

    public String value() {
        return name();
    }

    public static ErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
