
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacePosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FacePosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_FACE"/&gt;
 *     &lt;enumeration value="FRONT_FACE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacePosition")
@XmlEnum
public enum FacePosition {

    NONE_FACE,
    FRONT_FACE;

    public String value() {
        return name();
    }

    public static FacePosition fromValue(String v) {
        return valueOf(v);
    }

}
