
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LatentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="LatentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINGER"/&gt;
 *     &lt;enumeration value="PALM_OR_SUPPLEMENTALS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LatentType")
@XmlEnum
public enum LatentType {

    FINGER,
    PALM_OR_SUPPLEMENTALS;

    public String value() {
        return name();
    }

    public static LatentType fromValue(String v) {
        return valueOf(v);
    }

}
