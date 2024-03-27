
package Huella_import;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcquisitionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AcquisitionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE_ACQ_TYPE"/&gt;
 *     &lt;enumeration value="ROLLED_ACQ_TYPE"/&gt;
 *     &lt;enumeration value="FLAT_ACQ_TYPE"/&gt;
 *     &lt;enumeration value="LEFT_SIDE_ACQ_TYPE"/&gt;
 *     &lt;enumeration value="RIGHT_SIDE_ACQ_TYPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcquisitionType")
@XmlEnum
public enum AcquisitionType {

    NONE_ACQ_TYPE,
    ROLLED_ACQ_TYPE,
    FLAT_ACQ_TYPE,
    LEFT_SIDE_ACQ_TYPE,
    RIGHT_SIDE_ACQ_TYPE;

    public String value() {
        return name();
    }

    public static AcquisitionType fromValue(String v) {
        return valueOf(v);
    }

}
