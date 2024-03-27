
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonToPersonAuthenticateErrorType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PersonToPersonAuthenticateErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_ERR"/&gt;
 *     &lt;enumeration value="ERROR_NULL_PARAMETER"/&gt;
 *     &lt;enumeration value="ERROR_MEMORY_ALLOCATION_FAILED"/&gt;
 *     &lt;enumeration value="ERROR_ASSERTION_FAILED"/&gt;
 *     &lt;enumeration value="ERROR_PROTECTION"/&gt;
 *     &lt;enumeration value="INVALID_PARAMETER"/&gt;
 *     &lt;enumeration value="INVALID_CONFIGURATION_BLOCK"/&gt;
 *     &lt;enumeration value="ERROR_INTERNAL"/&gt;
 *     &lt;enumeration value="ERROR_INVALID_CFV_DATA"/&gt;
 *     &lt;enumeration value="ERROR_INVALID_CFV_VERSION"/&gt;
 *     &lt;enumeration value="ERROR_IMAGE_DECOMPRESSION"/&gt;
 *     &lt;enumeration value="ERROR_RECODING_NEEDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonToPersonAuthenticateErrorType")
@XmlEnum
public enum PersonToPersonAuthenticateErrorType {

    NO_ERR,
    ERROR_NULL_PARAMETER,
    ERROR_MEMORY_ALLOCATION_FAILED,
    ERROR_ASSERTION_FAILED,
    ERROR_PROTECTION,
    INVALID_PARAMETER,
    INVALID_CONFIGURATION_BLOCK,
    ERROR_INTERNAL,
    ERROR_INVALID_CFV_DATA,
    ERROR_INVALID_CFV_VERSION,
    ERROR_IMAGE_DECOMPRESSION,
    ERROR_RECODING_NEEDED;

    public String value() {
        return name();
    }

    public static PersonToPersonAuthenticateErrorType fromValue(String v) {
        return valueOf(v);
    }

}
