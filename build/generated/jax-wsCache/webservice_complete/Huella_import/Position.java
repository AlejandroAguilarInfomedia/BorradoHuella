
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Position.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Position"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RIGHT_THUMB"/&gt;
 *     &lt;enumeration value="RIGHT_INDEX"/&gt;
 *     &lt;enumeration value="RIGHT_MIDDLE"/&gt;
 *     &lt;enumeration value="RIGHT_RING"/&gt;
 *     &lt;enumeration value="RIGHT_LITTLE"/&gt;
 *     &lt;enumeration value="LEFT_THUMB"/&gt;
 *     &lt;enumeration value="LEFT_INDEX"/&gt;
 *     &lt;enumeration value="LEFT_MIDDLE"/&gt;
 *     &lt;enumeration value="LEFT_RING"/&gt;
 *     &lt;enumeration value="LEFT_LITTLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Position")
@XmlEnum
public enum Position {

    RIGHT_THUMB,
    RIGHT_INDEX,
    RIGHT_MIDDLE,
    RIGHT_RING,
    RIGHT_LITTLE,
    LEFT_THUMB,
    LEFT_INDEX,
    LEFT_MIDDLE,
    LEFT_RING,
    LEFT_LITTLE;

    public String value() {
        return name();
    }

    public static Position fromValue(String v) {
        return valueOf(v);
    }

}
