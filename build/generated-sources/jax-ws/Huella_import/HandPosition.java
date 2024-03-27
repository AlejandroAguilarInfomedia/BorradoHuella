
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HandPosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="HandPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_HAND"/&gt;
 *     &lt;enumeration value="RIGHT_HAND"/&gt;
 *     &lt;enumeration value="LEFT_HAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandPosition")
@XmlEnum
public enum HandPosition {

    NONE_HAND,
    RIGHT_HAND,
    LEFT_HAND;

    public String value() {
        return name();
    }

    public static HandPosition fromValue(String v) {
        return valueOf(v);
    }

}
