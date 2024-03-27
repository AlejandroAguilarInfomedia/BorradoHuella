
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NumericOperation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="NumericOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALWAYS_TRUE"/&gt;
 *     &lt;enumeration value="CHECK_INTERVAL"/&gt;
 *     &lt;enumeration value="EQUAL"/&gt;
 *     &lt;enumeration value="GREATER_THAN"/&gt;
 *     &lt;enumeration value="LOWER_THAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NumericOperation")
@XmlEnum
public enum NumericOperation {

    ALWAYS_TRUE,
    CHECK_INTERVAL,
    EQUAL,
    GREATER_THAN,
    LOWER_THAN;

    public String value() {
        return name();
    }

    public static NumericOperation fromValue(String v) {
        return valueOf(v);
    }

}
