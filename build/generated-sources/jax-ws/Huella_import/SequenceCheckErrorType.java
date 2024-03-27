
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SequenceCheckErrorType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="SequenceCheckErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPLICATE_ITEM"/&gt;
 *     &lt;enumeration value="MISPLACED_ITEM"/&gt;
 *     &lt;enumeration value="MISSING_MATE"/&gt;
 *     &lt;enumeration value="UNIDENTIFIED_ITEM"/&gt;
 *     &lt;enumeration value="LOCATION_ERROR"/&gt;
 *     &lt;enumeration value="INCONSISTENCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SequenceCheckErrorType")
@XmlEnum
public enum SequenceCheckErrorType {

    DUPLICATE_ITEM,
    MISPLACED_ITEM,
    MISSING_MATE,
    UNIDENTIFIED_ITEM,
    LOCATION_ERROR,
    INCONSISTENCY;

    public String value() {
        return name();
    }

    public static SequenceCheckErrorType fromValue(String v) {
        return valueOf(v);
    }

}
