
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedestrianPosition.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PedestrianPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_PEDESTRIAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PedestrianPosition")
@XmlEnum
public enum PedestrianPosition {

    NONE_PEDESTRIAN;

    public String value() {
        return name();
    }

    public static PedestrianPosition fromValue(String v) {
        return valueOf(v);
    }

}
