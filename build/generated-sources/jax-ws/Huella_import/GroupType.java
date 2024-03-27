
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GroupType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="GroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINGER"/&gt;
 *     &lt;enumeration value="FACE"/&gt;
 *     &lt;enumeration value="IRIS"/&gt;
 *     &lt;enumeration value="PALM_OR_SUPPLEMENTALS"/&gt;
 *     &lt;enumeration value="TATTOO"/&gt;
 *     &lt;enumeration value="PEDESTRIAN"/&gt;
 *     &lt;enumeration value="BAG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupType")
@XmlEnum
public enum GroupType {

    FINGER,
    FACE,
    IRIS,
    PALM_OR_SUPPLEMENTALS,
    TATTOO,
    PEDESTRIAN,
    BAG;

    public String value() {
        return name();
    }

    public static GroupType fromValue(String v) {
        return valueOf(v);
    }

}
