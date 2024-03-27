
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MinutiaeOrderType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MinutiaeOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_ORDERING"/&gt;
 *     &lt;enumeration value="ASCENDING"/&gt;
 *     &lt;enumeration value="DESCENDING"/&gt;
 *     &lt;enumeration value="CARTESIAN_XY"/&gt;
 *     &lt;enumeration value="CARTESIAN_YX"/&gt;
 *     &lt;enumeration value="ANGLE"/&gt;
 *     &lt;enumeration value="POLAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MinutiaeOrderType")
@XmlEnum
public enum MinutiaeOrderType {

    NO_ORDERING,
    ASCENDING,
    DESCENDING,
    CARTESIAN_XY,
    CARTESIAN_YX,
    ANGLE,
    POLAR;

    public String value() {
        return name();
    }

    public static MinutiaeOrderType fromValue(String v) {
        return valueOf(v);
    }

}
