
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FingerprintType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FingerprintType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_FP_TYPE"/&gt;
 *     &lt;enumeration value="PROXIMAL_FP_TYPE"/&gt;
 *     &lt;enumeration value="MEDIAL_FP_TYPE"/&gt;
 *     &lt;enumeration value="DISTAL_FP_TYPE"/&gt;
 *     &lt;enumeration value="TIP_FP_TYPE"/&gt;
 *     &lt;enumeration value="FULL_FP_TYPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FingerprintType")
@XmlEnum
public enum FingerprintType {

    NONE_FP_TYPE,
    PROXIMAL_FP_TYPE,
    MEDIAL_FP_TYPE,
    DISTAL_FP_TYPE,
    TIP_FP_TYPE,
    FULL_FP_TYPE;

    public String value() {
        return name();
    }

    public static FingerprintType fromValue(String v) {
        return valueOf(v);
    }

}
