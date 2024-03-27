
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FingerprintSampleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FingerprintSampleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TENPRINT_SLAP"/&gt;
 *     &lt;enumeration value="TENPRINT_ROLLED"/&gt;
 *     &lt;enumeration value="SLAP_442"/&gt;
 *     &lt;enumeration value="SLAP_4411"/&gt;
 *     &lt;enumeration value="TIPS"/&gt;
 *     &lt;enumeration value="EJI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FingerprintSampleType")
@XmlEnum
public enum FingerprintSampleType {

    TENPRINT_SLAP,
    TENPRINT_ROLLED,
    SLAP_442,
    SLAP_4411,
    TIPS,
    EJI;

    public String value() {
        return name();
    }

    public static FingerprintSampleType fromValue(String v) {
        return valueOf(v);
    }

}
