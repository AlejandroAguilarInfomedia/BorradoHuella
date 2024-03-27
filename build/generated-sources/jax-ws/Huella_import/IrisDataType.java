
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrisDataType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="IrisDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEPARATE_EYES"/&gt;
 *     &lt;enumeration value="BOTH_EYES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IrisDataType")
@XmlEnum
public enum IrisDataType {

    SEPARATE_EYES,
    BOTH_EYES;

    public String value() {
        return name();
    }

    public static IrisDataType fromValue(String v) {
        return valueOf(v);
    }

}
