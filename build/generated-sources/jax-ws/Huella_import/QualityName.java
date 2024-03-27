
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QualityName.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="QualityName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MORPHO"/&gt;
 *     &lt;enumeration value="ISO_19794"/&gt;
 *     &lt;enumeration value="MORPHO_ICB"/&gt;
 *     &lt;enumeration value="ALTERED_FINGERPRINT"/&gt;
 *     &lt;enumeration value="NFIQ"/&gt;
 *     &lt;enumeration value="MORPHO_NBPK"/&gt;
 *     &lt;enumeration value="MORPHO_IRIS_ATROPINE"/&gt;
 *     &lt;enumeration value="MORPHO_IRIS_FAKE_LENS"/&gt;
 *     &lt;enumeration value="NFIQ2"/&gt;
 *     &lt;enumeration value="ALTERED_FINGERPRINT2"/&gt;
 *     &lt;enumeration value="QVU"/&gt;
 *     &lt;enumeration value="PARALLEL_MINUTIAE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityName")
@XmlEnum
public enum QualityName {

    MORPHO("MORPHO"),
    ISO_19794("ISO_19794"),
    MORPHO_ICB("MORPHO_ICB"),
    ALTERED_FINGERPRINT("ALTERED_FINGERPRINT"),
    NFIQ("NFIQ"),
    MORPHO_NBPK("MORPHO_NBPK"),
    MORPHO_IRIS_ATROPINE("MORPHO_IRIS_ATROPINE"),
    MORPHO_IRIS_FAKE_LENS("MORPHO_IRIS_FAKE_LENS"),
    @XmlEnumValue("NFIQ2")
    NFIQ_2("NFIQ2"),
    @XmlEnumValue("ALTERED_FINGERPRINT2")
    ALTERED_FINGERPRINT_2("ALTERED_FINGERPRINT2"),
    QVU("QVU"),
    PARALLEL_MINUTIAE("PARALLEL_MINUTIAE");
    private final String value;

    QualityName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityName fromValue(String v) {
        for (QualityName c: QualityName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
