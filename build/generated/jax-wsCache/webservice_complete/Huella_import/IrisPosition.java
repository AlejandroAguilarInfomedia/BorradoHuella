
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisPosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="IrisPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_IRIS"/&gt;
 *     &lt;enumeration value="RIGHT_IRIS"/&gt;
 *     &lt;enumeration value="LEFT_IRIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IrisPosition")
@XmlEnum
public enum IrisPosition {

    NONE_IRIS,
    RIGHT_IRIS,
    LEFT_IRIS;

    public String value() {
        return name();
    }

    public static IrisPosition fromValue(String v) {
        return valueOf(v);
    }

}
