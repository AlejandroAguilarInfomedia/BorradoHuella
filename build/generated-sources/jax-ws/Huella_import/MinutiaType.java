
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MinutiaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MinutiaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIFURCATION"/&gt;
 *     &lt;enumeration value="RIDGE_ENDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MinutiaType")
@XmlEnum
public enum MinutiaType {

    BIFURCATION,
    RIDGE_ENDING;

    public String value() {
        return name();
    }

    public static MinutiaType fromValue(String v) {
        return valueOf(v);
    }

}
